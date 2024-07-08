package July2024;


    import java.util.*;

    public class GroupAnagrams {
        public List<List<String>> groupAnagrams(String[] strs) {
            if (strs == null || strs.length == 0) return new ArrayList<>();
            Map<String, List<String>> map = new HashMap<>();
            for (String s : strs) {
                char[] ca = s.toCharArray();
                Arrays.sort(ca);
                String key = String.valueOf(ca);
                if (!map.containsKey(key)) map.put(key, new ArrayList<>());
                map.get(key).add(s);
            }
            return new ArrayList<>(map.values());
        }

        public static void main(String[] args) {
            GroupAnagrams solution = new GroupAnagrams();
            String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
            List<List<String>> result = solution.groupAnagrams(strs);
            for (List<String> group : result) {
                System.out.println(group);
            }
        }
    }


