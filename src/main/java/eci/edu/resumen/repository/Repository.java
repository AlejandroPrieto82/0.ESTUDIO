package eci.edu.resumen.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import eci.edu.resumen.model.Task;

public interface Repository  extends MongoRepository<Task,String>{

}
