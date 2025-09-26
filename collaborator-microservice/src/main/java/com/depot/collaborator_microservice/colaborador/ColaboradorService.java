package com.depot.collaborator_microservice.colaborador;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ColaboradorService {

    private final ColaboradorMapper mapper;
    private final ColaboradorRepository repositorio;

    public String registrarColaborador(ColaboradorRequest request){
        var colaborador = mapper.colaboradorEntidad(request);
        return repositorio.save(colaborador).getIdColaborador();
    }

    public List<ColaboradorResponse> obtenerColaboradores() {
        return repositorio
                    .findAll()
                    .stream()
                    .map(mapper::colaboradorRespuesta)
                    .toList();
    }
} 
