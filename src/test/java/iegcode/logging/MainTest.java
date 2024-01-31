package iegcode.logging;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainTest {

    private static final Logger log = LoggerFactory.getLogger(MainTest.class);

    @Test
    void testLog() {
        // kalo pakai logger dikasih tahu waktu, level, info nama loggernya classnya apa, kejaiannya hasil log.info
        // sekarang System.out.println udah jarang digunakan developer java
        System.out.println("Hello Logger");
        log.info("Hello Logger");
        System.out.println("Iegcode");
        log.info("IegCode");
    }
}
