package array;

public class SwitchCase3 {

	public static void main(String[] args) {
		int floor = 3;
		String notice;
		
		switch(floor) {
		case 1 : notice = "1층 약국";
			break;
		case 2 : notice = "2층 정형외과";
			break;
		case 3 : notice = "3층 피부과";
			break;
		case 4 : notice = "4층 치과";
			break;
		case 5 : notice = "5층 헬스장";
			break;
		default : notice = "해당 층이 없습니다.";
		}
		System.out.println(notice + "입니다.");
	
		
	}

	

}
