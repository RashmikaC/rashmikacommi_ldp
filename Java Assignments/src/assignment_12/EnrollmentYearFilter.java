package assignment_12;

import java.util.List;

public class EnrollmentYearFilter {
    public void getEnrolledAfter2018(List<Student> students) {
        students.stream()
                .filter(student -> student.getYearOfEnrollment()>2018)
                .forEach(student -> System.out.print(student.getName()+" "));
    }
}
