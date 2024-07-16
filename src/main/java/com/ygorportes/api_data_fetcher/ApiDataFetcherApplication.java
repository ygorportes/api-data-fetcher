package com.ygorportes.api_data_fetcher;

import com.ygorportes.api_data_fetcher.main.Main;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiDataFetcherApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ApiDataFetcherApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Main main = new Main();
		main.showMenu();
	}
}
