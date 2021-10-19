package Reto3_Ciclo3.Reto_3.repository;

import Reto3_Ciclo3.Reto_3.model.Doctor;
import Reto3_Ciclo3.Reto_3.repository.crud.interfaceDoctor;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author diegoandres
 */

@Repository

public class RepositorioDoctor {
    
    @Autowired
    
    private interfaceDoctor crud;
    
    public List<Doctor> getAll(){
        
        return (List<Doctor>) crud.findAll();
    }
    
    public Optional <Doctor> getDoctor(int id){
        
        return crud.findById(id);
        
    }
    
    public Doctor save(Doctor doctor){
        
        return crud.save(doctor);
        
    }
    
 
    public void delete(Doctor doctor){
        crud.delete(doctor);
    }
    
    
    
}
