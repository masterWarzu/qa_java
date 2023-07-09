import com.example.Animal;
import org.junit.Test;

public class AnimalExceptionTest
{
    @Test(expected = Exception.class)
    public void getFoodThrowsException() throws Exception
    {
        Animal animal = new Animal();
        animal.getFood("Человек");
    }
}
