
package com.Proyecto.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="usuario")
public class Usuario implements Serializable{
    private static final long serialVersionUID = 1L; 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_usuario")
            
    private Long id_usuario;
    private String nombre;
    private String cedula;
    private String correo;
    private String direccion;
    private String telefono;
    private String imagen_perfil;
    private boolean administrador;
    
    public Usuario () {}

    public Usuario(Long id_usuario, String nombre, String cedula, String correo, String direccion, String telefono,boolean administrador) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.cedula = cedula;
        this.correo = correo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.administrador = administrador;
    }
    
    
}
