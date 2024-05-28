package com.danarg.cursosonline.service.impls;

import com.danarg.cursosonline.domain.entities.Homework;
import com.danarg.cursosonline.repository.HomeworkRepository;
import com.danarg.cursosonline.service.HomeworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HomeworkServiceImpl implements HomeworkService {

    @Autowired
    private HomeworkRepository homeworkRepository;

    @Override
    public Homework createHomework(Homework homework) {
        return homeworkRepository.save(homework);
    }

    @Override
    public Homework getHomeworkById(UUID id) {
        return homeworkRepository.findById(id).orElseThrow(() -> new RuntimeException("Homework not found"));
    }

    @Override
    public List<Homework> getAllHomework() {
        return homeworkRepository.findAll();
    }

    @Override
    public Homework updateHomework(UUID id, Homework homeworkDetails) {
        Homework homework = homeworkRepository.findById(id).orElseThrow(() -> new RuntimeException("Homework not found"));

        return homeworkRepository.save(homework);
    }

    @Override
    public void deleteHomework(UUID id) {
        Homework homework = homeworkRepository.findById(id).orElseThrow(() -> new RuntimeException("Homework not found"));
        homeworkRepository.delete(homework);
    }
