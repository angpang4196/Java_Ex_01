package com.biz.ex02;

public class GradeProcess01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 국어, 영어, 수학, 과학, 국사 과목의 성적을 임의로 설정하고
		// 총점과 평균을 계산하시오.
		
		int intKor = makeSum();
		int intEng = makeSum();
		int intMath = makeSum();
		int intSci = makeSum();
		int intHis = makeSum();
		int intSum = intKor + intEng + intMath + intSci + intHis;
		float fAvg = intSum / 5.0f ; // = (float)intSuM / 5;  
		
		System.out.println("국어 : " + intKor);
		System.out.println("영어 : " + intEng);
		System.out.println("수학 : " + intMath);
		System.out.println("과학 : " + intSci);
		System.out.println("국사 : " + intHis);
		System.out.println("총점 : " + intSum);
		System.out.println("평균 : " + fAvg);

	}
	
	public static int makeSum() {
		int intNum = (int)(Math.random() * (100 - 0 + 1) + 0);
		return intNum;
	}

}
