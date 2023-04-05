package association.aggregation;

import java.util.List;

public class College {
    String name;
    private List<Teacher> teacher;
    public College(String name, List<Teacher> teacher){
        this.name=name;
        this.teacher=teacher;
    }

    public List<Teacher> getTeachers() {
        return teacher;
    }
}
//    Aggregation is where one entity contains other one but both can survive independently. here college has a teacher
//without college teacher can survive independently
//code reusability