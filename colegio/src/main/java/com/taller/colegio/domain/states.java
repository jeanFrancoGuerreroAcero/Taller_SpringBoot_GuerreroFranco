package com.taller.colegio.domain;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "states")
public class states {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int country_id;
    private Timestamp created_at;
    private Timestamp updated_at;
    private String abbreviation;
    private String name_state;
    public states(Long id, int country_id, Timestamp created_at, Timestamp updated_at, String abbreviation,
            String name_state) {
        this.id = id;
        this.country_id = country_id;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.abbreviation = abbreviation;
        this.name_state = name_state;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public int getCountry_id() {
        return country_id;
    }
    public void setCountry_id(int country_id) {
        this.country_id = country_id;
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
    public String getAbbreviation() {
        return abbreviation;
    }
    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }
    public String getName_state() {
        return name_state;
    }
    public void setName_state(String name_state) {
        this.name_state = name_state;
    }

    
}
