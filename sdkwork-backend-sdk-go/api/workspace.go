package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type WorkspaceApi struct {
    client *sdkhttp.Client
}

func NewWorkspaceApi(client *sdkhttp.Client) *WorkspaceApi {
    return &WorkspaceApi{client: client}
}

// Update an existing workspace
func (a *WorkspaceApi) Update(body sdktypes.PlusWorkspaceForm) (sdktypes.PlusApiResultPlusWorkspaceVO, error) {
    raw, err := a.client.Put(BackendApiPath("/workspace"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusWorkspaceVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusWorkspaceVO](raw)
}

// Create a new workspace
func (a *WorkspaceApi) Create(body sdktypes.PlusWorkspaceForm) (sdktypes.PlusApiResultPlusWorkspaceVO, error) {
    raw, err := a.client.Post(BackendApiPath("/workspace"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusWorkspaceVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusWorkspaceVO](raw)
}

// Get workspaces by page
func (a *WorkspaceApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusWorkspaceVO, error) {
    raw, err := a.client.Post(BackendApiPath("/workspace/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusWorkspaceVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusWorkspaceVO](raw)
}

// Get all workspaces
func (a *WorkspaceApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusWorkspaceVO, error) {
    raw, err := a.client.Post(BackendApiPath("/workspace/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusWorkspaceVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusWorkspaceVO](raw)
}

// Get a workspace by ID
func (a *WorkspaceApi) GetById(id string) (sdktypes.PlusApiResultPlusWorkspaceVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/workspace/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusWorkspaceVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusWorkspaceVO](raw)
}

// Delete a workspace
func (a *WorkspaceApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/workspace/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
