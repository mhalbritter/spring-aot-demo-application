package com.example.nativeimagedemo.author.web;

import com.example.nativeimagedemo.author.business.Author;

/**
 * @author Moritz Halbritter
 */
record AuthorDto(long id, String name) {
    static AuthorDto from(Author author) {
        return new AuthorDto(author.id(), author.name());
    }
}
