package com.ygorportes.api_data_fetcher.main;

import com.ygorportes.api_data_fetcher.model.cep.CepData;
import com.ygorportes.api_data_fetcher.model.cnpj.CnpjData;
import com.ygorportes.api_data_fetcher.service.ConsumeApi;
import com.ygorportes.api_data_fetcher.service.ConvertsData;

import java.util.Scanner;

public class Main {

    private final Scanner reader = new Scanner(System.in);

    private final ConsumeApi consumeApi = new ConsumeApi();
    private final ConvertsData converter = new ConvertsData();

    private final String API_TOKEN = System.getenv("API_TOKEN");

    public void showMenu() {
        var option = -1;

        while (true) {
            var menu = """
                    Selecione uma opção:
                    
                    1 - Buscar CEP
                    2 - Buscar CNPJ
                    
                    0 - Sair
                    """;
            System.out.println(menu);
            option = reader.nextInt();
            reader.nextLine();

            switch (option) {
                case 1:
                    searchCep();
                    break;
                case 2:
                    searchCnpj();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida");
            }

        }
    }

    private void searchCep() {
        CepData data = getCepData();
        System.out.println(data);
    }

    private CepData getCepData() {
        System.out.println("Digite um CEP para busca:");
        var cep = reader.nextLine();
        String charactersToReplace = "-./ ";
        String formattedCep = cep.replaceAll("[" + charactersToReplace + "]", "");
        String apiUrl = "https://api.invertexto.com/v1/cep/";
        String fullUrl = apiUrl + formattedCep + API_TOKEN;
        var json = consumeApi.getData(fullUrl);
        return converter.getData(json, CepData.class);
    }

    private void searchCnpj() {
        CnpjData data = getCnpjData();
        System.out.println(data);
    }

    private CnpjData getCnpjData(){
        System.out.println("Digite um CNPJ para busca:");
        var cnpj = reader.nextLine();
        String charactersToReplace = "-./ ";
        String formattedCnpj = cnpj.replaceAll("[" + charactersToReplace + "]", "");
        String apiUrl = "https://api.invertexto.com/v1/cnpj/";
        String fullUrl = apiUrl + formattedCnpj + API_TOKEN;
        var json = consumeApi.getData(fullUrl);
        return converter.getData(json, CnpjData.class);
    }
}
