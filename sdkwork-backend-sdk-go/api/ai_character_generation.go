package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type AiCharacterGenerationApi struct {
    client *sdkhttp.Client
}

func NewAiCharacterGenerationApi(client *sdkhttp.Client) *AiCharacterGenerationApi {
    return &AiCharacterGenerationApi{client: client}
}

// Create character generation task
func (a *AiCharacterGenerationApi) Create(body sdktypes.GenerateCharacterForm) (sdktypes.PlusApiResultGenerateCharacterVO, error) {
    raw, err := a.client.Post(BackendApiPath("/generation/character/create"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultGenerateCharacterVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerateCharacterVO](raw)
}

// Get character generation result
func (a *AiCharacterGenerationApi) GetResult(taskId string) (sdktypes.PlusApiResultGenerateCharacterVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/generation/character/result/%s", taskId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultGenerateCharacterVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerateCharacterVO](raw)
}
