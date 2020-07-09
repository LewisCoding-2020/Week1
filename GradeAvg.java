//**********************************************************
//	Java				Author: Tracy
//						Date: July 7, 2020
//**********************************************************


public class GradeAvg {
//This program will find the average of Quiz Scores and Test Scores
	
	public static void main(String[] args) {
	
		double quizScore1, quizScore2, quizScore3, testScore1, testScore2, quizScoreAvg, testScoreAvg;
		
			quizScore1 = 30.5;
			quizScore2 = 70.5;
			quizScore3 = 50.5;
			testScore1 = 70.25;
			testScore2 = 80.25;
			quizScoreAvg = (quizScore1 + quizScore2 + quizScore3) /3;
			testScoreAvg = (testScore1 + testScore2) /2;
				
		System.out.println("Average Quiz Score = " + quizScoreAvg +"%");
		System.out.println("Average Test Score = " + testScoreAvg +"%");
				
	}

}
