class Solution {
    public int solution(String num_str) {
        int answer = 0;
        char[] numArray = num_str.toCharArray();
      
        for (char numChar : numArray) {
            answer += Character.getNumericValue(numChar);
        }
        
        return answer;
    }
}
