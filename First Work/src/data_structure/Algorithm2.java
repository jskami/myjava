package data_structure;
import java.util.Scanner;

public class Algorithm2 {
	// 세 값의 중앙 값 구하기
	public static int medium(int num1, int num2, int num3) {
		if(num1 <= num2)
			if(num2 >= num3)
				return num2;
			else if(num1 <= num3)
				return num1;
			else
				return num3;
		else if(num1 > num3)
			return num1;
		else if(num2 > num3)
			return num3;
		else
			return num2;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3;
		
		System.out.println("중앙값 구하기");
		System.out.print("첫 번째 값 : ");
		num1 = sc.nextInt();
		System.out.print("두 번째 값 : ");
		num2 = sc.nextInt();
		System.out.print("세 번째 값 : ");
		num3 = sc.nextInt();
	
		int m = medium(num1, num2, num3);
		System.out.println("중앙값 : " +m);
		
		sc.close();
	}
	
	
	
}