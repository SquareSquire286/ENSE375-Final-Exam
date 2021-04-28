import java.util.ArrayList;
import org.junit.jupiter.api.Test; //JUnit5
import static org.junit.jupiter.api.Assertions.*;

public class CyclicTripTest
{
    @Test
    public void FirstDeparture_FirstArrivalMatch_IsCyclic()
    {
        try
        {
            Flight f1 = new Flight("YQR", "YQR", new DateTime(new Date(5, 10, 2021), new Time12(1, 0, AmPm.am)), new DateTime(new Date(5, 10, 2021), new Time12(2, 45, AmPm.am)));
            Flight f2 = new Flight("YQR", "YYZ", new DateTime(new Date(5, 10, 2021), new Time12(3, 0, AmPm.am)), new DateTime(new Date(5, 10, 2021), new Time12(7, 30, AmPm.am)));
            Flight f3 = new Flight("YYZ", "YEG", new DateTime(new Date(5, 10, 2021), new Time12(7, 45, AmPm.am)), new DateTime(new Date(5, 10, 2021), new Time12(10, 30, AmPm.am)));
            ArrayList<Flight> flightList = new ArrayList<Flight>();
            flightList.add(f1);
            flightList.add(f2);
            flightList.add(f3);
            assertTrue(Ticket.hasCyclicTrip(flightList));
        }
        catch (Exception e) {}
    }
    
    @Test
    public void FirstDeparture_SecondArrivalMatch_IsCyclic()
    {
        try
        {
            Flight f1 = new Flight("YQR", "YYZ", new DateTime(new Date(5, 10, 2021), new Time12(1, 0, AmPm.am)), new DateTime(new Date(5, 10, 2021), new Time12(2, 45, AmPm.am)));
            Flight f2 = new Flight("YYZ", "YQR", new DateTime(new Date(5, 10, 2021), new Time12(3, 0, AmPm.am)), new DateTime(new Date(5, 10, 2021), new Time12(7, 30, AmPm.am)));
            Flight f3 = new Flight("YQR", "YEG", new DateTime(new Date(5, 10, 2021), new Time12(7, 45, AmPm.am)), new DateTime(new Date(5, 10, 2021), new Time12(10, 30, AmPm.am)));
            ArrayList<Flight> flightList = new ArrayList<Flight>();
            flightList.add(f1);
            flightList.add(f2);
            flightList.add(f3);
            assertTrue(Ticket.hasCyclicTrip(flightList));
        }
        catch (Exception e) {}
    }
    
    @Test
    public void FirstArrival_SecondArrivalMatch_IsCyclic()
    {
        try
        {
            Flight f1 = new Flight("YQR", "YEG", new DateTime(new Date(5, 10, 2021), new Time12(1, 0, AmPm.am)), new DateTime(new Date(5, 10, 2021), new Time12(2, 45, AmPm.am)));
            Flight f2 = new Flight("YEG", "YEG", new DateTime(new Date(5, 10, 2021), new Time12(3, 0, AmPm.am)), new DateTime(new Date(5, 10, 2021), new Time12(7, 30, AmPm.am)));
            Flight f3 = new Flight("YEG", "YYZ", new DateTime(new Date(5, 10, 2021), new Time12(7, 45, AmPm.am)), new DateTime(new Date(5, 10, 2021), new Time12(10, 30, AmPm.am)));
            ArrayList<Flight> flightList = new ArrayList<Flight>();
            flightList.add(f1);
            flightList.add(f2);
            flightList.add(f3);
            assertTrue(Ticket.hasCyclicTrip(flightList));
        }
        catch (Exception e) {}
    }
    
    @Test
    public void FirstArrival_ThirdArrivalMatch_IsCyclic()
    {
        try
        {
            Flight f1 = new Flight("YQR", "YYZ", new DateTime(new Date(5, 10, 2021), new Time12(1, 0, AmPm.am)), new DateTime(new Date(5, 10, 2021), new Time12(2, 45, AmPm.am)));
            Flight f2 = new Flight("YYZ", "YEG", new DateTime(new Date(5, 10, 2021), new Time12(3, 0, AmPm.am)), new DateTime(new Date(5, 10, 2021), new Time12(7, 30, AmPm.am)));
            Flight f3 = new Flight("YEG", "YYZ", new DateTime(new Date(5, 10, 2021), new Time12(7, 45, AmPm.am)), new DateTime(new Date(5, 10, 2021), new Time12(10, 30, AmPm.am)));
            ArrayList<Flight> flightList = new ArrayList<Flight>();
            flightList.add(f1);
            flightList.add(f2);
            flightList.add(f3);
            assertTrue(Ticket.hasCyclicTrip(flightList));
        }
        catch (Exception e) {}
    }
    
    @Test
    public void SecondArrival_ThirdArrivalMatch_IsCyclic()
    {
        try
        {
            Flight f1 = new Flight("YQR", "YYZ", new DateTime(new Date(5, 10, 2021), new Time12(1, 0, AmPm.am)), new DateTime(new Date(5, 10, 2021), new Time12(2, 45, AmPm.am)));
            Flight f2 = new Flight("YYZ", "YYC", new DateTime(new Date(5, 10, 2021), new Time12(3, 0, AmPm.am)), new DateTime(new Date(5, 10, 2021), new Time12(7, 30, AmPm.am)));
            Flight f3 = new Flight("YYC", "YYC", new DateTime(new Date(5, 10, 2021), new Time12(7, 45, AmPm.am)), new DateTime(new Date(5, 10, 2021), new Time12(10, 30, AmPm.am)));
            ArrayList<Flight> flightList = new ArrayList<Flight>();
            flightList.add(f1);
            flightList.add(f2);
            flightList.add(f3);
            assertTrue(Ticket.hasCyclicTrip(flightList));
        }
        catch (Exception e) {}
    }
    
    @Test
    public void RoundTrip_IsNotCyclic()
    {
        try
        {
            Flight f1 = new Flight("YQR", "YYZ", new DateTime(new Date(5, 10, 2021), new Time12(1, 0, AmPm.am)), new DateTime(new Date(5, 10, 2021), new Time12(2, 45, AmPm.am)));
            Flight f2 = new Flight("YYZ", "YYC", new DateTime(new Date(5, 10, 2021), new Time12(3, 0, AmPm.am)), new DateTime(new Date(5, 10, 2021), new Time12(7, 30, AmPm.am)));
            Flight f3 = new Flight("YYC", "YQR", new DateTime(new Date(5, 10, 2021), new Time12(7, 45, AmPm.am)), new DateTime(new Date(5, 10, 2021), new Time12(10, 30, AmPm.am)));
            ArrayList<Flight> flightList = new ArrayList<Flight>();
            flightList.add(f1);
            flightList.add(f2);
            flightList.add(f3);
            assertFalse(Ticket.hasCyclicTrip(flightList));
        }
        catch (Exception e) {}
    }
    
    @Test
    public void RoundTrip_IsNotCyclic()
    {
        try
        {
            Flight f1 = new Flight("YQR", "YYZ", new DateTime(new Date(5, 10, 2021), new Time12(1, 0, AmPm.am)), new DateTime(new Date(5, 10, 2021), new Time12(2, 45, AmPm.am)));
            Flight f2 = new Flight("YYZ", "YYC", new DateTime(new Date(5, 10, 2021), new Time12(3, 0, AmPm.am)), new DateTime(new Date(5, 10, 2021), new Time12(7, 30, AmPm.am)));
            Flight f3 = new Flight("YYC", "YEG", new DateTime(new Date(5, 10, 2021), new Time12(7, 45, AmPm.am)), new DateTime(new Date(5, 10, 2021), new Time12(10, 30, AmPm.am)));
            ArrayList<Flight> flightList = new ArrayList<Flight>();
            flightList.add(f1);
            flightList.add(f2);
            flightList.add(f3);
            assertFalse(Ticket.hasCyclicTrip(flightList));
        }
        catch (Exception e) {}
    }
}
