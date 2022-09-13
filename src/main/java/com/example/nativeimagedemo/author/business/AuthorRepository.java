package com.example.nativeimagedemo.author.business;

import java.util.List;

/**
 * @author Moritz Halbritter
 */
public interface AuthorRepository {
    Author insert(String name);

    List<Author> findAll();
}
