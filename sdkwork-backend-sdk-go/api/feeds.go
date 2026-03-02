package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type FeedsApi struct {
    client *sdkhttp.Client
}

func NewFeedsApi(client *sdkhttp.Client) *FeedsApi {
    return &FeedsApi{client: client}
}

// Update an existing feeds entry
func (a *FeedsApi) Update(body sdktypes.PlusFeedsForm) (sdktypes.PlusApiResultPlusFeedsVO, error) {
    raw, err := a.client.Put(BackendApiPath("/feeds"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusFeedsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusFeedsVO](raw)
}

// Create a new feeds entry
func (a *FeedsApi) Create(body sdktypes.PlusFeedsForm) (sdktypes.PlusApiResultPlusFeedsVO, error) {
    raw, err := a.client.Post(BackendApiPath("/feeds"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusFeedsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusFeedsVO](raw)
}

// Get feeds entries by page
func (a *FeedsApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusFeedsVO, error) {
    raw, err := a.client.Post(BackendApiPath("/feeds/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusFeedsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusFeedsVO](raw)
}

// Get all feeds entries
func (a *FeedsApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusFeedsVO, error) {
    raw, err := a.client.Post(BackendApiPath("/feeds/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusFeedsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusFeedsVO](raw)
}

// Get a feeds entry by ID
func (a *FeedsApi) GetById(id string) (sdktypes.PlusApiResultPlusFeedsVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/feeds/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusFeedsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusFeedsVO](raw)
}

// Delete a feeds entry
func (a *FeedsApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/feeds/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
