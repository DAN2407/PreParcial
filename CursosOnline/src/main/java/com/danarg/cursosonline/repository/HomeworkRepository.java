package com.danarg.cursosonline.repository;

import com.danarg.cursosonline.domain.entities.Homework;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

public class HomeworkRepository implements JpaRepository<Homework, UUID> {
    @Override
    public void flush() {

    }

    @Override
    public <S extends Homework> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Homework> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public void deleteAllInBatch(Iterable<Homework> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<UUID> uuids) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Homework getOne(UUID uuid) {
        return null;
    }

    @Override
    public Homework getById(UUID uuid) {
        return null;
    }

    @Override
    public Homework getReferenceById(UUID uuid) {
        return null;
    }

    @Override
    public <S extends Homework> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Homework> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends Homework> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends Homework> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Homework> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Homework> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Homework, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Homework> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Homework> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public Optional<Homework> findById(UUID uuid) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(UUID uuid) {
        return false;
    }

    @Override
    public List<Homework> findAll() {
        return List.of();
    }

    @Override
    public List<Homework> findAllById(Iterable<UUID> uuids) {
        return List.of();
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(UUID uuid) {

    }

    @Override
    public void delete(Homework entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends UUID> uuids) {

    }

    @Override
    public void deleteAll(Iterable<? extends Homework> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Homework> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<Homework> findAll(Pageable pageable) {
        return null;
    }
}
