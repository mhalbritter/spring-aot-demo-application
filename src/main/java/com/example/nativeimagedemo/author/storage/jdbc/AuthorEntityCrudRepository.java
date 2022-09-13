package com.example.nativeimagedemo.author.storage.jdbc;

import org.springframework.data.repository.ListCrudRepository;

/**
 * @author Moritz Halbritter
 */
interface AuthorEntityCrudRepository extends ListCrudRepository<AuthorEntity, Long> {
}
