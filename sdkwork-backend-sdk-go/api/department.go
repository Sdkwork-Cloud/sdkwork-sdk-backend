package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type DepartmentApi struct {
    client *sdkhttp.Client
}

func NewDepartmentApi(client *sdkhttp.Client) *DepartmentApi {
    return &DepartmentApi{client: client}
}

// Update an existing department
func (a *DepartmentApi) Update(body sdktypes.PlusDepartmentForm) (sdktypes.PlusApiResultPlusDepartmentVO, error) {
    raw, err := a.client.Put(BackendApiPath("/department"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusDepartmentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusDepartmentVO](raw)
}

// Create a new department
func (a *DepartmentApi) Create(body sdktypes.PlusDepartmentForm) (sdktypes.PlusApiResultPlusDepartmentVO, error) {
    raw, err := a.client.Post(BackendApiPath("/department"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusDepartmentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusDepartmentVO](raw)
}

// Get departments by page
func (a *DepartmentApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusDepartmentVO, error) {
    raw, err := a.client.Post(BackendApiPath("/department/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusDepartmentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusDepartmentVO](raw)
}

// Get all departments
func (a *DepartmentApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusDepartmentVO, error) {
    raw, err := a.client.Post(BackendApiPath("/department/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusDepartmentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusDepartmentVO](raw)
}

// Get a department by ID
func (a *DepartmentApi) GetById(id string) (sdktypes.PlusApiResultPlusDepartmentVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/department/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusDepartmentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusDepartmentVO](raw)
}

// Delete a department
func (a *DepartmentApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/department/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
