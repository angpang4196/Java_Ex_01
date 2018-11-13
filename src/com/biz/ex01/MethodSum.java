package com.biz.ex01;

public class MethodSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// retSum() 메서드를 선언하시오
		// int형 매개변수를 1개를 선언하시오.
		// main에서 숫자 50을 전달하시오
		// retSum 에서 전달받은 값에 +100을 실행
		// 결과를 다시 main으로 return하시오
		// main에서 console에 결과를 출력하시오.
		retSum(50);
		System.out.println(retSum(50));

	}
	public static int retSum(int intNum1) {
		
	  int intNum2 = intNum1 + 100; // intNum1 += 100;
	
	  return intNum2;
	}

}
