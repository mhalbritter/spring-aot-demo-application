package com.example.nativeimagedemo.author.storage.jpa;

/**
 * @author Moritz Halbritter
 */

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@ConditionalOnProperty(name = "application.storage", havingValue = "DATA_JPA")
public @interface OnEnabledDataJpa {
}
