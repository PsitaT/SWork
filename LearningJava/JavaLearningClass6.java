package LearningJava;

public class JavaLearningClass6 {

	public static void main(String[] args) {

		int day = 5;
		switch (day) {
		case 1:
			System.out.println("Sunday");
		case 2:
			System.out.println("Monday");
		case 3:
			System.out.println("Tuesday");
		case 4:
			System.out.println("Wednesday");
		case 5:
			System.out.println("Thursday");
		case 6:
			System.out.println("Friday");
		case 7:
			System.out.println("Saturday");
		default:
			System.out.println("Please insert the correct number");
		}

		int Day = 4;
		switch (Day) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Please insert the correct number");
		}

		String City = "Fortworth";
		switch (City) {
		case "Fortworth":
			System.out.println("FW");
		case "Crowley":
			System.out.println("FW");
		case "Burleson":
			System.out.println("FW");
		case "Benbrook":
			System.out.println("FW");
		case "Irving":
			System.out.println("DFW");
		case "Bedford":
			System.out.println("DFW");
		case "Hurst":
			System.out.println("DFW");
		default:
			System.out.println("Please provide correct city name");
		}

		String CityA = "Fortworth";
		switch (CityA) {
		case "Fortworth":
			System.out.println("FW");
			break;
		case "Crowley":
			System.out.println("FW");
			break;
		case "Burleson":
			System.out.println("FW");
			break;
		case "Benbrook":
			System.out.println("FW");
			break;
		case "Irving":
			System.out.println("DFW");
			break;
		case "Bedford":
			System.out.println("DFW");
			break;
		case "Hurst":
			System.out.println("DFW");
			break;
		default:
			System.out.println("Please provide correct cityA name");
		}

	}

}
