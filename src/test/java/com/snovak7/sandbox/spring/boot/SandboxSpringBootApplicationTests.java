package com.snovak7.sandbox.spring.boot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class SandboxSpringBootApplicationTests {

    @Test
    void contextLoads() {
    }

}
