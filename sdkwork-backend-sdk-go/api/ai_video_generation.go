package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type AiVideoGenerationApi struct {
    client *sdkhttp.Client
}

func NewAiVideoGenerationApi(client *sdkhttp.Client) *AiVideoGenerationApi {
    return &AiVideoGenerationApi{client: client}
}

// Create video generation task
func (a *AiVideoGenerationApi) Create(body sdktypes.GenerateVideoForm) (sdktypes.PlusApiResultGenerateVideoVO, error) {
    raw, err := a.client.Post(BackendApiPath("/generation/video/create"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultGenerateVideoVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerateVideoVO](raw)
}

// Get video generation result
func (a *AiVideoGenerationApi) GetResult(taskId string) (sdktypes.PlusApiResultGenerateVideoVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/generation/video/result/%s", taskId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultGenerateVideoVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerateVideoVO](raw)
}
