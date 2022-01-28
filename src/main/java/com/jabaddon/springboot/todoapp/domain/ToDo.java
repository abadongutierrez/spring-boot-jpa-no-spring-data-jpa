package com.jabaddon.springboot.todoapp.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="todo")
@Data
public class ToDo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_generator")
    @SequenceGenerator(name = "sequence_generator")
    private Long id;
    private String text;

    public ToDo(String t) {
        text = t;
    }
}
