import com.example.Animal;
import org.junit.Test;

import static org.junit.Assert.assertThrows;

public class AnimalExceptionTest
{
    @Test(expected = Exception.class)
    public void getFoodThrowsException() throws Exception
    {
        Animal animal = new Animal();
        animal.getFood("Человек");
    }
}
