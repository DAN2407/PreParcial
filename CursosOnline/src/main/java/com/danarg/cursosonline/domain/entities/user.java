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
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private String email;
    private String password;
    private String role;

    //foreign key
    @ManyToOne
    @JoinColumn(name = "curso_id")
    private Course Course;
    //fecha de inicio de curso
    private Date start_date;
    //fecha de fin de curso
    private Date end_date;

    //tarea
    @ManyToOne
    @JoinColumn(name = "tarea_id")
    private Homework Homework;
    //fecha de inicio de tarea
    private Date start_homework;
    //fecha de fin de tarea
    private Date end_homework;
    //calificacion de tarea
    private int score;


}
