class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int idx = phone_number.length();
        answer = phone_number.substring(0, idx - 4);
        answer = answer.replaceAll(".", "*");
        answer += phone_number.substring(idx - 4, idx);

        return answer;
    }
}