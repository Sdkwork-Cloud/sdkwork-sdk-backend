package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type SchemaApi struct {
    client *sdkhttp.Client
}

func NewSchemaApi(client *sdkhttp.Client) *SchemaApi {
    return &SchemaApi{client: client}
}

// Update an existing database schema
func (a *SchemaApi) Update(body sdktypes.PlusSchemaForm) (sdktypes.PlusApiResultPlusSchemaVO, error) {
    raw, err := a.client.Put(BackendApiPath("/schema"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusSchemaVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusSchemaVO](raw)
}

// Create a new database schema
func (a *SchemaApi) Create(body sdktypes.PlusSchemaForm) (sdktypes.PlusApiResultPlusSchemaVO, error) {
    raw, err := a.client.Post(BackendApiPath("/schema"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusSchemaVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusSchemaVO](raw)
}

// Get database schemas by page
func (a *SchemaApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusSchemaVO, error) {
    raw, err := a.client.Post(BackendApiPath("/schema/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusSchemaVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusSchemaVO](raw)
}

// Get all database schemas
func (a *SchemaApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusSchemaVO, error) {
    raw, err := a.client.Post(BackendApiPath("/schema/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusSchemaVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusSchemaVO](raw)
}

// Get a database schema by ID
func (a *SchemaApi) GetById(id string) (sdktypes.PlusApiResultPlusSchemaVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/schema/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusSchemaVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusSchemaVO](raw)
}

// Delete a database schema
func (a *SchemaApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/schema/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
