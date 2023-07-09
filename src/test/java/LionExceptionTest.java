import com.example.*;
import org.junit.Test;

public class LionExceptionTest
{
    @Test(expected = Exception.class)
    public void lionWithOtherParamThrowsException() throws Exception
    {
        Lion lion = new Lion("Человек");
    }
}
