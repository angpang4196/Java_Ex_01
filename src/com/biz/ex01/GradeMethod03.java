package com.biz.ex01;

public class GradeMethod03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 국어, 영어 ,수학, 과학 성적을 저장할 int형 변수선언
		// 각 과목의 점수를 50~100까지 범위의 임의의 점수를 생성하여 변수에 저장
		// gradeSum()Method 생성하여, 매개변수 2개를 전달받아 전과목 성적 총점을 계산하고 
		// main으로 결과를 return 한 다음 console에 표시
	  
		int intKor = makeGrade();
		int intEng = makeGrade();
		int intMath = makeGrade();
		int intSci = makeGrade();
		
		
		int intSum = (gradeSum(intKor, intEng) + gradeSum(intMath, intSci));
		
		
		System.out.print("국어 : " + intKor + " ");
		System.out.print("영어 : " + intEng + " ");
		System.out.print("수학 : " + intMath + " ");
		System.out.print("과학 : " + intSci+ " ");
		System.out.print("총점 : " + intSum + " ");
		// 평균을 비교적 정확히 계산하기위해서 총점을 float로 변환하고 /4를 계산해서 표시 
		System.out.println("평균 : " + ((float)intSum/4));

	}
	
	public static int gradeSum(int intNum1, int intNum2) {
		
		int intSum = intNum1 + intNum2;
		return intSum;
	}
	public static int makeGrade() {
		int intGrade = (int)(Math.random() * (100-50+1))+50;
		return intGrade;
	}

}
