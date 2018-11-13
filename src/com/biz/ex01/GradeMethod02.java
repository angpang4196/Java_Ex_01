package com.biz.ex01;

public class GradeMethod02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 국어 ,영어 ,수학, 과학 성적을 저장할 int형 변수선언
		// 각 과목의 점수를 0~100까지 범위의 임의의 점수를 변수에 저장
		// gradeSum()Method 생성하여, 매개변수 4개를 전달받아 성적 총점을 계산하고
		// main으로 결과를 return한 다음 main에서 평균을 계산한후 콘솔에 표시
		
		int intKor = 93;
		int intEng = 39;
		int intMath = 98;
		int intSci = 77;
		
		float floatAver = gradeSum(intKor, intEng, intMath, intSci) * 0.25f;
		System.out.println("네 과목의 평균점수는 " + floatAver + "점입니다.");

	}
	
	public static int gradeSum(int intKor, int intEng, int intMath, int intSci) {
		int intSum = intKor + intEng + intMath + intSci;
		
		return intSum;
	}

}
