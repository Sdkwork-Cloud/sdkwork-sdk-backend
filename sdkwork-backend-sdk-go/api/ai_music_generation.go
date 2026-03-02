package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type AiMusicGenerationApi struct {
    client *sdkhttp.Client
}

func NewAiMusicGenerationApi(client *sdkhttp.Client) *AiMusicGenerationApi {
    return &AiMusicGenerationApi{client: client}
}

// Create music generation task
func (a *AiMusicGenerationApi) Create(body sdktypes.GenerateMusicForm) (sdktypes.PlusApiResultGenerateMusicVO, error) {
    raw, err := a.client.Post(BackendApiPath("/generation/music/create"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultGenerateMusicVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerateMusicVO](raw)
}

// Get music generation result
func (a *AiMusicGenerationApi) GetResult(taskId string) (sdktypes.PlusApiResultGenerateMusicVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/generation/music/result/%s", taskId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultGenerateMusicVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerateMusicVO](raw)
}
