package com.ygorportes.api_data_fetcher.service;

public interface IConvertsData {

    <T> T getData(String json, Class<T> tClass);
}
