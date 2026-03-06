package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type ModelInformationApi struct {
    client *sdkhttp.Client
}

func NewModelInformationApi(client *sdkhttp.Client) *ModelInformationApi {
    return &ModelInformationApi{client: client}
}

// Update existing AI model information
func (a *ModelInformationApi) Update(body sdktypes.PlusAiModelInfoForm) (sdktypes.PlusApiResultPlusAiModelInfoVO, error) {
    raw, err := a.client.Put(BackendApiPath("/model"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAiModelInfoVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAiModelInfoVO](raw)
}

// Create a new AI model information
func (a *ModelInformationApi) Create(body sdktypes.PlusAiModelInfoForm) (sdktypes.PlusApiResultPlusAiModelInfoVO, error) {
    raw, err := a.client.Post(BackendApiPath("/model"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAiModelInfoVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAiModelInfoVO](raw)
}

// Get AI model information by page
func (a *ModelInformationApi) ListByPage(body *sdktypes.PlusAiModelInfoQueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusAiModelInfoVO, error) {
    raw, err := a.client.Post(BackendApiPath("/model/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusAiModelInfoVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusAiModelInfoVO](raw)
}

// Get all AI model information
func (a *ModelInformationApi) ListAllEntities(body *sdktypes.PlusAiModelInfoQueryListForm) (sdktypes.PlusApiResultListPlusAiModelInfoVO, error) {
    raw, err := a.client.Post(BackendApiPath("/model/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusAiModelInfoVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusAiModelInfoVO](raw)
}

// Get AI model information by ID
func (a *ModelInformationApi) GetById(id string) (sdktypes.PlusApiResultPlusAiModelInfoVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/model/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAiModelInfoVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAiModelInfoVO](raw)
}

// Delete AI model information
func (a *ModelInformationApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/model/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
