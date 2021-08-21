package br.edu.ifsp.scl.sdm.cadastro.model;

import androidx.annotation.NonNull;

public class Formulario {
    String NomeCompleto;
    String Email;
    String Sexo;
    String Telefone;
    String Cidade;
    String UF;
    Boolean IntegraEmail;

    public Formulario() {
    }


    @NonNull
    @Override
    public String toString() {
        return "Formulario {" +
                "NomeCompleto='" + NomeCompleto + '\'' +
                ", Email='" + Email + '\'' +
                ", Sexo='" + Sexo + '\'' +
                ", Telefone='" + Telefone + '\'' +
                ", Cidade='" + Cidade + '\'' +
                ", UF='" + UF + '\'' +
                ", IntegraEmail=" + IntegraEmail +
                '}';
    }

    public void setNomeCompleto(String nomeCompleto) {
        NomeCompleto = nomeCompleto;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    public void setCidade(String cidade) {
        Cidade = cidade;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public void setIntegraEmail(Boolean integraEmail) {
        IntegraEmail = integraEmail;
    }
}

