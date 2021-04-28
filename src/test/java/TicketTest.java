import java.util.ArrayList;
import org.junit.jupiter.api.Test; //JUnit5
import static org.junit.jupiter.api.Assertions.*;

public class TicketTest
{
    @Test
    public void InvalidDepartureAirport_Fails()
    {
        try
        {
            Flight f1 = new Flight("jDs", "YQR", new DateTime(new Date(5, 10, 2021), new Time(7, 45, AmPm.am)), new DateTime(new Date(5, 10, 2021), new Time(10, 30, AmPm.am)));
            ArrayList<Flight> flightList = new ArrayList<Flight>();
            flightList.add(f1);
            
            int maxFlights = 2;
            int maxFlightTime = 180;
            int maxLayoverTime = 30;
            boolean hasSchengenVisa = false;
            
            assertFalse(Ticket.checkTicket(flightList, maxFlights, maxFlightTime, maxLayoverTime, hasSchengenVisa));
        }
        catch (Exception e) {}
    }
    
    @Test
    public void InvalidArrivalAirport_Fails()
    {
        try
        {
            Flight f1 = new Flight("VIE", "ath", new DateTime(new Date(5, 10, 2021), new Time(7, 45, AmPm.am)), new DateTime(new Date(5, 10, 2021), new Time(10, 30, AmPm.am)));
            ArrayList<Flight> flightList = new ArrayList<Flight>();
            flightList.add(f1);
            
            int maxFlights = 2;
            int maxFlightTime = 180;
            int maxLayoverTime = 30;
            boolean hasSchengenVisa = false;
            
            assertFalse(Ticket.checkTicket(flightList, maxFlights, maxFlightTime, maxLayoverTime, hasSchengenVisa));
        }
        catch (Exception e) {}
    }
    
    @Test
    public void InvalidSecondDepartureAirport_Fails()
    {
        try
        {
            Flight f2 = new Flight("YQR", "VIE", new DateTime(new Date(5, 10, 2021), new Time(3, 0, AmPm.am)), new DateTime(new Date(5, 10, 2021), new Time(7, 30, AmPm.am)));
            Flight f2 = new Flight("VIe", "YYZ", new DateTime(new Date(5, 10, 2021), new Time(7, 45, AmPm.am)), new DateTime(new Date(5, 10, 2021), new Time(10, 30, AmPm.am)));
            ArrayList<Flight> flightList = new ArrayList<Flight>();
            flightList.add(f1);
            flightList.add(f2);
            
            int maxFlights = 2;
            int maxFlightTime = 180;
            int maxLayoverTime = 30;
            boolean hasSchengenVisa = false;
            
            assertFalse(Ticket.checkTicket(flightList, maxFlights, maxFlightTime, maxLayoverTime, hasSchengenVisa));
        }
        catch (Exception e) {}
    }
    
    @Test
    public void InvalidSecondArrivalAirport_Fails()
    {
        try
        {
            Flight f2 = new Flight("YQR", "VIE", new DateTime(new Date(5, 10, 2021), new Time(3, 0, AmPm.am)), new DateTime(new Date(5, 10, 2021), new Time(7, 30, AmPm.am)));
            Flight f2 = new Flight("VIE", "ath", new DateTime(new Date(5, 10, 2021), new Time(7, 45, AmPm.am)), new DateTime(new Date(5, 10, 2021), new Time(10, 30, AmPm.am)));
            ArrayList<Flight> flightList = new ArrayList<Flight>();
            flightList.add(f1);
            flightList.add(f2);
            
            int maxFlights = 2;
            int maxFlightTime = 180;
            int maxLayoverTime = 30;
            boolean hasSchengenVisa = false;
            
            assertFalse(Ticket.checkTicket(flightList, maxFlights, maxFlightTime, maxLayoverTime, hasSchengenVisa));
        }
        catch (Exception e) {}
    }
}
