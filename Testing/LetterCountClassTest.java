import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
//import static org.assertj.core.api.Assertions.*;


class LetterCountClassTest {

    @Test
    void givenWord() {
        LetterCountClass lccTest = new LetterCountClass("hello");
        assertEquals(5, lccTest.countLetter());
    }

    @Test
    void givenSentence() {
        LetterCountClass lccTest2 = new LetterCountClass("good afternoon");
        assertEquals(13, lccTest2.countLetter());
    }

    @Test
    void givenSentenceWCommas() {
        LetterCountClass lccTest3 = new LetterCountClass("hello there, my friend!");
        assertEquals(18, lccTest3.countLetter());
    }

    @Test
    void givenOnlySigns() {
        LetterCountClass lccTest4 = new LetterCountClass(",.!");
        assertNotEquals(3, lccTest4.countLetter());
    }

    @Test
    void givenEmpty() {
        LetterCountClass lccTest5 = new LetterCountClass("");
        assertEquals(0, lccTest5.countLetter());
    }

//    @Test
//    void testStringInAssertJ() {
//        assertThat("hello").isNotEmpty();
//    }

}