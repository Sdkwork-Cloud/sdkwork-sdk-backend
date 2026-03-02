package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type RolePermissionApi struct {
    client *sdkhttp.Client
}

func NewRolePermissionApi(client *sdkhttp.Client) *RolePermissionApi {
    return &RolePermissionApi{client: client}
}

// Update role-permission association
func (a *RolePermissionApi) Update(body sdktypes.PlusRolePermissionForm) (sdktypes.PlusApiResultPlusRolePermissionVO, error) {
    raw, err := a.client.Put(BackendApiPath("/role/permission"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusRolePermissionVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusRolePermissionVO](raw)
}

// Create role-permission association
func (a *RolePermissionApi) Create(body sdktypes.PlusRolePermissionForm) (sdktypes.PlusApiResultPlusRolePermissionVO, error) {
    raw, err := a.client.Post(BackendApiPath("/role/permission"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusRolePermissionVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusRolePermissionVO](raw)
}

// Get role-permission associations by page
func (a *RolePermissionApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusRolePermissionVO, error) {
    raw, err := a.client.Post(BackendApiPath("/role/permission/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusRolePermissionVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusRolePermissionVO](raw)
}

// Get all role-permission associations
func (a *RolePermissionApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusRolePermissionVO, error) {
    raw, err := a.client.Post(BackendApiPath("/role/permission/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusRolePermissionVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusRolePermissionVO](raw)
}

// Get role-permission association by ID
func (a *RolePermissionApi) GetById(id string) (sdktypes.PlusApiResultPlusRolePermissionVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/role/permission/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusRolePermissionVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusRolePermissionVO](raw)
}

// Delete role-permission association
func (a *RolePermissionApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/role/permission/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
