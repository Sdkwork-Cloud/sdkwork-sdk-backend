package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type AiVoiceSpeakerGenerationApi struct {
    client *sdkhttp.Client
}

func NewAiVoiceSpeakerGenerationApi(client *sdkhttp.Client) *AiVoiceSpeakerGenerationApi {
    return &AiVoiceSpeakerGenerationApi{client: client}
}

// Create voice speaker generation task
func (a *AiVoiceSpeakerGenerationApi) Create(body sdktypes.GenerateVoiceSpeakerForm) (sdktypes.PlusApiResultGenerateVoiceSpeakerVO, error) {
    raw, err := a.client.Post(BackendApiPath("/generation/voice-speaker/create"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultGenerateVoiceSpeakerVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerateVoiceSpeakerVO](raw)
}

// Get voice speaker generation result
func (a *AiVoiceSpeakerGenerationApi) GetResultByTaskId(taskId string) (sdktypes.PlusApiResultGenerateVoiceSpeakerVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/generation/voice-speaker/result/%s", taskId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultGenerateVoiceSpeakerVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerateVoiceSpeakerVO](raw)
}
