package individual_practice;

public class WhileEx1 {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		while(num <= 10) {
			sum += num;
			num++;
		}
		System.out.println("합계 " + sum);
		
	}
	
}
