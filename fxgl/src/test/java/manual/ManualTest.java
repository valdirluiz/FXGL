/*
 * FXGL - JavaFX Game Library. The MIT License (MIT).
 * Copyright (c) AlmasB (almaslvl@gmail.com).
 * See LICENSE for details.
 */

package manual;

import com.almasb.fxgl.io.IOTask;

/**
 * @author Almas Baimagambetov (almaslvl@gmail.com)
 */
public class ManualTest {

    private static void test() {
        IOTask.ofVoid(() -> System.out.println("Hi")).execute();
        IOTask.of(() -> "Hello World").then(s -> IOTask.ofVoid(() -> System.out.println(s))).execute();
    }

    public static void main(String[] args) {
        test();
    }
}
