package com.yao.demo.jdk17;

import com.yao.demo.jdk17.features.Strictfp;
import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.stream.Stream;

public class StrictfpTest {
    @Test
    public void testStrictfp(){
        float aFloat = 0.6666666666666666666f;
        double aDouble = 0.88888888888888888d;
        double result = Strictfp.sum(aFloat, aDouble);
        //System.out.println(aFloat + "+" + aDouble + " = " +result);

        Stream.generate(new Random()::nextInt)
                .limit(5).forEach(System.out::println);
    }
}
