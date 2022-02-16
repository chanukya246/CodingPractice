package com.arena.old;

import java.util.ArrayList;
import java.util.List;

public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] arr = new int[numCourses - 1];
        List<Integer> list = new ArrayList<>(numCourses - 1);


        for (int[] i : prerequisites) {
            list.set(i[0], list.get(i[0]) + 1);

        }
        return true;
    }


}
