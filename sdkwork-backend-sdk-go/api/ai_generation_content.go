package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type AiGenerationContentApi struct {
    client *sdkhttp.Client
}

func NewAiGenerationContentApi(client *sdkhttp.Client) *AiGenerationContentApi {
    return &AiGenerationContentApi{client: client}
}

// Update AI generated content
func (a *AiGenerationContentApi) Update(body sdktypes.PlusAiGenerationContentForm) (sdktypes.PlusApiResultPlusAiGenerationContentVO, error) {
    raw, err := a.client.Put(BackendApiPath("/generation/content"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAiGenerationContentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAiGenerationContentVO](raw)
}

// Create new AI generated content
func (a *AiGenerationContentApi) Create(body sdktypes.PlusAiGenerationContentForm) (sdktypes.PlusApiResultPlusAiGenerationContentVO, error) {
    raw, err := a.client.Post(BackendApiPath("/generation/content"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAiGenerationContentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAiGenerationContentVO](raw)
}

// Get AI generated content by page
func (a *AiGenerationContentApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusAiGenerationContentVO, error) {
    raw, err := a.client.Post(BackendApiPath("/generation/content/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusAiGenerationContentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusAiGenerationContentVO](raw)
}

// Get all AI generated content
func (a *AiGenerationContentApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusAiGenerationContentVO, error) {
    raw, err := a.client.Post(BackendApiPath("/generation/content/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusAiGenerationContentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusAiGenerationContentVO](raw)
}

// Get AI generated content by ID
func (a *AiGenerationContentApi) GetById(id string) (sdktypes.PlusApiResultPlusAiGenerationContentVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/generation/content/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAiGenerationContentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAiGenerationContentVO](raw)
}

// Delete AI generated content
func (a *AiGenerationContentApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/generation/content/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
