import org.junit.Assert;
import org.junit.jupiter.api.Test;

class VectorTest {

    @Test
    public void newVectorShouldHaveZeroLength(){
        Vector vector = new Vector();
        Assert.assertEquals(0,vector.length(),1e-6);
    }
}