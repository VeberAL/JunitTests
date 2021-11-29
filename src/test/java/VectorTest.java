import org.junit.Assert;
import org.junit.jupiter.api.Test;

class VectorTest {

    @Test
    public void newVectorShouldHaveZeroLength(){
        Vector vector = new Vector();
        Assert.assertEquals(0,vector.length(),1e-6);
    }
    @Test
    public void newVectorShouldHaveZeroX(){
        Vector vector = new Vector();
        Assert.assertEquals(0,vector.getX(),1e-6);
    }
    @Test
    public void newVectorShouldHaveZeroY(){
        Vector vector = new Vector();
        Assert.assertEquals(0,vector.getY(),1e-6);
    }
}