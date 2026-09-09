package com.biolab.ecommerce.Controllers;

import com.biolab.ecommerce.DTOs.UsuarioDTO;
import com.biolab.ecommerce.Service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioControllers {

    private final UsuarioService Service;

    public UsuarioControllers(UsuarioService service)    {
       this.Service = service;
    }

    @PostMapping
    public ResponseEntity<?> saveUser(@RequestBody UsuarioDTO dto) {
        return ResponseEntity.ok(Service.criar(dto));
    }
}
