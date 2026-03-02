package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type VipPackageGroupApi struct {
    client *sdkhttp.Client
}

func NewVipPackageGroupApi(client *sdkhttp.Client) *VipPackageGroupApi {
    return &VipPackageGroupApi{client: client}
}

// Update an existing VIP package group
func (a *VipPackageGroupApi) Update(body sdktypes.PlusVipPackGroupForm) (sdktypes.PlusApiResultPlusVipPackGroupVO, error) {
    raw, err := a.client.Put(BackendApiPath("/vip/pack_group"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVipPackGroupVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVipPackGroupVO](raw)
}

// Create a new VIP package group
func (a *VipPackageGroupApi) Create(body sdktypes.PlusVipPackGroupForm) (sdktypes.PlusApiResultPlusVipPackGroupVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/pack_group"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVipPackGroupVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVipPackGroupVO](raw)
}

// List public
func (a *VipPackageGroupApi) ListPublic(body *sdktypes.PlusVipPackGroupQueryForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusVipPackGroupVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/pack_group/list_public"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusVipPackGroupVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusVipPackGroupVO](raw)
}

// Get VIP package groups by page
func (a *VipPackageGroupApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusVipPackGroupVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/pack_group/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusVipPackGroupVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusVipPackGroupVO](raw)
}

// Get all VIP package groups
func (a *VipPackageGroupApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusVipPackGroupVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/pack_group/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusVipPackGroupVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusVipPackGroupVO](raw)
}

// Get a VIP package group by ID
func (a *VipPackageGroupApi) GetById(id string) (sdktypes.PlusApiResultPlusVipPackGroupVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/vip/pack_group/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVipPackGroupVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVipPackGroupVO](raw)
}

// Delete a VIP package group
func (a *VipPackageGroupApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/vip/pack_group/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
