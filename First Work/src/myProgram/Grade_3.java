package myProgram;

import java.util.Collections;
import java.util.PriorityQueue;

public class Grade_3 {

	public static void main(String[] args) {
		int[] stId = { 1, 2, 3 };
		int[] kor = { 80, 62, 90 };
		int[] eng = { 75, 60, 70 };
		int[] mat = { 66, 70, 95 };
		int[] total = new int[3];
		int[] avg = new int[3];
		char[] point = new char[3];
		int[] rank = new int[3];
	
		// 학점 채점
		for (int i = 0; i < stId.length; i++) {
			total[i] = kor[i] + eng[i] + mat[i];
			avg[i] = total[i] / kor.length;
			if (avg[i] >= 90) {
				point[i] = 'A';
			} else if (avg[i] >= 80) {
				point[i] = 'B';
			} else if (avg[i] >= 70) {
				point[i] = 'C';
			} else if (avg[i] >= 60) {
				point[i] = 'D';
			} else {
				point[i] = 'F';
			}
			rank[i] = 1;
		}
		
		
		// 등수 계산
//		for(int i = 0; i < stId.length; i++) {
//			for(int j = i + 1; j < stId.length; j++) {
//				if(avg[i] < avg[j]) {	// i번 학생이 j번 학생보다 평균이 낮으면
//					int temp = stId[i];	// swap
//					stId[i] = stId[j];
//					stId[j] = temp;
//					
//					// 점수 swap
//					temp = kor[i];
//					kor[i] = kor[j];
//					kor[j] = temp;
//					
//					temp = eng[i];
//					eng[i] = eng[j];
//					eng[j] = temp;
//					
//					temp = mat[i];
//					mat[i] = mat[j];
//					mat[j] = temp;
//					
//					temp = total[i];
//					total[i] = total[j];
//					total[j] = temp;
//					
//					temp = avg[i];
//					avg[i] = avg[j];
//					avg[j] = temp;
//					
//					// 문자열 전용 빈공간
//					char temp2 = point[i];
//					point[i] = point[j];
//					point[j] = temp2;
//				}
//			}
//		}
		
		// 등수 초기화
//		for(int i = 0; i < stId.length; i++) {
//			for(int j = i + 1; j < stId.length; j++) {
//				if(avg[i] < avg[j]) {
//					rank[i] = rank[i]+1;
//				}else if(avg[i] > avg[j]) {
//					rank[j] = rank[j]+1;
//				}
//			}
//		}
		
		// 22.04.28 숙제 : 등수 없이 등수 매기는 방법 찾아라
		// 코드 수정할 필요 없음, 평균으로 구하는거 아님, 힙정렬의 최대, 최소값으로 구하는 것도 아님.
		
		System.out.println("================================= 성적표 ===============================");
		System.out.println("\t학번\t국어\t영어\t수학\t총점 \t평균\t학점\t등수");
		System.out.println("----------------------------------------------------------------------");
		for (int i = 0; i < stId.length; i++) {
			System.out.println("\t" + stId[i] + "\t" + kor[i] + "\t" + eng[i] + "\t" + mat[i] + "\t" + total[i] + "\t"
					+ avg[i] + "\t" + point[i] + "\t" + rank[i]);
		}
		
		
//		PriorityQueue<Integer> heap = new PriorityQueue<Integer>(Collections.reverseOrder());
//		
//		for(int i = 0; i < avg.length; i++) {
//			heap.add(avg[i]);
//		}
//		
//		for(int i = 0; i < avg.length; i++) {
//			avg[i] = heap.poll();
//		}
//		
//		System.out.print("\n 우선순위가 높은 원소 순서로 뽑아낸 결과(1등, 2등, 3등) :");
//		for(int val : avg) {
//			System.out.print(val + ", ");
//		}
		
	}		
}