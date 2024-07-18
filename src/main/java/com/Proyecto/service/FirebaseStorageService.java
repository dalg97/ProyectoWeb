
package com.Proyecto.service;

import org.springframework.web.multipart.MultipartFile;


public interface FirebaseStorageService {
    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id); 
    
    //El BuketName es el <id_del_proyecto> + ".appspot.com"
    final String BucketName = "proyectoweb-468a1.appspot.com";

    //Esta es la ruta básica de este proyecto Techshop
    final String rutaSuperiorStorage = "proyectoweb";

    //Ubicación donde se encuentra el archivo de configuración Json
    final String rutaJsonFile = "firebase";
    
    //El nombre del archivo Json
    final String archivoJsonFile = "proyectoweb-468a1-firebase-adminsdk-kjxm6-d8e2136ae5.json";

}
