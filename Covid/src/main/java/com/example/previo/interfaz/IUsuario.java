/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.previo.interfaz;

import com.example.previo.model.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author HP
 */


@Repository
public interface IUsuario extends CrudRepository<Usuario, Integer>{
    
}
