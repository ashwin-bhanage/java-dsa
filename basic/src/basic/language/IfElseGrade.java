package basic.language;

public class IfElseGrade {

	public static void main(String[] args) {
		int score = 85;

		IfElseGrade gradeChecker = new IfElseGrade();
		gradeChecker.checkGrade(score);
	}

	public void checkGrade(int score) {
		if (score >= 90) {
			System.out.println("Grade: A");
		} else if (score >= 80) {
			System.out.println("Grade: B");
		} else if (score >= 70) {
			System.out.println("Grade: C");
		} else if (score >= 60) {
			System.out.println("Grade: D");
		} else {
			System.out.println("Grade: F");
		}
	}
}
