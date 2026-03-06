package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type CharacterGenerationApi struct {
    client *sdkhttp.Client
}

func NewCharacterGenerationApi(client *sdkhttp.Client) *CharacterGenerationApi {
    return &CharacterGenerationApi{client: client}
}

// Create character generation task
func (a *CharacterGenerationApi) Create(body sdktypes.GenerateCharacterForm) (sdktypes.PlusApiResultGenerateCharacterVO, error) {
    raw, err := a.client.Post(BackendApiPath("/generation/character/create"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultGenerateCharacterVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerateCharacterVO](raw)
}

// Get character generation result
func (a *CharacterGenerationApi) GetResult(taskId string) (sdktypes.PlusApiResultGenerateCharacterVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/generation/character/result/%s", taskId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultGenerateCharacterVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerateCharacterVO](raw)
}
