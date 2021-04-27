import org.junit.jupiter.api.Test; //JUnit5
import static org.junit.jupiter.api.Assertions.*;

public class DateTimeTest
{
    @Test
    public void SameDayDifference_Valid()
    {
        try
        {
            DateTime dt1 = new DateTime(new Date(12, 22, 2020), new Time12(11, 0, AmPm.pm));
            DateTime dt2 = new DateTime(new Date(12, 22, 2020), new Time12(3, 0, AmPm.pm));
            
            assertEquals(480, DateTime.subtract(dt1, dt2));
        } catch (Exception e) {}
    }
    
    @Test
    public void Day2AfterDay1Difference_Valid()
    {
        try
        {
            DateTime dt1 = new DateTime(new Date(12, 22, 2020), new Time12(3, 0, AmPm.pm));
            DateTime dt2 = new DateTime(new Date(12, 23, 2020), new Time12(12, 0, AmPm.am));
            
            assertEquals(-180, DateTime.subtract(dt1, dt2));
        } catch (Exception e) {}
    }
    
    @Test
    public void Day1AfterDay2Difference_Valid()
    {
        try
        {
            DateTime dt1 = new DateTime(new Date(12, 23, 2020), new Time12(12, 15, AmPm.am));
            DateTime dt2 = new DateTime(new Date(12, 22, 2020), new Time12(10, 45, AmPm.pm));
            
            assertEquals(90, DateTime.subtract(dt1, dt2));
        } catch (Exception e) {}
    }
    
    @Test
    public void MultipleDayDifference_Invalid()
    {
        assertThrows(MoreThanOneDayException.class, () -> { DateTime.subtract(new DateTime(new Date(12, 22, 2020), new Time12(12, 0, AmPm.pm)), new DateTime(new Date(12, 22, 2021), new Time12(12, 0, AmPm.pm)));});
    }
}
