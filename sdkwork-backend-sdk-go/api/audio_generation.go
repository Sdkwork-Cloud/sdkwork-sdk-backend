package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type AudioGenerationApi struct {
    client *sdkhttp.Client
}

func NewAudioGenerationApi(client *sdkhttp.Client) *AudioGenerationApi {
    return &AudioGenerationApi{client: client}
}

// Create audio generation task
func (a *AudioGenerationApi) Create(body sdktypes.GenerateAudioForm) (sdktypes.PlusApiResultGenerateAudioVO, error) {
    raw, err := a.client.Post(BackendApiPath("/generation/audio/create"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultGenerateAudioVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerateAudioVO](raw)
}

// Get audio generation result
func (a *AudioGenerationApi) GetResult(taskId string) (sdktypes.PlusApiResultGenerateAudioVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/generation/audio/result/%s", taskId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultGenerateAudioVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerateAudioVO](raw)
}
