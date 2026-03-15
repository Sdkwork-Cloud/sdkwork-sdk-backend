package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type TableApi struct {
    client *sdkhttp.Client
}

func NewTableApi(client *sdkhttp.Client) *TableApi {
    return &TableApi{client: client}
}

// Update an existing database table
func (a *TableApi) Update(body sdktypes.PlusTableForm) (sdktypes.PlusApiResultPlusTableVO, error) {
    raw, err := a.client.Put(BackendApiPath("/table"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusTableVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusTableVO](raw)
}

// Create a new database table
func (a *TableApi) Create(body sdktypes.PlusTableForm) (sdktypes.PlusApiResultPlusTableVO, error) {
    raw, err := a.client.Post(BackendApiPath("/table"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusTableVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusTableVO](raw)
}

// Get database tables by page
func (a *TableApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusTableVO, error) {
    raw, err := a.client.Post(BackendApiPath("/table/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusTableVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusTableVO](raw)
}

// Get all database tables
func (a *TableApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusTableVO, error) {
    raw, err := a.client.Post(BackendApiPath("/table/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusTableVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusTableVO](raw)
}

// Get a database table by ID
func (a *TableApi) GetById(id string) (sdktypes.PlusApiResultPlusTableVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/table/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusTableVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusTableVO](raw)
}

// Delete a database table
func (a *TableApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/table/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
