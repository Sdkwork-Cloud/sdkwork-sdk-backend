package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type MusicApi struct {
    client *sdkhttp.Client
}

func NewMusicApi(client *sdkhttp.Client) *MusicApi {
    return &MusicApi{client: client}
}

// Update music
func (a *MusicApi) Update(body sdktypes.PlusMusicForm) (sdktypes.PlusApiResultPlusMusicVO, error) {
    raw, err := a.client.Put(BackendApiPath("/music"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusMusicVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusMusicVO](raw)
}

// Create new music
func (a *MusicApi) Create(body sdktypes.PlusMusicForm) (sdktypes.PlusApiResultPlusMusicVO, error) {
    raw, err := a.client.Post(BackendApiPath("/music"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusMusicVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusMusicVO](raw)
}

// Get music records by page
func (a *MusicApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusMusicVO, error) {
    raw, err := a.client.Post(BackendApiPath("/music/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusMusicVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusMusicVO](raw)
}

// Get all music records
func (a *MusicApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusMusicVO, error) {
    raw, err := a.client.Post(BackendApiPath("/music/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusMusicVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusMusicVO](raw)
}

// Get music by ID
func (a *MusicApi) GetById(id string) (sdktypes.PlusApiResultPlusMusicVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/music/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusMusicVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusMusicVO](raw)
}

// Delete music
func (a *MusicApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/music/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
