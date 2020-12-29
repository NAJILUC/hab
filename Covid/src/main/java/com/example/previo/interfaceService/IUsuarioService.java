/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.previo.interfaceService;

import com.example.previo.model.Usuario;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author HP
 */
public interface IUsuarioService {
    public List<Usuario>listar();
    public Optional<Usuario>listarId(int id);
    public int save(Usuario p);
    public void delete(int id);
}
