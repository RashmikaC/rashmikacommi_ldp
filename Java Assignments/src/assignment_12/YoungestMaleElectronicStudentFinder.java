package assignment_12;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class YoungestMaleElectronicStudentFinder {
    public void getYoungestMaleElectronicStudent(List<Student> students){
        Optional<Student> youngestMaleElectronicStudent = students.stream()
                .filter(s -> s.getEngDepartment().equals("Electronic"))
                .filter(s -> s.getGender().equals("Male"))
                .min(Comparator.comparingInt(Student::getAge));

        if (youngestMaleElectronicStudent.isPresent()) {
            System.out.println(youngestMaleElectronicStudent.get().getName());
        } else {
            System.out.println("No male student found in the Electronic department");
        }
    }
}
