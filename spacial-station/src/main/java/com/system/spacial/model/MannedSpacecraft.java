package com.system.spacial.model;

import javax.persistence.*;

@Entity
@Table(name="mannedSpacecraft")
public class MannedSpacecraft {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String img ;
    private String name;
    private String description;
    private String typespaceship;

    public String getTypespaceship() {
        return typespaceship;
    }

    public void setTypespaceship(String typespaceship) {
        this.typespaceship = typespaceship;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MannedSpacecraft() {
        super();
    }
}
