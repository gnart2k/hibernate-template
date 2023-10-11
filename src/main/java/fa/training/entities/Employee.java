package fa.training.entities;

import jakarta.persistence.*;
import lombok.*;

@Data
@ToString
@Table(name = "employee")
@Entity
@Builder
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private long employeeId;
    @Column(name = "employee_name")
    private String employeeName;

//    public Employee(String employeeName) {
//        this.employeeName = employeeName;
//    }
}