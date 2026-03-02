package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type ColumnApi struct {
    client *sdkhttp.Client
}

func NewColumnApi(client *sdkhttp.Client) *ColumnApi {
    return &ColumnApi{client: client}
}

// Update column
func (a *ColumnApi) Update(body sdktypes.PlusColumnForm) (sdktypes.PlusApiResultPlusColumnVO, error) {
    raw, err := a.client.Put(BackendApiPath("/column"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusColumnVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusColumnVO](raw)
}

// Create column
func (a *ColumnApi) Create(body sdktypes.PlusColumnForm) (sdktypes.PlusApiResultPlusColumnVO, error) {
    raw, err := a.client.Post(BackendApiPath("/column"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusColumnVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusColumnVO](raw)
}

// Get columns by page
func (a *ColumnApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusColumnVO, error) {
    raw, err := a.client.Post(BackendApiPath("/column/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusColumnVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusColumnVO](raw)
}

// Get all columns
func (a *ColumnApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusColumnVO, error) {
    raw, err := a.client.Post(BackendApiPath("/column/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusColumnVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusColumnVO](raw)
}

// Get column by ID
func (a *ColumnApi) GetById(id string) (sdktypes.PlusApiResultPlusColumnVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/column/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusColumnVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusColumnVO](raw)
}

// Delete column
func (a *ColumnApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/column/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
