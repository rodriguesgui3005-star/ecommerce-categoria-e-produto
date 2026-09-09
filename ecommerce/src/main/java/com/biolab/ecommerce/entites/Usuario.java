package com.biolab.ecommerce.entites;

import com.biolab.ecommerce.entites.enums.Role;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
//Subsitui os getters e setters
@Data
//Substitui o construtor com todos os argumentos
@AllArgsConstructor
//Substitui o construtor vazio
@NoArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String nome;
    @NotBlank
    @Email
    @Column(length = 150)
    private String email;
    @Column(length = 20)
    private String telefone;
    @NotBlank @Size(min = 6)
    private String senha;
    @Enumerated(EnumType.STRING)
    private Role roles;

}
