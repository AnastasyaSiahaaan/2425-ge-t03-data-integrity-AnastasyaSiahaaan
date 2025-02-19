package academic.model;

/**
 * @author 12S23030 - Simorangkir Jonathan
 * @author 12S23046- Anastasya T.B Siahaan
 */
public class Course {
    private String courseID;
    private String courseName;
    private int sks;
    private String grade;

    public Course(String courseID, String courseName, int sks, String grade) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.sks = sks;
        this.grade = grade;
    }

    public String getCourseID() {
        return courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getSks() {
        return sks;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return courseID + "|" + courseName + "|" + sks + "|" + grade;
    }
}