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
    
    @Test
    public void HourGreater_MinuteLess_PMvsAM_Positive()
    {
        try
        {
            Time12 t1 = new Time12(11, 45, AmPm.pm);
            Time12 t2 = new Time12(10, 55, AmPm.am);
            assertEquals(50, Time12.subtract(t1, t2));
        } catch (Exception e) {}
    }
    
    @Test
    public void HourLess_MinuteLess_PMvsAM_Positive()
    {
        try
        {
            Time12 t1 = new Time12(3, 30, AmPm.pm);
            Time12 t2 = new Time12(11, 50, AmPm.am);
            assertEquals(220, Time12.subtract(t1, t2));
        } catch (Exception e) {}
    }
    
    @Test
    public void HourLess_MinuteGreater_PMvsAM_Positive()
    {
        try
        {
            Time12 t1 = new Time12(4, 45, AmPm.pm);
            Time12 t2 = new Time12(11, 30, AmPm.am);
            assertEquals(315, Time12.subtract(t1, t2));
        } catch (Exception e) {}
    }
    
    @Test
    public void HourGreater_MinuteEqual_PMvsAM_Positive()
    {
        try
        {
            Time12 t1 = new Time12(12, 0, AmPm.pm);
            Time12 t2 = new Time12(11, 0, AmPm.am);
            assertEquals(60, Time12.subtract(t1, t2));
        } catch (Exception e) {}
    }
    
    @Test
    public void HourLess_MinuteEqual_PMvsAM_Positive()
    {
        try
        {
            Time12 t1 = new Time12(5, 30, AmPm.pm);
            Time12 t2 = new Time12(10, 30, AmPm.am);
            assertEquals(420, Time12.subtract(t1, t2));
        } catch (Exception e) {}
    }
    
    @Test
    public void HourEqual_MinuteGreater_PMvsAM_Positive()
    {
        try
        {
            Time12 t1 = new Time12(9, 45, AmPm.pm);
            Time12 t2 = new Time12(9, 20, AmPm.am);
            assertEquals(745, Time12.subtract(t1, t2));
        } catch (Exception e) {}
    }
    
    @Test
    public void HourEqual_MinuteLess_PMvsAM_Positive()
    {
        try
        {
            Time12 t1 = new Time12(9, 10, AmPm.pm);
            Time12 t2 = new Time12(9, 40, AmPm.am);
            assertEquals(690, Time12.subtract(t1, t2));
        } catch (Exception e) {}
    }
}
