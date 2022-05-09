package practice.com;

import java.util.ArrayList;

public class BeggarCoins {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>  list = new ArrayList<>();

        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(1);            arr1.add(2);          arr1.add(10);
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(2);            arr2.add(3);          arr2.add(20);
        ArrayList<Integer> arr3 = new ArrayList<>();
        arr3.add(2);            arr3.add(5);          arr3.add(25);
        list.add(arr1);        list.add(arr2);        list.add(arr3);
        BeggarCoins beggarCoins = new BeggarCoins();
        ArrayList<Integer> res = beggarCoins.solve(5, list);
        System.out.println("res: " + res);
    }

    public ArrayList<Integer> solve(int A, ArrayList<ArrayList<Integer>> B) {

        ArrayList<Integer> res = new ArrayList<Integer>(A);
        System.out.println(res);
        if (B.size()==0) return res;
        for (ArrayList<Integer> b : B) {
            int left = b.get(0)-1;
            int right = b.get(1);
            for (int i = left; i < right; i++) {
                int sum = res.get(i);
                res.set(i, sum+b.get(2));
            }
        }
        return res;
    }
}
