package individual_practice;

public class NewEx1 {
	public void sum(int a, int b) {
		int sum = 0, odd = 0, even = 0;	// 초기값 설정
		for(int i = a; i < b; i++) {
			sum += i;	// 총합 합계
			if(i%2==0) {
				even += 1;	//짝수 합
			} else {
				odd += 1;	//홀수 합
			}
		}
		System.out.println(a + "~" + b + "까지 합 : " + sum);
		System.out.println(a + "~" + b + "까지 짝수 합 : " + even);
		System.out.println(a + "~" + b + "까지 홀수 합 : " + odd);
	}

	public static void main(String[] args) {
		NewEx1 val = new NewEx1();
		val.sum(2, 8);
	}
}
