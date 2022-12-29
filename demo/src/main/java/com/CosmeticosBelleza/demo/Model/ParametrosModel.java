package com.CosmeticosBelleza.demo.Model;

import javax.persistence.*;

@Entity
@Table(name = "parametro")
public class ParametrosModel {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int ID;
    @Column(name = "tipo",length=80,nullable=false)
    private String TIPO;
    
    @Column(name ="monto", nullable=false)
    private float Monto;
    
    @Column(name ="descripcion",length=45, nullable=false)
    private String DESCRIPCION;

    public ParametrosModel() {
    }

    public ParametrosModel(int ID, String TIPO, float monto, String DESCRIPCION) {
        this.ID = ID;
        this.TIPO = TIPO;
        Monto = monto;
        this.DESCRIPCION = DESCRIPCION;
    }

    public ParametrosModel(String TIPO, float monto, String DESCRIPCION) {
        this.TIPO = TIPO;
        Monto = monto;
        this.DESCRIPCION = DESCRIPCION;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTIPO() {
        return TIPO;
    }

    public void setTIPO(String TIPO) {
        this.TIPO = TIPO;
    }

    public float getMonto() {
        return Monto;
    }

    public void setMonto(float monto) {
        Monto = monto;
    }

    public String getDESCRIPCION() {
        return DESCRIPCION;
    }

    public void setDESCRIPCION(String DESCRIPCION) {
        this.DESCRIPCION = DESCRIPCION;
    }
}
