package com.codecademy.diningreviewapi.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String displayName;
    private boolean existsByDisplayName;
    private String city;
    private String state;
    private String zipcode;
    private boolean interestedInPeanutAllergies;
    private boolean interestedInEggAllergies;
    private boolean interestedInDairyAllergies;

    // Constructors (default and parameterized)
    public User() {
    }

    public User(String displayName, String city, String state, String zipcode, boolean interestedInPeanutAllergies,
            boolean interestedInEggAllergies, boolean interestedInDairyAllergies) {
        this.displayName = displayName;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.interestedInPeanutAllergies = interestedInPeanutAllergies;
        this.interestedInEggAllergies = interestedInEggAllergies;
        this.interestedInDairyAllergies = interestedInDairyAllergies;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public boolean isInterestedInPeanutAllergies() {
        return interestedInPeanutAllergies;
    }

    public void setInterestedInPeanutAllergies(boolean interestedInPeanutAllergies) {
        this.interestedInPeanutAllergies = interestedInPeanutAllergies;
    }

    public boolean isInterestedInEggAllergies() {
        return interestedInEggAllergies;
    }

    public void setInterestedInEggAllergies(boolean interestedInEggAllergies) {
        this.interestedInEggAllergies = interestedInEggAllergies;
    }

    public boolean isInterestedInDairyAllergies() {
        return interestedInDairyAllergies;
    }

    public void setInterestedInDairyAllergies(boolean interestedInDairyAllergies) {
        this.interestedInDairyAllergies = interestedInDairyAllergies;
    }

	public boolean isExistsByDisplayName() {
		return existsByDisplayName;
	}

	public void setExistsByDisplayName(boolean existsByDisplayName) {
		this.existsByDisplayName = existsByDisplayName;
	}

    // Add any additional methods as needed
}
