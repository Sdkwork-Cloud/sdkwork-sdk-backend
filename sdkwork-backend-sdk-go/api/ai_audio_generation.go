package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type AiAudioGenerationApi struct {
    client *sdkhttp.Client
}

func NewAiAudioGenerationApi(client *sdkhttp.Client) *AiAudioGenerationApi {
    return &AiAudioGenerationApi{client: client}
}

// Create audio generation task
func (a *AiAudioGenerationApi) Create(body sdktypes.GenerateAudioForm) (sdktypes.PlusApiResultGenerateAudioVO, error) {
    raw, err := a.client.Post(BackendApiPath("/generation/audio/create"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultGenerateAudioVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerateAudioVO](raw)
}

// Get audio generation result
func (a *AiAudioGenerationApi) GetResult(taskId string) (sdktypes.PlusApiResultGenerateAudioVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/generation/audio/result/%s", taskId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultGenerateAudioVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerateAudioVO](raw)
}
