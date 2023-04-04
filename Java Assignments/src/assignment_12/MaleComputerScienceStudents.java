package assignment_12;

import java.util.List;

public class MaleComputerScienceStudents {
    public void getMaleComputerScienceStudents(List<Student> students) {
        students.stream()
                .filter(student -> student.getEngDepartment().equals("Computer Science") && student.getGender().equals("Male"))
                .forEach(student -> System.out.println("Name:"+student.getName()+" Id:"+student.getId()+" Age:"+student.getAge()+" Percentage:"+student.getPerTillDate()));

    }
}
