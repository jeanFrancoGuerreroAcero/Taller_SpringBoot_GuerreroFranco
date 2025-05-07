package com.taller.colegio.domain;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "skills")
public class skills {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Timestamp created_at;
    private Timestamp updated_at;
    
    @NotNull
    private String iconurl;

    @NotNull
    private String skill_name;

    @NotNull
    private String skill_description;

    public skills() {
    }

    public skills(Long id, Timestamp created_at, Timestamp updated_at, @NotNull String iconurl,@NotNull String skill_name, @NotNull String skill_description) {
        this.id = id;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.iconurl = iconurl;
        this.skill_name = skill_name;
        this.skill_description = skill_description;
    }

    @ManyToMany
    @JoinTable(name = "skill_route_path", joinColumns = @JoinColumn(name = "persona_id" , foreignKey = @Foreingkey(name = "fk_skill_id_roas_paths")),inverseJoinColumns = @JoinColumn(name = "project_id"))
    private List<road_paths> projects = new ArrayList<>();

    @ManyToMany
    @JoinTable(
        name = "skill_route_path",
        joinColumns = @JoinColumn(name = "skill_id", foreignKey = @ForeignKey(name = "fk_skills_id_road_paths")),
        inverseJoinColumns = @JoinColumn(name = "road_path_id")
    )



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

    public String getIconurl() {
        return iconurl;
    }

    public void setIconurl(String iconurl) {
        this.iconurl = iconurl;
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

    public road_paths getRoad_paths_id() {
        return road_paths_id;
    }

    public void setRoad_paths_id(road_paths road_paths_id) {
        this.road_paths_id = road_paths_id;
    }
    
    
}
