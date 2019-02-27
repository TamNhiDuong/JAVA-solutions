
public class TimePeriod {

	// Instance field
	private int hours;
	private int minutes;

	// Constructor
	public TimePeriod() {
		hours = 0;
		minutes = 0;
	}

	// Methods
	int totalMin;   //to calculate hours from minutes
	int hoursToAdd; // to generate hours from minutes over 60min
	int hoursSum;   // to limit hours under 99
	int minSum;     // to limit minutes under 59

	public void addHours(int hoursToAdd) {
		hoursSum = hours + hoursToAdd;

		if (hoursToAdd >= 0 && hoursSum <= 99) {
			hours = hours + hoursToAdd;
		}

		else {
			hoursToAdd = 0;
		}
	}

	public void addMinutes(int minutesToAdd) {
		minSum = minutes + minutesToAdd; 

		if (minutesToAdd >= 0 && minutesToAdd <= 60 && hoursSum < 99) {
			totalMin = minutes + minutesToAdd;
			minutes = totalMin % 60;

			if (totalMin >= 60) {
				hoursToAdd = totalMin / 60;
				hours = hours + hoursToAdd;

			}
		}
		else if (hoursSum >= 99 && minSum <= 59) {
			minutes = minutes + minutesToAdd;
		}

		else {
			minutesToAdd = 0;
		}
	}

	public String toString() {
		return hours + " h " + minutes + " min";
	}

}
