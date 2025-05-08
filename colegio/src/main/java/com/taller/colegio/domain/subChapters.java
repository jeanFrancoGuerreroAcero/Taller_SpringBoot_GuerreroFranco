package com.taller.colegio.domain;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "subChapters")
public class subChapters {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private String summary;

    public subChapters() {
    }
    public subChapters(Long id, String description, String summary) {
        this.id = id;
        this.description = description;
        this.summary = summary;
    }

    @OneToMany(mappedBy = "subChapter")
    private List<chapters> chapters = new ArrayList<>();

    @ManyToMany(mappedBy = "subChapterss")
    private List<subChapters> subChapters = new ArrayList<>();


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getSummary() {
        return summary;
    }
    public void setSummary(String summary) {
        this.summary = summary;
    }
    public List<chapters> getChapters() {
        return chapters;
    }
    public void setChapters(List<chapters> chapters) {
        this.chapters = chapters;
    }
    public List<subChapters> getSubChapters() {
        return subChapters;
    }
    public void setSubChapters(List<subChapters> subChapters) {
        this.subChapters = subChapters;
    }

    


    

    

}
