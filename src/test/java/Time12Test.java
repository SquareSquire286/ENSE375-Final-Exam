import org.junit.jupiter.api.Test; //JUnit5
import static org.junit.jupiter.api.Assertions.*;

public class Time12Test
{
    @Test
    public void HourGreater_MinuteGreater_PMvsAM_Positive()
    {
        try
        {
            Time12 t1 = new Time12(12, 45, AmPm.pm);
            Time12 t2 = new Time12(8, 36, AmPm.am);
            assertEquals(249, Time12.subtract(t1, t2));
        } catch (Exception e) {}
    }
}
