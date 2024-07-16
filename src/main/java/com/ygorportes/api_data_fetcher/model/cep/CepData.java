package com.ygorportes.api_data_fetcher.model.cep;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record CepData(@JsonAlias("cep") String cep,
                      @JsonAlias("state") String estado,
                      @JsonAlias("city") String cidade,
                      @JsonAlias("neighborhood") String bairro,
                      @JsonAlias("street") String rua) {

    public String getFormattedStreet() {
        if (rua != null && rua.startsWith("Rua ")) {
            return rua.substring(4);
        }
        return rua;
    }

    @Override
    public String toString() {
        return  "---------------------------" +
                "\nCEP: " + cep +
                "\nEstado: " + estado +
                "\nCidade: " + cidade +
                "\nBairro: " + bairro +
                "\nRua: " + getFormattedStreet() +
                "\n---------------------------";
    }
}
