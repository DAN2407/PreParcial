package com.danarg.cursosonline.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tareas")
public class Homework {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String titulo;
    private String descripcion;
    //fecha de inicio de tarea
    private Date start_homework;
    //fecha de fin de tarea
    private Date end_homework;
    //calificacion de tarea
    private int score;

    //foreign key
    @ManyToOne
    @JoinColumn(name = "curso_id")
    private Course Course;

    //usuario
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


}
