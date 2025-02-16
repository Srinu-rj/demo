package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Review;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {

}
