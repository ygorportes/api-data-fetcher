package com.ygorportes.api_data_fetcher.model.cnpj;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Atividade(String descricao) {

    @Override
    public String toString() {
        return "\nDescrição: " + descricao;
    }
}
