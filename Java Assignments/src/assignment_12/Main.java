package assignment_12;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8),
                new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2),
                new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3),
                new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80),
                new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70),
                new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70),
                new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70),
                new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80),
                new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85),
                new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82),
                new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83),
                new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4),
                new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6),
                new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8),
                new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4),
                new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4),
                new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5)));

        // Print the name of all departments in the college
        new DepartmentListPrinter().printDepartmentList(students);
        System.out.println();

        //Get the names of all students who have enrolled after 2018
        new EnrollmentYearFilter().getEnrolledAfter2018(students);
        System.out.println();

        // Get the details of all male student in the computer science department
        new MaleComputerScienceStudents().getMaleComputerScienceStudents(students);

        // How many male and female student are there
        Map<String, Long> genderCounts=new GenderCounter().countByGender(students);
        System.out.println(genderCounts);

        //What is the average age of male and female students
        Map<String, Double> genderAverageAge = new AverageAge().getAverageAgeByGender(students);
        System.out.println(genderAverageAge);

        //Get the details of student having the highest percentage
        Student topStudent =new HighestPercentageStudentFinder().getHighestPercentageStudent(students);
        System.out.println(topStudent.getName()+" "+topStudent.getId()+" "+topStudent.getPerTillDate()+" "+topStudent.getEngDepartment());

        //Count the number of students in each department
        Map<String, Long> departmentCounts = new StudentCountByDepartment().getCountByDepartment(students);
        System.out.println(departmentCounts);

        //What is the average percentage achieved in each department
        Map<String, Double> avgPercentageDept = new AveragePercentageByDepartment().getAveragePercentageByDept(students);
        System.out.println(avgPercentageDept);

        // Get the details of the youngest male student in the Electronic department
        new YoungestMaleElectronicStudentFinder().getYoungestMaleElectronicStudent(students);

        //How many male and female students are there in the computer science department
        new StudentsCountInComputerScience().getCount(students);
    }
}
//Time Complexity: O(n)
//Space Complexity: O(n), where n is number of students