package pack1;

import java.util.HashMap;
import java.util.Map;

public class RideRepository {

	Map<String, Ride[]> userRides = new HashMap<>();

		//addRideForUser method
		public void addRideForUser(String userId, Ride[] rides) {

			userRides.put(userId, rides);
		}

		//getRidesForUser method
		public Ride[] getRidesForUser(String userId) {
			return userRides.get(userId);
		}
}
