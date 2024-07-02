import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] dice = {a, b, c, d};
        Arrays.sort(dice);
        
        if (dice[0] == dice[3]) {
            return 1111 * dice[0];
        }
    
        if (dice[0] == dice[2] || dice[1] == dice[3]) {
            int p = dice[1]; 
            int q = (dice[0] == dice[2]) ? dice[3] : dice[0];
            return (int) Math.pow(10 * p + q, 2);
        }
        
        if (dice[0] == dice[1] && dice[2] == dice[3]) {
            int p = dice[0];
            int q = dice[2];
            return (p + q) * Math.abs(p - q);
        }
      
        if (dice[0] == dice[1] && dice[2] != dice[3]) {
            return dice[2] * dice[3];
        }
        if (dice[1] == dice[2] && dice[0] != dice[3]) {
            return dice[0] * dice[3];
        }
        if (dice[2] == dice[3] && dice[0] != dice[1]) {
            return dice[0] * dice[1];
        }
        
        return dice[0];
    }
}
