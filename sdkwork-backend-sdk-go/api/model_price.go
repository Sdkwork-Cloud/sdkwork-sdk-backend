package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type ModelPriceApi struct {
    client *sdkhttp.Client
}

func NewModelPriceApi(client *sdkhttp.Client) *ModelPriceApi {
    return &ModelPriceApi{client: client}
}

// Update an existing AI model price
func (a *ModelPriceApi) Update(body sdktypes.PlusAiModelPriceForm) (sdktypes.PlusApiResultPlusAiModelPriceVO, error) {
    raw, err := a.client.Put(BackendApiPath("/model/price"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAiModelPriceVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAiModelPriceVO](raw)
}

// Create a new AI model price
func (a *ModelPriceApi) Create(body sdktypes.PlusAiModelPriceForm) (sdktypes.PlusApiResultPlusAiModelPriceVO, error) {
    raw, err := a.client.Post(BackendApiPath("/model/price"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAiModelPriceVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAiModelPriceVO](raw)
}

// Get AI model prices by page
func (a *ModelPriceApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusAiModelPriceVO, error) {
    raw, err := a.client.Post(BackendApiPath("/model/price/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusAiModelPriceVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusAiModelPriceVO](raw)
}

// Get all AI model prices
func (a *ModelPriceApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusAiModelPriceVO, error) {
    raw, err := a.client.Post(BackendApiPath("/model/price/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusAiModelPriceVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusAiModelPriceVO](raw)
}

// Get an AI model price by ID
func (a *ModelPriceApi) GetById(id string) (sdktypes.PlusApiResultPlusAiModelPriceVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/model/price/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAiModelPriceVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAiModelPriceVO](raw)
}

// Delete an AI model price
func (a *ModelPriceApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/model/price/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
