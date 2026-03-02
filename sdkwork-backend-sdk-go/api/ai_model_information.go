package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type AiModelInformationApi struct {
    client *sdkhttp.Client
}

func NewAiModelInformationApi(client *sdkhttp.Client) *AiModelInformationApi {
    return &AiModelInformationApi{client: client}
}

// Update existing AI model information
func (a *AiModelInformationApi) Update(body sdktypes.PlusAiModelInfoForm) (sdktypes.PlusApiResultPlusAiModelInfoVO, error) {
    raw, err := a.client.Put(BackendApiPath("/model"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAiModelInfoVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAiModelInfoVO](raw)
}

// Create a new AI model information
func (a *AiModelInformationApi) Create(body sdktypes.PlusAiModelInfoForm) (sdktypes.PlusApiResultPlusAiModelInfoVO, error) {
    raw, err := a.client.Post(BackendApiPath("/model"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAiModelInfoVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAiModelInfoVO](raw)
}

// Get AI model information by page
func (a *AiModelInformationApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusAiModelInfoVO, error) {
    raw, err := a.client.Post(BackendApiPath("/model/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusAiModelInfoVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusAiModelInfoVO](raw)
}

// Get all AI model information
func (a *AiModelInformationApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusAiModelInfoVO, error) {
    raw, err := a.client.Post(BackendApiPath("/model/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusAiModelInfoVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusAiModelInfoVO](raw)
}

// Get AI model information by ID
func (a *AiModelInformationApi) GetById(id string) (sdktypes.PlusApiResultPlusAiModelInfoVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/model/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAiModelInfoVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAiModelInfoVO](raw)
}

// Delete AI model information
func (a *AiModelInformationApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/model/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
