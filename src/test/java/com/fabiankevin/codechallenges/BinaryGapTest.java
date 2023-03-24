package com.fabiankevin.codechallenges;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryGapTest {
    private BinaryGap binaryGap;

    private static Stream<Arguments> givenAndOutput() {
        return Stream.of(
                Arguments.of(0, 0),
                Arguments.of(9, 2),
                Arguments.of(15, 0),
                Arguments.of(32, 0),
                Arguments.of(529, 4),
                Arguments.of(1041, 5),
                Arguments.of(65536, 0),
                Arguments.of(65537, 15),
                Arguments.of(100000, 4),
                Arguments.of(2147483, 5),
                Arguments.of(2147483637, 1),
                Arguments.of(2147483646, 0),
                Arguments.of(2147483646, 0)
        );
    }


    @BeforeEach
    void setup(){
        binaryGap = new BinaryGap();
    }

    @ParameterizedTest
    @MethodSource("givenAndOutput")
    void scenarios(int input, int expected) {
        int result = binaryGap.resolve(input);
        assertEquals(expected, result);
    }
}
