package com.Proyecto.service;

import com.Proyecto.domain.Noticia;
import java.util.List;

public interface NoticiaService {
    List<Noticia> getNoticias();
    Noticia getNoticia(Noticia noticia);
    public void save(Noticia noticia);
    public void delete(Noticia noticia);


}
