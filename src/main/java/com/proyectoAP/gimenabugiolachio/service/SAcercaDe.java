
package com.proyectoAP.gimenabugiolachio.service;

import com.proyectoAP.gimenabugiolachio.entity.AcercaDe;
import com.proyectoAP.gimenabugiolachio.repository.RAcercaDe;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SAcercaDe {
    @Autowired
    RAcercaDe rAcercaDe;
    
    public List<AcercaDe> list(){
        return rAcercaDe.findAll();
    }
    
    public Optional<AcercaDe> getOne(int id){
        return rAcercaDe.findById(id);
    }
    
    public Optional<AcercaDe> getByNombreA(String nombreA){
        return rAcercaDe.findByNombreA(nombreA);
    }
    
    public void save(AcercaDe acercaDe){
        rAcercaDe.save(acercaDe);
    }
    
    public void delete(int id){
        rAcercaDe.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rAcercaDe.existsById(id);
    }
    
    public boolean existsByNombreA(String nombreA){
        return rAcercaDe.existsByNombreA(nombreA);
    }
}
