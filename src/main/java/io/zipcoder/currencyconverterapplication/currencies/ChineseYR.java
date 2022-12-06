package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class ChineseYR implements ConvertableCurrency {
    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate()/CurrencyType.CHINESE_YR.getRate();
    }

    @Override
    public CurrencyType getCurrencyType() {
        return CurrencyType.CHINESE_YR;
    }
}
