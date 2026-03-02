package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type ShortUrlApi struct {
    client *sdkhttp.Client
}

func NewShortUrlApi(client *sdkhttp.Client) *ShortUrlApi {
    return &ShortUrlApi{client: client}
}

// Update short URL
func (a *ShortUrlApi) Update(body sdktypes.ShortUrlForm) (sdktypes.PlusApiResultShortUrlVO, error) {
    raw, err := a.client.Put(BackendApiPath("/short_url"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultShortUrlVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultShortUrlVO](raw)
}

// Create short URL
func (a *ShortUrlApi) Create(body sdktypes.ShortUrlForm) (sdktypes.PlusApiResultShortUrlVO, error) {
    raw, err := a.client.Post(BackendApiPath("/short_url"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultShortUrlVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultShortUrlVO](raw)
}

// Get short URLs by page
func (a *ShortUrlApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPageShortUrlVO, error) {
    raw, err := a.client.Post(BackendApiPath("/short_url/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPageShortUrlVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageShortUrlVO](raw)
}

// Get all short URLs
func (a *ShortUrlApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListShortUrlVO, error) {
    raw, err := a.client.Post(BackendApiPath("/short_url/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListShortUrlVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListShortUrlVO](raw)
}

// Get short URL details
func (a *ShortUrlApi) GetById(id string) (sdktypes.PlusApiResultShortUrlVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/short_url/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultShortUrlVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultShortUrlVO](raw)
}

// Delete short URL
func (a *ShortUrlApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/short_url/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
