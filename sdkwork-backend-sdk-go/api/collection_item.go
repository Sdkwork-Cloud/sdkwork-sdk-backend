package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type CollectionItemApi struct {
    client *sdkhttp.Client
}

func NewCollectionItemApi(client *sdkhttp.Client) *CollectionItemApi {
    return &CollectionItemApi{client: client}
}

// Update an existing collection item
func (a *CollectionItemApi) Update(body sdktypes.PlusCollectionItemForm) (sdktypes.PlusApiResultPlusCollectionItemVO, error) {
    raw, err := a.client.Put(BackendApiPath("/collection-item"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusCollectionItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusCollectionItemVO](raw)
}

// Create a new collection item
func (a *CollectionItemApi) Create(body sdktypes.PlusCollectionItemForm) (sdktypes.PlusApiResultPlusCollectionItemVO, error) {
    raw, err := a.client.Post(BackendApiPath("/collection-item"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusCollectionItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusCollectionItemVO](raw)
}

// Get collection items by page
func (a *CollectionItemApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusCollectionItemVO, error) {
    raw, err := a.client.Post(BackendApiPath("/collection-item/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusCollectionItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusCollectionItemVO](raw)
}

// Get all collection items
func (a *CollectionItemApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusCollectionItemVO, error) {
    raw, err := a.client.Post(BackendApiPath("/collection-item/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusCollectionItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusCollectionItemVO](raw)
}

// Get a collection item by ID
func (a *CollectionItemApi) GetById(id string) (sdktypes.PlusApiResultPlusCollectionItemVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/collection-item/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusCollectionItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusCollectionItemVO](raw)
}

// Delete a collection item
func (a *CollectionItemApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/collection-item/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
