package com.ygorportes.api_data_fetcher.model.cnpj;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Situacao(@JsonAlias("nome") String status) {

    @Override
    public String toString() {
        return  status + "\n";
    }
}
