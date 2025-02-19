package academic.model;

/**
 * @author 12S23030 - Simorangkir Jonathan
 * @author 12S23046- Anastasya T.B Siahaan
 */
public class Enrollment {
    private String studentId;
    private String courseId;
    private String academicYear;
    private String semester;
    private String status;

    public Enrollment(String studentId, String courseId, String academicYear, String semester, String status) {
        this.studentId = studentId;
        this.courseId = courseId;
        this.academicYear = academicYear;
        this.semester = semester;
        this.status = status;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getAcademicYear() {
        return academicYear;
    }

    public String getSemester() {
        return semester;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return courseId + "|" + studentId + "|" + academicYear + "|" + semester + "|" + status;
    }
}