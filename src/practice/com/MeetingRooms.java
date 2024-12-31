package practice.com;

import java.util.ArrayList;
import java.util.Collections;

public class MeetingRooms {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>();
        a.add(0);
        a.add(30);
        A.add(a);
        a = new ArrayList<>();
        a.add(5);
        a.add(10);
        A.add(a);
        a = new ArrayList<>();
        a.add(15);
        a.add(20);
        A.add(a);
        System.out.println(new MeetingRooms().solve(A));
    }

    public int solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            a.add(A.get(i).get(0));
            b.add(A.get(i).get(1));
        }

        Collections.sort(a);
        Collections.sort(b);

        int i = 0;
        int j = 0;
        int rooms = 0;
        while (i < A.size() && j < A.size()) {
            if (a.get(i) < b.get(j)) {
                System.out.println("a.get(i): " + a.get(i) + " b.get(j): " + b.get(j));
                rooms++;
                i++;
            } else {
                i++;
                j++;
            }
        }
        return rooms;
    }
}
