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
    
    @Test
    public void HourEqual_MinuteEqual_PMvsAM_Positive()
    {
        try
        {
            Time12 t1 = new Time12(9, 30, AmPm.pm);
            Time12 t2 = new Time12(9, 30, AmPm.am);
            assertEquals(720, Time12.subtract(t1, t2));
        } catch (Exception e) {}
    }
    
    @Test
    public void HourGreater_MinuteGreater_BothAM_Positive()
    {
        try
        {
            Time12 t1 = new Time12(10, 10, AmPm.am);
            Time12 t2 = new Time12(8, 0, AmPm.am);
            assertEquals(130, Time12.subtract(t1, t2));
        } catch (Exception e) {}
    }
    
    @Test
    public void HourGreater_MinuteLess_BothAM_Positive()
    {
        try
        {
            Time12 t1 = new Time12(10, 0, AmPm.am);
            Time12 t2 = new Time12(8, 30, AmPm.am);
            assertEquals(90, Time12.subtract(t1, t2));
        } catch (Exception e) {}
    }
    
    @Test
    public void HourGreater_MinuteEqual_BothAM_Positive()
    {
        try
        {
            Time12 t1 = new Time12(10, 0, AmPm.am);
            Time12 t2 = new Time12(8, 0, AmPm.am);
            assertEquals(120, Time12.subtract(t1, t2));
        } catch (Exception e) {}
    }
    
    @Test
    public void HourEqual_MinuteGreater_BothAM_Positive()
    {
        try
        {
            Time12 t1 = new Time12(10, 20, AmPm.am);
            Time12 t2 = new Time12(10, 15, AmPm.am);
            assertEquals(5, Time12.subtract(t1, t2));
        } catch (Exception e) {}
    }
    
    @Test
    public void HourGreater_MinuteGreater_BothPM_Positive()
    {
        try
        {
            Time12 t1 = new Time12(10, 10, AmPm.pm);
            Time12 t2 = new Time12(8, 0, AmPm.pm);
            assertEquals(130, Time12.subtract(t1, t2));
        } catch (Exception e) {}
    }
    
    @Test
    public void HourGreater_MinuteLess_BothPM_Positive()
    {
        try
        {
            Time12 t1 = new Time12(10, 0, AmPm.pm);
            Time12 t2 = new Time12(8, 30, AmPm.pm);
            assertEquals(90, Time12.subtract(t1, t2));
        } catch (Exception e) {}
    }
    
    @Test
    public void HourGreater_MinuteEqual_BothPM_Positive()
    {
        try
        {
            Time12 t1 = new Time12(10, 0, AmPm.pm);
            Time12 t2 = new Time12(8, 0, AmPm.pm);
            assertEquals(120, Time12.subtract(t1, t2));
        } catch (Exception e) {}
    }
    
    @Test
    public void HourEqual_MinuteGreater_BothPM_Positive()
    {
        try
        {
            Time12 t1 = new Time12(10, 20, AmPm.pm);
            Time12 t2 = new Time12(10, 15, AmPm.pm);
            assertEquals(5, Time12.subtract(t1, t2));
        } catch (Exception e) {}
    }
    
    @Test
    public void BothAM_Equal()
    {
        try
        {
            Time12 t1 = new Time12(10, 47, AmPm.am);
            Time12 t2 = new Time12(10, 47, AmPm.sm);
            assertEquals(0, Time12.subtract(t1, t2));
        } catch (Exception e) {}
    }
    
    @Test
    public void BothPM_Equal()
    {
        try
        {
            Time12 t1 = new Time12(3, 54, AmPm.pm);
            Time12 t2 = new Time12(3, 54, AmPm.pm);
            assertEquals(0, Time12.subtract(t1, t2));
        } catch (Exception e) {}
    }
    
    public void HourGreater_MinuteGreater_PMvsAM_Positive()
    {
        try
        {
            Time12 t1 = new Time12(12, 45, AmPm.pm);
            Time12 t2 = new Time12(8, 36, AmPm.am);
            assertEquals(-249, Time12.subtract(t2, t1));
        } catch (Exception e) {}
    }
    
    @Test
    public void HourGreater_MinuteLess_PMvsAM_Positive()
    {
        try
        {
            Time12 t1 = new Time12(11, 45, AmPm.pm);
            Time12 t2 = new Time12(10, 55, AmPm.am);
            assertEquals(-50, Time12.subtract(t2, t1));
        } catch (Exception e) {}
    }
    
    @Test
    public void HourLess_MinuteLess_PMvsAM_Positive()
    {
        try
        {
            Time12 t1 = new Time12(3, 30, AmPm.pm);
            Time12 t2 = new Time12(11, 50, AmPm.am);
            assertEquals(-220, Time12.subtract(t2, t1));
        } catch (Exception e) {}
    }
    
    @Test
    public void HourLess_MinuteGreater_PMvsAM_Positive()
    {
        try
        {
            Time12 t1 = new Time12(4, 45, AmPm.pm);
            Time12 t2 = new Time12(11, 30, AmPm.am);
            assertEquals(-315, Time12.subtract(t2, t1));
        } catch (Exception e) {}
    }
    
    @Test
    public void HourGreater_MinuteEqual_PMvsAM_Positive()
    {
        try
        {
            Time12 t1 = new Time12(12, 0, AmPm.pm);
            Time12 t2 = new Time12(11, 0, AmPm.am);
            assertEquals(-60, Time12.subtract(t2, t1));
        } catch (Exception e) {}
    }
    
    @Test
    public void HourLess_MinuteEqual_PMvsAM_Positive()
    {
        try
        {
            Time12 t1 = new Time12(5, 30, AmPm.pm);
            Time12 t2 = new Time12(10, 30, AmPm.am);
            assertEquals(-420, Time12.subtract(t2, t1));
        } catch (Exception e) {}
    }
    
    @Test
    public void HourEqual_MinuteGreater_PMvsAM_Positive()
    {
        try
        {
            Time12 t1 = new Time12(9, 45, AmPm.pm);
            Time12 t2 = new Time12(9, 20, AmPm.am);
            assertEquals(-745, Time12.subtract(t2, t1));
        } catch (Exception e) {}
    }
    
    @Test
    public void HourEqual_MinuteLess_PMvsAM_Positive()
    {
        try
        {
            Time12 t1 = new Time12(9, 10, AmPm.pm);
            Time12 t2 = new Time12(9, 40, AmPm.am);
            assertEquals(-690, Time12.subtract(t2, t1));
        } catch (Exception e) {}
    }
    
    @Test
    public void HourEqual_MinuteEqual_PMvsAM_Positive()
    {
        try
        {
            Time12 t1 = new Time12(9, 30, AmPm.pm);
            Time12 t2 = new Time12(9, 30, AmPm.am);
            assertEquals(-720, Time12.subtract(t2, t1));
        } catch (Exception e) {}
    }
    
    @Test
    public void HourGreater_MinuteGreater_BothAM_Positive()
    {
        try
        {
            Time12 t1 = new Time12(10, 10, AmPm.am);
            Time12 t2 = new Time12(8, 0, AmPm.am);
            assertEquals(-130, Time12.subtract(t2, t1));
        } catch (Exception e) {}
    }
    
    @Test
    public void HourGreater_MinuteLess_BothAM_Positive()
    {
        try
        {
            Time12 t1 = new Time12(10, 0, AmPm.am);
            Time12 t2 = new Time12(8, 30, AmPm.am);
            assertEquals(-90, Time12.subtract(t2, t1));
        } catch (Exception e) {}
    }
    
    @Test
    public void HourGreater_MinuteEqual_BothAM_Positive()
    {
        try
        {
            Time12 t1 = new Time12(10, 0, AmPm.am);
            Time12 t2 = new Time12(8, 0, AmPm.am);
            assertEquals(-120, Time12.subtract(t2, t1));
        } catch (Exception e) {}
    }
    
    @Test
    public void HourEqual_MinuteGreater_BothAM_Positive()
    {
        try
        {
            Time12 t1 = new Time12(10, 20, AmPm.am);
            Time12 t2 = new Time12(10, 15, AmPm.am);
            assertEquals(-5, Time12.subtract(t2, t1));
        } catch (Exception e) {}
    }
    
    @Test
    public void HourGreater_MinuteGreater_BothPM_Positive()
    {
        try
        {
            Time12 t1 = new Time12(10, 10, AmPm.pm);
            Time12 t2 = new Time12(8, 0, AmPm.pm);
            assertEquals(-130, Time12.subtract(t2, t1));
        } catch (Exception e) {}
    }
    
    @Test
    public void HourGreater_MinuteLess_BothPM_Positive()
    {
        try
        {
            Time12 t1 = new Time12(10, 0, AmPm.pm);
            Time12 t2 = new Time12(8, 30, AmPm.pm);
            assertEquals(-90, Time12.subtract(t2, t1));
        } catch (Exception e) {}
    }
    
    @Test
    public void HourGreater_MinuteEqual_BothPM_Positive()
    {
        try
        {
            Time12 t1 = new Time12(10, 0, AmPm.pm);
            Time12 t2 = new Time12(8, 0, AmPm.pm);
            assertEquals(-120, Time12.subtract(t2, t1));
        } catch (Exception e) {}
    }
    
    @Test
    public void HourEqual_MinuteGreater_BothPM_Positive()
    {
        try
        {
            Time12 t1 = new Time12(10, 20, AmPm.pm);
            Time12 t2 = new Time12(10, 15, AmPm.pm);
            assertEquals(-5, Time12.subtract(t2, t1));
        } catch (Exception e) {}
    }
}
