package BFS_DFS;

import java.util.LinkedList;
import java.util.Queue;
//Stack<String> stack = new Stack<String>();: String 유형의 요소를 보유할 수 있는 스택 데이터 구조의 인스턴스를 생성합니다. 스택은 후입선출(LIFO) 데이터 구조의 한 유형으로, 가장 최근에 추가된 요소가 가장 먼저 제거된다는 의미입니다. Stack 클래스는 Java Collections Framework의 일부입니다.
//PriorityQueue<Integer> pq = new PriorityQueue<Integer>();: Integer 유형의 요소를 보유할 수 있는 우선 순위 큐 데이터 구조의 인스턴스를 생성합니다. 우선 순위 큐는 요소가 우선 순위에 따라 특정 순서로 삽입되는 큐 유형입니다. 이 경우 우선 순위는 'Integer' 요소의 자연 순서에 따라 결정됩니다. PriorityQueue 클래스는 Java Collections Framework의 일부입니다.
//Queue<String> que = new LinkedList<String>();: String 유형의 요소를 보유할 수 있는 대기열 데이터 구조의 인스턴스를 생성합니다. 큐는 선입선출(FIFO) 데이터 구조의 한 유형으로, 추가된 첫 번째 요소가 가장 먼저 제거된다는 의미입니다. 이 예제에서 LinkedList 클래스는 Queue 인터페이스의 구현으로 사용됩니다. Queue 인터페이스도 Java Collections Framework의 일부입니다.
public class BFS {
	public static void main(String[] args) {
		// 각 노드가 연결된 정보를 2차원 배열 자료형으로 표현
		int[][] graph = { {}, { 2, 3, 8 }, { 1, 7 }, { 1, 4, 5 }, { 3, 5 }, { 3, 4 }, { 7 }, { 2, 6, 8 }, { 1, 7 } };

		// 각 노드가 방문된 정보를 1차원 배열 자료형으로 표현
		boolean[] visited = { false, false, false, false, false, false, false, false, false };

		int start = 1; // 시작 노드
		// 큐 구현
		Queue<Integer> queue = new LinkedList<>();
		queue.add(start);

		// 현재 노드를 방문 처리
		visited[start] = true;

		// 큐가 빌때까지 반복
		while (!queue.isEmpty()) {
			// 큐에서 하나의 원소를 뽑아 출력
			int v = queue.poll();
			System.out.println(v + " ");

			// 인접한 노드 중 아직 방문하지 않은 원소들을 큐에 삽입
			for (int i : graph[v]) {
				if (visited[i] == false) {
					queue.add(i);
					visited[i] = true;
				}
			}
		}
	}

}
