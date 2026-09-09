package com.biolab.ecommerce.entites;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    @ManyToMany(mappedBy = "categorias")
    //Set n deixa repitir o produto ou dublicar itens
    private Set<Produto> produtos = new HashSet<>();
    //HashSet inicializa o objeto, implementa a classe set
}
