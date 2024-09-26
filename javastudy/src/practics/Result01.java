package practics;

import java.util.Scanner;

public class Result01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);

		        // Get the scores from the user
		        System.out.println("국어 점수를 입력해주세요.");
		        int koreanScore = scanner.nextInt();

		        System.out.println("영어 점수를 입력해주세요.");
		        int englishScore = scanner.nextInt();

		        System.out.println("수학 점수를 입력해주세요.");
		        int mathScore = scanner.nextInt();

		        // Calculate the average score
		        double averageScore = (koreanScore + englishScore + mathScore) / 3.0;
		        
		        // Determine the grade
		        String grade;
		        if (averageScore >= 90) {
		            grade = "A";
		        } else if (averageScore >= 80) {
		            grade = "B";
		        } else if (averageScore >= 70) {
		            grade = "C";
		        } else {
		            grade = "D";
		        }

		        // Print the results
		        System.out.println("평균: " + averageScore);
		        System.out.println("등급: " + grade);
	}
}


