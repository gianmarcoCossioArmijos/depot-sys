package com.depot.collaborator_microservice.rol;

import org.springframework.stereotype.Service;

import com.depot.collaborator_microservice.colaborador.ColaboradorResponse;

@Service
public class RolMapper {

    public Rol rolEntidad(RolRequest request) {
        return Rol.builder()
                .nombre(request.nombre())
                .build();
    }

    public RolResponse rolRespuesta(Rol rol) {
        return new RolResponse(
                rol.getIdRol(),
                rol.getNombre(),
                rol.getEstado(),
                rol.getColaborador().stream()
                        .map(colaborador -> new ColaboradorResponse(
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
                                colaborador.getRol().getIdRol().toString()
                            )).toList());
    }
}
