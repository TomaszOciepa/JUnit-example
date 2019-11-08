package calculator;

import org.junit.Assert;
import org.junit.Test;


public class MathTest {

    //BDD
    @Test
   public void should_add_two_numbers() {
//        //given
//        Math math = new Math();
//
//        //when
//        int result = math.add(1, 5);
//
//        //then
//        Assert.assertEquals(result, 6);

        //given
        Math math = new Math();

        //then
        Assert.assertEquals(math.add(1,5), 6);
        Assert.assertEquals(math.add(-1,5), 4);
        Assert.assertEquals(math.add(10,5), 15);

    }
}