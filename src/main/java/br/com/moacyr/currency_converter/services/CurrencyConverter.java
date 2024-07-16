package br.com.moacyr.currency_converter.services;

import br.com.moacyr.currency_converter.models.ExchangeRateList;

public class CurrencyConverter {

    private String baseCurrency;
    private String targetCurrency;
    private double value;
    private double convertion;

    public CurrencyConverter(ExchangeRateList exchangeRate, Double value) {
        this.baseCurrency = exchangeRate.base_code();
        this.targetCurrency = exchangeRate.target_code();
        this.convertion = Double.valueOf(exchangeRate.conversion_result());
        this.value = value;
    }
    @Override
    public String toString() {
        return
                "baseCurrency = " + baseCurrency +
                        ", targetCurrency= " + targetCurrency +
                        ", value= " + value +
                        ", convertion= " + convertion;
    }

}
