package br.com.moacyr.currency_converter.services;

public class SelectingCode {

    private String baseCurrency;
    private String targetCurrency;
    public void selectCode(int code){

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
    }
    public String getBaseCurrency(){
        return baseCurrency;
    }

    public String getTargetCurrency(){
        return targetCurrency;
    }

    public void selectContinueOrExit(int code) {


    }
}