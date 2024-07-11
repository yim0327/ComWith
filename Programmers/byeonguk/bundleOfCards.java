class bundleOfCards {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int count1 = 0, count2 = 0;

        for (String card : goal) {
            if (count1 < cards1.length && card.equals(cards1[count1])) {
                count1++;
            } else if (count2 < cards2.length && card.equals(cards2[count2])) {
                count2++;
            } else {
                return "No";
            }
        }
        return "Yes";
    }
}