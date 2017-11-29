package WebApplication.Applications.Service.Model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String couserName;

    @ManyToMany(mappedBy = "courses")
    private Set<Student> students;

    public Course(String couserName, Set<Student> students) {
        this.couserName = couserName;
        this.students = students;
    }

    public String getCouserName() {
        return couserName;
    }

    public void setCouserName(String couserName) {
        this.couserName = couserName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }
}
