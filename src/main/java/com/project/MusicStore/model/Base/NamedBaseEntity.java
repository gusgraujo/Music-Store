package com.project.MusicStore.model.Base;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import org.jetbrains.annotations.NotNull;


@MappedSuperclass
public class NamedBaseEntity extends BaseEntity{

    @NotNull
    @Column(name = "name")
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
