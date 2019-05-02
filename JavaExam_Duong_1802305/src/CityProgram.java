import java.util.ArrayList;
import java.util.Scanner;

public class CityProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<City> cityList = new ArrayList<City>();
		int population = 0;
		String country = "";
		String name = "";
		City cityInput = new City(name, population, country);

		System.out.println("=== Enter cities (empty city name ends) ===");

		System.out.print("Enter city name: ");
		name = input.nextLine();
		cityInput = new City(name, population, country);

		while (!name.isEmpty()) {
		
			System.out.print("Enter population: ");
			population = Integer.parseInt(input.nextLine());
			cityInput = new City(name, population, country);

			System.out.print("Enter country: ");
			country = input.nextLine();
			cityInput = new City(name, population, country);
			cityList.add(cityInput);
			System.out.println();

			System.out.print("Enter city name: ");
			name = input.nextLine();
			cityInput = new City(name, population, country);

		}
		System.out.println();
		System.out.println("=== City infor ===");

		int max = 0;

		String mostPopulated = "";
		for (int i = cityList.size()-1; i >= 0; i--) {
			if (cityList.get(i).getPopulation() > max) {
				max = cityList.get(i).getPopulation();
				mostPopulated = cityList.get(i).getCityName();
			}
		}

		int min = max;

		for (int i = 0; i < cityList.size(); i++) {
			if (cityList.get(i).getPopulation() < min) {
				min = cityList.get(i).getPopulation();
			}
		}
		int total = max + min;
		int percent = (max - min) * 100 / min;

		System.out.println("The most populated city is " + mostPopulated + ".");
		System.out.println("It has " + percent + " % more than inhabitants than the least populated city.");

		System.out.println();
		for (int i = cityList.size()-1; i >= 0; i--) {
			System.out.println(cityList.get(i).getCityName() + " in " + cityList.get(i).getCountryName() + " has "
					+ cityList.get(i).getPopulation() + " inhabitants");
		}

	}

}
