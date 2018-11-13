package com.biz.ex02;

public class GradeProcess02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5명의 학생 성적을 처리하려고 한다. *for를 이용 5번실행
		// 각 학생의 국어, 영어, 수학, 과학, 국사 과목의 성적을 임의로 설정하고 
		// 총점과 평균을 계산하시오.
		// 총점은 gradeSum() method를 선언하여 계산을 수행
		int index = 0;
		int intSum = 0;
		
		
		for(index = 1; index <= 5; index ++) {
		    
			int intKor = makeSum();
		    int intEng = makeSum();
		    int intMath = makeSum();
		    int intSci = makeSum();
		    int intHis = makeSum();
			intSum = gradeSum(intKor, intEng, intMath, intSci, intHis);
			System.out.printf("%d번 학생 : 국어 : %d점, 영어 : %d점, 수학 : %d점, 과학 : %d점, 국사 : %d점\n", index, intKor, intEng, intMath, intSci, intHis);
			System.out.println("총점 : " + intSum + "점");
			System.out.println("평균 : " + intSum / 5.0f + "점");
		    
		}

	}
	public static int makeSum() {
		return (int)(Math.random() * (100-0+1)+0);
	}
	public static int gradeSum(int intKor, int intEng, int intMath, int intSci, int intHis) {
		return intKor + intEng + intMath + intSci + intHis;
	}

}
