package com.taller.colegio.domain;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "operation")
public class Operation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private Boolean permit;

    private int module_id;
    private String http_method;
    private String name;
    private String path;

    @OneToMany(mappedBy = "operation")
    private List<module> module = new ArrayList<>();

    public Operation() {
    }

    public Operation(Long id, @NotNull Boolean permit, int module_id, String http_method, String name, String path,
            List<com.taller.colegio.domain.module> module) {
        this.id = id;
        this.permit = permit;
        this.module_id = module_id;
        this.http_method = http_method;
        this.name = name;
        this.path = path;
        this.module = module;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getPermit() {
        return permit;
    }

    public void setPermit(Boolean permit) {
        this.permit = permit;
    }

    public int getModule_id() {
        return module_id;
    }

    public void setModule_id(int module_id) {
        this.module_id = module_id;
    }

    public String getHttp_method() {
        return http_method;
    }

    public void setHttp_method(String http_method) {
        this.http_method = http_method;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public List<module> getModule() {
        return module;
    }

    public void setModule(List<module> module) {
        this.module = module;
    }
    
    


    
}
