package poc.java.com;

import java.util.ArrayList;
import java.util.Arrays;

public class Equilibrium {

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(-7, 1, 5, 2, -4, 3, 0));

        extracted();
        /*long sum1=0;
        for(int i=0;i<A.size();i++)
            sum1+=A.get(i);

        long sum2=0;
        int ans=1000000000;
        for(int i=0;i<A.size();i++){
            sum1 -= A.get(i);
            if(sum1==sum2){
                ans=i;
                break;
            }
            sum2 += A.get(i);
        }
        System.out.println("ans: " + ans);*/
    }

    private static void extracted() {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(-7, 1, 5, 2, -4, 3, 0));
        if (A.size() == 1) System.out.println("A.1");
        int lSum = 0;
        for (int i = 1; i < A.size(); i++) {
            lSum += A.get(i - 1);
            int rSum = 0;
            for (int j = A.size() - 1; j > i; j--) {
                rSum += A.get(j);
                if (lSum == rSum && i + j == A.size()) {
                    System.out.println("j: " + (j - 1));
                }

            }
        }
        System.out.println("The end");
    }

}
