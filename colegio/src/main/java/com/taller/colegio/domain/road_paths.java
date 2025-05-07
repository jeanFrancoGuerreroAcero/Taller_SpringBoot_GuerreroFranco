package com.taller.colegio.domain;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "road_paths")
public class road_paths {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private boolean isactive;
    private Timestamp created_at;
    private Timestamp updated_at;
    private String image_path;

    @NotNull
    private String path_name;

    @NotNull
    private String description;

    public road_paths() {
    }

    public road_paths(Long id, boolean isactive, Timestamp created_at, Timestamp updated_at, String image_path,@NotNull String path_name, @NotNull String description) {
        this.id = id;
        this.isactive = isactive;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.image_path = image_path;
        this.path_name = path_name;
        this.description = description;
    }

    @ManyToMany(mappedBy = "road_pathss")
    private List<skills> skill = new ArrayList<>();

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isIsactive() {
        return isactive;
    }

    public void setIsactive(boolean isactive) {
        this.isactive = isactive;
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

    public String getImage_path() {
        return image_path;
    }

    public void setImage_path(String image_path) {
        this.image_path = image_path;
    }

    public String getPath_name() {
        return path_name;
    }

    public void setPath_name(String path_name) {
        this.path_name = path_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public skills getSkills_id() {
        return skills_id;
    }

    public void setSkills_id(skills skills_id) {
        this.skills_id = skills_id;
    }

    

    
}
