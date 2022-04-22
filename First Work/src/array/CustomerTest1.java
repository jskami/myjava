package array;

public class CustomerTest1 {
	// 상속 클래스 테스트 239p
	public static void main(String[] args) {
		Customer ctLee = new Customer(1001, "이씨");
//		ctLee.setctID(1001);
//		ctLee.setctName("이씨");
		ctLee.bonusPoint = 1000;
		System.out.println(ctLee.showCustomerInfo());
		System.out.println("=====================");
		
		Customer ctPark = new Customer(1002, "박씨");
//		ctPark.setctID(1002);
//		ctPark.setctName("박씨");
		ctPark.bonusPoint = 10000;
		System.out.println(ctPark.showCustomerInfo());
		System.out.println("=====================");

		VIPCustomer ctKim = new VIPCustomer(1003, "김씨", 0001);
//		ctKim.setctID(1003);
//		ctKim.setctName("김씨");
		ctKim.bonusPoint = 99999;
		System.out.println(ctKim.showCustomerInfo());
		System.out.println("=====================");
		
	}

}
