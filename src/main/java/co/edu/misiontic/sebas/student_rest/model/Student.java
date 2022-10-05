package co.edu.misiontic.sebas.student_rest.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Students")

public class Student implements Serializable {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String firstName;
        private String lastName;
        private String email;

        // Constructors
        public Student() {
        }

        public Student(Long id, String firstName, String lastName, String email, List<Course> courses) {
                this.id = id;
                this.firstName = firstName;
                this.lastName = lastName;
                this.email = email;
                this.courses = courses;
        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getFirstName() {
                return firstName;
        }

        public void setFirstName(String firstName) {
                this.firstName = firstName;
        }

        public String getLastName() {
                return lastName;
        }

        public void setLastName(String lastName) {
                this.lastName = lastName;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public List<Course> getCourses() {
                return courses;
        }

        public void setCourses(List<Course> courses) {
                this.courses = courses;
        }

        @Override
        public String toString() {
                return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
                                + ", courses=" + courses + "]";
        }

        @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
        @JoinTable(name = "students_courses", joinColumns = {
                        @JoinColumn(name = "student_id", referencedColumnName = "id")
        }, inverseJoinColumns = {
                        @JoinColumn(name = "course_id", referencedColumnName = "id")
        })
        private List<Course> courses = new ArrayList<>();

}