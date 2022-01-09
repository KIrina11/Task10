package ru.vsu.cs.kislova_i_v;

import java.util.List;

public class StudentInformation {
    private String nameStudent;
    private int scoreRussianLanguage;
    private int scoreMath;
    private int scorePhysic;
    private double averageScore;

    public StudentInformation(String nameStudent, int scoreRussianLanguage, int scoreMath, int scorePhysic, double averageScore) {
        this.nameStudent = nameStudent;
        this.scoreRussianLanguage = scoreRussianLanguage;
        this.scoreMath = scoreMath;
        this.scorePhysic = scorePhysic;
        this.averageScore = (scoreRussianLanguage + scoreMath + scorePhysic) / 3;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public int getScoreRussianLanguage() {
        return scoreRussianLanguage;
    }

    public int getScoreMath() {
        return scoreMath;
    }

    public int getScorePhysic() {
        return scorePhysic;
    }

    public double getAverageScore() {
        return (scoreRussianLanguage + scoreMath + scorePhysic) / 3;
    }

    public static String[][] makeListToStringArray2(List<StudentInformation> list) {
        String[][] array = new String[list.size()][5];

        for (int r = 0; r < array.length; r++) {
            StudentInformation studentInformation = list.get(r);

            array[r][0] = studentInformation.nameStudent;
            array[r][1] = String.valueOf(studentInformation.scoreRussianLanguage);
            array[r][2] = String.valueOf(studentInformation.scoreMath);
            array[r][3] = String.valueOf(studentInformation.scorePhysic);
            array[r][4] = String.valueOf(studentInformation.averageScore);
        }

        return array;
    }
}
