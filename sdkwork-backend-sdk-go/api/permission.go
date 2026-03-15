package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type PermissionApi struct {
    client *sdkhttp.Client
}

func NewPermissionApi(client *sdkhttp.Client) *PermissionApi {
    return &PermissionApi{client: client}
}

func (a *PermissionApi) Update(body sdktypes.PlusPermissionForm) (sdktypes.PlusApiResultPlusPermissionVO, error) {
    raw, err := a.client.Put(BackendApiPath("/permission"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusPermissionVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusPermissionVO](raw)
}

func (a *PermissionApi) Create(body sdktypes.PlusPermissionForm) (sdktypes.PlusApiResultPlusPermissionVO, error) {
    raw, err := a.client.Post(BackendApiPath("/permission"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusPermissionVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusPermissionVO](raw)
}

// List permissions by page
func (a *PermissionApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusPermissionVO, error) {
    raw, err := a.client.Post(BackendApiPath("/permission/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusPermissionVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusPermissionVO](raw)
}

// List all permissions
func (a *PermissionApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusPermissionVO, error) {
    raw, err := a.client.Post(BackendApiPath("/permission/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusPermissionVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusPermissionVO](raw)
}

func (a *PermissionApi) GetById(id string) (sdktypes.PlusApiResultPlusPermissionVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/permission/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusPermissionVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusPermissionVO](raw)
}

func (a *PermissionApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/permission/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
