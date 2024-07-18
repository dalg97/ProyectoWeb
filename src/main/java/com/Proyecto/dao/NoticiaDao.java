package com.Proyecto.dao;

import com.Proyecto.domain.Noticia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoticiaDao extends JpaRepository<Noticia, Long> {}
