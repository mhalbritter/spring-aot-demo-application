package com.example.nativeimagedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @author Moritz Halbritter
 */
@SpringBootApplication
@EnableConfigurationProperties(NativeImageDemoConfigurationProperties.class)
public class NativeImageDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(NativeImageDemoApplication.class, args);
    }

}
