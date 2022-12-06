package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class CanadianDollar implements ConvertableCurrency {
    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate()/CurrencyType.CANADIAN_DOLLAR.getRate();
    }

    @Override
    public CurrencyType getCurrencyType() {
        return CurrencyType.CANADIAN_DOLLAR;
    }
}
