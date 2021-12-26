package secondTask;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList <StudentCourseGrade> items = new ArrayList();
        items.add(new StudentCourseGrade(1,1123,34));
        items.add(new StudentCourseGrade(1,1124,88));
        items.add(new StudentCourseGrade(2,1123,65));


        ArrayList <Integer> list = buildListStudentsCourses(items, 2);
        for (int i:list) {
            System.out.println(i);
        }

        System.out.println(averageGrade(items, 1125));
    }

    public static ArrayList buildListStudentsCourses (ArrayList <StudentCourseGrade> listGrades, int studentId) {
        ArrayList<Integer> courses = new ArrayList<>();
        for (StudentCourseGrade scg: listGrades) {
            if (scg.studentId == studentId) courses.add(scg.courseId);
        }
        return courses;
    }

    public static int averageGrade (ArrayList <StudentCourseGrade> listGrades, int courseId) {
        int sum = 0;
        int quantity = 0;
        for (StudentCourseGrade scg: listGrades) {
            if (scg.courseId == courseId) {
                sum = sum + scg.grade;
                quantity++;
            }
        }
        if (quantity !=0) return sum/quantity;
        else
            return 0;
    }
}
