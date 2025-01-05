package com.example.excercise.dto;

import lombok.Data;
import java.util.List;

import com.example.excercise.entity.Image;
/**
 * DTO class representing a user's profile including their basic information and associated images.
 */
@Data
public class UserProfile {
    /**
     * The unique identifier for the user.
     */
    private Long id;

    /**
     * The username of the user.
     */
    private String username;

    /**
     * A list of images associated with the user.
     */
    private List<Image> images;
}
