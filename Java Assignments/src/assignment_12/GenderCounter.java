package assignment_12;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GenderCounter {
    public Map<String, Long> countByGender(List<Student> students) {
        return students.stream()
                .collect(Collectors.groupingBy(Student::getGender, Collectors.counting()));
    }
}
