package practice.com;

import java.util.Arrays;

public class Anagram {


    public static void main (String[] args){
        System.out.println(isAnagram("brag","grab"));
    }

    private static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] alpbts = new int[26];
        for (int i=0; i<s.length(); i++){
            alpbts[s.charAt(i) - 'a']++;
            alpbts[t.charAt(i) - 'a']--;
        }

        for (int j : alpbts){
            if (j != 0){
                return false;
            }
        }

        return true;
    }

    private static boolean isAnagram2(String str1, String str2) {

        str1 = str1.toLowerCase().trim();
        str2 = str2.toLowerCase().trim();

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        if(ch1.length != ch2.length)
            return false;

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(Arrays.equals(ch1, ch2))
            return true;

        return false;
    }

}
