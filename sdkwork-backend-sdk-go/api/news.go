package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type NewsApi struct {
    client *sdkhttp.Client
}

func NewNewsApi(client *sdkhttp.Client) *NewsApi {
    return &NewsApi{client: client}
}

// Update an existing news
func (a *NewsApi) Update(body sdktypes.PlusNewsForm) (sdktypes.PlusApiResultPlusNewsVO, error) {
    raw, err := a.client.Put(BackendApiPath("/news"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusNewsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusNewsVO](raw)
}

// Create a new news
func (a *NewsApi) Create(body sdktypes.PlusNewsForm) (sdktypes.PlusApiResultPlusNewsVO, error) {
    raw, err := a.client.Post(BackendApiPath("/news"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusNewsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusNewsVO](raw)
}

// Get news by page
func (a *NewsApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusNewsVO, error) {
    raw, err := a.client.Post(BackendApiPath("/news/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusNewsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusNewsVO](raw)
}

// Get all news
func (a *NewsApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusNewsVO, error) {
    raw, err := a.client.Post(BackendApiPath("/news/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusNewsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusNewsVO](raw)
}

// Get a news by ID
func (a *NewsApi) GetById(id string) (sdktypes.PlusApiResultPlusNewsVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/news/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusNewsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusNewsVO](raw)
}

// Delete a news
func (a *NewsApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/news/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
