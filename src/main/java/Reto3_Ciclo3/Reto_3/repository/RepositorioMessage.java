package Reto3_Ciclo3.Reto_3.repository;

import Reto3_Ciclo3.Reto_3.model.Message;
import Reto3_Ciclo3.Reto_3.repository.crud.interfaceMessage;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author diegoandres
 */

@Repository

public class RepositorioMessage {
    
    @Autowired
    
    private interfaceMessage crud3;
    
    public List<Message> getAll(){
        return (List<Message>) crud3.findAll();
    }
    
    public Optional <Message> getMessage(int id){
        return crud3.findById(id);
    }
    
    public Message save(Message messages){
        return crud3.save(messages);        
    }
    
    public void delete(Message message){
        crud3.delete(message);
    }

            
}
