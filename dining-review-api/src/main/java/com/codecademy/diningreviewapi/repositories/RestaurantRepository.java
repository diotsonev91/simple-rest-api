package com.codecademy.diningreviewapi.repositories;

import com.codecademy.diningreviewapi.entities.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

}