package academic.driver;

import java.util.Scanner;
import academic.model.Course;
import academic.model.Student;
import academic.model.Enrollment;

/**
 * @author 12S23030 - Simorangkir Jonathan
 * @author 12S23046 - Anastasya T.B Siahaan
 */
public class Driver1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Course[] courses = new Course[100];
        Student[] students = new Student[100];
        Enrollment[] enrollments = new Enrollment[100];
        int courseCount = 0, studentCount = 0, enrollmentCount = 0;
        
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            if (input.equals("---")) {
                break;
            }
            
            String[] data = input.split("#");
            String type = data[0];

            switch (type) {
                case "course-add":
                    if (data.length == 5) {
                        String NIM = data[1];
                        String courseID = data[2];
                        int sks = Integer.parseInt(data[3]);
                        String grade = data[4];
                        courses[courseCount++] = new Course(NIM, courseID, sks, grade);
                    }
                    break;
                case "student-add":
                    if (data.length == 5) {
                        String NIM = data[1];
                        String nama = data[2];
                        int tahun = Integer.parseInt(data[3]);
                        String prodi = data[4];
                        students[studentCount++] = new Student(NIM, nama, tahun, prodi);
                    }
                    break;
                case "enrollment-add":
                    if (data.length == 5) {
                        String NIM = data[1];
                        String NIM2 = data[2];
                        String tahun = data[3];
                        String prodi = data[4];
                        String status = "None"; 

                        // Cek apakah NIM dan NIM2 valid
                        boolean student1Exists = false, student2Exists = false;
                        for (int i = 0; i < studentCount; i++) {
                            if (students[i].getNIM().equals(NIM)) {
                                student1Exists = true;
                            }
                            if (students[i].getNIM().equals(NIM2)) {
                                student2Exists = true;
                            }
                        }

                        if (student1Exists && student2Exists) {
                            enrollments[enrollmentCount++] = new Enrollment(NIM, NIM2, tahun, prodi, status);
                        }
                    }
                    break;
            }
        }
        scanner.close();

        for (int i = courseCount - 1; i >= 0; i--) {
            System.out.println(courses[i]);
        }

        for (int i = 0; i < studentCount; i++) {
            System.out.println(students[i]);
        }

        for (int i = 0; i < enrollmentCount; i++) {
            System.out.println(enrollments[i]);
        }
    }
}
