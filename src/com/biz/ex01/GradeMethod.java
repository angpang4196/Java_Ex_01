package com.biz.ex01;

public class GradeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 국어, 영어, 수학 성적을 저장할 int형 변수 3개선언
		// 각 과목의 점수를 0~100 까지 범위의 임의의 점수로 생성
		// gradeSum() method 생성하여, 매개변수 3개를 전달받아 성적합계 계산
		// main 으로 결과를 return 하여 콘솔에 표시
		
		int korGrade = 80;
		int engGrade = 70;
		int mathGrade = 63;
		
	    int intSum = korGrade + engGrade + mathGrade; // int intSum = gradeSum(korGrade, engGrade, mathGrade); 
	    gradeSum(korGrade, engGrade, mathGrade);     //   
	    
		System.out.println("국어, 영어, 수학 성적의 총점은 " + intSum + "점입니다.");
		
	}
	
	public static int gradeSum(int korGrade, int engGrade, int mathGrade) {
		
		int intSum = korGrade + engGrade + mathGrade;
		
	return intSum;
	
	}

}
