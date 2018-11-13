package com.biz.ex01;

public class GradeMethod01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 국어, 영어, 수학, 과학 성적을 저장할 int 형 변수선언
		// 각 과목의 점수를 0~100까지 범위의 임의의 점수를 변수에 저장
		// gradeSum() Method 생성하여 매개변수개를 전달받아 성적평균을 소수점까지 계산
		// main으로 결과를 return하여 콘솔에 표시
		int korGrade = 70;
		int engGrade = 60;
		int mathGrade = 92;
		int sciGrade = 87;

		System.out.println("네 과목의 평균은 " + gradeSum(korGrade, engGrade, mathGrade, sciGrade)+ "점입니다.");
	}
	
	public static float gradeSum(int korGrade, int engGrade, int mathGrade, int sciGrade) {
		int intSum = korGrade + engGrade + mathGrade + sciGrade;
		float averGrade = intSum * 0.25f;
		
		return averGrade;
	}

}
