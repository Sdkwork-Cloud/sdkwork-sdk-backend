package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type VipPointChangeApi struct {
    client *sdkhttp.Client
}

func NewVipPointChangeApi(client *sdkhttp.Client) *VipPointChangeApi {
    return &VipPointChangeApi{client: client}
}

// Update an existing VIP point change record
func (a *VipPointChangeApi) Update(body sdktypes.PlusVipPointChangeForm) (sdktypes.PlusApiResultPlusVipPointChangeVO, error) {
    raw, err := a.client.Put(BackendApiPath("/vip/point/change"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVipPointChangeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVipPointChangeVO](raw)
}

// Create a new VIP point change record
func (a *VipPointChangeApi) Create(body sdktypes.PlusVipPointChangeForm) (sdktypes.PlusApiResultPlusVipPointChangeVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/point/change"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVipPointChangeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVipPointChangeVO](raw)
}

// Get VIP point change records by page
func (a *VipPointChangeApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusVipPointChangeVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/point/change/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusVipPointChangeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusVipPointChangeVO](raw)
}

// Get all VIP point change records
func (a *VipPointChangeApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusVipPointChangeVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/point/change/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusVipPointChangeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusVipPointChangeVO](raw)
}

// Get a VIP point change record by ID
func (a *VipPointChangeApi) GetById(id string) (sdktypes.PlusApiResultPlusVipPointChangeVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/vip/point/change/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVipPointChangeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVipPointChangeVO](raw)
}

// Delete a VIP point change record
func (a *VipPointChangeApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/vip/point/change/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
