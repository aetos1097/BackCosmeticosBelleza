package com.CosmeticosBelleza.demo.Model;

import javax.persistence.*;

@Entity
@Table(name = "departamento")
public class DepartamentoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    
    @Column(name ="NOMBRE_DEPARTAMENTO",length=80,nullable=false)
    private String NOMBRE_DEPARTAMENTO;

    public DepartamentoModel() {
    }

    public DepartamentoModel(int ID, String NOMBRE_DEPARTAMENTO) {
        this.ID = ID;
        this.NOMBRE_DEPARTAMENTO = NOMBRE_DEPARTAMENTO;
    }

    public DepartamentoModel(String NOMBRE_DEPARTAMENTO) {

        this.NOMBRE_DEPARTAMENTO = NOMBRE_DEPARTAMENTO;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNOMBRE_DEPARTAMENTO() {
        return NOMBRE_DEPARTAMENTO;
    }

    public void setNOMBRE_DEPARTAMENTO(String NOMBRE_DEPARTAMENTO) {
        this.NOMBRE_DEPARTAMENTO = NOMBRE_DEPARTAMENTO;
    }
}

