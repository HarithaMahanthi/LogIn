package com.example.excercise.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

/**
 * Entity class representing an image uploaded by a user.
 */
@Entity
@Data
public class Image {

    /**
     * The unique identifier for the image.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * The unique identifier for the image on Imgur.
     */
    private String imgurId;

    /**
     * The URL link to access the image on Imgur.
     */
    private String link;

    /**
     * The user who uploaded the image.
     */
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
