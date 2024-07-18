package com.Proyecto.controller;

import com.Proyecto.domain.Usuario;
import com.Proyecto.service.UsuarioService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/principal")
public class PrincipalController {
    @GetMapping("/principal")
    public String principal() {
        return "/principal/principal";
    }
}
