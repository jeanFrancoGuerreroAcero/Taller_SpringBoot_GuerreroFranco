package com.taller.colegio.domain;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "countries")
public class countries {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Timestamp created_at;
    private Timestamp updated_at;
    private String iconuri;
    private String skill_name;
    private String skill_description;
    public countries(Long id, Timestamp created_at, Timestamp updated_at, String iconuri, String skill_name,
            String skill_description) {
        this.id = id;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.iconuri = iconuri;
        this.skill_name = skill_name;
        this.skill_description = skill_description;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
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
    public String getIconuri() {
        return iconuri;
    }
    public void setIconuri(String iconuri) {
        this.iconuri = iconuri;
    }
    public String getSkill_name() {
        return skill_name;
    }
    public void setSkill_name(String skill_name) {
        this.skill_name = skill_name;
    }
    public String getSkill_description() {
        return skill_description;
    }
    public void setSkill_description(String skill_description) {
        this.skill_description = skill_description;
    }

    

}
