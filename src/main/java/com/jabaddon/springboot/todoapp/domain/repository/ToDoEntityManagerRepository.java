package com.jabaddon.springboot.todoapp.domain.repository;

import com.jabaddon.springboot.todoapp.domain.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class ToDoEntityManagerRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public ToDo save(ToDo toDo) {
        entityManager.persist(toDo);
        return toDo;
    }

    public List<ToDo> findAll() {
        String jpql = "SELECT c FROM ToDo c";
        TypedQuery<ToDo> query = entityManager.createQuery(jpql, ToDo.class);
        return query.getResultList();
    }
}
