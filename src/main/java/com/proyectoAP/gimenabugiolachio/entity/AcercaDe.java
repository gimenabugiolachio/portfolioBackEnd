
package com.proyectoAP.gimenabugiolachio.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AcercaDe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;  
    private String nombreA;
    private String descripcionA;
    private String edadA;
    private String telefonoA;
    private String mailA;
    private String imgA;

    public AcercaDe() {
    }

    public AcercaDe(String nombreA, String descripcionA, String edadA, String telefonoA, String mailA, String imgA) {
        this.nombreA = nombreA;
        this.descripcionA = descripcionA;
        this.edadA = edadA;
        this.telefonoA = telefonoA;
        this.mailA = mailA;
        this.imgA = imgA;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    public String getDescripcionA() {
        return descripcionA;
    }

    public void setDescripcionA(String descripcionA) {
        this.descripcionA = descripcionA;
    }

    public String getEdadA() {
        return edadA;
    }

    public void setEdadA(String edadA) {
        this.edadA = edadA;
    }

    public String getTelefonoA() {
        return telefonoA;
    }

    public void setTelefonoA(String telefonoA) {
        this.telefonoA = telefonoA;
    }

    public String getMailA() {
        return mailA;
    }

    public void setMailA(String mailA) {
        this.mailA = mailA;
    }

    public String getImgA() {
        return imgA;
    }

    public void setImgA(String imgA) {
        this.imgA = imgA;
    }

   

    
    
}
