package io.github.ololx.leetcode.examples.easy.task1114;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicInteger;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 13.07.2022 09:46
 *
 * @author Alexander A. Kropotin
 */
public class SolutionV3Test extends AbstractSolutionTest {

    @Test(dataProvider = "providesRunnableOrder")
    public void firstSecondThird_whenFooMethodsExecuteInDifferentOrders_thenRunItInExpectedOrder(int[] order,
                                                                                                 int[] expected) {
        int[] actual = new int[3];
        AtomicInteger actualIndex = new AtomicInteger();
        AtomicInteger invocationIndex = new AtomicInteger();

        final SolutionV3.Foo foo = new SolutionV3.Foo();
        List<CompletableFuture<Void>> fooFutures = new ArrayList<>() {{
           add(
                   CompletableFuture.runAsync(() -> {
                       System.err.println("Run the process num = " + invocationIndex.incrementAndGet());

                       try {
                           foo.first(() -> actual[actualIndex.getAndIncrement()] = 1);
                       } catch (InterruptedException e) {
                           e.printStackTrace();
                       }}
                   )
           );
            add(
                    CompletableFuture.runAsync(() -> {
                        System.err.println("Run the process num = " + invocationIndex.incrementAndGet());

                        try {
                            foo.second(() -> actual[actualIndex.getAndIncrement()] = 2);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }}
                    )
            );
            add(
                    CompletableFuture.runAsync(() -> {
                        System.err.println("Run the process num = " + invocationIndex.incrementAndGet());

                        try {
                            foo.third(() -> actual[actualIndex.getAndIncrement()] = 3);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }}
                    )
            );
        }};

        for (int futureIndex : order) {
            fooFutures.get(futureIndex - 1).join();
        }

        assertEquals(actual, expected);
    }
}
