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
        Assert.assertEquals(math.add(2,-2), 0);

    }

    @Test
    public void should_no_add_two_numbers() {
        //given
        Math math = new Math();

        //then
        Assert.assertNotEquals(math.add(2,5), 6);
    }

    @Test
    public void should_divide_two_numbers() {
        //given
        Math math = new Math();

        //then
        Assert.assertEquals(math.divide(4.03,2), 2.015, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void should_no_divide_by_zero() {
        //given
        Math math = new Math();

        //then
        Assert.assertEquals(math.divide(100,0), 10, 0);
    }
}