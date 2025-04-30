package com.colegiotibu.colegio_tibu.domain.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Table
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "age", columnDefinition = "INTEGER")
    private int age;

    @Column(name = "name_student", length = 70, nullable = false)
    private String name;

    @Column(name = "celphone_student", length = 20, nullable = false)
    private String celphone;

    @Column(name = "email", length = 80, nullable = false)
    private String email;

    @Column(name = "firstname", length = 70, nullable = false)
    private String firstName;

    @Column(name = "lastname", length = 70, nullable = false)
    private String lastName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "city_id", nullable = false)
    @JsonBackReference
    private City city;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "school_id", nullable = false)
    @JsonBackReference
    private School school;

}
