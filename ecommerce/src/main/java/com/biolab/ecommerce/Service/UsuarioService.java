package com.biolab.ecommerce.Service;

import com.biolab.ecommerce.DTOs.UsuarioDTO;
import com.biolab.ecommerce.entites.Usuario;
import com.biolab.ecommerce.entites.enums.Role;
import com.biolab.ecommerce.repositories.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    private final UsuarioRepository repo;

    public UsuarioService(UsuarioRepository repo) {
        this.repo = repo;
    }

    public String criar(UsuarioDTO u) {
        Usuario usuario = new Usuario();
        usuario.setNome(u.getNome());
        usuario.setEmail(u.getEmail());
        usuario.setTelefone(u.getTelefone());
        usuario.setSenha(u.getSenha());
        usuario.setRoles(Role.USER);
        repo.save(usuario);
        return "Usuario criado com sucesso!";
    }
}
