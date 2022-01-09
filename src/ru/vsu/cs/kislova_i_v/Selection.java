package ru.vsu.cs.kislova_i_v;

import com.sun.org.apache.bcel.internal.generic.ARETURN;
import ru.vsu.cs.util.ListUtils;

import java.util.*;

public class Selection {
    public static List<StudentInformation> selectionStudents(List<StudentInformation> informationList, int numberOfBudgetSeats) {
        sortStudentsAverageScore(informationList);
        Collections.reverse(informationList);

        for (int i = informationList.size() - 1; i > numberOfBudgetSeats - 1; i--) {
            informationList.remove(i);
        }

        List<StudentInformation> resultList = informationList;

        return resultList;
    }

    public static void sortStudentsAverageScore(List<StudentInformation> list) {
        list.sort(new Comparator<StudentInformation>() {
            public int compare(StudentInformation o1, StudentInformation o2) {
                if (o1.getAverageScore() == o2.getAverageScore()) {
                    return 0;
                } else {
                    if (o1.getAverageScore() > o2.getAverageScore()) {
                        return 1;
                    } else {
                        return -1;
                    }
                }
            }
        });
    }
}
