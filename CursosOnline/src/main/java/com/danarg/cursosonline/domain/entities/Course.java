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
@Table(name = "cursos")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String titulo;
    private String descripcion;
    private boolean active;
    //fecha de inicio de curso
    private Date start_date;
    //fecha de fin de curso
    private Date end_date;

    //foreign key
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

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
