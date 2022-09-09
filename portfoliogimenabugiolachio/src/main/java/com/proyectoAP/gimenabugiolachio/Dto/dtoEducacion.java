package com.proyectoAP.gimenabugiolachio.Dto;

import javax.validation.constraints.NotBlank;


public class dtoEducacion {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;  
    @NotBlank
    private String detallesE;
    @NotBlank
    private String fechaInicioE;
    @NotBlank
    private String fechaFinE;
    @NotBlank
    private String imgE;

    public dtoEducacion() {
    }

    public dtoEducacion(String nombreE, String descripcionE, String detallesE, String fechaInicioE, String fechaFinE, String imgE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.detallesE = detallesE;
        this.fechaInicioE = fechaInicioE;
        this.fechaFinE = fechaFinE;
        this.imgE = imgE;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public String getDetallesE() {
        return detallesE;
    }

    public void setDetallesE(String detallesE) {
        this.detallesE = detallesE;
    }

    public String getFechaInicioE() {
        return fechaInicioE;
    }

    public void setFechaInicioE(String fechaInicioE) {
        this.fechaInicioE = fechaInicioE;
    }

    public String getFechaFinE() {
        return fechaFinE;
    }

    public void setFechaFinE(String fechaFinE) {
        this.fechaFinE = fechaFinE;
    }

    public String getImgE() {
        return imgE;
    }

    public void setImgE(String imgE) {
        this.imgE = imgE;
    }

   

}
