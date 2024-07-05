import java.util.LinkedList;

class foodFight {
    public String solution(int[] food) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(0);
        for (int i = food.length - 1; i >= 0; i--) {
            if (food[i] / 2 == 0) {
                continue;
            } else {
                for (int j = 0; j < food[i] / 2; j++) {
                    list.addFirst(i);
                    list.addLast(i);
                }
            }
        }
        StringBuilder result = new StringBuilder();
        for (int num : list) {
            result.append(num);
        }
        return result.toString();
    }
}