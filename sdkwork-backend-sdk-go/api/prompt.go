package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type PromptApi struct {
    client *sdkhttp.Client
}

func NewPromptApi(client *sdkhttp.Client) *PromptApi {
    return &PromptApi{client: client}
}

// Update an existing AI prompt
func (a *PromptApi) Update(body sdktypes.PlusAiPromptForm) (sdktypes.PlusApiResultPlusAiPromptVO, error) {
    raw, err := a.client.Put(BackendApiPath("/prompt"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAiPromptVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAiPromptVO](raw)
}

// Create a new AI prompt
func (a *PromptApi) Create(body sdktypes.PlusAiPromptForm) (sdktypes.PlusApiResultPlusAiPromptVO, error) {
    raw, err := a.client.Post(BackendApiPath("/prompt"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAiPromptVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAiPromptVO](raw)
}

// Get AI prompts by page
func (a *PromptApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusAiPromptVO, error) {
    raw, err := a.client.Post(BackendApiPath("/prompt/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusAiPromptVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusAiPromptVO](raw)
}

// Get all AI prompts
func (a *PromptApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusAiPromptVO, error) {
    raw, err := a.client.Post(BackendApiPath("/prompt/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusAiPromptVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusAiPromptVO](raw)
}

// Get an AI prompt by ID
func (a *PromptApi) GetById(id string) (sdktypes.PlusApiResultPlusAiPromptVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/prompt/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAiPromptVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAiPromptVO](raw)
}

// Delete an AI prompt
func (a *PromptApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/prompt/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
