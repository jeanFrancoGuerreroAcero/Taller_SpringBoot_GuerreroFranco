package com.taller.colegio.domain;

import java.security.Timestamp;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "chapters")
public class chapters {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int numberChapter;
    private int skill_id;
    private Timestamp created_at;
    private Timestamp updated_at;
    private String description;
    private String chapter_summary;

    public chapters() {
    }

    public chapters(Long id, int numberChapter, int skill_id, Timestamp created_at, Timestamp updated_at,String description, String chapter_summary) {
        this.id = id;
        this.numberChapter = numberChapter;
        this.skill_id = skill_id;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.description = description;
        this.chapter_summary = chapter_summary;
    }

    @OneToMany(mappedBy = "chapters")
    private List<skills> skills = new ArrayList<>();
    
    @ManyToOne
    @JoinColumn(name = "subChapters_id")

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumberChapter() {
        return numberChapter;
    }

    public void setNumberChapter(int numberChapter) {
        this.numberChapter = numberChapter;
    }

    public int getSkill_id() {
        return skill_id;
    }

    public void setSkill_id(int skill_id) {
        this.skill_id = skill_id;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getChapter_summary() {
        return chapter_summary;
    }

    public void setChapter_summary(String chapter_summary) {
        this.chapter_summary = chapter_summary;
    }

    public List<skills> getSkills() {
        return skills;
    }

    public void setSkills(List<skills> skills) {
        this.skills = skills;
    }

    

}
