package com.proyectoAP.gimenabugiolachio.Dto;

import javax.validation.constraints.NotBlank;

public class dtoAcercaDe {

    @NotBlank
    private String nombreA;
    @NotBlank
    private String descripcionA;
    @NotBlank
    private String edadA;
    @NotBlank
    private String telefonoA;
    @NotBlank
    private String mailA;
    @NotBlank
    private String imgA;

    public dtoAcercaDe() {
    }

    public dtoAcercaDe(String nombreA, String descripcionA, String edadA, String telefonoA, String mailA, String imgA) {
        this.nombreA = nombreA;
        this.descripcionA = descripcionA;
        this.edadA = edadA;
        this.telefonoA = telefonoA;
        this.mailA = mailA;
        this.imgA = imgA;
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
