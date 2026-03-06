package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class AccountExchangeConfigApi {
    private final HttpClient client;
    
    public AccountExchangeConfigApi(HttpClient client) {
        this.client = client;
    }

    /** Get points-to-cash rate */
    public PlusApiResultAccountExchangeRateVO getPointsToCashRate() throws Exception {
        return (PlusApiResultAccountExchangeRateVO) client.get(ApiPaths.backendPath("/account/exchange-config/points-cash-rate"));
    }

    /** Update points-to-cash rate */
    public PlusApiResultAccountExchangeRateVO updatePointsToCashRate(AccountExchangeRateUpdateForm body) throws Exception {
        return (PlusApiResultAccountExchangeRateVO) client.put(ApiPaths.backendPath("/account/exchange-config/points-cash-rate"), body);
    }
}
