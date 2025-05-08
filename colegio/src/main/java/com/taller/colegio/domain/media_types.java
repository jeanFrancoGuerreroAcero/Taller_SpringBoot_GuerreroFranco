package com.taller.colegio.domain;

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

@Entity
@Table(name = "media_types")
public class media_types {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    public media_types() {
    }

    public media_types(Long id, String description) {
        this.id = id;
        this.description = description;
    }

    @ManyToMany
    @JoinTable(name = "media_sub_chapters", joinColumns = @JoinColumn(name = "media_id"),inverseJoinColumns = @JoinColumn(name = "subChapters_id"))
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

    public List<subChapters> getSubChapters() {
        return subChapters;
    }

    public void setSubChapters(List<subChapters> subChapters) {
        this.subChapters = subChapters;
    }

    
}
