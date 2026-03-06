package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type ChannelProxyApi struct {
    client *sdkhttp.Client
}

func NewChannelProxyApi(client *sdkhttp.Client) *ChannelProxyApi {
    return &ChannelProxyApi{client: client}
}

// Update channel proxy
func (a *ChannelProxyApi) Update(body sdktypes.PlusChannelProxyForm) (sdktypes.PlusApiResultPlusChannelProxyVO, error) {
    raw, err := a.client.Put(BackendApiPath("/channel/proxy"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusChannelProxyVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusChannelProxyVO](raw)
}

// Create channel proxy
func (a *ChannelProxyApi) Create(body sdktypes.PlusChannelProxyForm) (sdktypes.PlusApiResultPlusChannelProxyVO, error) {
    raw, err := a.client.Post(BackendApiPath("/channel/proxy"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusChannelProxyVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusChannelProxyVO](raw)
}

// List channel proxies by page
func (a *ChannelProxyApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusChannelProxyVO, error) {
    raw, err := a.client.Post(BackendApiPath("/channel/proxy/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusChannelProxyVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusChannelProxyVO](raw)
}

// List all channel proxies
func (a *ChannelProxyApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusChannelProxyVO, error) {
    raw, err := a.client.Post(BackendApiPath("/channel/proxy/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusChannelProxyVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusChannelProxyVO](raw)
}

// Get channel proxy by ID
func (a *ChannelProxyApi) GetById(id string) (sdktypes.PlusApiResultPlusChannelProxyVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/channel/proxy/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusChannelProxyVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusChannelProxyVO](raw)
}

// Delete channel proxy
func (a *ChannelProxyApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/channel/proxy/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
