package com.ygorportes.api_data_fetcher.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertsData implements IConvertsData{

    private final ObjectMapper mapper = new ObjectMapper();
    @Override
    public <T> T getData(String json, Class<T> tClass) {
        try{
            return mapper.readValue(json, tClass);
        } catch (JsonProcessingException e){
            throw new RuntimeException(e);
        }
    }
}
