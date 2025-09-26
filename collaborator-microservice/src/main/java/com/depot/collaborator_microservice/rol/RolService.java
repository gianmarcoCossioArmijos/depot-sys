package com.depot.collaborator_microservice.rol;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RolService {

    private final RolMapper mapper;
    private final RolRepository repositorio;

    public String registrarRol(RolRequest request) {
        var rol = mapper.rolEntidad(request);
        return repositorio.save(rol).getIdRol().toString();
    }

    public List<RolResponse> obtenerRoles() {
        return repositorio
                .findAll()
                .stream()
                .map(mapper::rolRespuesta)
                .toList();
    }
}
