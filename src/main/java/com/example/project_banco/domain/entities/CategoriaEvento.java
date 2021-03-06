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
public class CategoriaEvento {

    public CategoriaEvento(){
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdCategoriaEvento;

    @Column(nullable = false, length = 250)
    private String NomeCategoria;
}
