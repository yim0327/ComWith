class Solution {
    public String solution(String phone_number) {
        int length = phone_number.length();
        StringBuilder maskedNumber = new StringBuilder();
        
        for (int i = 0; i < length - 4; i++) {
            maskedNumber.append('*');
        }
        
        maskedNumber.append(phone_number.substring(length - 4));
        
        return maskedNumber.toString();
    }
}
