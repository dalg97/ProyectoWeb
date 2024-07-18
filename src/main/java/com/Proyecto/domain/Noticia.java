package com.Proyecto.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "noticia")
public class Noticia implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_noticia")
    private Long id_noticia;
    private String titulo;
    private String descripcion;
    private String imagen;
    private String url;

    public Noticia() {}

    public Noticia(Long id_noticia, String titulo, String descripcion, String url) {
        this.id_noticia = id_noticia;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.url = url;
    }
    
    
}
