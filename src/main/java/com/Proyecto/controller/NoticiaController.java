package com.Proyecto.controller;

import com.Proyecto.domain.Noticia;
import com.Proyecto.service.NoticiaService;
import com.Proyecto.service.impl.FirebaseStorageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/noticia")
public class NoticiaController {
    @Autowired
    private NoticiaService noticiaService;

    @GetMapping("/listado")
    public String listadoNoticias(Model model) {
        var noticias = noticiaService.getNoticias();
        model.addAttribute("noticias", noticias);
        return "noticia/listado";
    }
    @GetMapping("/listadoAdmin")
    public String listadoNoticiasAdmin(Model model) {
        var noticias = noticiaService.getNoticias();
        model.addAttribute("noticias", noticias);
        return "noticia/listadoAdmin";
    }
    
    @GetMapping("/eliminar/{id_noticia}")
     public String noticiaEliminar(Noticia noticia) {
        noticiaService.delete(noticia);
        return "redirect:/noticia/listadoAdmin";
    }
     
    @GetMapping("/modificar/{id_noticia}")
    public String noticiaModificar(Noticia noticia, Model model) {
        noticia = noticiaService.getNoticia(noticia);
        model.addAttribute("noticia", noticia);
        return "/noticia/modifica";
    }
    
    @Autowired
    private FirebaseStorageServiceImpl firebaseStorageService;
    
    @PostMapping("/guardar")
    public String noticiaGuardar(Noticia noticia, @RequestParam("imagenFile")MultipartFile imagenFile){
        if (!imagenFile.isEmpty()) {
            noticiaService.save(noticia);
            noticia.setImagen(
                   firebaseStorageService.cargaImagen(
                           imagenFile, 
                            "noticia", 
                            noticia.getId_noticia()));
        }
        noticiaService.save(noticia);
        return "redirect:/noticia/listadoAdmin";
    }
}
