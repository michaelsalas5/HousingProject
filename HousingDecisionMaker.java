import java.util.Scanner;

public class HousingDecisionMaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Age;
		String Year = "yes";
		String LocationStatus = "yes";
		double GPA;
		String WorkStudy = "yes";
		String Military = "yes";
		int HousingPoints = 0;

		Scanner keyboard = new Scanner(System.in);

		System.out.print("How old are you?: ");
		Age = keyboard.nextInt();
		if (Age <= 22)
			HousingPoints += 2;
		if (Age >= 23)
			HousingPoints += 1;

		System.out.print("What year are you?: (ex. freshman, sophomore...)");
		Year = keyboard.next();
		if (Year.equals("freshman")) {
			HousingPoints += 4;
		} else if (Year.equals("sophomore")) {
			HousingPoints += 3;
		} else if (Year.equals("junior")) {
			HousingPoints += 2;
		} else if (Year.equals("senior")) {
			HousingPoints += 1;
		}

		System.out.print("Are you an International/Out of State Student?: (Enter yes or no) ");
		LocationStatus = keyboard.next();
		if (LocationStatus.equals("yes"))
			HousingPoints += 5;

		System.out.print("What is your gpa?: (incoming freshman enter 0 to skip)");
		GPA = keyboard.nextDouble();
		if (GPA >= 3.5) {
			HousingPoints += 2;
		} else if (0.1 <= GPA && GPA <= 2.0) {
			HousingPoints += -1;
		} else if (GPA == 0) {
			HousingPoints += 0;
		}

		System.out.print("Are you participating in work study?:  (yes or no)");
		WorkStudy = keyboard.next();
		WorkStudy = "yes";
		if (WorkStudy.equals("yes")) {
			HousingPoints += 2;
		}

		System.out.print("Have you served or are currently in the military?: (yes or no)");
		Military = keyboard.next();
		if (Military.equals("yes")) {
			HousingPoints += 3;
		}

		System.out.println("You have " + HousingPoints + " housing points.");

		keyboard.close();

	}
}
