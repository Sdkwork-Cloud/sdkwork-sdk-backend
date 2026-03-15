package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type ModelApi struct {
    client *sdkhttp.Client
}

func NewModelApi(client *sdkhttp.Client) *ModelApi {
    return &ModelApi{client: client}
}

// Update existing AI model information
func (a *ModelApi) Update(body sdktypes.PlusAiModelInfoForm) (sdktypes.PlusApiResultPlusAiModelInfoVO, error) {
    raw, err := a.client.Put(BackendApiPath("/model"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAiModelInfoVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAiModelInfoVO](raw)
}

// Create a new AI model information
func (a *ModelApi) Create(body sdktypes.PlusAiModelInfoForm) (sdktypes.PlusApiResultPlusAiModelInfoVO, error) {
    raw, err := a.client.Post(BackendApiPath("/model"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAiModelInfoVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAiModelInfoVO](raw)
}

// Update an existing AI model price
func (a *ModelApi) UpdatePrice(body sdktypes.PlusAiModelPriceForm) (sdktypes.PlusApiResultPlusAiModelPriceVO, error) {
    raw, err := a.client.Put(BackendApiPath("/model/price"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAiModelPriceVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAiModelPriceVO](raw)
}

// Create a new AI model price
func (a *ModelApi) CreatePrice(body sdktypes.PlusAiModelPriceForm) (sdktypes.PlusApiResultPlusAiModelPriceVO, error) {
    raw, err := a.client.Post(BackendApiPath("/model/price"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAiModelPriceVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAiModelPriceVO](raw)
}

// Get AI model prices by page
func (a *ModelApi) CreateListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusAiModelPriceVO, error) {
    raw, err := a.client.Post(BackendApiPath("/model/price/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusAiModelPriceVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusAiModelPriceVO](raw)
}

// Get all AI model prices
func (a *ModelApi) CreateListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusAiModelPriceVO, error) {
    raw, err := a.client.Post(BackendApiPath("/model/price/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusAiModelPriceVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusAiModelPriceVO](raw)
}

// Get AI model information by page
func (a *ModelApi) CreateListByPageModel(body *sdktypes.PlusAiModelInfoQueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusAiModelInfoVO, error) {
    raw, err := a.client.Post(BackendApiPath("/model/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusAiModelInfoVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusAiModelInfoVO](raw)
}

// Get all AI model information
func (a *ModelApi) CreateListAllEntitiesModel(body *sdktypes.PlusAiModelInfoQueryListForm) (sdktypes.PlusApiResultListPlusAiModelInfoVO, error) {
    raw, err := a.client.Post(BackendApiPath("/model/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusAiModelInfoVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusAiModelInfoVO](raw)
}

// Get AI model information by ID
func (a *ModelApi) GetById(id string) (sdktypes.PlusApiResultPlusAiModelInfoVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/model/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAiModelInfoVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAiModelInfoVO](raw)
}

// Delete AI model information
func (a *ModelApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/model/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Get an AI model price by ID
func (a *ModelApi) GetByIdPrice(id string) (sdktypes.PlusApiResultPlusAiModelPriceVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/model/price/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAiModelPriceVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAiModelPriceVO](raw)
}

// Delete an AI model price
func (a *ModelApi) DeletePrice(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/model/price/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
