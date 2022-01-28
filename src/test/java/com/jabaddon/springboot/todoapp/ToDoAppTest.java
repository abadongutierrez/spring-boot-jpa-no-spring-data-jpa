package com.jabaddon.springboot.todoapp;

import com.jabaddon.springboot.todoapp.domain.ToDo;
import com.jabaddon.springboot.todoapp.domain.repository.ToDoEntityManagerRepository;
import com.jabaddon.springboot.todoapp.domain.service.ToDoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

@SpringBootTest(classes=TodoAppApplication.class)
@Transactional
class ToDoAppTest {

    @Autowired
    private ToDoService toDoService;

    @Test
    void test() {
        ToDo newToDo = toDoService.save(new ToDo("New todo"));
        assertThat(newToDo.getId(), is(not(nullValue())));
        assertThat(toDoService.findAll(), hasSize(1));
    }
}
