package com.ygorportes.api_data_fetcher.model.cnpj;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record CnpjData(String cnpj,
                       String razao_social,
                       String nome_fantasia,
                       String data_inicio,
                       String tipo,
                       Situacao situacao,
                       Endereco endereco,
                       @JsonProperty("socios")
                       List<Socios> socios,
                       Atividade atividade_principal,
                       @JsonProperty("atividades_secundarias")
                       List<Atividade> atividades_secundarias) {

    @Override
    public String toString() {
        return  "-------------------------------------------------------------------------------------------------------" + "\n" +
                "CNPJ: " + cnpj + "\n" +
                "Razão Social: " + razao_social + "\n" +
                "Nome Fantasia: " + nome_fantasia + "\n" +
                "Data de Início: " + data_inicio + "\n" +
                "Tipo: " + tipo + "\n" +
                "Situação: " + situacao + "\n" +
                "-------------------------------------------------------------------------------------------------------" + "\n" +
                "Endereço: " + endereco + "\n" +
                "-------------------------------------------------------------------------------------------------------" + "\n" +
                "Sócios: " + socios + "\n" +
                "-------------------------------------------------------------------------------------------------------" + "\n" +
                "Atividade Principal: " + atividade_principal + "\n" +
                "Atividades Secundárias: " + atividades_secundarias + "\n" +
                "-------------------------------------------------------------------------------------------------------";
    }
}
