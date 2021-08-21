package br.edu.ifsp.scl.sdm.cadastro.model;

public class Formulario {
    String NomeCompleto;
    String Email;
    String Sexo;
    String Telefone;
    String Cidade;
    String UF;
    Boolean IntegraEmail;


    @Override
    public String toString() {
        return "Formulario{" +
                "NomeCompleto='" + NomeCompleto + '\'' +
                ", Email='" + Email + '\'' +
                ", Sexo='" + Sexo + '\'' +
                ", Telefone='" + Telefone + '\'' +
                ", Cidade='" + Cidade + '\'' +
                ", UF='" + UF + '\'' +
                ", IntegraEmail=" + IntegraEmail +
                '}';
    }

}

