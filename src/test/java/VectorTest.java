import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

public class VectorTest {
    private final double Eps = 1e-6;
    private static Vector vector;

    //Выносим повторяющиеся действия в отдельный блок с before-анотацией
    @BeforeClass
    public static void createNewVector(){
        vector = new Vector();
    }
    //При передаче в метод length пустых значений выражение должно быть 0
    @Test
    public void newVectorShouldHaveZeroLength(){
        Assert.assertEquals(0,vector.length(),Eps);
    }
    //При создании объекта без передачи параметров х=0,y=0
    @Test
    public void newVectorShouldHaveZeroXAndZeroY(){
        Assert.assertEquals(0,vector.getX(),Eps);
        Assert.assertEquals(0,vector.getY(),Eps);
    }
}