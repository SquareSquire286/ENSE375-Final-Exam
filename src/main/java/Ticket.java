import java.util.ArrayList;
import java.util.Arrays;
/**
 * Class Ticket, a List of Flights in ordered sequences
 *
 */
public class Ticket
{
	
	private static final String [] SchengenAirportsCode = new String[] { "VIE","BRU","PRG","CPH","TLL","HEL","CDG","FRA","MUC","ATH","BUD","KEF","CIA","RIX","VNO","LUX","MLA","AMS","OSL","WAW","LIS","LJU","KSC","MAD","ARN","BRN"};
	/**
	 * The function checks the validaity of a ticket
	 * It checks
	 *		1. airports code are in IATA format (any three uppercases letters)
	 *		2. maximum flights Count <= number of flights in the ticket
	 *		3. maximum flight time <= Total flight times ( sum of flight time of each flight)
	 *		4. maximum layover time <= Total layover times ( sum of layover time between each consequative flight)
	 *		5. no flight between two airports in the Schengen area unless the passenger has a valid SchengenVisa
	 *		6. no cyclic trip
	 *		7. The sequence of flights in correct ( the arrival airport of a flight is the departure airport of the next flight)
	 * 		8. any other logical constraints 
	 * @param	ticket				List of ordered sequences of flights
	 * @param	maxFlightsCount		Maximum number of flights in the ticket
	 * @param	maxFlightTime		Maximum allowable total flight times in minutes
	 * @param	maxLayoverTime		Maximum allowable total layover times in minutes
	 * @param	hasSchengenVisa		to indicate if the passenger has a valid Schengen Visa or not
	 * @return	true if the ticket is valid, false otherwise
	 * usefeul functions that you may use
	 * 		(class: Flight , method: getArrivalAirport)
	 * 		(class: Flight , method: getDepatureAirport)
	 * 		(class: Flight , method: calculateFlightTime)
	 * 		(class: Flight , method: calculateLayoverTime)
	 * 		(class: ticket , method: hasCyclicTrip)
	*/
	public static boolean checkTicket( ArrayList<Flight> ticket, int maxFlightsCount, int maxFlightTime, int maxLayoverTime, boolean hasSchengenVisa)
	{
	    for (Flight flight : ticket) // Checks condition #1
		{
		    for (int i = 0; i < flight.getDepartureAirport().length(); i++)
			{
			    int ascii = flight.getDepartureAirport().charAt(i);
			    if (ascii < 65 || ascii > 90)
				return false;
			}

		    for (int i = 0; i < flight.getArrivalAirport().length(); i++)
			{
			    int ascii = flight.getArrivalAirport().charAt(i);
			    if (ascii < 65 || ascii > 90)
				return false;
			}
		}

	    if (ticket.size() > maxFlightsCount) // Checks condition #2
		return false;

	    int flightTime = 0;
	    int layoverTime = 0;

	    for (int i = 0; i < ticket.size(); i++)
		{
		    try
			{
			    flightTime += ticket.get(i).calculateFlightTime();
			}
		    catch (Exception e)
			{
			}
		}

	    for (int i = 0; i < ticket.size() - 1; i++)
		{
		    try
			{
			    layoverTime += Flight.calculateLayoverTime(ticket.get(i), ticket.get(i + 1));
			}
		    catch (Exception e)
			{
			}
		}
	    
	    if (flightTime > maxFlightTime) // Checks condition #3
		return false;

	    if (layoverTime > maxLayoverTime) // Checks condition #4
		return false;

	    int schengenAirportCount = 0;

	    for (Flight flight : ticket)
		{
		    for (int i = 0; i < Ticket.SchengenAirportsCode.length; i++)
			if (flight.getArrivalAirport().equals(Ticket.SchengenAirportsCode[i]))
			    schengenAirportCount++;
		}

	    if (schengenAirportCount > 1 && !hasSchengenVisa) // Checks condition #5
		return false;

	    if (Ticket.hasCyclicTrip(ticket)) // Checks condition #6
	      return false;

	    for (int i = 0; i < ticket.size() - 1; i ++) // Checks condition #7
		{
		    if (!(ticket.get(i).getArrivalAirport().equals(ticket.get(i + 1).getDepartureAirport())))
		        return false;
		}
	    
	    return true;
	}
		/**
	 * The function checks if the ticket has a cyclic trip
	 * (that is, no passenger can arrive at the same airport more than once within the same ticket)
	 * @param	ticket				List of ordered sequences of flights
	 * @return	true if the ticket has a cyclic trip, false otherwise
	 * usefeul functions that you may use
	 * 		(class: Flight , method: getArrivalAirport)
	 * 		(class: Flight , method: getDepatureAirport)
	*/
	public static boolean hasCyclicTrip(ArrayList<Flight> ticket)
	{
	    boolean cyclicTripExists = false;
	    
	    for (int i = 0; i < ticket.size(); i++)
		{ // a round trip is allowed, but there cannot be any flights after the initial airport is returned to
		    if (i < ticket.size() - 1 && (ticket.get(i).getArrivalAirport().equals(ticket.get(0).getDepartureAirport())))
			cyclicTripExists = true;

		    for (int j = i + 1; j < ticket.size(); j++) // the same destination cannot appear twice under any circumstances
			if (ticket.get(i).getArrivalAirport().equals(ticket.get(j).getArrivalAirport()))
			    cyclicTripExists = true;
		}
	    
	    return cyclicTripExists;
	}
}
