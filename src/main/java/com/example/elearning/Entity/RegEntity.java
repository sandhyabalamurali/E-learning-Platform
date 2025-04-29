package com.example.elearning.Entity;

import jakarta.persistence.*;
import org.apache.catalina.User;

import java.time.LocalDateTime;

@Entity
public class RegEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long regId;

    private LocalDateTime timestamp;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity user;

//    @ManyToOne
//    @JoinColumn(name = "course_id", nullable = false)
//    private Course course;


    public RegEntity(Long regId, LocalDateTime timestamp, UserEntity user) {
        this.regId = regId;
        this.timestamp = timestamp;
        this.user = user;
    }

    public Long getRegId() {
        return regId;
    }

    public void setRegId(Long regId) {
        this.regId = regId;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }
}
