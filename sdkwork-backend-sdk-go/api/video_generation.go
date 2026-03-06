package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type VideoGenerationApi struct {
    client *sdkhttp.Client
}

func NewVideoGenerationApi(client *sdkhttp.Client) *VideoGenerationApi {
    return &VideoGenerationApi{client: client}
}

// Create video generation task
func (a *VideoGenerationApi) Create(body sdktypes.GenerateVideoForm) (sdktypes.PlusApiResultGenerateVideoVO, error) {
    raw, err := a.client.Post(BackendApiPath("/generation/video/create"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultGenerateVideoVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerateVideoVO](raw)
}

// Get video generation result
func (a *VideoGenerationApi) GetResult(taskId string) (sdktypes.PlusApiResultGenerateVideoVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/generation/video/result/%s", taskId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultGenerateVideoVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerateVideoVO](raw)
}
