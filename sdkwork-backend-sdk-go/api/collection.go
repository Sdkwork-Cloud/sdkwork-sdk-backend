package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type CollectionApi struct {
    client *sdkhttp.Client
}

func NewCollectionApi(client *sdkhttp.Client) *CollectionApi {
    return &CollectionApi{client: client}
}

// Update an existing collection
func (a *CollectionApi) Update(body sdktypes.PlusCollectionForm) (sdktypes.PlusApiResultPlusCollectionVO, error) {
    raw, err := a.client.Put(BackendApiPath("/collection"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusCollectionVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusCollectionVO](raw)
}

// Create a new collection
func (a *CollectionApi) Create(body sdktypes.PlusCollectionForm) (sdktypes.PlusApiResultPlusCollectionVO, error) {
    raw, err := a.client.Post(BackendApiPath("/collection"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusCollectionVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusCollectionVO](raw)
}

// Get collections by page
func (a *CollectionApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusCollectionVO, error) {
    raw, err := a.client.Post(BackendApiPath("/collection/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusCollectionVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusCollectionVO](raw)
}

// Get all collections
func (a *CollectionApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusCollectionVO, error) {
    raw, err := a.client.Post(BackendApiPath("/collection/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusCollectionVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusCollectionVO](raw)
}

// Get a collection by ID
func (a *CollectionApi) GetById(id string) (sdktypes.PlusApiResultPlusCollectionVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/collection/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusCollectionVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusCollectionVO](raw)
}

// Delete a collection
func (a *CollectionApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/collection/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
