package com.depot.collaborator_microservice.rol;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("api/v1/roles")
@RestController
public class RolController {

    private final RolService servicio;

    @PostMapping
    public ResponseEntity<String> registrarRol(@Valid @RequestBody RolRequest request) {
        return ResponseEntity.ok(servicio.registrarRol(request));
    }

    @GetMapping
    public ResponseEntity<List<RolResponse>> obtenerRoles() {
        return ResponseEntity.ok(servicio.obtenerRoles());
    }
}
