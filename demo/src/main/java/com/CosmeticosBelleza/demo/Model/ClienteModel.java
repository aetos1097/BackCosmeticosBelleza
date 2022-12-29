package com.CosmeticosBelleza.demo.Model;

import javax.persistence.*;

@Entity
@Table(name = "cliente")
public class ClienteModel {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int ID;
   @Column(name = "Nombre",length =45,nullable = false)
   private String NOMBRE;
   @Column(name = "Apellido",length= 45, nullable = false)
   private String APELLIDO;
   @Column(name = "Telefono", length= 45, nullable = false)
   private String TELEFONO;
   @Column(name ="Direccion", length= 45,nullable = false)
   private String DIRECCION;
   @Column(columnDefinition = "0")
   private int DESCUENTO;
   @Column(name ="Correo", length= 120, nullable = false)
   private String CORREO;
   @Column(name = "Documento", length =45,nullable = false,unique = true)
   private String DOCUMENTO;
   public ClienteModel() {
   }

   public ClienteModel(int ID, String NOMBRE, String APELLIDO, String TELEFONO, String DIRECCION, int DESCUENTO, String CORREO,String DOCUMENTO) {
      this.ID = ID;
      this.NOMBRE = NOMBRE;
      this.APELLIDO = APELLIDO;
      this.TELEFONO = TELEFONO;
      this.DIRECCION = DIRECCION;
      this.DESCUENTO = DESCUENTO;
      this.CORREO = CORREO;
      this.DOCUMENTO = DOCUMENTO;
   }

   public ClienteModel(String NOMBRE, String APELLIDO, String TELEFONO, String DIRECCION, int DESCUENTO,String CORREO,String DOCUMENTO) {
      this.NOMBRE = NOMBRE;
      this.APELLIDO = APELLIDO;
      this.TELEFONO = TELEFONO;
      this.DIRECCION = DIRECCION;
      this.DESCUENTO = DESCUENTO;
      this.CORREO = CORREO;
      this.DOCUMENTO = DOCUMENTO;
   }

   public int getId() {
      return ID;
   }

   public void setId(int ID) {
      this.ID = ID;
   }

   public String getNOMBRE() {
      return NOMBRE;
   }

   public void setNOMBRE(String NOMBRE) {
      this.NOMBRE = NOMBRE;
   }

   public String getAPELLIDO() {
      return APELLIDO;
   }

   public void setAPELLIDO(String APELLIDO) {
      this.APELLIDO = APELLIDO;
   }

   public String getTELEFONO() {
      return TELEFONO;
   }

   public void setTELEFONO(String TELEFONO) {
      this.TELEFONO = TELEFONO;
   }

   public String getDIRECCION() {
      return DIRECCION;
   }

   public void setDIRECCION(String DIRECCION) {
      this.DIRECCION = DIRECCION;
   }

   public int getDESCUENTO() {
      return DESCUENTO;
   }

   public void setDESCUENTO(int DESCUENTO) {
      this.DESCUENTO = DESCUENTO;
   }

   public String getCORREO() {
      return CORREO;
   }

   public void setCORREO(String CORREO) {
      this.CORREO = CORREO;
   }

   public String getDOCUMENTO() {
      return DOCUMENTO;
   }

   public void setDOCUMENTO(String DOCUMENTO) {
      this.DOCUMENTO = DOCUMENTO;
   }
}
