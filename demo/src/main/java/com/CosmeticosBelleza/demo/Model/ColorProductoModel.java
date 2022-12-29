package com.CosmeticosBelleza.demo.Model;

import javax.persistence.*;

@Entity
@Table(name = "color_producto")
public class ColorProductoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    @Column(length=45,nullable = false)
    private String NOMBRE_COLOR;

    public ColorProductoModel() {
    }

    public ColorProductoModel(int ID, String NOMBRE_COLOR) {
        this.ID = ID;
        this.NOMBRE_COLOR = NOMBRE_COLOR;
    }

    public ColorProductoModel(String NOMBRE_COLOR) {
        this.NOMBRE_COLOR = NOMBRE_COLOR;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNOMBRE_COLOR() {
        return NOMBRE_COLOR;
    }

    public void setNOMBRE_COLOR(String NOMBRE_COLOR) {
        this.NOMBRE_COLOR = NOMBRE_COLOR;
    }
}
