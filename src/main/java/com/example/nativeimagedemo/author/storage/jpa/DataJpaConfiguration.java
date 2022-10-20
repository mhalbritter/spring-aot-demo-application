package com.example.nativeimagedemo.author.storage.jpa;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author Moritz Halbritter
 */
@Configuration
@EnableJpaRepositories
@OnEnabledDataJpa
class DataJpaConfiguration {

}
