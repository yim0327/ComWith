class Solution {
    public int solution(int[] numbers) {
        int totalSum = 45;
        
        
        int sumOfNumbers = 0;
        for (int number : numbers) {
            sumOfNumbers += number;
        }
        
        
        return totalSum - sumOfNumbers;
    }
}
