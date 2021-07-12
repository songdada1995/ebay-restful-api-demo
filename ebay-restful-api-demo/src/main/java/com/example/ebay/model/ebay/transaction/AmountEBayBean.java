package com.example.ebay.model.ebay.transaction;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author songbo
 * @Date 2021/7/12 11:06
 * @Version 1.0
 */
@NoArgsConstructor
@Data
public class AmountEBayBean {
    @SerializedName("currency")
    private String currency;
    @SerializedName("convertedFromCurrency")
    private String convertedFromCurrency;
    @SerializedName("convertedFromValue")
    private String convertedFromValue;
    @SerializedName("exchangeRate")
    private String exchangeRate;
    @SerializedName("value")
    private String value;
}
