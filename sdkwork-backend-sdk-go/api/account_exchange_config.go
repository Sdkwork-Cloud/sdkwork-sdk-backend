package api

import (
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type AccountExchangeConfigApi struct {
    client *sdkhttp.Client
}

func NewAccountExchangeConfigApi(client *sdkhttp.Client) *AccountExchangeConfigApi {
    return &AccountExchangeConfigApi{client: client}
}

// Get points-to-cash rate
func (a *AccountExchangeConfigApi) GetPointsToCashRate() (sdktypes.PlusApiResultAccountExchangeRateVO, error) {
    raw, err := a.client.Get(BackendApiPath("/account/exchange-config/points-cash-rate"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultAccountExchangeRateVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultAccountExchangeRateVO](raw)
}

// Update points-to-cash rate
func (a *AccountExchangeConfigApi) UpdatePointsToCashRate(body sdktypes.AccountExchangeRateUpdateForm) (sdktypes.PlusApiResultAccountExchangeRateVO, error) {
    raw, err := a.client.Put(BackendApiPath("/account/exchange-config/points-cash-rate"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultAccountExchangeRateVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultAccountExchangeRateVO](raw)
}
