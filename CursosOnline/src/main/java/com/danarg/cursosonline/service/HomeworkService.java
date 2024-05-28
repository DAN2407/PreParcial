package com.danarg.cursosonline.service;

import com.danarg.cursosonline.domain.entities.Homework;

import java.util.List;
import java.util.UUID;

public interface HomeworkService {
    Homework createHomework(Homework homework);
    Homework getHomeworkById(UUID id);
    List<Homework> getAllHomework();
    Homework updateHomework(UUID id, Homework homeworkDetails);
    void deleteHomework(UUID id);
}
