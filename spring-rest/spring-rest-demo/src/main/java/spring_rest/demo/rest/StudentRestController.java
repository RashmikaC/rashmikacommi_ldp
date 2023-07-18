package spring_rest.demo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring_rest.demo.entity.MyStudent;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<MyStudent> theStudents;

    //define @PostConstruct to load data only once

    @PostConstruct
    public void loadData(){
        theStudents=new ArrayList<>();
        theStudents.add(new MyStudent("Ram","K"));
        theStudents.add(new MyStudent("Ravi","P"));
        theStudents.add(new MyStudent("Raju","L"));
    }

    //define endpoint for "/students" - return list of students
    @GetMapping("/students")
    public List<MyStudent> getStudents(){
        return theStudents;
    }

    //define endpoint for "/students/{studentId}" - return single student
    @GetMapping("/students/{studentId}")
    public MyStudent getStudent(@PathVariable int studentId){
        //check studentId
        if(studentId>=theStudents.size() || studentId<0)
            throw new StudentsNotFoundException("Student id not found"+studentId);

        return theStudents.get(studentId);
    }
    //exceptional handlers can be added here but better to use global handler
}
