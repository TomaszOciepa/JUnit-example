package calculator;

import org.junit.Assert;
import org.junit.Test;


public class MathTest {

    //BDD
    @Test
   public void should_add_two_numbers() {
        //given
        Math math = new Math();

        //when
        int result = math.add(1, 5);

        //then
        Assert.assertEquals(result, 6);

    }
}