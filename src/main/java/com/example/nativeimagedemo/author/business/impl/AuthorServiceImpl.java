package com.example.nativeimagedemo.author.business.impl;

import com.example.nativeimagedemo.author.business.Author;
import com.example.nativeimagedemo.author.business.AuthorRepository;
import com.example.nativeimagedemo.author.business.AuthorService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Moritz Halbritter
 */
@Component
class AuthorServiceImpl implements AuthorService {
    private final AuthorRepository authorRepository;

    AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    @Transactional
    public Author create(String name) {
        return this.authorRepository.insert(name);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Author> findAll() {
        return this.authorRepository.findAll();
    }
}
