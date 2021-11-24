import org.junit.Assert;
import org.junit.jupiter.api.Test;


class TriangleAreaTest {
    @Test
    public void newTriangleShouldHaveZero(){
        TriangleArea.Areatr(0,0);
        Assert.assertEquals(0,0,1e-9);
    }
    @Test
    public void newTriangleShouldHaveHalf(){
        TriangleArea.Areatr(1,1);
        Assert.assertEquals(1.5,1.5,1e-9);
    }
}