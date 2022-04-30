package com.example.demosecurity.model.service;

import com.example.demosecurity.model.dao.IUsuarioDao;
import com.example.demosecurity.model.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;


    @Autowired
    private IUsuarioDao usuarioDao;

    //Guardar usuario
    public void saveUser(Usuario usuario){
        usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
        usuarioDao.save(usuario);

    }


}
