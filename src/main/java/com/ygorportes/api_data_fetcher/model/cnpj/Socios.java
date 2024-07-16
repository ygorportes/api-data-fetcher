package com.ygorportes.api_data_fetcher.model.cnpj;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Socios(String nome,
                     String cpf_cnpj,
                     String data_entrada,
                     String qualificacao) {

    @Override
    public String toString() {
        return  "\n" +
                "Nome: " + nome + "\n" +
                "CPF/CNPJ: " + cpf_cnpj + "\n" +
                "Data de Entrada: " + data_entrada + "\n" +
                "Qualificação: " + qualificacao + "\n" +
                "-----------------------------------------";
    }
}
