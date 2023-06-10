package io.github.ololx.leetcode.solutions.medium.task1117;

import org.testng.annotations.Test;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;

import static org.testng.Assert.*;

/**
 * project leetcode-solutions
 * created 10.06.2023 14:59
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    private static final Logger log = Logger.getLogger(SolutionTest.class.getName());

    @Test(threadPoolSize = 3, invocationCount = 6)
    public void h2o_whenInvoke_thenRunInNeededOrder() throws InterruptedException {
        Solution.H2O h2o = new Solution.H2O();

        AtomicInteger hCount = new AtomicInteger();
        AtomicInteger oCount = new AtomicInteger();
        StringBuffer stringBuffer = new StringBuffer();

        CompletableFuture.allOf(
                CompletableFuture.runAsync(() -> {
                    try {
                        h2o.hydrogen(() -> {
                            stringBuffer.append("H");
                            hCount.incrementAndGet();
                        });
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }),
                CompletableFuture.runAsync(() -> {
                    try {
                        h2o.hydrogen(() -> {
                            stringBuffer.append("H");
                            hCount.incrementAndGet();
                        });
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }),
                CompletableFuture.runAsync(() -> {
                    try {
                        h2o.oxygen(() -> {
                            stringBuffer.append("O");
                            oCount.incrementAndGet();
                        });
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                })
        ).join();

        assertEquals(hCount.get(), 2);
        assertEquals(oCount.get(), 1);

        String h2oString = stringBuffer.toString();
        log.info("Result H2O = " + h2oString);

        assertTrue(h2oString.contains("O"));
        assertEquals(h2oString.lastIndexOf("O"), h2oString.indexOf("O"));
        assertTrue(h2oString.contains("H"));
        assertNotEquals(h2oString.lastIndexOf("H"), h2oString.indexOf("H"));
    }
}
