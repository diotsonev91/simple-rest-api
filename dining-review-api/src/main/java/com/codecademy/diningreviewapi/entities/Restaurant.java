package com.codecademy.diningreviewapi.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "restaurants")
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int peanut;
    private int egg;
    private int dairy;
    private int overallScore;
    private String zipcode;
    
    public Restaurant() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPeanut() {
        return peanut;
    }

    public void setPeanut(Integer peanut) {
        this.peanut = peanut;
    }

    public Integer getEgg() {
        return egg;
    }

    public void setEgg(Integer egg) {
        this.egg = egg;
    }

    public Integer getDairy() {
        return dairy;
    }

    public void setDairy(Integer dairy) {
        this.dairy = dairy;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOverallScore() {
		return overallScore;
	}

	public void setOverallScore(int overallScore) {
		this.overallScore = overallScore;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
}
