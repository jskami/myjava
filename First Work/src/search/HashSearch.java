package search;

import java.util.LinkedList;

/* key값을 hash function을 통해 hashcode를 주고, 저장공간의 size로 나누어
 * index를 정한 후 value값을 저장한다.
 * =============================
 * ! 서로 다른 key값이 하나의 index에 저장될 수도 있다 -> 해시충돌 */
public class HashSearch {
	class Node {	// key, value를 가지는 Node 클래스 정의
		String key;
		String value;
		
		public Node(String key, String value) {
			this.key = key;
			this.value = value;
		}
		String value() {
			return value;
		}
		void value(String value) {
			this.value = value;
		}
	}
	
	// Node형 연결리스트로 선언
	LinkedList<Node>[] data;
	
	// 자신을 호출하면서 크기 지정, 선언
	public HashSearch(int size) {	// size를 인자로 받아 크기 초기화
		this.data = new LinkedList[size];
	}
	
	// key값을 통해 hashcode 생성 - ASCII이용
	int gethashCode(String key) {	
		int hashcode = 0;
		for(char c : key.toCharArray())
			hashcode += c;
		return hashcode;
	}
	
	// hashCode를 이용해서 Index 지정
	int convertToIndex(int hashcode) {
		return hashcode % data.length;
	}
	
	Node searchKey(LinkedList<Node> list, String key) {
		if(list == null)
			return null;
		for(Node node : list) {
			if(node.key.equals(key)) {
				return node;
			}
		}
		return null;
	}
	
	// key를 통한 값 저장
	void set(String key, String value) {
		int index = convertToIndex(gethashCode(key));
		LinkedList<Node> list = data[index];
		
		if(list == null) {	// 없으면 저장
			list = new LinkedList<Node>();
			data[index] = list;
		}
		
		Node node = searchKey(list, key);
		
		if(node == null)
			list.addLast(new Node(key, value));
		else
			node.value(value);
		
		System.out.println("hashcode : " + gethashCode(key) + ", index : " + index + ", ");
	}

	// key를 통한 값 호출
	String get(String key) {
		int index = convertToIndex(gethashCode(key));
		LinkedList<Node> list = data[index];
		
		if(list == null)
			return "Not Found";
		else {
			for(Node n : list) {
				if(n.key.equals(key))
					return n.value;
			}
		return null;
		}
	}
}
