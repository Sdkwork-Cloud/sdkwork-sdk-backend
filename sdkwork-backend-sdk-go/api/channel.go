package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type ChannelApi struct {
    client *sdkhttp.Client
}

func NewChannelApi(client *sdkhttp.Client) *ChannelApi {
    return &ChannelApi{client: client}
}

// Update channel
func (a *ChannelApi) Update(body sdktypes.PlusChannelForm) (sdktypes.PlusApiResultPlusChannelVO, error) {
    raw, err := a.client.Put(BackendApiPath("/channel"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusChannelVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusChannelVO](raw)
}

// Create channel
func (a *ChannelApi) Create(body sdktypes.PlusChannelForm) (sdktypes.PlusApiResultPlusChannelVO, error) {
    raw, err := a.client.Post(BackendApiPath("/channel"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusChannelVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusChannelVO](raw)
}

// List channels by page
func (a *ChannelApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusChannelVO, error) {
    raw, err := a.client.Post(BackendApiPath("/channel/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusChannelVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusChannelVO](raw)
}

// List all channels
func (a *ChannelApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusChannelVO, error) {
    raw, err := a.client.Post(BackendApiPath("/channel/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusChannelVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusChannelVO](raw)
}

// Get channel by ID
func (a *ChannelApi) GetById(id string) (sdktypes.PlusApiResultPlusChannelVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/channel/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusChannelVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusChannelVO](raw)
}

// Delete channel
func (a *ChannelApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/channel/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
