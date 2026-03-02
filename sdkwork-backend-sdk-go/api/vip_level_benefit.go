package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type VipLevelBenefitApi struct {
    client *sdkhttp.Client
}

func NewVipLevelBenefitApi(client *sdkhttp.Client) *VipLevelBenefitApi {
    return &VipLevelBenefitApi{client: client}
}

// Update an existing VIP level benefit
func (a *VipLevelBenefitApi) Update(body sdktypes.PlusVipLevelBenefitForm) (sdktypes.PlusApiResultPlusVipLevelBenefitVO, error) {
    raw, err := a.client.Put(BackendApiPath("/vip/level/benefit"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVipLevelBenefitVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVipLevelBenefitVO](raw)
}

// Create a new VIP level benefit
func (a *VipLevelBenefitApi) Create(body sdktypes.PlusVipLevelBenefitForm) (sdktypes.PlusApiResultPlusVipLevelBenefitVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/level/benefit"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVipLevelBenefitVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVipLevelBenefitVO](raw)
}

// Get VIP level benefits by page
func (a *VipLevelBenefitApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusVipLevelBenefitVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/level/benefit/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusVipLevelBenefitVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusVipLevelBenefitVO](raw)
}

// Get all VIP level benefits
func (a *VipLevelBenefitApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusVipLevelBenefitVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/level/benefit/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusVipLevelBenefitVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusVipLevelBenefitVO](raw)
}

// Get a VIP level benefit by ID
func (a *VipLevelBenefitApi) GetById(id string) (sdktypes.PlusApiResultPlusVipLevelBenefitVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/vip/level/benefit/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVipLevelBenefitVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVipLevelBenefitVO](raw)
}

// Delete a VIP level benefit
func (a *VipLevelBenefitApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/vip/level/benefit/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
