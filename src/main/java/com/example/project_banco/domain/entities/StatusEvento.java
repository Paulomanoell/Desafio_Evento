package com.example.project_banco.domain.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
@Builder
@Data
@Entity
@AllArgsConstructor
public class StatusEvento {

    public StatusEvento(){
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdEventoStatus;

    @Column(nullable = false, length = 250)
    private String NomeStatus;

    // @ManyToOne
    // @JoinColumn(name = "IdEventoStatus", nullable = false)
    // private Evento evento;
} 

