package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type AiAudioEffectGenerationApi struct {
    client *sdkhttp.Client
}

func NewAiAudioEffectGenerationApi(client *sdkhttp.Client) *AiAudioEffectGenerationApi {
    return &AiAudioEffectGenerationApi{client: client}
}

// Create audio effect generation task
func (a *AiAudioEffectGenerationApi) Create(body sdktypes.GenerateAudioEffectForm) (sdktypes.PlusApiResultGenerateAudioEffectVO, error) {
    raw, err := a.client.Post(BackendApiPath("/generation/audio-effect/create"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultGenerateAudioEffectVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerateAudioEffectVO](raw)
}

// Get audio effect generation result
func (a *AiAudioEffectGenerationApi) GetResult(taskId string) (sdktypes.PlusApiResultGenerateAudioEffectVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/generation/audio-effect/result/%s", taskId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultGenerateAudioEffectVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerateAudioEffectVO](raw)
}
