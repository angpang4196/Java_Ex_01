package com.biz.ex01;

public class Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// guguDa()method를 선언하고
		// main 에서 2부터 9까지의 반복되는 숫자를 매개변수로 guguDan()에 전달하여
		// 2단부터 9단까지의 구구단을 console에 출력하시오.
		int index = 0;
		
		for(index = 2; index <10 ; index++) {
			guguDan(index);	
		}
	}
	public static void guguDan(int intNum) {
			
			for(int j = 1; j <10 ; j++) {
				System.out.printf("%d x %d = %d\n", intNum, j, intNum * j);
				
			}
		}		
	
	}


