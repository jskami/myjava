package array;

public class VIPCustomer extends Customer {
	// 고객 클래스의 멤버변수와 동일 -> 나중에 상속받아서 쓰면 필요없음
//	private int ctID;
//	private String ctName;
//	private String ctGrade;
//	int bonusPoint;
//	double bonusRatio;
	
	// vip 고객 관련 기능 구현때만 필요한 멤버변수
	private int agentID;
	double saleRatio;
	
	// vip 디폴트 생성자
	public VIPCustomer() {
		ctGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCustomer() 생성자 호출");
	}
	
//	public int calcPrice(int price) {
//		bonusPoint += price * bonusRatio;
//		return price - (int)(price * saleRatio);	// 할인율 적용
//	}
	
	// vip에게만 필요한 메서드
	public int getAgentID() {
		return agentID;
	}
	
//	public String showCustomerInfo() {
//		return ctName + " 님의 등급은 " + ctGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
//	}
	
}