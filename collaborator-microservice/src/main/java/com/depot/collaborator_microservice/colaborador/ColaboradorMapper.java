package com.depot.collaborator_microservice.colaborador;

import org.springframework.stereotype.Service;

import com.depot.collaborator_microservice.rol.Rol;

@Service
public class ColaboradorMapper {

    public Colaborador colaboradorEntidad(ColaboradorRequest request) {
        return Colaborador.builder()
                        .idColaborador(request.idColaborador())
                        .nombres(request.nombres())
                        .apellidos(request.apellidos())
                        .email(request.email())
                        .telefono(request.email())
                        .direccion(request.direccion())
                        .nacimiento(request.nacimiento())
                        .fechaIngreso(request.fechaIngreso())
                        .fechaCese(request.fechaCese())
                        .cargo(request.cargo())
                        .estado(request.estado())
                        .rol(Rol.builder()
                                .idRol(request.rolId())
                                .build()
                            )
                        .build();
    }

    public ColaboradorResponse colaboradorRespuesta(Colaborador colaborador) {
        return new ColaboradorResponse(
                    colaborador.getIdColaborador(),
                    colaborador.getNombres(),
                    colaborador.getApellidos(),
                    colaborador.getEmail(),
                    colaborador.getTelefono(),
                    colaborador.getDireccion(),
                    colaborador.getNacimiento(),
                    colaborador.getFechaIngreso(),
                    colaborador.getFechaCese(),
                    colaborador.getCargo(),
                    colaborador.getEstado(),
                    colaborador.getRol().getNombre());
    }
}
