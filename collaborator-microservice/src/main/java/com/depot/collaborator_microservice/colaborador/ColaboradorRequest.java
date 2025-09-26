package com.depot.collaborator_microservice.colaborador;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ColaboradorRequest(
    @NotNull(message = "El nombre no puede ser nulo")
    @NotBlank(message = "El nombre no puede estar vacio")
    String idColaborador,

    @NotNull(message = "El nombre no puede ser nulo")
    @NotBlank(message = "El nombre no puede estar vacio")
    String nombres,

    @NotNull(message = "El apellido no puede ser nulo")
    @NotBlank(message = "El apellido no puede estar vacio")
    String apellidos,

    @Email(message = "El email debe tener un formato valido")
    String email,

    @NotNull(message = "El telefono no puede ser nulo")
    @NotBlank(message = "El telefono no puede estar vacio")
    String telefono,

    @NotNull(message = "La direccion no puede ser nulo")
    @NotBlank(message = "La direccion no puede estar vacio")
    String direccion,

    @NotNull(message = "La fecha de nacimiento no puede ser nulo")
    @NotBlank(message = "La fecha de nacimiento no puede estar vacio")
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    Date nacimiento,

    @NotNull(message = "La fecha de ingreso no puede ser nulo")
    @NotBlank(message = "La fecha de ingreso no puede estar vacio")
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    Date fechaIngreso,

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    Date fechaCese,

    @NotNull(message = "El cargo no puede ser nulo")
    @NotBlank(message = "El cargo no puede estar vacio")
    String cargo,
    Boolean estado,
    
    @NotNull(message = "El rol no puede ser nulo")
    Integer rolId
) {}
