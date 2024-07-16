package br.com.moacyr.currency_converter.models;

public record ExchangeRateList(String base_code, String target_code,
                               Double value, String conversion_result) {
}
