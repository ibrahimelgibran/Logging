package iegcode.logging;

import org.junit.jupiter.api.Test;
import org.slf4j.MDC;

import java.util.UUID;

public class MyTest {

    @Test
    void testRequestId() throws InterruptedException {

        String requestId = UUID.randomUUID().toString();

        MyController controller = new MyController(new MyService(new MyRepository()));

        for (int i = 0; i < 5; i++) {
            new Thread(()-> {
                // jadi muncul ada request idnya didalam []. tidak manual lagi
                MDC.put("requestId",requestId);
                controller.save();
                MDC.remove("requestId");
            }).start();
        }

        Thread.sleep(1000);
    }
}
