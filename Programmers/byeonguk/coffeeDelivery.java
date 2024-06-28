class Solution {
    public int coffeeDelivery(String[] order) {
        int answer = 0;
        for (String coffee : order) {
            if (coffee.contains("cafelatte")) {
                answer += 5000;
            } else {
                answer += 4500;
            }
        }
        return answer;
    }
}

/*
* class Solution {
    public int coffeeDelivery(String[] order) {
        int answer = 0;
        for (int i = 0; i < order.length; i++) {
            switch (order[i]) {
                case "icecafelatte":
                    answer += 5000;
                    break;
                case "cafelatteice":
                    answer += 5000;
                    break;
                case "hotcafelatte":
                    answer += 5000;
                    break;
                case "cafelattehot":
                    answer += 5000;
                    break;
                case "cafelatte":
                    answer += 5000;
                    break;
                default:
                    answer += 4500;
                    break;
            }
        }
        return answer;
    }
}
* */