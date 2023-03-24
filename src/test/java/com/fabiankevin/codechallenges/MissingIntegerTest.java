package com.fabiankevin.codechallenges;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissingIntegerTest {
    private MissingInteger solution = new MissingInteger();

    private static Stream<Arguments> givenAndOutput() {
        return Stream.of(
                Arguments.of(new int [] {              1, 3, 6, 4, 1, 2 }, 5 ),
                Arguments.of(new int [] {           1, 3, 6, 4, 1, 2, 5 }, 7)
        );
    }


    @ParameterizedTest
    @MethodSource("givenAndOutput")
    void scenarios(int[] array, int expected) {
        int result = solution.resolve(array);
        assertEquals(expected, result);
    }
}
