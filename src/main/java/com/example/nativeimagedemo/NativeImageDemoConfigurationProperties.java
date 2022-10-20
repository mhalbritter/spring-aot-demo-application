package com.example.nativeimagedemo;

import jakarta.validation.constraints.NotNull;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

/**
 * @author Moritz Halbritter
 */
@ConfigurationProperties("application")
@Validated
public class NativeImageDemoConfigurationProperties {

    /**
     * Storage backend.
     */
    @NotNull
    private Storage storage;

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public enum Storage {
        /**
         * Spring Data JPA.
         */
        DATA_JPA,
        /**
         * Spring Data JDBC.
         */
        DATA_JDBC
    }
}
