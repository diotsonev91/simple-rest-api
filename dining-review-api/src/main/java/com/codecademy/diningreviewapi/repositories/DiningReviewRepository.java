package com.codecademy.diningreviewapi.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codecademy.diningreviewapi.entities.DiningReview;
import com.codecademy.diningreviewapi.entities.Restaurant;

public interface DiningReviewRepository extends JpaRepository<DiningReview, Long> {

}