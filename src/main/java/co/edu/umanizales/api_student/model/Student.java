package co.edu.umanizales.api_student.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@AllArgsConstructor
public class Student {
    private String identification;
    private byte gender;
    private double salary;
    private boolean job;
    private String name;
}
