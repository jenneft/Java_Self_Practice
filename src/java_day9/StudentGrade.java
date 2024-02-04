package java_day9;

public class StudentGrade {
    public static void main(String[] args) {

        String[] studentNames = {"Don Brown", "Ron Johnson", "Evelyn Grace","Emily Watkins","Charly Eyth"};
        int[] scores = {60, 70, 80, 90, 100};
        char[] grades = new char[5];

        grades= assignGrades(scores,grades);
        for (int i = 0; i < studentNames.length; i++) {
            System.out.println(studentNames[i]+"'s score is "+scores[i]+" and grade is "+grades[i]+".");

        }

    }

    private static char[] assignGrades(int[] scores, char[] grades) {
        for (int i = 0; i < scores.length; i++) {
            grades[i] = (scores[i] >= 90) ? 'A' :
                        (scores[i] >= 80) ? 'B' :
                        (scores[i] >= 70) ? 'C' :
                        (scores[i] >= 60) ? 'D' : 'F';
        }
        return grades;

    }
}
/*
write a program with the following specifications:
	4.1 Given two arrays with the same length:
		   studentNames (String[])
		   scores (int[])

   	4.2 Write a program to determine and store the students' grades in an array of characters named grades.

   2.3 Print the grade report for each student in separate lines.

			Example:
				String[] names = {"Anna", "Nancy", "Sarah"};
				int[] scores = {90, 75, 80};

			Output:
				grades = {'A', 'C', 'B'};
				Anna's score is 90, and grade is A
				Nancy's score is 75, and grade is C
				Sarah's score is 80, and grade is B
 */