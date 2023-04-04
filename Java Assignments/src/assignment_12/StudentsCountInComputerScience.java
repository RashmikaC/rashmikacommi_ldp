package assignment_12;

import java.util.List;

public class StudentsCountInComputerScience {
    public void getCount(List<Student> students) {
        long maleCSCount=students.stream()
                .filter(s->s.getGender().equals("Male")&&s.getEngDepartment().equals("Computer Science"))
                .count();
        long femaleCSCount=students.stream()
                .filter(s->s.getGender().equals("Female")&&s.getEngDepartment().equals("Computer Science"))
                .count();
        System.out.println("Count of male students is "+maleCSCount+" and female students is "+femaleCSCount);
    }
}
