import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

class memoryScore {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < name.length; i++) {  //  key, value값 저장
            map.put(name[i], yearning[i]);
        }
        for (int i = 0; i < photo.length; i++) {
            int sum = 0;
            for (int j = 0; j < photo[i].length; j++) {
                if (map.containsKey(photo[i][j])) {  //  해당 사람이 있다면
                    sum += map.get(photo[i][j]);
                }
            }
            result.add(sum);
        }
        return result.stream().mapToInt(i->i).toArray();
    }
}