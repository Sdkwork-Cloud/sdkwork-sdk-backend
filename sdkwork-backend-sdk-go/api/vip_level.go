package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type VipLevelApi struct {
    client *sdkhttp.Client
}

func NewVipLevelApi(client *sdkhttp.Client) *VipLevelApi {
    return &VipLevelApi{client: client}
}

// Update an existing VIP level
func (a *VipLevelApi) Update(body sdktypes.PlusVipLevelForm) (sdktypes.PlusApiResultPlusVipLevelVO, error) {
    raw, err := a.client.Put(BackendApiPath("/vip/level"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVipLevelVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVipLevelVO](raw)
}

// Create a new VIP level
func (a *VipLevelApi) Create(body sdktypes.PlusVipLevelForm) (sdktypes.PlusApiResultPlusVipLevelVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/level"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVipLevelVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVipLevelVO](raw)
}

// Get VIP levels by page
func (a *VipLevelApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusVipLevelVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/level/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusVipLevelVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusVipLevelVO](raw)
}

// Get all VIP levels
func (a *VipLevelApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusVipLevelVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/level/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusVipLevelVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusVipLevelVO](raw)
}

// Get a VIP level by ID
func (a *VipLevelApi) GetById(id string) (sdktypes.PlusApiResultPlusVipLevelVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/vip/level/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVipLevelVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVipLevelVO](raw)
}

// Delete a VIP level
func (a *VipLevelApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/vip/level/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
