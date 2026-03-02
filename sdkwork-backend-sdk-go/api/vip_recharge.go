package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type VipRechargeApi struct {
    client *sdkhttp.Client
}

func NewVipRechargeApi(client *sdkhttp.Client) *VipRechargeApi {
    return &VipRechargeApi{client: client}
}

// Update an existing VIP recharge record
func (a *VipRechargeApi) Update(body sdktypes.PlusVipRechargeForm) (sdktypes.PlusApiResultPlusVipRechargeVO, error) {
    raw, err := a.client.Put(BackendApiPath("/vip/recharge"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVipRechargeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVipRechargeVO](raw)
}

// Create a new VIP recharge record
func (a *VipRechargeApi) Create(body sdktypes.PlusVipRechargeForm) (sdktypes.PlusApiResultPlusVipRechargeVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/recharge"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVipRechargeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVipRechargeVO](raw)
}

// Get VIP recharge records by page
func (a *VipRechargeApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusVipRechargeVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/recharge/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusVipRechargeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusVipRechargeVO](raw)
}

// Get all VIP recharge records
func (a *VipRechargeApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusVipRechargeVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/recharge/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusVipRechargeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusVipRechargeVO](raw)
}

// Get a VIP recharge record by ID
func (a *VipRechargeApi) GetById(id string) (sdktypes.PlusApiResultPlusVipRechargeVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/vip/recharge/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVipRechargeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVipRechargeVO](raw)
}

// Delete a VIP recharge record
func (a *VipRechargeApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/vip/recharge/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
