import com.example.Lion;
import com.example.Feline;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParametrizedTest
{
    private final String sex;
    private final boolean expected;
    Feline feline;

    public LionParametrizedTest(String sex, boolean expected)
    {
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData()
    {
        return new Object[][]
        {
            {"Самец", true},
            {"Самка", false}
        };
    }

    @Test
    public void doesHaveManeTrueAndFalse() throws Exception
    {
        Lion lion = new Lion(sex, feline);
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);
    }
}
