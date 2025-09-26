package com.depot.collaborator_microservice.rol;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RolRequest(
    Integer id_rol,
    @NotNull(message = "El nombre no puede ser nulo")
    @NotBlank(message = "El nombre no puede estar vacio")
    String nombre,
    Boolean estado
) {}
