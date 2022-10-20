package com.example.nativeimagedemo.author.storage.jdbc;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

/**
 * @author Moritz Halbritter
 */
@Configuration
@EnableJdbcRepositories
@OnEnabledDataJdbc
class DataJdbcConfiguration {

}
