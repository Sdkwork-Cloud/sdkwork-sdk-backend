package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type RbacPermissionApi struct {
    client *sdkhttp.Client
}

func NewRbacPermissionApi(client *sdkhttp.Client) *RbacPermissionApi {
    return &RbacPermissionApi{client: client}
}

func (a *RbacPermissionApi) Update(body sdktypes.PlusPermissionForm) (sdktypes.PlusApiResultPlusPermissionVO, error) {
    raw, err := a.client.Put(BackendApiPath("/permission"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusPermissionVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusPermissionVO](raw)
}

func (a *RbacPermissionApi) Create(body sdktypes.PlusPermissionForm) (sdktypes.PlusApiResultPlusPermissionVO, error) {
    raw, err := a.client.Post(BackendApiPath("/permission"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusPermissionVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusPermissionVO](raw)
}

// List permissions by page
func (a *RbacPermissionApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusPermissionVO, error) {
    raw, err := a.client.Post(BackendApiPath("/permission/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusPermissionVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusPermissionVO](raw)
}

// List all permissions
func (a *RbacPermissionApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusPermissionVO, error) {
    raw, err := a.client.Post(BackendApiPath("/permission/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusPermissionVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusPermissionVO](raw)
}

func (a *RbacPermissionApi) GetById(id string) (sdktypes.PlusApiResultPlusPermissionVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/permission/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusPermissionVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusPermissionVO](raw)
}

func (a *RbacPermissionApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/permission/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
