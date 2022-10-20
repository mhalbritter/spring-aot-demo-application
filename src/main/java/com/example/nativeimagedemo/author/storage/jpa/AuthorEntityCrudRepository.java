package com.example.nativeimagedemo.author.storage.jpa;

import org.springframework.data.repository.ListCrudRepository;

/**
 * @author Moritz Halbritter
 */
@OnEnabledDataJpa
interface AuthorEntityCrudRepository extends ListCrudRepository<AuthorEntity, Long> {
}
