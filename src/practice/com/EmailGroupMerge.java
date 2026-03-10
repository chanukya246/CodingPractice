package practice.com;

import java.util.*;

public class EmailGroupMerge {

    static class UnionFind {
        private final Map<String, String> parent = new HashMap<>();

        public String find(String x) {
            if (!parent.containsKey(x)) {
                parent.put(x, x);
            }

            if (!parent.get(x).equals(x)) {
                parent.put(x, find(parent.get(x))); // path compression
            }

            return parent.get(x);
        }

        public void union(String a, String b) {
            String rootA = find(a);
            String rootB = find(b);

            if (!rootA.equals(rootB)) {
                parent.put(rootA, rootB);
            }
        }
    }

    public static List<List<String>> mergeEmailGroups(List<List<String>> groups) {
        UnionFind uf = new UnionFind();

        // Step 1: Union all emails in the same group
        for (List<String> group : groups) {
            String first = group.get(0);
            for (int i = 1; i < group.size(); i++) {
                uf.union(first, group.get(i));
            }
        }

        // Step 2: Group emails by root parent
        Map<String, Set<String>> merged = new HashMap<>();

        for (List<String> group : groups) {
            for (String email : group) {
                String root = uf.find(email);
                merged.putIfAbsent(root, new HashSet<>());
                merged.get(root).add(email);
            }
        }

        // Step 3: Convert to list
        List<List<String>> result = new ArrayList<>();
        for (Set<String> set : merged.values()) {
            result.add(new ArrayList<>(set));
        }

        return result;
    }

    public static void main(String[] args) {
        List<List<String>> input = List.of(
                List.of("a@getflex.com", "b@getflex.com"),
                List.of("c@getflex.com", "b@getflex.com"),
                List.of("a@getflex.com", "d@getflex.com"),
                List.of("e@getflex.com"),
                List.of("e@getflex.com", "f@getflex.com", "g@getflex.com"),
                List.of("g@getflex.com", "h@getflex.com")
        );

        List<List<String>> result = mergeEmailGroups(input);

        for (List<String> group : result) {
            System.out.println(group);
        }
        /*output = [ ['c@getflex.com', 'd@getflex.com', 'a@getflex.com', 'b@getflex.com'],
                ['h@getflex.com', 'g@getflex.com', 'e@getflex.com', 'f@getflex.com'] ]*/
    }
}