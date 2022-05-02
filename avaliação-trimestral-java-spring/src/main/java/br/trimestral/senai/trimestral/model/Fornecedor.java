package br.trimestral.senai.trimestral.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Fornecedor {
    private int id;
    private String nome;
    private String email;
    private String telfone;

    public Fornecedor(int id, String nome, String email, String telfone) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telfone = telfone;
    }
    @Entity(name = "fornecedor")
    public class Fornecedor{

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "nome")
        @Size(max = 150)
        @NotNull
        private String nome;

        @Size(max = 100)
        private String email;

        @Size(max = 60)
        private String telfone;

        public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelfone() {
        return telfone;
    }

    public void setTelfone(String telfone) {
        this.telfone = telfone;
    }

    @Override
    public String toString() {
        return "Fornecedor\n" +
                "\nid: " + id +
                "\nnome: " + nome +
                "\nemail: " + email +
                "\ntelfone: " + telfone;
    }
}
