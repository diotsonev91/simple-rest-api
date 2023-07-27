package com.codecademy.diningreviewapi.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "dining_reviews")
public class DiningReview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String displayName;
    private Long restaurantId;
    private Integer peanutScore;
    private Integer eggScore;
    private Integer dairyScore;
    private String commentary;
    private Boolean isApproved; 
    private Boolean isPendingReview;
    
    @Enumerated(EnumType.STRING)
    private DiningReviewStatus status;

    public DiningReview() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Long restaurantId) {
        this.restaurantId = restaurantId;
    }

    public Integer getPeanutScore() {
        return peanutScore;
    }

    public void setPeanutScore(Integer peanutScore) {
        this.peanutScore = peanutScore;
    }

    public Integer getEggScore() {
        return eggScore;
    }

    public void setEggScore(Integer eggScore) {
        this.eggScore = eggScore;
    }

    public Integer getDairyScore() {
        return dairyScore;
    }

    public void setDairyScore(Integer dairyScore) {
        this.dairyScore = dairyScore;
    }

    public String getCommentary() {
        return commentary;
    }

    public void setCommentary(String commentary) {
        this.commentary = commentary;
    }

    public Boolean getIsApproved() {
        return isApproved;
    }

    public void setIsApproved(Boolean isApproved) {
        // Ensure that the review can't be both pending and approved
        if (isApproved) {
            this.isPendingReview = false;
        }
        this.isApproved = isApproved;
    }

    public Boolean getIsPendingReview() {
        return isPendingReview;
    }

    public void setIsPendingReview(Boolean isPendingReview) {
        // Ensure that the review can't be both pending and approved
        if (isPendingReview) {
            this.isApproved = false;
        }
        this.isPendingReview = isPendingReview;
    }
}
