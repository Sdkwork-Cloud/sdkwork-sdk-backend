package api

import (
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type AuthorizationApi struct {
    client *sdkhttp.Client
}

func NewAuthorizationApi(client *sdkhttp.Client) *AuthorizationApi {
    return &AuthorizationApi{client: client}
}

// 检查用户角色
func (a *AuthorizationApi) HasRole(body sdktypes.RoleCheckForm) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Post(BackendApiPath("/auth/authorization/has_role"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// 检查用户权限
func (a *AuthorizationApi) HasPermission(body sdktypes.PermissionCheckForm) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Post(BackendApiPath("/auth/authorization/has_permission"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// 获取用户角色列表
func (a *AuthorizationApi) GetRoles() (sdktypes.PlusApiResultListString, error) {
    raw, err := a.client.Get(BackendApiPath("/auth/authorization/roles"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListString
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListString](raw)
}

// 获取用户权限列表
func (a *AuthorizationApi) GetPermissions() (sdktypes.PlusApiResultListString, error) {
    raw, err := a.client.Get(BackendApiPath("/auth/authorization/permissions"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListString
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListString](raw)
}
