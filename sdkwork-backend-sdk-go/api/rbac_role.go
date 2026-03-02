package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type RbacRoleApi struct {
    client *sdkhttp.Client
}

func NewRbacRoleApi(client *sdkhttp.Client) *RbacRoleApi {
    return &RbacRoleApi{client: client}
}

// Update an existing system role
func (a *RbacRoleApi) Update(body sdktypes.PlusRoleForm) (sdktypes.PlusApiResultPlusRoleVO, error) {
    raw, err := a.client.Put(BackendApiPath("/role"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusRoleVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusRoleVO](raw)
}

// Create a new system role
func (a *RbacRoleApi) Create(body sdktypes.PlusRoleForm) (sdktypes.PlusApiResultPlusRoleVO, error) {
    raw, err := a.client.Post(BackendApiPath("/role"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusRoleVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusRoleVO](raw)
}

// Get system roles by page
func (a *RbacRoleApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusRoleVO, error) {
    raw, err := a.client.Post(BackendApiPath("/role/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusRoleVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusRoleVO](raw)
}

// Get all system roles
func (a *RbacRoleApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusRoleVO, error) {
    raw, err := a.client.Post(BackendApiPath("/role/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusRoleVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusRoleVO](raw)
}

// Get a system role by ID
func (a *RbacRoleApi) GetById(id string) (sdktypes.PlusApiResultPlusRoleVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/role/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusRoleVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusRoleVO](raw)
}

// Delete a system role
func (a *RbacRoleApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/role/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
