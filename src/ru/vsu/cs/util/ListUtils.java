package ru.vsu.cs.util;

import ru.vsu.cs.kislova_i_v.StudentInformation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ListUtils {
    public static String[] toStringArr(List<String> list) {
        if (list == null) {
            return null;
        }
        String[] result = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public static String[][] toStringArr2(List<List<String>> list) {
        if (list == null) {
            return null;
        }
        String[][] result = new String[list.size()][];
        for (int i = 0; i < list.size(); i++) {
            result[i] = toStringArr(list.get(i));
        }
        return result;
    }

    public static String toString(List<String> list) {
        String str = "";
        for (int i = 0; i < list.size(); i++) {
            str += list.get(i) + " ";
        }
        return  str;
    }

    public static List<String> readLinesFromFileToList(String fileName) throws FileNotFoundException {
        List<String> lines;
        try (Scanner scanner = new Scanner(new File(fileName), "UTF-8")) {
            lines = new ArrayList<>();
            while (scanner.hasNext()) {
                lines.add(scanner.nextLine());
            }
            // обязательно, чтобы закрыть открытый файл
        }
        return lines;
    }

    public static List<String[]> splitList(List<String> list) {
        List<String[]> information = new ArrayList<>();

        for (String value : list) {
            String[] lines = value.split(" ");
            information.add(lines);
        }

        return information;
    }

    public static List<String[]> readSplitListFromFile(String fileName) throws FileNotFoundException {
        return splitList(readLinesFromFileToList(fileName));
    }

    public static List<StudentInformation> makeListToStudentInformation(List<String[]> list) {
        List<StudentInformation> informationList = new ArrayList<>();

        for (String[] value : list) {
            StudentInformation studentInformation = new StudentInformation(value[0], Integer.parseInt(value[1]),
                    Integer.parseInt(value[2]), Integer.parseInt(value[3]), Double.parseDouble(value[4]));
            informationList.add(studentInformation);
        }

        return informationList;
    }

    public static String[][] writeStringListToMatrix(List<String[]> list) {
        String[][] array = new String[list.size()][5];

        for (int r = 0; r < array.length; r++) {
            array[r] = list.get(r);
        }

        return array;
    }

    public static List<String[]> writeMatrixToArray2(String[][] array) {
        List<String[]> list = new ArrayList<>();

        for (int r = 0; r < array.length; r++) {
            list.add(r, array[r]);
        }

        return list;
    }

    public static List<List<String>> loadStringList2FromFile(String fileName) throws FileNotFoundException {
        try {
            return toList2(readLinesFromFile(fileName));
        } catch (FileNotFoundException e) {
            return null;
        }
    }

    public static List<List<String>> toList2(String[] lines) {
        List<List<String>> list2 = new ArrayList<>();
        for (String line : lines) {
            list2.add(toList(line));
        }
        return list2;
    }

    public static List<List<String>> toList2(String[][] lines) {
        List<List<String>> list2 = new ArrayList<>();
        for (String[] line : lines) {
            list2.add(toList(line));
        }
        return list2;
    }

    public static List<String> toList(String str) {
        String[] values = str.split(" ");
        return new ArrayList<>(Arrays.asList(values));
    }

    public static List<String> toList(String[] str) {
        return new ArrayList<>(Arrays.asList(str));
    }

    public static String[] readLinesFromFile(String fileName) throws FileNotFoundException {
        List<String> lines;
        try (Scanner scanner = new Scanner(new File(fileName), "UTF-8")) {
            lines = new ArrayList<>();
            while (scanner.hasNext()) {
                lines.add(scanner.nextLine());
            }
        }
        return lines.toArray(new String[0]);
    }

    public static void printListInConsole(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            System.out.print(" ");
        }
    }

    public static void printList2InConsole(List<List<String>> list) {
        for (int i = 0; i < list.size(); i++) {
            printListInConsole(list.get(i));
            System.out.println();
        }
    }
}
