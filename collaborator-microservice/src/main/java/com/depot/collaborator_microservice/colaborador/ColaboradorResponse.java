package com.depot.collaborator_microservice.colaborador;

import java.util.Date;

public record ColaboradorResponse(
    String idColaborador,
    String nombres,
    String apellidos,
    String email,
    String telefono,
    String direccion,
    Date nacimiento,
    Date fechaIngreso,
    Date fechaCese,
    String cargo,
    Boolean estado,
    String rolNombre
) {}
