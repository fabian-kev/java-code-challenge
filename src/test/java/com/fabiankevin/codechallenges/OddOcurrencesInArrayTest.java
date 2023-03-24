package com.fabiankevin.codechallenges;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OddOcurrencesInArrayTest {
    private OddOcurrencesInArray solution = new OddOcurrencesInArray();

    private static Stream<Arguments> givenAndOutput() {
        return Stream.of(
                Arguments.of(new int [] { 9, 3, 9, 3, 9, 7, 9 },  7),
                Arguments.of( new int [] { 1, 2, 1, 3, 5, 2, 3 },  5 ),
                Arguments.of( new int [] { 1, 2, 1, 3, 5, 2, 3 },  5 ),
                Arguments.of( new int [] { 1, 2, 1, 3, 5, 2, 3, 1, 1, 2, 2 },  5 )
        );
    }


    @ParameterizedTest
    @MethodSource("givenAndOutput")
    void scenarios(int[] array, int expected) {
        int result = solution.resolve(array);
        assertEquals(expected, result);
    }
}
