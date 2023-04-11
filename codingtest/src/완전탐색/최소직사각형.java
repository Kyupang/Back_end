package 완전탐색;
import java.util.*;

class 최소직사각형 {
    public int solution(int[][] sizes) {
        int answer = 0;
        int temp = 0;
        int[] row = new int[sizes.length];
        int[] col = new int[sizes.length];
        for(int i = 0; i< sizes.length; i++){
            if(sizes[i][0] < sizes[i][1] ){
                //스왑
                temp = sizes[i][1];
                sizes[i][1] = sizes[i][0] ;
                sizes[i][0] = temp;
            }
                row[i] = sizes[i][0];
                col[i] = sizes[i][1];
        }
        Arrays.sort(row);
        Arrays.sort(col);
        
        answer = row[sizes.length-1]* col[sizes.length-1];
        
        return answer;
        //가로보다 세로가 큰 애들은 스왑해주고 
        // 가로에서 가장큰수(정렬) 세로에서 가장 큰수(정렬) 곱하면 될듯.
        
    }
}