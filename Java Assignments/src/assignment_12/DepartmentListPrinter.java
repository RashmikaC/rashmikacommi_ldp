package assignment_12;

import java.util.List;

public class DepartmentListPrinter {
    public void printDepartmentList(List<Student> students) {
        students.stream()
                .map(Student::getEngDepartment) // method reference, .map(student -> student.getEngDepartment())
                .distinct()
                .forEach(department -> System.out.print(department+" "));
    }
}
