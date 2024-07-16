package com.ygorportes.api_data_fetcher.model.cnpj;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Endereco(String tipo_logradouro,
                       String logradouro,
                       String numero,
                       String complemento,
                       String bairro,
                       String cep,
                       String uf,
                       String municipio) {

    @Override
    public String toString() {
        return tipo_logradouro + " " + logradouro + ", " + numero + "\n" +
                "Complemento: " + complemento + "\n" +
                "Bairro: " + bairro + "\n" +
                "CEP: " + cep + "\n" +
                "Estado: " + uf + "\n" +
                "Município: " + municipio;
    }
}
