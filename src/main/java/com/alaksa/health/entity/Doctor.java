package com.alaksa.health.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "doctors")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="doctor_id",nullable = false,unique = false )
    private long id ;

    @Column(name ="doctor_name",nullable = false,unique = false )
    private String name;

    @Column(name ="designation",nullable = true,unique = false )
    private String designation;

    @Column(name ="specialization",nullable = true,unique = false )
    private String specialization;

}
