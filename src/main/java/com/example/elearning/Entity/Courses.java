package com.example.elearning.Entity;
import jakarta.persistence.*;
import java.util.List;
import jakarta.persistence.Entity;


@Entity
public class Courses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseId;

    private String courseName;
    private String description;
    private Double price;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private List<Category> categories;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private List<Content> contents;

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public UserEntityg getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public List<Content> getContents() {
        return contents;
    }

    public void setContents(List<Content> contents) {
        this.contents = contents;
    }
}
