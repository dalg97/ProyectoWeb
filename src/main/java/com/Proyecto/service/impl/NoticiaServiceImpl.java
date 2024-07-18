package com.Proyecto.service.impl;

import com.Proyecto.dao.NoticiaDao;
import com.Proyecto.domain.Noticia;
import com.Proyecto.service.NoticiaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class NoticiaServiceImpl implements NoticiaService {
    @Autowired
    private NoticiaDao noticiaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Noticia> getNoticias() {
        return noticiaDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Noticia getNoticia(Noticia noticia) {
        return noticiaDao.findById(noticia.getId_noticia()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Noticia noticia) {
        noticiaDao.save(noticia);
    }

    @Override
    @Transactional
    public void delete(Noticia noticia) {
        noticiaDao.delete(noticia);
    }
}
