package com.snovak7.sandbox.spring.boot;

import org.springframework.boot.SpringApplication;

public class TestSandboxSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.from(SandboxSpringBootApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
