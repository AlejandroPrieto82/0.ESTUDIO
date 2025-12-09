package eci.edu.resumen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import eci.edu.resumen.model.Task;
import eci.edu.resumen.repository.Repository;

@org.springframework.stereotype.Service
public class Service {
    
    @Autowired
    private Repository repo;

    public Task save(Task task){
        return repo.save(task);
        
    }
      public List<Task> getAll(){
        return repo.findAll();
    }

    public void delete(String id){
        repo.deleteById(id);
    }


}
