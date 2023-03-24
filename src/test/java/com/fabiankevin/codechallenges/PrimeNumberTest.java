package com.fabiankevin.codechallenges;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimeNumberTest {
    private PrimeNumber solution = new PrimeNumber();

    private static Stream<Arguments> givenAndOutput() {
        return Stream.of(
                Arguments.of(2, new int[]{2}),
                Arguments.of(3, new int[]{2, 3}),
                Arguments.of(5, new int[]{2, 3, 5}),
                Arguments.of(10, new int[]{2, 3, 5, 7}),
                Arguments.of(11, new int[]{2, 3, 5, 7, 11}),
                Arguments.of(36, new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31})
        );
    }


    @ParameterizedTest
    @MethodSource("givenAndOutput")
    void scenarios(int input, int[] expectedArray) {
        int[] results = solution.resolve(input);
        assertArrayEquals(expectedArray, results);
    }
}
