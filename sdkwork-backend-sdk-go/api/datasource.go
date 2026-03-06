package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type DatasourceApi struct {
    client *sdkhttp.Client
}

func NewDatasourceApi(client *sdkhttp.Client) *DatasourceApi {
    return &DatasourceApi{client: client}
}

// Update an existing data source
func (a *DatasourceApi) Update(body sdktypes.PlusDatasourceForm) (sdktypes.PlusApiResultPlusDatasourceVO, error) {
    raw, err := a.client.Put(BackendApiPath("/datasource"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusDatasourceVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusDatasourceVO](raw)
}

// Create a new data source
func (a *DatasourceApi) Create(body sdktypes.PlusDatasourceForm) (sdktypes.PlusApiResultPlusDatasourceVO, error) {
    raw, err := a.client.Post(BackendApiPath("/datasource"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusDatasourceVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusDatasourceVO](raw)
}

func (a *DatasourceApi) Stop(query map[string]interface{}, headers map[string]string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Post(BackendApiPath("/datasource/stop"), nil, query, headers, "")
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Get data sources by page
func (a *DatasourceApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusDatasourceVO, error) {
    raw, err := a.client.Post(BackendApiPath("/datasource/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusDatasourceVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusDatasourceVO](raw)
}

// Get all data sources
func (a *DatasourceApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusDatasourceVO, error) {
    raw, err := a.client.Post(BackendApiPath("/datasource/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusDatasourceVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusDatasourceVO](raw)
}

// Create a chat completion with Datasource
func (a *DatasourceApi) CreateCompletions(body sdktypes.ChatCompletionCreateForm, query map[string]interface{}, headers map[string]string) (sdktypes.ChatCompletionChunk, error) {
    raw, err := a.client.Post(BackendApiPath("/datasource/chat/completions"), body, query, headers, "")
    if err != nil {
        var zero sdktypes.ChatCompletionChunk
        return zero, err
    }
    return decodeResult[sdktypes.ChatCompletionChunk](raw)
}

// Get a data source by ID
func (a *DatasourceApi) GetById(id string) (sdktypes.PlusApiResultPlusDatasourceVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/datasource/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusDatasourceVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusDatasourceVO](raw)
}

// Delete a data source
func (a *DatasourceApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/datasource/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
