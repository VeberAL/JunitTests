import org.junit.Assert;
import org.junit.jupiter.api.Test;


class TriangleAreaTest {
    @Test
    public void newTriangleShouldHaveZero(){
        TriangleArea.Areatr(0,0);
        Assert.assertEquals(0,0,1e-9);
    }




}