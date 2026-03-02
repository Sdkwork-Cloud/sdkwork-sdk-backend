package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type DetailApi struct {
    client *sdkhttp.Client
}

func NewDetailApi(client *sdkhttp.Client) *DetailApi {
    return &DetailApi{client: client}
}

// Update existing detail content
func (a *DetailApi) Update(body sdktypes.PlusDetailForm) (sdktypes.PlusApiResultPlusDetailVO, error) {
    raw, err := a.client.Put(BackendApiPath("/detail"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusDetailVO](raw)
}

// Create new detail content
func (a *DetailApi) Create(body sdktypes.PlusDetailForm) (sdktypes.PlusApiResultPlusDetailVO, error) {
    raw, err := a.client.Post(BackendApiPath("/detail"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusDetailVO](raw)
}

// Get detail contents by page
func (a *DetailApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusDetailVO, error) {
    raw, err := a.client.Post(BackendApiPath("/detail/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusDetailVO](raw)
}

// Get all detail contents
func (a *DetailApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusDetailVO, error) {
    raw, err := a.client.Post(BackendApiPath("/detail/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusDetailVO](raw)
}

// Get detail content by ID
func (a *DetailApi) GetById(id string) (sdktypes.PlusApiResultPlusDetailVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/detail/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusDetailVO](raw)
}

// Delete detail content
func (a *DetailApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/detail/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
