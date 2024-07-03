import java.util.HashMap;
import java.util.Map;

class runningRace {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);  //  선수와 등수 저장
        }
        for (String calling : callings) {
            int rank = map.get(calling);  //  불린 사람의 등수
            String prev_player = players[rank - 1];  //  불린 사람의 앞 사람

            //  등수 교체
            players[rank - 1] = calling;
            players[rank] = prev_player;

            //  map을 갱신
            map.put(calling, rank - 1);
            map.put(prev_player, rank);
        }
        return players;
    }
}


/*
import java.util.ArrayList;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        ArrayList<String> list = new ArrayList<>();
        for (String player : players) {
            list.add(player);
        }
        for (String calling : callings) {
            int calling_idx = list.indexOf(calling);  // callings에 있는 값의 list에서의 인덱스
                String temp = list.get(calling_idx - 1);
                list.set(calling_idx - 1, calling);
                list.set(calling_idx, temp);
        }
        return list.stream().toArray(String[]::new);
    }
}
*/