package com.depot.collaborator_microservice.colaborador;

import java.util.Date;

import com.depot.collaborator_microservice.rol.Rol;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "colaborador")
public class Colaborador {

    @Id
    private String idColaborador;
    private String nombres;
    private String apellidos;
    private String email;
    private String telefono;
    private String direccion;
    private Date nacimiento;
    private Date fechaIngreso;
    private Date fechaCese;
    private String cargo;
    private String clave;
    private Boolean estado;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_rol")
    private Rol rol;

    public void prePersist() {
        if (estado == null) {
            estado = true;
        }
    }
}

