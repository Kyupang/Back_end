package BFS_DFS;

import java.util.LinkedList;
import java.util.Queue;

// 큐는 add를 가지지만 offer를 통해서 true false를 하는게 좋습니다 왜냐면 가득찬 경우에 exception을 뱉기 때문입니다. 
// 큐를 활용한다는 점이 BFS 의 특징입니다. 
public class 게임맵최단거리 {

	public static void main(String[] args) {
		Sol sol = new Sol();
		int[][] maps = { { 1, 0, 1, 1, 1 }, { 1, 0, 1, 0, 1 }, { 1, 0, 1, 1, 1 }, { 1, 1, 1, 0, 1 },
				{ 0, 0, 0, 0, 1 } };
		int result = sol.solution(maps);
		System.out.println(result);
	}

}

// BFS 문제를 푸는 순서 
// n,m을 (인풋 그래프의 크기를) 설정합니다.
// 지금 현재 문제는 누적합이 있어야 하기에 dist 배열을 만들어줍니다.
// 방문 처리를 할 이중 배열을 선언합니다.
// 이동할 수 있는 dx dy를 설정합니다.
// 큐를 하나 만들어줍니다.
// 큐에 초기값을 넣어주고 , 방문처리, 누적합을 처리해줍니다.
// while (큐가 비어있지 않으면) 계속 반복 행동을 처리합니다.
// for문을 돌아가면서 순회하며 가야할 범위를 벗어나거나 방문한적이 있거나 간선이 없다면 이후처리를 하지않고 for문을 진행합니다.
// 방문처리, 누적합을 처리하고, 큐에도 현재 노드의 좌표를 저장합니다.
// 마지막으로 답을 처리합니다. 마지막 결착지의 값이 있으면 혹은 없으면 answer을 리터합니다. 


class Sol {
    public int solution(int[][] maps) {  //처음에 그래프를 받습니다.
        int answer = 0;					
        int n = maps.length;		// n은 그래프의 노드 갯수입니다.
        int m = maps[0].length;		// m은 그래프의 최대 간선 갯수입니다. 
        
        int[][] dist = new int[n][m];  // 결과값을 누적하기 위한 배열입니다.
        
        boolean[][] visited = new boolean[n][m]; // 방문처리를 하기위한 그래프 크기의 배열입니다.
        
        int[] dx = {-1, 0, 1, 0};				// 이동을 위해 왼쪽 오른쪽 위아래 입니다.
        int[] dy = {0, 1, 0, -1};	
        
        Queue<int[]> queue = new LinkedList<>(); // BFS 이기 때문에 큐를 일반적으로 사용하고 큐는 linkedlist를 사용합니다.

        queue.offer(new int[]{0, 0}); // 처음 초깃값 집어넣습니다. 큐에 0,0은 처음 좌표값입니다.
        							  // 0,0이 추가되었으면 true 안됐으면 false // add의 역할입니다.
        visited[0][0] = true;  		  // 초깃값을 방문했으니 방문처리를 합니다.
        dist[0][0] = 1;				  // 처음 거리는 1입니다.

        while(!queue.isEmpty()) {     // 큐가 다 비지 않았다는 것은 방문할 노드가 남아있다는 뜻.
            int[] curr = queue.poll(); // 현재 노드를 poll 하고 반복문을 통해 큐에 인접 노드들을 집어넣고 방문처리할 것입니다. 
            							// 현재 노드의 좌표값을 배열로 만들어서 저장합니다.

            for(int i = 0; i < 4; i++) { //4방향을 모두 순회하며 
                int nx = curr[0] + dx[i];	//현재 좌표의 x값에 dx를 더해주고
                int ny = curr[1] + dy[i];	//현재 좌표의 y값에 dy를 더해줍니다. 
                							//모든 dx dy 배열은 보면 4번을 돌 때 하나씩만 움직이기에 모든 방향을 순회해볼 수 있습니다.

                if(nx < 0 || nx >= n || ny < 0 || ny >= m) continue; // 가야할 범위를 벗어난다면 그만해 
                if(visited[nx][ny] || maps[nx][ny] == 0) continue; //간선이 없거나 방문한적이 있으면 for문 그만돌려 while로 가 

                visited[nx][ny] = true; 						//방문한적도 없고 간선도 있으면 방문처리해 
                dist[nx][ny] = dist[curr[0]][curr[1]] + 1;		//방문한데를 누적으로 더해서 가려는 노드에 저장하면 먼저 도착한 마지막 위치에는 결과값이 있을거임 
                queue.offer(new int[]{nx, ny});					//큐에는 현재 노드의 좌표를 저장합니다. 
            }
        }

        answer = dist[n-1][m-1] == 0 ? -1 : dist[n-1][m-1]; 	//만약 결과위치의 값이 끝날때까지 0이면 -1을 반환하고 현재 노드의 값이 있으면 누적거리를 반환합니다.

        return answer;
    }
}

