import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0)  
            return new ArrayList<>();

        Map<String, List<String>> frequencyStringMap = new HashMap<>();

        for (String str : strs) {
            String frequencyString = getfrequencyString(str);

            if (frequencyStringMap.containsKey(frequencyString)) {
                frequencyStringMap.get(frequencyString).add(str);
            } else {
                List<String> strlist = new ArrayList<>();
                strlist.add(str);
                frequencyStringMap.put(frequencyString, strlist);
            }
        }

        return new ArrayList<>(frequencyStringMap.values());
    }

    private String getfrequencyString(String str) {
        int[] count = new int[26];  

        for (char c : str.toCharArray()) {
            count[c - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            sb.append('#'); 
            sb.append(count[i]);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> output = sol.groupAnagrams(input);

        for (List<String> group : output) {
            System.out.println(group);
        }
    }
}
