package com.depot.collaborator_microservice.rol;

import java.util.List;

import com.depot.collaborator_microservice.colaborador.Colaborador;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "rol")
public class Rol {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idRol;
    private String nombre;
    private Boolean estado;
    @OneToMany(mappedBy = "rol", fetch = FetchType.LAZY)
    private List<Colaborador> colaborador;

    public void prePersist() {
        if (estado == null) {
            estado = true;
        }
    }
}

