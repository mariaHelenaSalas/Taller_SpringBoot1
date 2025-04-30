package com.colegiotibu.colegio_tibu.domain.entities;

import java.time.LocalDateTime;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Table(name = "test_config")
@Entity
public class TestConfig {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name_test_config", length = 50, nullable = false)
    private String nameTestConfig;

    @Column(name = "end_date")
    private LocalDateTime endDate;

    @Column(name = "score", columnDefinition =  "INTEGER")
    private Integer score;
    

    @Column(name = "active")
    private Boolean active;

    @Column(name = "start_date")
    private LocalDateTime startDate;


    @Column(name = "description", length = 80)
    private String description;

    @OneToMany(mappedBy = "testConfig", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Exam> exams;







}
