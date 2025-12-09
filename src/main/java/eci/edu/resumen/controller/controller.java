package eci.edu.resumen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eci.edu.resumen.model.Task;
import eci.edu.resumen.service.Service;

@RestController
@RequestMapping("/api/task")
@CrossOrigin("*")
public class controller {

    @Autowired
    private Service service;

    @PostMapping
    public ResponseEntity<Task> save(@RequestBody Task task) {
        Task createdTask = service.save(task);

        return new ResponseEntity<Task>(createdTask, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Task>> getAll() {
        List<Task> tasks = service.getAll();

        if (tasks.isEmpty()) {
            return new ResponseEntity<List<Task>>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<List<Task>>(tasks, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        service.delete(id);

        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
}
