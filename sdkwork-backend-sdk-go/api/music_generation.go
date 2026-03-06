package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type MusicGenerationApi struct {
    client *sdkhttp.Client
}

func NewMusicGenerationApi(client *sdkhttp.Client) *MusicGenerationApi {
    return &MusicGenerationApi{client: client}
}

// Create music generation task
func (a *MusicGenerationApi) Create(body sdktypes.GenerateMusicForm) (sdktypes.PlusApiResultGenerateMusicVO, error) {
    raw, err := a.client.Post(BackendApiPath("/generation/music/create"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultGenerateMusicVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerateMusicVO](raw)
}

// Get music generation result
func (a *MusicGenerationApi) GetResult(taskId string) (sdktypes.PlusApiResultGenerateMusicVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/generation/music/result/%s", taskId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultGenerateMusicVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerateMusicVO](raw)
}
