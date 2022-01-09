package ru.vsu.cs.kislova_i_v;

import org.junit.*;
import ru.vsu.cs.util.ArrayUtils;
import ru.vsu.cs.util.ListUtils;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;

public class Tests {
    @BeforeClass
    public static void reportAboutStartOfTests() {
        System.out.println("Testing of the program begins...");
        System.out.println();
    }

    @Before
    public void reportOnTestOperation() {
        System.out.print("Test is running...");
    }

    @Test
    public void test1() throws FileNotFoundException {
        List<String[]> list = ListUtils.readSplitListFromFile("C:\\Users\\Ирина\\IdeaProjects\\Task10_num23"
                + "\\inputForTests\\input01.txt");
        int numberOfBudgetSeats = 10;
        List<String[]> modifiedList = ListUtils.writeMatrixToArray2(StudentInformation.makeListToStringArray2(Selection.selectionStudents(ListUtils.makeListToStudentInformation(list), numberOfBudgetSeats)));
        List<String[]> correctList = ListUtils.readSplitListFromFile("C:\\Users\\Ирина\\IdeaProjects"
                + "\\Task10_num23\\correctTestResults\\correctTestResult01.txt");

        Assert.assertEquals(compareModifiedListAndResultList(modifiedList, correctList), true);
    }

    @Test
    public void test2() throws FileNotFoundException {
        List<String[]> list = ListUtils.readSplitListFromFile("C:\\Users\\Ирина\\IdeaProjects\\Task10_num23"
                + "\\inputForTests\\input02.txt");
        int numberOfBudgetSeats = 5;
        List<String[]> modifiedList = ListUtils.writeMatrixToArray2(StudentInformation.makeListToStringArray2(Selection.selectionStudents(ListUtils.makeListToStudentInformation(list), numberOfBudgetSeats)));
        List<String[]> correctList = ListUtils.readSplitListFromFile("C:\\Users\\Ирина\\IdeaProjects"
                + "\\Task10_num23\\correctTestResults\\correctTestResult02.txt");

        Assert.assertEquals(compareModifiedListAndResultList(modifiedList, correctList), true);
    }

    @Test
    public void test3() throws FileNotFoundException {
        List<String[]> list = ListUtils.readSplitListFromFile("C:\\Users\\Ирина\\IdeaProjects\\Task10_num23"
                + "\\inputForTests\\input03.txt");
        int numberOfBudgetSeats = 15;
        List<String[]> modifiedList = ListUtils.writeMatrixToArray2(StudentInformation.makeListToStringArray2(Selection.selectionStudents(ListUtils.makeListToStudentInformation(list), numberOfBudgetSeats)));
        List<String[]> correctList = ListUtils.readSplitListFromFile("C:\\Users\\Ирина\\IdeaProjects"
                + "\\Task10_num23\\correctTestResults\\correctTestResult03.txt");

        Assert.assertEquals(compareModifiedListAndResultList(modifiedList, correctList), true);
    }

    @Test
    public void test4() throws FileNotFoundException {
        List<String[]> list = ListUtils.readSplitListFromFile("C:\\Users\\Ирина\\IdeaProjects\\Task10_num23"
                + "\\inputForTests\\input04.txt");
        int numberOfBudgetSeats = 20;
        List<String[]> modifiedList = ListUtils.writeMatrixToArray2(StudentInformation.makeListToStringArray2(Selection.selectionStudents(ListUtils.makeListToStudentInformation(list), numberOfBudgetSeats)));
        List<String[]> correctList = ListUtils.readSplitListFromFile("C:\\Users\\Ирина\\IdeaProjects"
                + "\\Task10_num23\\correctTestResults\\correctTestResult04.txt");

        Assert.assertEquals(compareModifiedListAndResultList(modifiedList, correctList), true);
    }

    @Test
    public void test5() throws FileNotFoundException {
        List<String[]> list = ListUtils.readSplitListFromFile("C:\\Users\\Ирина\\IdeaProjects\\Task10_num23"
                + "\\inputForTests\\input05.txt");
        int numberOfBudgetSeats = 30;
        List<String[]> modifiedList = ListUtils.writeMatrixToArray2(StudentInformation.makeListToStringArray2(Selection.selectionStudents(ListUtils.makeListToStudentInformation(list), numberOfBudgetSeats)));
        List<String[]> correctList = ListUtils.readSplitListFromFile("C:\\Users\\Ирина\\IdeaProjects"
                + "\\Task10_num23\\correctTestResults\\correctTestResult05.txt");

        Assert.assertEquals(compareModifiedListAndResultList(modifiedList, correctList), true);
    }

    private static boolean compareModifiedListAndResultList(List<String[]> modifiedList, List<String[]> resultList) {
        boolean value = false;
        for (int i = 0; i < modifiedList.size(); i++) {
            value = Arrays.equals(modifiedList.get(i), resultList.get(i));
        }
        return value;
    }

    @After
    public void reportCompletionOfTest() {
        System.out.println("Test execution completed");
    }

    @AfterClass
    public static void reportAboutEndOfTests() {
        System.out.println();
        System.out.print("Testing of the program is completed");
    }
}
