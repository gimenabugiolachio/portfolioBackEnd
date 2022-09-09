package com.proyectoAP.gimenabugiolachio.Dto;

import javax.validation.constraints.NotBlank;


public class dtoExperiencia {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String puestoE;
    @NotBlank
    private String descripcionE;
    @NotBlank
    private String fechaInicioE;
    @NotBlank
    private String fechaFinE;
    

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreE, String puestoE, String descripcionE, String fechaInicioE, String fechaFinE) {
        this.nombreE = nombreE;
        this.puestoE = puestoE;
        this.descripcionE = descripcionE;
        this.fechaInicioE = fechaInicioE;
        this.fechaFinE = fechaFinE;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getPuestoE() {
        return puestoE;
    }

    public void setPuestoE(String puestoE) {
        this.puestoE = puestoE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
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

   

    
    

}
   

   
