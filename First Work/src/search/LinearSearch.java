package search;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

// 수정 필요-

public class LinearSearch {
	static int lSearch(int[] a, int n, int key) {
		
		int result = -1;
		for(int i = 0; i < n; i++) {
			if(a[i] == key) {
				result = i;
			}
		}
		return result;		
	}
	
	public static void main(String[] args) {
		int[] a = {5, 3, 9, 2, 1, 8, 4, 6};
		Scanner s = new Scanner(System.in);
		System.out.print("요소 개수: ");
		int num = s.nextInt();
		int[] x= new int[num];

		for(int i = 0; i < num; i++) {
		System.out.print("x[" + i + "]: ");
		x[i] = s.nextInt();
		}

		System.out.print("검색할 값: ");
		int ky = s.nextInt();
		int idx = lSearch(x, num, ky);

		if(idx == -1)
		System.out.println("그 값의 요소가 없습니다.");
		else
		System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
		}
	}