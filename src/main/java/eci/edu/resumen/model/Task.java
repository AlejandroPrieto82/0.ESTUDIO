package eci.edu.resumen.model;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Task {
    @Id
    private String id;
    private String description;
    private Boolean done;

    

}
