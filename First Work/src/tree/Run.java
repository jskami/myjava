package tree;
import tree.Tree.Node;

//(참고 https://readerr.tistory.com/35)
public class Run {

	public static void main(String[] args) {
		// 트리 생성
		Tree tree = new Tree();
		
		// 노드 생성
		Node node1 = tree.addNode(1);
		Node node2 = tree.addNode(2);
		Node node3 = tree.addNode(3);
		Node node4 = tree.addNode(4);
		Node node5 = tree.addNode(5);
		Node node6 = tree.addNode(6);
		Node node7 = tree.addNode(7);
		
		// 트리 연결관계 생성(트리모양)
		/*		1
		 * 	 2	   3
		 * 4  5   6  7 
		 * */
		node1.addLeft(node2);
		node1.addRight(node3);
		node2.addLeft(node4);
		node2.addRight(node5);
		node3.addLeft(node6);
		node3.addRight(node7);
		
		// 순회
		tree.preOrder(node1);
		System.out.println("- 전위 순회");
		tree.inOrder(node1);
		System.out.println("- 중위 순회");
		tree.postOrder(node1);
		System.out.println("- 후위 순회");
		
		// 삭제
		node2.deleteLeft();
		node3.deleteRight();
		/* 노드2의 왼쪽 자식, 노드3의 오른쪽 자식을 삭제하면
		 * 		1
		 *   2	   3
		 * 	   5 6
		 * 
		 * */
		
		
		// 순회
		System.out.println();
		tree.preOrder(node1);
		System.out.println();
		tree.inOrder(node1);
		System.out.println();
		tree.postOrder(node1);
		
		
	}

}
