package com.fabiankevin.codechallenges;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneContactTest {

    private PhoneContact solution = new PhoneContact();

    private static Stream<Arguments> givenAndOutput() {
        return Stream.of(
                Arguments.of(new String [] {"pim","pom"}, new String [] {"9999999999","777888999"},  "8899", "pom"),
                Arguments.of(new String [] {"sander","amy", "ann", "michael"}, new String [] {"123456789","777888999", "123456789", "123456789"},  "1", "ann"),
                Arguments.of(new String [] {"adam","eva", "leo"}, new String [] {"1212121212","111111111", "444555566666"},  "112", "NO_CONTACT")
        );
    }


    @ParameterizedTest
    @MethodSource("givenAndOutput")
    void scenarios(String[] names, String[] contactNumber, String keyword, String expected) {
        String result = solution.solution(names, contactNumber, keyword);
        assertEquals(expected, result);
    }
}
