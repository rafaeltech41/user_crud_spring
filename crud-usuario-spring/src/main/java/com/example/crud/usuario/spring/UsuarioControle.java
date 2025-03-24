package com.example.crud.usuario.spring;

import com.example.crud.usuario.spring.entidade.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

//isso é um end point
@RestController
@RequestMapping("/usuario") //get  set put delete
public class UsuarioControle {
    private ArrayList<Usuario> usuario = new ArrayList<>();

    public UsuarioControle(){
     usuario.add(new Usuario(1,"Rafael"));
        usuario.add(new Usuario(2,"BibiFF"));
    }
    @GetMapping
    public String getUsuario(){
        return """
                [
                {
                "nome": "Rafael",
                "horario" : "14:00:00",
                "imagem" : "-"
                },
                {
                "nome": "Gislene",
                "horario" : "14:00:00",
                "imagem" : "-"
                }
                ]
                """;
    }

    @PostMapping
    public String adicionarUsuario(@RequestBody Usuario usuario){
        this.usuario.add(usuario);
        return "adicionado com sucesso";
    }

    @PutMapping
    public String atualizarUsuario(@RequestBody Usuario usuarioAtualizado, Integer id){

        for (Usuario u: usuario){
            if (u.getId() == id){
                u.setNome(usuarioAtualizado.getNome());
                return "atualizado com sucesso";
            }
        }
        return "atualizado com sucesso";
    }
}
