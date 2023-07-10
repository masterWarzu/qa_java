import com.example.*;
import org.junit.Test;
import com.example.Feline;

public class LionExceptionTest
{
    @Test(expected = Exception.class)
    public void lionWithOtherParamThrowsException() throws Exception
    {
        Feline feline = new Feline();
        Lion lion = new Lion("Человек", feline);
    }
}
