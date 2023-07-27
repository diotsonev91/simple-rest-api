package com.codecademy.diningreviewapi.services;

import com.codecademy.diningreviewapi.entities.Restaurant;

public class RestaurantScoreCalculator {

    public Float calculateOverallScore(Restaurant restaurant) {
        int totalCategories = 0;
        float totalScore = 0;

        if (restaurant.getPeanut() != null) {
            totalScore += restaurant.getPeanut();
            totalCategories++;
        }

        if (restaurant.getEgg() != null) {
            totalScore += restaurant.getEgg();
            totalCategories++;
        }

        if (restaurant.getDairy() != null) {
            totalScore += restaurant.getDairy();
            totalCategories++;
        }

        if (totalCategories > 0) {
            return totalScore / totalCategories;
        } else {
            return null;
        }
    }
}
