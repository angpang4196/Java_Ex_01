package com.biz.ex01;

public class RndSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for문을 이용해서 0부터 16까지 반복문 작성
		// 50부터 100까지 임의의 숫자를 생성하여 생성된 숫자를 모두 합산
		// 합산된 숫자의 평균을 계산하여 console 에 표시
		int index = 0;
		int intSum = 0;
		int intAvg = 0;
		for(index = 0 ; index < 16; index++ ) {
			
			int intNum = (int)((Math.random() * (100-50+1))+50);
			
			intSum += intNum;
			System.out.println(intNum);
			
		}
		intAvg = intSum / 16;
		System.out.println("===================");
		System.out.println("합계 : " + intSum); 
		System.out.println("평균 : " + intAvg);

	}

}
