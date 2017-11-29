package WebApplication.Applications.Service.Model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_user")
    private User userid;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "course_student", joinColumns = @JoinColumn(name="course_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name="student_id", referencedColumnName = "id"))
    private Set<Course> courses;
}
