package com.biblioteca.model;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;

@Embeddable
public class Publicacao {

    @NotBlank(message = "Editora é obrigatória")
    private String editora;

    @Min(value = 1500, message = "Ano deve ser maior que 1500")
    private int ano;

    @NotNull(message = "Data de publicação é obrigatória")
    private LocalDate dataPublicacao;

    public Publicacao() {}

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(LocalDate dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }
}
