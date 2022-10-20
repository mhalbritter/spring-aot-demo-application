package com.example.nativeimagedemo.author.storage.jpa;

import com.example.nativeimagedemo.author.business.Author;
import com.example.nativeimagedemo.author.business.AuthorRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Moritz Halbritter
 */
@Repository
@OnEnabledDataJpa
class JpaAuthorRepository implements AuthorRepository {
    private static final Logger LOGGER = LoggerFactory.getLogger(JpaAuthorRepository.class);

    private final AuthorEntityCrudRepository crudRepository;

    JpaAuthorRepository(AuthorEntityCrudRepository crudRepository) {
        LOGGER.info("Using Spring Data JPA as storage backend");
        this.crudRepository = crudRepository;
    }

    @Override
    public Author insert(String name) {
        AuthorEntity entity = new AuthorEntity(name);
        entity = this.crudRepository.save(entity);
        return entity.toAuthor();

    }

    @Override
    public List<Author> findAll() {
        return this.crudRepository.findAll().stream().map(AuthorEntity::toAuthor).collect(Collectors.toList());
    }
}
