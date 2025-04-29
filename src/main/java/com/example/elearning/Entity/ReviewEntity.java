package com.example.elearning.Entity;

import jakarta.persistence.*;
import org.apache.catalina.User;

@Entity
public class ReviewEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reviewId;
    private int rating;
    private String comment;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity user;

    // You can add a course relation if review is related to a course
    // @ManyToOne
    // private Course course;

    // Getters and setters

    public ReviewEntity(Long reviewId, int rating, String comment, UserEntity user) {
        this.reviewId = reviewId;
        this.rating = rating;
        this.comment = comment;
        this.user = user;
    }

    public Long getReviewId() {
        return reviewId;
    }

    public void setReviewId(Long reviewId) {
        this.reviewId = reviewId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }



    public void setUser(UserEntity user) {
        this.user = user;
    }
}
