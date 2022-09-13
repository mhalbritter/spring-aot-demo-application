package com.example.nativeimagedemo.author.storage;

import org.springframework.data.repository.ListCrudRepository;

/**
 * @author Moritz Halbritter
 */
interface AuthorEntityCrudRepository extends ListCrudRepository<AuthorEntity, Long> {
}
