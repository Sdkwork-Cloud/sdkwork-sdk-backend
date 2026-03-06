package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type GenerationApi struct {
    client *sdkhttp.Client
}

func NewGenerationApi(client *sdkhttp.Client) *GenerationApi {
    return &GenerationApi{client: client}
}

// Update an existing AI generation record
func (a *GenerationApi) Update(body sdktypes.PlusAiGenerationForm) (sdktypes.PlusApiResultPlusAiGenerationVO, error) {
    raw, err := a.client.Put(BackendApiPath("/generation"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAiGenerationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAiGenerationVO](raw)
}

// Create a new AI generation record
func (a *GenerationApi) Create(body sdktypes.PlusAiGenerationForm) (sdktypes.PlusApiResultPlusAiGenerationVO, error) {
    raw, err := a.client.Post(BackendApiPath("/generation"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAiGenerationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAiGenerationVO](raw)
}

// Get AI generation records by page
func (a *GenerationApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusAiGenerationVO, error) {
    raw, err := a.client.Post(BackendApiPath("/generation/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusAiGenerationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusAiGenerationVO](raw)
}

// Get all AI generation records
func (a *GenerationApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusAiGenerationVO, error) {
    raw, err := a.client.Post(BackendApiPath("/generation/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusAiGenerationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusAiGenerationVO](raw)
}

// Get an AI generation record by ID
func (a *GenerationApi) GetById(id string) (sdktypes.PlusApiResultPlusAiGenerationVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/generation/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAiGenerationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAiGenerationVO](raw)
}

// Delete an AI generation record
func (a *GenerationApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/generation/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
