package Reto3_Ciclo3.Reto_3.repository;

import Reto3_Ciclo3.Reto_3.model.Client;
import Reto3_Ciclo3.Reto_3.repository.crud.interfaceClient;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author diegoandres
 */

@Repository

public class RepositorioClient {
    
    @Autowired
    
    private interfaceClient crud2;
    
    public List<Client> getAll(){
        return (List<Client>) crud2.findAll();               
    }
    
    public Optional<Client> getClient(int id){
        return crud2.findById(id);       
    }
    
    public Client save(Client client){
        return crud2.save(client);
    }
    
    public void delete(Client client){
        crud2.delete(client);
    }
    
    
}
