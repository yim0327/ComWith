import java.util.HashMap;

class poncketMon {
    public int solution(int[] nums) {
        HashMap<Integer, Integer> monList = new HashMap<>();
        for (int num : nums) {
            monList.put(num, monList.getOrDefault(num, 0) + 1);
        }

        int choice = nums.length / 2;
        int count = 0;

        for (int key : monList.keySet()) {
            if (count < choice) {
                count++;
            } else {
                break;
            }
        }

        return count;
    }
}