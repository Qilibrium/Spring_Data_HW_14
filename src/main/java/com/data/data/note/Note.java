package com.data.data.note;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "note")
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String content;

    }

