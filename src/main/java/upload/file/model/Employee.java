package upload.file.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "Employee")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private int empId;
    @Column(name = "emp_name", columnDefinition = "varchar(100)", nullable = false)
    private String empName;
    @Column(name = "emp_age")
    private int age;
    @Column(name = "emp_avatar", columnDefinition = "text")
    private String avatar;
    @Column(name = "emp_status")
    private boolean status;
}
