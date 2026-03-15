package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type RoleApi struct {
    client *sdkhttp.Client
}

func NewRoleApi(client *sdkhttp.Client) *RoleApi {
    return &RoleApi{client: client}
}

// Update an existing system role
func (a *RoleApi) Update(body sdktypes.PlusRoleForm) (sdktypes.PlusApiResultPlusRoleVO, error) {
    raw, err := a.client.Put(BackendApiPath("/role"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusRoleVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusRoleVO](raw)
}

// Create a new system role
func (a *RoleApi) Create(body sdktypes.PlusRoleForm) (sdktypes.PlusApiResultPlusRoleVO, error) {
    raw, err := a.client.Post(BackendApiPath("/role"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusRoleVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusRoleVO](raw)
}

// Update role-permission association
func (a *RoleApi) UpdatePermission(body sdktypes.PlusRolePermissionForm) (sdktypes.PlusApiResultPlusRolePermissionVO, error) {
    raw, err := a.client.Put(BackendApiPath("/role/permission"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusRolePermissionVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusRolePermissionVO](raw)
}

// Create role-permission association
func (a *RoleApi) CreatePermission(body sdktypes.PlusRolePermissionForm) (sdktypes.PlusApiResultPlusRolePermissionVO, error) {
    raw, err := a.client.Post(BackendApiPath("/role/permission"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusRolePermissionVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusRolePermissionVO](raw)
}

// Get role-permission associations by page
func (a *RoleApi) CreateListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusRolePermissionVO, error) {
    raw, err := a.client.Post(BackendApiPath("/role/permission/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusRolePermissionVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusRolePermissionVO](raw)
}

// Get all role-permission associations
func (a *RoleApi) CreateListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusRolePermissionVO, error) {
    raw, err := a.client.Post(BackendApiPath("/role/permission/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusRolePermissionVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusRolePermissionVO](raw)
}

// Get system roles by page
func (a *RoleApi) CreateListByPageRole(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusRoleVO, error) {
    raw, err := a.client.Post(BackendApiPath("/role/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusRoleVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusRoleVO](raw)
}

// Get all system roles
func (a *RoleApi) CreateListAllEntitiesRole(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusRoleVO, error) {
    raw, err := a.client.Post(BackendApiPath("/role/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusRoleVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusRoleVO](raw)
}

// Get a system role by ID
func (a *RoleApi) GetById(id string) (sdktypes.PlusApiResultPlusRoleVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/role/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusRoleVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusRoleVO](raw)
}

// Delete a system role
func (a *RoleApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/role/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Get role-permission association by ID
func (a *RoleApi) GetByIdPermission(id string) (sdktypes.PlusApiResultPlusRolePermissionVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/role/permission/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusRolePermissionVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusRolePermissionVO](raw)
}

// Delete role-permission association
func (a *RoleApi) DeletePermission(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/role/permission/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
