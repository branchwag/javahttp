package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    public void testAppCreation() {
        App app = new App();
        assertNotNull(app);
    }
}
