package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type RbacApi struct {
    client *sdkhttp.Client
}

func NewRbacApi(client *sdkhttp.Client) *RbacApi {
    return &RbacApi{client: client}
}

// Update user-role relationship
func (a *RbacApi) Update(body sdktypes.PlusUserRoleForm) (sdktypes.PlusApiResultPlusUserRoleVO, error) {
    raw, err := a.client.Put(BackendApiPath("/rbac/user/role"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusUserRoleVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusUserRoleVO](raw)
}

// Create user-role relationship
func (a *RbacApi) Create(body sdktypes.PlusUserRoleForm) (sdktypes.PlusApiResultPlusUserRoleVO, error) {
    raw, err := a.client.Post(BackendApiPath("/rbac/user/role"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusUserRoleVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusUserRoleVO](raw)
}

// Get user-role relationships by page
func (a *RbacApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusUserRoleVO, error) {
    raw, err := a.client.Post(BackendApiPath("/rbac/user/role/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusUserRoleVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusUserRoleVO](raw)
}

// Get all user-role relationships
func (a *RbacApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusUserRoleVO, error) {
    raw, err := a.client.Post(BackendApiPath("/rbac/user/role/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusUserRoleVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusUserRoleVO](raw)
}

// Get user-role relationship by ID
func (a *RbacApi) GetById(id string) (sdktypes.PlusApiResultPlusUserRoleVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/rbac/user/role/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusUserRoleVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusUserRoleVO](raw)
}

// Delete user-role relationship
func (a *RbacApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/rbac/user/role/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
