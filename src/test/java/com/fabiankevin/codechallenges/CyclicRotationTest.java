package com.fabiankevin.codechallenges;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CyclicRotationTest {
    private CyclicRotation solution = new CyclicRotation();

    private static Stream<Arguments> givenAndOutput() {
        return Stream.of(
                Arguments.of(new int[]{3, 8, 9,  7, 6}, 3, new int [] {  9, 7, 6,  3, 8 }),
                Arguments.of(new int [] {       0,  0, 0 },  1,  new int [] {        0,  0, 0 }),
                Arguments.of(new int [] {    1, 2,  3, 4 },  4,  new int [] {     1, 2,  3, 4 }),
                Arguments.of(new int [] {    1, 2,  3, 4 },  5,  new int [] {     4, 1,  2, 3 }),
                Arguments.of(new int [] {   -1, 2, -3, 4 }, 10,  new int [] {    -3, 4, -1, 2 }),
                Arguments.of(new int [] {   -1, 2, -3, 4 }, 99,  new int [] {    2, -3, 4, -1 })
        );
    }


    @ParameterizedTest
    @MethodSource("givenAndOutput")
    void scenarios(int[] pA, int pK, int[] expected) {
        int[] result = solution.resolve(pA, pK);
        assertArrayEquals(expected, result);
    }
}
