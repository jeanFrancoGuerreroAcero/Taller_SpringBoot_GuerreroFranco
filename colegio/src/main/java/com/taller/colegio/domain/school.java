package com.taller.colegio.domain;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "school")
public class school {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int city_id;
    private Timestamp created_at;
    private Timestamp updated_at;
    private String description_school;
    private String headmaster_school;
    private String celphone_school;
    private String email_school;
    public school(Long id, int city_id, Timestamp created_at, Timestamp updated_at, String description_school,
            String headmaster_school, String celphone_school, String email_school) {
        this.id = id;
        this.city_id = city_id;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.description_school = description_school;
        this.headmaster_school = headmaster_school;
        this.celphone_school = celphone_school;
        this.email_school = email_school;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public int getCity_id() {
        return city_id;
    }
    public void setCity_id(int city_id) {
        this.city_id = city_id;
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
    public String getDescription_school() {
        return description_school;
    }
    public void setDescription_school(String description_school) {
        this.description_school = description_school;
    }
    public String getHeadmaster_school() {
        return headmaster_school;
    }
    public void setHeadmaster_school(String headmaster_school) {
        this.headmaster_school = headmaster_school;
    }
    public String getCelphone_school() {
        return celphone_school;
    }
    public void setCelphone_school(String celphone_school) {
        this.celphone_school = celphone_school;
    }
    public String getEmail_school() {
        return email_school;
    }
    public void setEmail_school(String email_school) {
        this.email_school = email_school;
    }

    

}
