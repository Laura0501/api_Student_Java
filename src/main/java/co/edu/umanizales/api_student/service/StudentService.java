package co.edu.umanizales.api_student.service;

import co.edu.umanizales.api_student.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private List<Student> students;

    public List<Student> getAllStudents()
    {
        students= new ArrayList<>();
        students.add(new Student("123455",(byte)1,123234445.98,true,"paco restrepo"));
        students.add(new Student("123455",(byte)2,123234445.93,true,"Valentina mesa"));
        students.add(new Student("123455",(byte)1,123234445.38,false,"sebastian orozco"));
        students.add(new Student("123455",(byte)2,123234445.12,true,"Luisa moreno"));

        return students;
    }



}
