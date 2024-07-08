class findPrimeNumber {
    public int solution(int n) {
        int count = 0;
        for (int i = 2; i < n + 1; i++) {
            if(prime(i)) count += 1;
        }
        return count;
    }
    //  소수 판별하는 함수
    private boolean prime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}