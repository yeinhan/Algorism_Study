package Programmers.Network;

/*
 * 테스트 1 〉	통과 (0.02ms, 51.8MB)
테스트 2 〉	통과 (0.02ms, 51.6MB)
테스트 3 〉	통과 (0.04ms, 52.2MB)
테스트 4 〉	통과 (0.05ms, 52.6MB)
테스트 5 〉	통과 (0.02ms, 53.4MB)
테스트 6 〉	통과 (0.09ms, 52.6MB)
테스트 7 〉	통과 (0.03ms, 52.6MB)
테스트 8 〉	통과 (0.08ms, 52.2MB)
테스트 9 〉	통과 (0.06ms, 53.4MB)
테스트 10 〉	통과 (0.05ms, 52.8MB)
테스트 11 〉	통과 (0.26ms, 56.1MB)
테스트 12 〉	통과 (0.23ms, 53.2MB)
테스트 13 〉	통과 (0.12ms, 53.2MB)

 */

public class Solution {
	 public int solution(int n, int[][] computers) {
         int answer = 0;
         boolean[] visited = new boolean[n];        

         for (int i = 0; i < n; i++) {
            if (visited[i] == false) {      //방문확인
               answer++;
               dfs(i, visited, computers);
            }
         }

         return answer;
      }

      public void dfs(int node, boolean[] visited, int[][] computers) {
         visited[node] = true;

            //node  방문
         for (int i = 0; i < computers.length; i++) {
            if (visited[i] == false && computers[node][i] == 1) {
               dfs(i, visited, computers);
            }
         }
      }
}
