class smallSubstring {
    public int solution(String t, String p) {
        int count = 0;
        for (int i = 0; i < t.length() - p.length() + 1; i++) {
            String sub_string = t.substring(i, i + p.length());
            if (Long.parseLong(sub_string) <= Long.parseLong(p)) {
                count += 1;
            }
        }
        return count;
    }
}