package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type DatabaseTableApi struct {
    client *sdkhttp.Client
}

func NewDatabaseTableApi(client *sdkhttp.Client) *DatabaseTableApi {
    return &DatabaseTableApi{client: client}
}

// Update an existing database table
func (a *DatabaseTableApi) Update(body sdktypes.PlusTableForm) (sdktypes.PlusApiResultPlusTableVO, error) {
    raw, err := a.client.Put(BackendApiPath("/table"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusTableVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusTableVO](raw)
}

// Create a new database table
func (a *DatabaseTableApi) Create(body sdktypes.PlusTableForm) (sdktypes.PlusApiResultPlusTableVO, error) {
    raw, err := a.client.Post(BackendApiPath("/table"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusTableVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusTableVO](raw)
}

// Get database tables by page
func (a *DatabaseTableApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusTableVO, error) {
    raw, err := a.client.Post(BackendApiPath("/table/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusTableVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusTableVO](raw)
}

// Get all database tables
func (a *DatabaseTableApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusTableVO, error) {
    raw, err := a.client.Post(BackendApiPath("/table/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusTableVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusTableVO](raw)
}

// Get a database table by ID
func (a *DatabaseTableApi) GetById(id string) (sdktypes.PlusApiResultPlusTableVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/table/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusTableVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusTableVO](raw)
}

// Delete a database table
func (a *DatabaseTableApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/table/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
