package com.example.elearning.Entity;

import jakarta.persistence.*;
import jakarta.servlet.Registration;
import org.apache.catalina.User;

import java.util.List;

@Entity
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String name;
    private String mail;
    private String role;
    private String password;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<RegEntity> registrations;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<ReviewEntity> reviews;

//    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
//    private List<Course> courses;

    public UserEntity(Long userId, String name, String mail, String role, String password, List<RegEntity> registrations, List<ReviewEntity> reviews) {
        this.userId = userId;
        this.name = name;
        this.mail = mail;
        this.role = role;
        this.password = password;
        this.registrations = registrations;
        this.reviews = reviews;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<RegEntity> getRegistrations() {
        return registrations;
    }

    public void setRegistrations(List<RegEntity> registrations) {
        this.registrations = registrations;
    }

    public List<ReviewEntity> getReviews() {
        return reviews;
    }

    public void setReviews(List<ReviewEntity> reviews) {
        this.reviews = reviews;
    }
}