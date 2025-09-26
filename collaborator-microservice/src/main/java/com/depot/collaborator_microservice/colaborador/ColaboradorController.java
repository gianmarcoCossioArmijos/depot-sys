package com.depot.collaborator_microservice.colaborador;

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
@RequestMapping("api/v1/colaboradores")
@RestController
public class ColaboradorController {

    private final ColaboradorService servicio;

    @PostMapping
    public ResponseEntity<String> registrarColaborador(@Valid @RequestBody ColaboradorRequest request) {
        return ResponseEntity.ok(servicio.registrarColaborador(request));
    }

    @GetMapping
    public ResponseEntity<List<ColaboradorResponse>> obtenerColaboradores (){
        return ResponseEntity.ok(servicio.obtenerColaboradores());
    }
}
