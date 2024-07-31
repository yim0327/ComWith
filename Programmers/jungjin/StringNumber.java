class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
       char[] charArray = my_string.toCharArray();
        
        for (char ch : charArray) {
            if (ch >= 'A' && ch <= 'Z') {
               answer[ch - 'A']++;
            } else if (ch >= 'a' && ch <= 'z') {
                answer[ch - 'a' + 26]++;
            }
        }
        
        return answer;
    }
}
