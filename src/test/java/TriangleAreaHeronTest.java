import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TriangleAreaHeronTest {
    //проверка при a,b,c=1 p должно быть приблизительно равно 1,5
    @Test
    public void newPShouldHaveHalfOne(){
        Assert.assertEquals(TriangleAreaHeron.solveP(1,1,1),1.5,1e-3);
    }
    //проверка при a,b,c=0 p не должно быть null
    @Test
    public void newPShouldHaveNotNull(){
        Assert.assertNotNull(TriangleAreaHeron.solveP(0,0,0));
    }
    //Значение S должно быть меньше 2 при a,b,c=2
    @Test
    public void newSShouldHaveBiggestOne(){
        Assert.assertTrue(TriangleAreaHeron.solveS(2,2,2, 3)<2);
    }
    //При нулевых значениях площадь тоже ноль
    @Test
    public void newAShouldHaveNotNull(){
        Assert.assertTrue(TriangleAreaHeron.solveS(0,0,0,0)==0);
    }

}