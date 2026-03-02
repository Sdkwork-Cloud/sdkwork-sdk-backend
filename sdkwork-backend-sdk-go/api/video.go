package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type VideoApi struct {
    client *sdkhttp.Client
}

func NewVideoApi(client *sdkhttp.Client) *VideoApi {
    return &VideoApi{client: client}
}

// Update an existing video
func (a *VideoApi) Update(body sdktypes.PlusVideoForm) (sdktypes.PlusApiResultPlusVideoVO, error) {
    raw, err := a.client.Put(BackendApiPath("/video"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVideoVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVideoVO](raw)
}

// Create a new video
func (a *VideoApi) Create(body sdktypes.PlusVideoForm) (sdktypes.PlusApiResultPlusVideoVO, error) {
    raw, err := a.client.Post(BackendApiPath("/video"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVideoVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVideoVO](raw)
}

// Get videos by page
func (a *VideoApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusVideoVO, error) {
    raw, err := a.client.Post(BackendApiPath("/video/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusVideoVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusVideoVO](raw)
}

// Get all videos
func (a *VideoApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusVideoVO, error) {
    raw, err := a.client.Post(BackendApiPath("/video/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusVideoVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusVideoVO](raw)
}

// Get a video by ID
func (a *VideoApi) GetById(id string) (sdktypes.PlusApiResultPlusVideoVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/video/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVideoVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVideoVO](raw)
}

// Delete a video
func (a *VideoApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/video/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
