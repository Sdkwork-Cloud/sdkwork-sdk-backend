package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type ProjectApi struct {
    client *sdkhttp.Client
}

func NewProjectApi(client *sdkhttp.Client) *ProjectApi {
    return &ProjectApi{client: client}
}

// Update an existing project
func (a *ProjectApi) Update(body sdktypes.PlusProjectForm) (sdktypes.PlusApiResultPlusProjectVO, error) {
    raw, err := a.client.Put(BackendApiPath("/project"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusProjectVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusProjectVO](raw)
}

// Create a new project
func (a *ProjectApi) Create(body sdktypes.PlusProjectForm) (sdktypes.PlusApiResultPlusProjectVO, error) {
    raw, err := a.client.Post(BackendApiPath("/project"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusProjectVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusProjectVO](raw)
}

// Get projects by page
func (a *ProjectApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusProjectVO, error) {
    raw, err := a.client.Post(BackendApiPath("/project/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusProjectVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusProjectVO](raw)
}

// Get all projects
func (a *ProjectApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusProjectVO, error) {
    raw, err := a.client.Post(BackendApiPath("/project/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusProjectVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusProjectVO](raw)
}

// Get a project by ID
func (a *ProjectApi) GetById(id string) (sdktypes.PlusApiResultPlusProjectVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/project/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusProjectVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusProjectVO](raw)
}

// Delete a project
func (a *ProjectApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/project/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
