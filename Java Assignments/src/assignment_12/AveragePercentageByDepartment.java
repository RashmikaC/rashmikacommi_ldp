package assignment_12;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AveragePercentageByDepartment {
    public Map<String, Double> getAveragePercentageByDept(List<Student> students) {
        return students.stream()
                .collect(Collectors.groupingBy(Student::getEngDepartment, Collectors.averagingDouble(Student::getPerTillDate)));
    }
}
