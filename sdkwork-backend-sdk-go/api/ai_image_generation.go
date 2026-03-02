package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type AiImageGenerationApi struct {
    client *sdkhttp.Client
}

func NewAiImageGenerationApi(client *sdkhttp.Client) *AiImageGenerationApi {
    return &AiImageGenerationApi{client: client}
}

// Create image generation task
func (a *AiImageGenerationApi) Create(body sdktypes.GenerateImageForm) (sdktypes.PlusApiResultGenerateImageVO, error) {
    raw, err := a.client.Post(BackendApiPath("/generation/image/create"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultGenerateImageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerateImageVO](raw)
}

// Get image generation result
func (a *AiImageGenerationApi) GetResult(taskId string) (sdktypes.PlusApiResultGenerateImageVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/generation/image/result/%s", taskId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultGenerateImageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerateImageVO](raw)
}
