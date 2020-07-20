package practice.com;

import java.util.Arrays;
import java.util.concurrent.Callable;

public class Anagram {


    public static void main (String[] args){
        System.out.println(isAnagram("BRAG ","Grab"));
    }

    private static boolean isAnagram(String str1, String str2) {

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
