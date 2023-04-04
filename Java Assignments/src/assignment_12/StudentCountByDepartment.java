package assignment_12;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentCountByDepartment {
    public Map<String, Long> getCountByDepartment(List<Student> students) {
        return students.stream()
                .collect(Collectors.groupingBy(Student::getEngDepartment, Collectors.counting()));
    }
}
