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
            System.out.println("이름이 입력되지 않았습니다. 확인해주세요.");
            return;
        }
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        if (studentId == null || studentId.isEmpty()) {
            System.out.println("학번이 입력되지 않았습니다. 확인해주세요");
            return;
        }
        this.studentId = studentId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        if (department == null || department.isEmpty()) {
            System.out.println("학과가 입력되지 않았습니다. 확인해주세요");
            return;
        }
        this.department = department;
    }
}
