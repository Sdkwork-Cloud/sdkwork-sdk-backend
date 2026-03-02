package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type ChannelResourceApi struct {
    client *sdkhttp.Client
}

func NewChannelResourceApi(client *sdkhttp.Client) *ChannelResourceApi {
    return &ChannelResourceApi{client: client}
}

// Update an existing channel resource
func (a *ChannelResourceApi) Update(body sdktypes.PlusChannelResourceForm) (sdktypes.PlusApiResultPlusChannelResourceVO, error) {
    raw, err := a.client.Put(BackendApiPath("/channel/resource"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusChannelResourceVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusChannelResourceVO](raw)
}

// Create a new channel resource
func (a *ChannelResourceApi) Create(body sdktypes.PlusChannelResourceForm) (sdktypes.PlusApiResultPlusChannelResourceVO, error) {
    raw, err := a.client.Post(BackendApiPath("/channel/resource"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusChannelResourceVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusChannelResourceVO](raw)
}

// Get channel resources by page
func (a *ChannelResourceApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusChannelResourceVO, error) {
    raw, err := a.client.Post(BackendApiPath("/channel/resource/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusChannelResourceVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusChannelResourceVO](raw)
}

// Get all channel resources
func (a *ChannelResourceApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusChannelResourceVO, error) {
    raw, err := a.client.Post(BackendApiPath("/channel/resource/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusChannelResourceVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusChannelResourceVO](raw)
}

// Get a channel resource by ID
func (a *ChannelResourceApi) GetById(id string) (sdktypes.PlusApiResultPlusChannelResourceVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/channel/resource/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusChannelResourceVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusChannelResourceVO](raw)
}

// Delete a channel resource
func (a *ChannelResourceApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/channel/resource/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
