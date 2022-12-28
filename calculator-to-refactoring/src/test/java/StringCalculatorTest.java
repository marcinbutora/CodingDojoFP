import com.fp.codingdojo.calculator.StringCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class StringCalculatorTest {
    @Test
    public void returnZeroForEmptyString() {
        // given

        // when
        String result = StringCalculator.sum(new String[]{""});

        // then
        assertEquals("0", result);
    }

    @Test
    public void returnOneWhenGivenOne() {
        // given

        // when
        String result = StringCalculator.sum(new String[]{"1"});

        // then
        assertEquals("1", result);
    }

    @Test
    public void returnSumOfGivenNumbers() {
        // given

        // when
        String result = StringCalculator.sum(new String[]{"1,2"});

        // then
        assertEquals("3", result);
    }

    @Test
    public void returnSumOfThreeNumbers() {
        // given

        // when
        String result = StringCalculator.sum(new String[]{"5,6,7"});

        // then
        assertEquals("18", result);
    }

    @Test
    public void returnSumOfNumbersSeparatedByNewLine() {
        // given

        // when
        String result = StringCalculator.sum(new String[]{"5,6\n7,8\n9,10"});

        // then
        assertEquals("45", result);
    }
}
