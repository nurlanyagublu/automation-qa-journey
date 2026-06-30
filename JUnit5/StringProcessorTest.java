package JUnit5.JUnit5;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;


import java.util.stream.Stream;

public class StringProcessorTest {

    private StringProcessor stringProcessor;

    @BeforeEach
    void setUp()
    {
        stringProcessor = new StringProcessor();
    }

@ParameterizedTest
@CsvSource({
        "' ', ' '",
        "A, A",
        "oTuran, naruTo",
        "Test, tseT"
})
    void testReverse(String input, String expected) {
    assertEquals(expected,  stringProcessor.reverse(input));
}

@ParameterizedTest
@ValueSource(strings = {"aka", "panap", "panamanap", "kƏlək"})
    void testPalindrome(String input)
    {
        assertTrue(stringProcessor.isPalindrome(input));
    }

    static Stream<Arguments> countVowels()
    {
        return Stream.of(
                Arguments.of("count", 2),
                Arguments.of("arguments", 3),
                Arguments.of("test", 1),
                Arguments.of("tshdghss", 0)
        );
    }


    @ParameterizedTest
    @MethodSource("countVowels")
    void testCountVowels(String input, int expected) {
        assertEquals(expected, stringProcessor.countVowels(input));
    }


    @ParameterizedTest
    @CsvSource({
        "abc, short",
        "abcdef, medium",
        "abcdefghjki, long"
    })

    void testClassify (String input, String expected) {
        assertEquals(expected, stringProcessor.classify(input));
    }

}
