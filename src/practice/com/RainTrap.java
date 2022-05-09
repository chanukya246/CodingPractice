package practice.com;

import java.util.ArrayList;
import java.util.List;

public class RainTrap {

    public static void main(String[] args) {
        RainTrap rt = new RainTrap();
    }

    public int trap(final List<Integer> A) {

        int len = A.size(), i = 1, j = len - 1;

        ArrayList<Integer> pm = new ArrayList<Integer>(len);
        for (int p : A) pm.add(0);
        ArrayList<Integer> sm = new ArrayList<Integer>(len);
        for (int p : A) sm.add(0);

        while ((i < len - 1) && (j > 0)) {
            pm.set(i, Math.max(pm.get(i-1), A.get(i-1)));
            sm.set(j-1, Math.max(sm.get(j), A.get(j)));
            i++; j--;
        }
        int res = 0;
        for (int k = 1; k < len - 1; k++) {
            if (Math.min(pm.get(k), sm.get(k)) - A.get(k) > 0)
                res += Math.min(pm.get(k), sm.get(k)) - A.get(k);
        }

        return res;
    }
}
