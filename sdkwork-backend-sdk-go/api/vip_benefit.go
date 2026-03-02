package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type VipBenefitApi struct {
    client *sdkhttp.Client
}

func NewVipBenefitApi(client *sdkhttp.Client) *VipBenefitApi {
    return &VipBenefitApi{client: client}
}

// Update an existing VIP benefit
func (a *VipBenefitApi) Update(body sdktypes.PlusVipBenefitForm) (sdktypes.PlusApiResultPlusVipBenefitVO, error) {
    raw, err := a.client.Put(BackendApiPath("/vip/benefit"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVipBenefitVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVipBenefitVO](raw)
}

// Create a new VIP benefit
func (a *VipBenefitApi) Create(body sdktypes.PlusVipBenefitForm) (sdktypes.PlusApiResultPlusVipBenefitVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/benefit"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVipBenefitVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVipBenefitVO](raw)
}

// Get VIP benefits by page
func (a *VipBenefitApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusVipBenefitVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/benefit/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusVipBenefitVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusVipBenefitVO](raw)
}

// Get all VIP benefits
func (a *VipBenefitApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusVipBenefitVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/benefit/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusVipBenefitVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusVipBenefitVO](raw)
}

// Get a VIP benefit by ID
func (a *VipBenefitApi) GetById(id string) (sdktypes.PlusApiResultPlusVipBenefitVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/vip/benefit/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVipBenefitVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVipBenefitVO](raw)
}

// Delete a VIP benefit
func (a *VipBenefitApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/vip/benefit/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
