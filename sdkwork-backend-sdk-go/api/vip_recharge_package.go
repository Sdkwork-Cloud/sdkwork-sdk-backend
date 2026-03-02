package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type VipRechargePackageApi struct {
    client *sdkhttp.Client
}

func NewVipRechargePackageApi(client *sdkhttp.Client) *VipRechargePackageApi {
    return &VipRechargePackageApi{client: client}
}

// Update an existing VIP recharge package
func (a *VipRechargePackageApi) Update(body sdktypes.PlusVipRechargePackForm) (sdktypes.PlusApiResultPlusVipRechargePackVO, error) {
    raw, err := a.client.Put(BackendApiPath("/vip/recharge/pack"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVipRechargePackVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVipRechargePackVO](raw)
}

// Create a new VIP recharge package
func (a *VipRechargePackageApi) Create(body sdktypes.PlusVipRechargePackForm) (sdktypes.PlusApiResultPlusVipRechargePackVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/recharge/pack"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVipRechargePackVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVipRechargePackVO](raw)
}

// Get VIP recharge packages by page
func (a *VipRechargePackageApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusVipRechargePackVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/recharge/pack/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusVipRechargePackVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusVipRechargePackVO](raw)
}

// Get all VIP recharge packages
func (a *VipRechargePackageApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusVipRechargePackVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/recharge/pack/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusVipRechargePackVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusVipRechargePackVO](raw)
}

// Get a VIP recharge package by ID
func (a *VipRechargePackageApi) GetById(id string) (sdktypes.PlusApiResultPlusVipRechargePackVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/vip/recharge/pack/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVipRechargePackVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVipRechargePackVO](raw)
}

// Delete a VIP recharge package
func (a *VipRechargePackageApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/vip/recharge/pack/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
