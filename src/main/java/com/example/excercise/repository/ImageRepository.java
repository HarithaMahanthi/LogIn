package com.example.excercise.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.excercise.entity.Image;
import com.example.excercise.entity.User;

/**
 * Repository interface for managing Image entities.
 */
public interface ImageRepository extends JpaRepository<Image, Long> {

    /**
     * Finds a list of images associated with the given user.
     *
     * @param user the user whose images are to be found
     * @return a list of images associated with the user
     */
    List<Image> findByUser(User user);
}
