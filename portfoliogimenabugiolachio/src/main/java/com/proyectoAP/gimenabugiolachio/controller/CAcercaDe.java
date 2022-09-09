
package com.proyectoAP.gimenabugiolachio.controller;

import com.proyectoAP.gimenabugiolachio.Dto.dtoAcercaDe;
import com.proyectoAP.gimenabugiolachio.entity.AcercaDe;
import com.proyectoAP.gimenabugiolachio.security.Controller.Mensaje;
import com.proyectoAP.gimenabugiolachio.service.SAcercaDe;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/acercaDe")
@CrossOrigin(origins = "https://portfoliogimenabugiolachio.web.app")
public class CAcercaDe {
    
    @Autowired
    SAcercaDe sAcercaDe;
    
    @GetMapping("/lista")
    public ResponseEntity<List<AcercaDe>> list(){
        List<AcercaDe> list = sAcercaDe.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<AcercaDe> getById(@PathVariable("id") int id){
        if(!sAcercaDe.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe"), HttpStatus.NOT_FOUND);
        }
        AcercaDe acercaDe = sAcercaDe.getOne(id).get();
        return new ResponseEntity(acercaDe, HttpStatus.OK);
    }
    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoAcercaDe dtoacerca){
        if(StringUtils.isBlank(dtoacerca.getNombreA())){
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if(sAcercaDe.existsByNombreA(dtoacerca.getNombreA())){
            return new ResponseEntity(new Mensaje("Ese nombre ya existe"), HttpStatus.BAD_REQUEST);
        }
        
        AcercaDe acercaDe = new AcercaDe(dtoacerca.getNombreA(), dtoacerca.getDescripcionA(), dtoacerca.getEdadA(), dtoacerca.getMailA(), dtoacerca.getTelefonoA(), dtoacerca.getImgA());
        sAcercaDe.save(acercaDe);
        
        return new ResponseEntity(new Mensaje("Información agregada con éxito"), HttpStatus.OK);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id")int id, @RequestBody dtoAcercaDe dtoacerca){
        if(!sAcercaDe.existsById(id)){
            return new ResponseEntity(new Mensaje("El id no existe"), HttpStatus.BAD_REQUEST);
        }
        
        if(sAcercaDe.existsByNombreA(dtoacerca.getNombreA()) && sAcercaDe.getByNombreA(dtoacerca.getNombreA()).get().getId() != id){
            return new ResponseEntity(new Mensaje("Esa información ya existe"), HttpStatus.BAD_REQUEST);
        }
        
        if(StringUtils.isBlank(dtoacerca.getNombreA())){
            return new ResponseEntity(new Mensaje("El campo no puede estar vacío"), HttpStatus.BAD_REQUEST);
        }
        
        AcercaDe acercaDe = sAcercaDe.getOne(id).get();
        
        acercaDe.setNombreA(dtoacerca.getNombreA());
        acercaDe.setDescripcionA(dtoacerca.getDescripcionA());
        acercaDe.setEdadA(dtoacerca.getEdadA());
        acercaDe.setMailA(dtoacerca.getMailA());
        acercaDe.setTelefonoA(dtoacerca.getTelefonoA());
        acercaDe.setImgA(dtoacerca.getImgA());
        
        sAcercaDe.save(acercaDe);
        return new ResponseEntity(new Mensaje("Información actualizada"), HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id){
        if(!sAcercaDe.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe el id"), HttpStatus.NOT_FOUND);
        }
        
        sAcercaDe.delete(id);
        return new ResponseEntity(new Mensaje("Información eliminada con éxito"), HttpStatus.OK);
    }    
    
}
