package poc.java.com;

import java.util.*;

public class CharacterSequenceFrequency {

    public static void main(String[] args) {

        String ip = "yyyyyuueeeeeEEEetuqhs28";
        Map<Character, Integer> hmap = new HashMap<>();
        for (char ch : ip.toCharArray()) {
            hmap.put(ch, hmap.getOrDefault(ch, 0) + 1);
        }

        List<Character> characters = new ArrayList<>(hmap.keySet());
        System.out.println("chars keyset: " + hmap.keySet());
        System.out.println("chars: " + characters);
        characters.sort((c1, c2) -> hmap.get(c1) - hmap.get(c2));

        StringBuilder sb = new StringBuilder();
        for (char ch : characters) {
            sb.append(String.valueOf(ch).repeat(hmap.get(ch)));
        }
        System.out.println("chars: " + sb);
    }
}
