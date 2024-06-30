package br.com.moacyr.currency_converter;

import br.com.moacyr.currency_converter.services.APIConsumption;
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

		Scanner sc = new Scanner(System.in);

		while (code != 7) {
			System.out.println("**************************************");
			System.out.println("Seja bem vindo/a ao Conversor de Moedas");
			System.out.println(" ");
			System.out.println("1) Real Brasileiro =>> Dólar");
			System.out.println("2) Dólar =>> Real Brasileiro");
			System.out.println("3) Real Brasileiro =>> Rupia Indiana");
			System.out.println("4) Rupia Indiana =>> Real Brasileiro");
			System.out.println("5) Real Brasileiro =>> Dólar Australiano");
			System.out.println("6) Dólar Australiano =>> Real Brasileiro");
			System.out.println("7) Sair");
			System.out.println("Escolha uma opção válida: ");
			System.out.println("**************************************");

			code = sc.nextInt();

			switch (code) {
				case 1:
					baseCurrency = "BRL";
					targetCurrency = "USD";
					break;
				case 2:
					baseCurrency = "USD";
					targetCurrency = "BRL";
					break;
				case 3:
					baseCurrency = "BRL";
					targetCurrency = "INR";
					break;
				case 4:
					baseCurrency = "INR";
					targetCurrency = "BRL";
					break;
				case 5:
					baseCurrency = "BRL";
					targetCurrency = "AUD";
					break;
				case 6:
					baseCurrency = "AUD";
					targetCurrency = "BRL";
					break;
				default:
					baseCurrency = "BRL";
					targetCurrency = "USD";
			}
			if (code != 7){

				System.out.println("Digite o valor que deseja converter ");

				value = sc.nextDouble();

			}
		}
		sc.close();
	}
}
