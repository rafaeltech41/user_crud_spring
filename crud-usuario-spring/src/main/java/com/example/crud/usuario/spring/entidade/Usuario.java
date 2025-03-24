package com.example.crud.usuario.spring.entidade;

public class Usuario {
    Interger id ;
    String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Usuario(Interger id ,
                   String name){
        this.id = id;
        this.name  = name;
    }
}
