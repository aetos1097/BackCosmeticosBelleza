package com.CosmeticosBelleza.demo.Model;

import javax.persistence.*;

@Entity
@Table(name="metodo_pago")
public class MetodoPagoModel {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int ID;
     @Column(name="nombre", length =80,nullable = false)
    private String NOMBRE;

    public MetodoPagoModel() {
    }

    public MetodoPagoModel(int ID, String NOMBRE) {
        this.ID = ID;
        this.NOMBRE = NOMBRE;
    }

    public MetodoPagoModel(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }
}
