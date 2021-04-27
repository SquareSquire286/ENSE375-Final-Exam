import org.junit.jupiter.api.Test; //JUnit5
import static org.junit.jupiter.api.Assertions.*;

public class Time24Test
{
    @Test
    public void NormalAfternoonDate_Valid()
    {
        int hours = 3;
        int minutes = 00;
        AmPm ampm = AmPm.pm;
        
        Time24 time = Time24.toTime24(hours, minutes, ampm);
        String timeString = time.toString();
        assertEquals("15:00", timeString);
    }
}
