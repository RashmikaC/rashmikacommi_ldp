package assignment_12;

import java.util.Comparator;
import java.util.List;

public class HighestPercentageStudentFinder {
    public Student getHighestPercentageStudent(List<Student> students) {
        return students.stream()
                .max(Comparator.comparingDouble(Student::getPerTillDate))
                .get();
    }
}
