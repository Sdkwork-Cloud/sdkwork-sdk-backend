package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type VipPackageApi struct {
    client *sdkhttp.Client
}

func NewVipPackageApi(client *sdkhttp.Client) *VipPackageApi {
    return &VipPackageApi{client: client}
}

// Update VIP Package
func (a *VipPackageApi) Update(body sdktypes.PlusVipPackForm) (sdktypes.PlusApiResultPlusVipPackVO, error) {
    raw, err := a.client.Put(BackendApiPath("/vip/pack"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVipPackVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVipPackVO](raw)
}

// Create VIP Package
func (a *VipPackageApi) Create(body sdktypes.PlusVipPackForm) (sdktypes.PlusApiResultPlusVipPackVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/pack"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVipPackVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVipPackVO](raw)
}

// Get VIP Packages by Page
func (a *VipPackageApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusVipPackVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/pack/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusVipPackVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusVipPackVO](raw)
}

// Get All VIP Packages
func (a *VipPackageApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusVipPackVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/pack/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusVipPackVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusVipPackVO](raw)
}

// Get VIP Package by ID
func (a *VipPackageApi) GetById(id string) (sdktypes.PlusApiResultPlusVipPackVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/vip/pack/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVipPackVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVipPackVO](raw)
}

// Delete VIP Package
func (a *VipPackageApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/vip/pack/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
