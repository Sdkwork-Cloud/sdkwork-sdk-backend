package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type VipBenefitUsageApi struct {
    client *sdkhttp.Client
}

func NewVipBenefitUsageApi(client *sdkhttp.Client) *VipBenefitUsageApi {
    return &VipBenefitUsageApi{client: client}
}

// Update an existing VIP benefit usage record
func (a *VipBenefitUsageApi) Update(body sdktypes.PlusVipBenefitUsageForm) (sdktypes.PlusApiResultPlusVipBenefitUsageVO, error) {
    raw, err := a.client.Put(BackendApiPath("/vip/benefit/usage"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVipBenefitUsageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVipBenefitUsageVO](raw)
}

// Create a new VIP benefit usage record
func (a *VipBenefitUsageApi) Create(body sdktypes.PlusVipBenefitUsageForm) (sdktypes.PlusApiResultPlusVipBenefitUsageVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/benefit/usage"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVipBenefitUsageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVipBenefitUsageVO](raw)
}

// Get VIP benefit usage records by page
func (a *VipBenefitUsageApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusVipBenefitUsageVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/benefit/usage/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusVipBenefitUsageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusVipBenefitUsageVO](raw)
}

// Get all VIP benefit usage records
func (a *VipBenefitUsageApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusVipBenefitUsageVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/benefit/usage/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusVipBenefitUsageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusVipBenefitUsageVO](raw)
}

// Get a VIP benefit usage record by ID
func (a *VipBenefitUsageApi) GetById(id string) (sdktypes.PlusApiResultPlusVipBenefitUsageVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/vip/benefit/usage/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVipBenefitUsageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVipBenefitUsageVO](raw)
}

// Delete a VIP benefit usage record
func (a *VipBenefitUsageApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/vip/benefit/usage/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
