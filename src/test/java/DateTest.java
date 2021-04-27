import org.junit.jupiter.api.Test; //JUnit5
import static org.junit.jupiter.api.Assertions.*;

public class DateTest
{
    @Test
    public void YearGreater_MonthGreater_DayGreater_False()
    {
        try
        {
            Date d1 = new Date(8, 12, 2017);
            Date d2 = new Date(7, 4, 2004);
            assertEquals(false, Date.lessThan(d1, d2));
        }
        catch (Exception e) {}
    }
    
    @Test
    public void YearGreater_MonthLess_DayGreater_False()
    {
        try
        {
            Date d1 = new Date(4, 26, 2019);
            Date d2 = new Date(6, 24, 2016);
            assertEquals(false, Date.lessThan(d1, d2));
        }
        catch (Exception e) {}
    }
    
    @Test
    public void YearGreater_MonthEqual_DayGreater_False()
    {
        try
        {
            Date d1 = new Date(5, 15, 2018);
            Date d2 = new Date(5, 7, 2016);
            assertEquals(false, Date.lessThan(d1, d2));
        }
        catch (Exception e) {}
    }
    
    @Test
    public void YearGreater_MonthGreater_DayLess_False()
    {
        try
        {
            Date d1 = new Date(5, 15, 2018);
            Date d2 = new Date(5, 27, 2016);
            assertEquals(false, Date.lessThan(d1, d2));
        }
        catch (Exception e) {}
    }
    
    @Test
    public void YearGreater_MonthLess_DayLess_False()
    {
        try
        {
            Date d1 = new Date(4, 10, 2017);
            Date d2 = new Date(6, 29, 2014);
            assertEquals(false, Date.lessThan(d1, d2));
        }
        catch (Exception e) {}
    }
    
    @Test
    public void YearGreater_MonthEqual_DayLess_False()
    {
        try
        {
            Date d1 = new Date(8, 11, 2015);
            Date d2 = new Date(8, 23, 2008);
            assertEquals(false, Date.lessThan(d1, d2));
        }
        catch (Exception e) {}
    }
    
    @Test
    public void YearGreater_MonthGreater_DayEqual_False()
    {
        try
        {
            Date d1 = new Date(12, 31, 2017);
            Date d2 = new Date(7, 31, 2013);
            assertEquals(false, Date.lessThan(d1, d2));
        }
        catch (Exception e) {}
    }
    
    @Test
    public void YearGreater_MonthLess_DayEqual_False()
    {
        try
        {
            Date d1 = new Date(2, 23, 2021);
            Date d2 = new Date(7, 23, 2011);
            assertEquals(false, Date.lessThan(d1, d2));
        }
        catch (Exception e) {}
    }
    
    @Test
    public void YearGreater_MonthEqual_DayEqual_False()
    {
        try
        {
            Date d1 = new Date(4, 24, 2021);
            Date d2 = new Date(4, 24, 2012);
            assertEquals(false, Date.lessThan(d1, d2));
        }
        catch (Exception e) {}
    }
    
    @Test
    public void YearEqual_MonthGreater_DayGreater_False()
    {
        try
        {
            Date d1 = new Date(5, 30, 2019);
            Date d2 = new Date(4, 24, 2019);
            assertEquals(false, Date.lessThan(d1, d2));
        }
        catch (Exception e) {}
    }
    
    @Test
    public void YearEqual_MonthGreater_DayLess_False()
    {
        try
        {
            Date d1 = new Date(5, 10, 2019);
            Date d2 = new Date(4, 24, 2019);
            assertEquals(false, Date.lessThan(d1, d2));
        }
        catch (Exception e) {}
    }
    
    @Test
    public void YearEqual_MonthGreater_DayEqual_False()
    {
        try
        {
            Date d1 = new Date(5, 17, 2019);
            Date d2 = new Date(4, 17, 2019);
            assertEquals(false, Date.lessThan(d1, d2));
        }
        catch (Exception e) {}
    }
    
    @Test
    public void YearEqual_MonthEqual_DayGreater_False()
    {
        try
        {
            Date d1 = new Date(6, 26, 2019);
            Date d2 = new Date(6, 4, 2019);
            assertEquals(false, Date.lessThan(d1, d2));
        }
        catch (Exception e) {}
    }
    
    @Test
    public void AllEqual_False()
    {
        try
        {
            Date d1 = new Date(6, 26, 1999);
            Date d2 = new Date(6, 26, 1999);
            assertEquals(false, Date.lessThan(d1, d2));
        }
        catch (Exception e) {}
    }
    
    @Test
    public void YearLess_MonthLess_DayLess_False()
    {
        try
        {
            Date d1 = new Date(8, 12, 2017);
            Date d2 = new Date(7, 4, 2004);
            assertEquals(true, Date.lessThan(d2, d1));
        }
        catch (Exception e) {}
    }
    
    @Test
    public void YearLess_MonthGreater_DayLess_True()
    {
        try
        {
            Date d1 = new Date(4, 26, 2019);
            Date d2 = new Date(6, 24, 2016);
            assertEquals(true, Date.lessThan(d2, d1));
        }
        catch (Exception e) {}
    }
    
    @Test
    public void YearLess_MonthEqual_DayLess_True()
    {
        try
        {
            Date d1 = new Date(5, 15, 2018);
            Date d2 = new Date(5, 7, 2016);
            assertEquals(true, Date.lessThan(d2, d1));
        }
        catch (Exception e) {}
    }
    
    @Test
    public void YearLess_MonthLess_DayGreater_True()
    {
        try
        {
            Date d1 = new Date(5, 15, 2018);
            Date d2 = new Date(5, 27, 2016);
            assertEquals(true, Date.lessThan(d2, d1));
        }
        catch (Exception e) {}
    }
    
    @Test
    public void YearLess_MonthGreater_DayGreater_True()
    {
        try
        {
            Date d1 = new Date(4, 10, 2017);
            Date d2 = new Date(6, 29, 2014);
            assertEquals(true, Date.lessThan(d2, d1));
        }
        catch (Exception e) {}
    }
    
    @Test
    public void YearLess_MonthEqual_DayGreater_True()
    {
        try
        {
            Date d1 = new Date(8, 11, 2015);
            Date d2 = new Date(8, 23, 2008);
            assertEquals(true, Date.lessThan(d2, d1));
        }
        catch (Exception e) {}
    }
    
    @Test
    public void YearLess_MonthLess_DayEqual_True()
    {
        try
        {
            Date d1 = new Date(12, 31, 2017);
            Date d2 = new Date(7, 31, 2013);
            assertEquals(true, Date.lessThan(d2, d1));
        }
        catch (Exception e) {}
    }
    
    @Test
    public void YearLess_MonthGreater_DayEqual_True()
    {
        try
        {
            Date d1 = new Date(2, 23, 2021);
            Date d2 = new Date(7, 23, 2011);
            assertEquals(true, Date.lessThan(d2, d1));
        }
        catch (Exception e) {}
    }
    
    @Test
    public void YearLess_MonthEqual_DayEqual_True()
    {
        try
        {
            Date d1 = new Date(4, 24, 2021);
            Date d2 = new Date(4, 24, 2012);
            assertEquals(true, Date.lessThan(d2, d1));
        }
        catch (Exception e) {}
    }
    
    @Test
    public void YearEqual_MonthLess_DayLess_True()
    {
        try
        {
            Date d1 = new Date(5, 30, 2019);
            Date d2 = new Date(4, 24, 2019);
            assertEquals(true, Date.lessThan(d2, d1));
        }
        catch (Exception e) {}
    }
    
    @Test
    public void YearEqual_MonthLess_DayGreater_True()
    {
        try
        {
            Date d1 = new Date(5, 10, 2019);
            Date d2 = new Date(4, 24, 2019);
            assertEquals(true, Date.lessThan(d2, d1));
        }
        catch (Exception e) {}
    }
    
    @Test
    public void YearEqual_MonthGreater_DayEqual_True()
    {
        try
        {
            Date d1 = new Date(5, 17, 2019);
            Date d2 = new Date(4, 17, 2019);
            assertEquals(true, Date.lessThan(d2, d1));
        }
        catch (Exception e) {}
    }
    
    @Test
    public void YearEqual_MonthEqual_DayGreater_True()
    {
        try
        {
            Date d1 = new Date(6, 26, 2019);
            Date d2 = new Date(6, 4, 2019);
            assertEquals(true, Date.lessThan(d2, d1));
        }
        catch (Exception e) {}
    }
}
