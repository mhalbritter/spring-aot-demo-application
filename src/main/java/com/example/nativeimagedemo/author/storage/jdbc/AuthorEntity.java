package com.example.nativeimagedemo.author.storage.jdbc;

import com.example.nativeimagedemo.author.business.Author;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

/**
 * @author Moritz Halbritter
 */
@Table(name = "authors")
record AuthorEntity(@Id Long id, String name) {
    public Author toAuthor() {
        return new Author(id, name);
    }
}
