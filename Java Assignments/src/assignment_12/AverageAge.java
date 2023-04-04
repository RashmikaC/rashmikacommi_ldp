package assignment_12;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AverageAge {
    public Map<String, Double> getAverageAgeByGender(List<Student> students) {
        return students.stream()
                .collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getAge)));
    }
}
