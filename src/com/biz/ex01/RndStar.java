package com.biz.ex01;

public class RndStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// intStarts 변수를 선언하고 5부터 9까지의 임의 수를 생성하여 저장
		// makeStar(int intStars) method를 선언하고 매개변수를 전달받아
		// 매개변수 개수만큼 별을 console에 출력
		// 단, 별은 n x n개 의 정사각형 모양으로 출력
		
		int intStars = (int)((Math.random() * (9-5+1))+5);
		makeStar(intStars);
        
	}
	
	public static int makeStar(int intStars) {
		for(int i= 0 ; i < intStars; i ++) {
			
			for(int j = 0 ; j < intStars; j ++) {
				
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		return intStars;
	}

}
