package br.com.moacyr.currency_converter;

import br.com.moacyr.currency_converter.services.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class CurrencyConverterApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConverterApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {

		int code = 0;
		Double value;
		String baseCurrency = null;
		String targetCurrency = null;

		Locale.setDefault(Locale.US);

		while (code != 7) {

			Display exhibit = new Display();
			exhibit.display();
			//
			UserInteraction userInteraction = new UserInteraction();
			code = userInteraction.getCodeFromUser();
			//
			SelectingCode selectingCode = new SelectingCode();
			selectingCode.selectCode(code);

			baseCurrency = selectingCode.getBaseCurrency();
			targetCurrency = selectingCode.getTargetCurrency();
			//
			if (code != 7){

				value = userInteraction.getValueFromUser();

				APIConsumption apiConsumption = new APIConsumption();
				Url url = new Url();

				String apiUrl = url.getUrl(baseCurrency, targetCurrency, value);
				var json = apiConsumption.getData(apiUrl);

				System.out.println(json);
			}
		}
	}
}
