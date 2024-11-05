/*
There are multiple deliverables that you must complete for this project. In
summary:
1) Provide a list of all the factors you have gathered from your group discussions
and your individual conversation(s) with friends or family.
2) Design an algorithm that assigns points to students for the factors that you
believe are the most important in your list above.
Include in your algorithm a minimum of 4 factors/questions – and implement them
in your Java code.
3) Write a program that does the following:
Ask students questions (like "What class year are you?").
Assign points based on their answers (like 4 points for senior).
Accumulate their total points across all answers (like "You have 23 housing
points").
4) Write 3-5 test cases for your program.
5) Lastly, capture your reflections.
6) Submit this completed file via upload to the Programming Project # 2 assignment
page.
Here's additional detail on these deliverables:
1) Provide a List of All Factors
This list should begin with the factors we discussed in class (copied here from the
slides):
Grade Level (Freshman, Sophomore, Junior, Senior)
Age
Part-Time Job / Work-Study
Academic Probation
Academic Suspension
Disciplinary Probation
Add to this list the factors that you gathered from your group discussions.
Distance from campus, masters students, if they are first gen.
Although you discussed these factors during your group activity, it's not enough.
Other people may think differently about what is fair.
Using this list, interview other people. Try to interview people outside the CSC
121 class; perhaps friends or family.
Ask which of these factors are important to them. Ask them if they have other
factors.
Add to this list any new factors that you gather from these conversations.
Military, GPA
2) Design Your Algorithm
Pick at least 4 factors from the overall list (that you created in step 1 above)
that you consider to be the most important.
For each factor, indicate what question you want to ask a student and what points
you want to assign for their response.
For example...
Question: What class year are you? (1, 2, 3, 4):
1: +1 point
2: +2 points
3: +3 points
4: +4 points
Question: How old are you?
If greater than 22, then + 1 point
If 22 or less, then no points
3) Using your algorithm, write your program - use the class and main method laid
out below.
4) Write 3-5 test cases for your program.
Here's an example:
A 22-year-old junior should output 3 points
A 19 year old sophomore who isnt international, has a 3.7 gpa, participates in work study, and is not in the 
military should give 9 points
A 25 year old sophomore who is an international student with a 3.0 gpa, who is also participating in work 
study and has also served in the military should give 14 points
A 20 year old incoming freshman who is an international student, with no gpa but is participating in 
work study and is also serving in the military should give 16 points
5) Capture Your Reflections
Your code is working now... But is it fair?
Take a few minutes and reflect upon your good work...
Consider answering these questions:
Which students are most likely to benefit from your algorithm?
Which students are most likely to be forgotten by your algorithm?
What else occurs to you as you think about this entire journey?
My code is fair for the most part. It helps those who are new to the school and those coming from 
international backgrounds who may really need campus housing. It also helps support those who may have
served or are still serving in the military. The points benefit those who are involved on campus, in either
work study or good GPA standing. The seniors however may be a bit under represented, however this simulation
is implying that there is limited housing available, and I believe that seniors and juniors at that point
should have the advantage with outside of campus housing such as apartments, which some freshman may not 
have the funds or be comfortable with doing.
*/

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
