package oop.encap.test;

public class Student {

    // 학생 이름
    private String name;
    // 학번
    private String studentId;
    // 학과
    private String department;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("유효하지 않은 이름입니다.");
            return;
        }
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        if (studentId == null || studentId.isEmpty()) {
            System.out.println("유효하지 않은 학번입니다.");
            return;
        }
        this.studentId = studentId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        if (department == null || department.isEmpty()) {
            System.out.println("유효하지 않은 학과입니다.");
            return;
        }
        this.department = department;
    }
}
