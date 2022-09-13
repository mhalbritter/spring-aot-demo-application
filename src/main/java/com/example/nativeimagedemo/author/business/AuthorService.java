package com.example.nativeimagedemo.author.business;

import java.util.List;

/**
 * @author Moritz Halbritter
 */
public interface AuthorService {
    Author create(String name);

    List<Author> findAll();
}
