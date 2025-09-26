package com.depot.collaborator_microservice.rol;

import java.util.List;

import com.depot.collaborator_microservice.colaborador.ColaboradorResponse;

public record RolResponse(
    Integer id_rol,
    String nombre,
    Boolean estado,
    List<ColaboradorResponse> colaboradores
) {}
