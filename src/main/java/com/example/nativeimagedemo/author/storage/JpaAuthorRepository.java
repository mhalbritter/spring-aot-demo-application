package com.example.nativeimagedemo.author.storage;

import com.example.nativeimagedemo.author.business.Author;
import com.example.nativeimagedemo.author.business.AuthorRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Moritz Halbritter
 */
@Repository
class JpaAuthorRepository implements AuthorRepository {
    private final AuthorEntityCrudRepository crudRepository;

    JpaAuthorRepository(AuthorEntityCrudRepository crudRepository) {
        this.crudRepository = crudRepository;
    }

    @Override
    public Author insert(String name) {
        AuthorEntity entity = new AuthorEntity();
        entity.setName(name);
        entity = this.crudRepository.save(entity);
        return entity.toAuthor();
    }

    @Override
    public List<Author> findAll() {
        return this.crudRepository.findAll().stream().map(AuthorEntity::toAuthor).collect(Collectors.toList());
    }
}
