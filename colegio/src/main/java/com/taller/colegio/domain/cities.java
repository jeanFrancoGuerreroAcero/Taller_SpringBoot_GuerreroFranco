package com.taller.colegio.domain;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cities")
public class cities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int state_id;
    private String state_abbreviation;
    private Timestamp created_at;
    private Timestamp updated_at;
    private String name_city;
    public cities(Long id, int state_id, String state_abbreviation, Timestamp created_at, Timestamp updated_at,String name_city) {
        this.id = id;
        this.state_id = state_id;
        this.state_abbreviation = state_abbreviation;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.name_city = name_city;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public int getState_id() {
        return state_id;
    }
    public void setState_id(int state_id) {
        this.state_id = state_id;
    }
    public String getState_abbreviation() {
        return state_abbreviation;
    }
    public void setState_abbreviation(String state_abbreviation) {
        this.state_abbreviation = state_abbreviation;
    }
    public Timestamp getCreated_at() {
        return created_at;
    }
    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }
    public Timestamp getUpdated_at() {
        return updated_at;
    }
    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }
    public String getName_city() {
        return name_city;
    }
    public void setName_city(String name_city) {
        this.name_city = name_city;
    }

        
}
