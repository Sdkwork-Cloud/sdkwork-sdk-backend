package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type FavoriteApi struct {
    client *sdkhttp.Client
}

func NewFavoriteApi(client *sdkhttp.Client) *FavoriteApi {
    return &FavoriteApi{client: client}
}

// Update an existing favorite
func (a *FavoriteApi) Update(body sdktypes.PlusFavoriteForm) (sdktypes.PlusApiResultPlusFavoriteVO, error) {
    raw, err := a.client.Put(BackendApiPath("/favorite"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusFavoriteVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusFavoriteVO](raw)
}

// Create a new favorite
func (a *FavoriteApi) Create(body sdktypes.PlusFavoriteForm) (sdktypes.PlusApiResultPlusFavoriteVO, error) {
    raw, err := a.client.Post(BackendApiPath("/favorite"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusFavoriteVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusFavoriteVO](raw)
}

// Get favorites by page
func (a *FavoriteApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusFavoriteVO, error) {
    raw, err := a.client.Post(BackendApiPath("/favorite/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusFavoriteVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusFavoriteVO](raw)
}

// Get all favorites
func (a *FavoriteApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusFavoriteVO, error) {
    raw, err := a.client.Post(BackendApiPath("/favorite/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusFavoriteVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusFavoriteVO](raw)
}

// Get a favorite by ID
func (a *FavoriteApi) GetById(id string) (sdktypes.PlusApiResultPlusFavoriteVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/favorite/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusFavoriteVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusFavoriteVO](raw)
}

// Delete a favorite
func (a *FavoriteApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/favorite/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
