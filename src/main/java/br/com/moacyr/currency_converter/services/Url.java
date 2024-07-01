package br.com.moacyr.currency_converter.services;

public class Url {

    public String getUrl(String baseCurrency, String targetCurrency, Double value){

        String url = "https://v6.exchangerate-api.com/v6/9e5ca52030535439d3ad186d/pair/"
                + baseCurrency + "/" + targetCurrency + "/" + value;
        return url;

    }
}
