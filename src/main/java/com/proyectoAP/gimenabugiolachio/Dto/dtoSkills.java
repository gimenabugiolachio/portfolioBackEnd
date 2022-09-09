package com.proyectoAP.gimenabugiolachio.Dto;

import javax.validation.constraints.NotBlank;

public class dtoSkills {
    @NotBlank
    private String nombre;
    @NotBlank
    private String tipo;
    @NotBlank
    private Long porcentaje;
    @NotBlank
    private String icono;

    public dtoSkills() {
    }

    public dtoSkills(String nombre, String tipo, Long porcentaje, String icono) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.porcentaje = porcentaje;
        this.icono = icono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Long getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Long porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getIcono() {
        return icono;
    }

    public void setIcono(String icono) {
        this.icono = icono;
    }

    
}
