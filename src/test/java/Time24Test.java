import org.junit.jupiter.api.Test; //JUnit5
import static org.junit.jupiter.api.Assertions.*;

public class Time24Test
{
    @Test
    public void NormalAfternoonTime_Valid()
    {
        try
        {
            Time24 time = Time24.toTime24(3, 0, AmPm.pm);
        } catch (InvalidTimeException e) {}
        
        String timeString = time.toString();
        assertEquals("15:00", timeString);
    }
    
    @Test
    public void TwelveOClockAfternoonTime_Valid()
    {
        try
        {
            Time24 time = Time24.toTime24(12, 27, AmPm.pm);
        } catch (InvalidTimeException e) {}
        
        String timeString = time.toString();
        assertEquals("12:27", timeString);
    }
    
    @Test
    public void NormalMorning_Valid()
    {
        try
        {
            Time24 time = Time24.toTime24(6, 30, AmPm.am);
        } catch (InvalidTimeException e) {}
        
        String timeString = time.toString();
        assertEquals(" 6:30", timeString);
    }
    
    @Test
    public void TwelveOClockMorning_Valid()
    {
        try
        {
            Time24 time = Time24.toTime24(12, 45, AmPm.am);
        } catch (InvalidTimeException e) {}
        
        String timeString = time.toString();
        assertEquals(" 0:45", timeString);
    }
    
    @Test
    public void AfternoonTime_MinuteException_Invalid()
    {
        assertThrows(InvalidTimeException.class, () -> { Time24 time = Time24.toTime24(3, 65, AmPm.pm);});
    }
    
    @Test
    public void AfternoonTime_HourException_Invalid()
    {
        assertThrows(InvalidTimeException.class, () -> { Time24 time = Time24.toTime24(25, 30, AmPm.pm);});
    }
    
    @Test
    public void TwelveOClockAfternoon_MinuteException_Invalid()
    {
        assertThrows(InvalidTimeException.class, () -> { Time24 time = Time24.toTime24(12, -15, AmPm.pm);});
    }
    
    @Test
    public void TwelveOClockMorning_MinuteException_Invalid()
    {
        assertThrows(InvalidTimeException.class, () -> { Time24 time = Time24.toTime24(12, 90, AmPm.am);});
    }
    
    @Test
    public void NormalMorningTime_HourException_Invalid()
    {
        assertThrows(InvalidTimeException.class, () -> { Time24 time = Time24.toTime24(-4, 30, AmPm.am);});
    }
    
    @Test
    public void NormalMorningTime_MinuteException_Invalid()
    {
        assertThrows(InvalidTimeException.class, () -> { Time24 time = Time24.toTime24(8, -20, AmPm.am);});
    }
}
