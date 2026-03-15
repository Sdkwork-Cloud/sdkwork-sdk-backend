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

// Update an existing channel resource
func (a *ChannelApi) UpdateResource(body sdktypes.PlusChannelResourceForm) (sdktypes.PlusApiResultPlusChannelResourceVO, error) {
    raw, err := a.client.Put(BackendApiPath("/channel/resource"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusChannelResourceVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusChannelResourceVO](raw)
}

// Create a new channel resource
func (a *ChannelApi) CreateResource(body sdktypes.PlusChannelResourceForm) (sdktypes.PlusApiResultPlusChannelResourceVO, error) {
    raw, err := a.client.Post(BackendApiPath("/channel/resource"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusChannelResourceVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusChannelResourceVO](raw)
}

// Update channel proxy
func (a *ChannelApi) UpdateProxy(body sdktypes.PlusChannelProxyForm) (sdktypes.PlusApiResultPlusChannelProxyVO, error) {
    raw, err := a.client.Put(BackendApiPath("/channel/proxy"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusChannelProxyVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusChannelProxyVO](raw)
}

// Create channel proxy
func (a *ChannelApi) CreateProxy(body sdktypes.PlusChannelProxyForm) (sdktypes.PlusApiResultPlusChannelProxyVO, error) {
    raw, err := a.client.Post(BackendApiPath("/channel/proxy"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusChannelProxyVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusChannelProxyVO](raw)
}

// Update channel account
func (a *ChannelApi) UpdateAccount(body sdktypes.PlusChannelAccountForm) (sdktypes.PlusApiResultPlusChannelAccountVO, error) {
    raw, err := a.client.Put(BackendApiPath("/channel/account"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusChannelAccountVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusChannelAccountVO](raw)
}

// Create channel account
func (a *ChannelApi) CreateAccount(body sdktypes.PlusChannelAccountForm) (sdktypes.PlusApiResultPlusChannelAccountVO, error) {
    raw, err := a.client.Post(BackendApiPath("/channel/account"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusChannelAccountVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusChannelAccountVO](raw)
}

// Get channel resources by page
func (a *ChannelApi) CreateListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusChannelResourceVO, error) {
    raw, err := a.client.Post(BackendApiPath("/channel/resource/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusChannelResourceVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusChannelResourceVO](raw)
}

// Get all channel resources
func (a *ChannelApi) CreateListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusChannelResourceVO, error) {
    raw, err := a.client.Post(BackendApiPath("/channel/resource/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusChannelResourceVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusChannelResourceVO](raw)
}

// List channel proxies by page
func (a *ChannelApi) CreateListByPageProxy(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusChannelProxyVO, error) {
    raw, err := a.client.Post(BackendApiPath("/channel/proxy/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusChannelProxyVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusChannelProxyVO](raw)
}

// List all channel proxies
func (a *ChannelApi) CreateListAllEntitiesProxy(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusChannelProxyVO, error) {
    raw, err := a.client.Post(BackendApiPath("/channel/proxy/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusChannelProxyVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusChannelProxyVO](raw)
}

// List channels by page
func (a *ChannelApi) CreateListByPageChannel(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusChannelVO, error) {
    raw, err := a.client.Post(BackendApiPath("/channel/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusChannelVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusChannelVO](raw)
}

// List all channels
func (a *ChannelApi) CreateListAllEntitiesChannel(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusChannelVO, error) {
    raw, err := a.client.Post(BackendApiPath("/channel/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusChannelVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusChannelVO](raw)
}

// Get SMS channel accounts
func (a *ChannelApi) ListSms(body *sdktypes.PlusChannelAccountQueryForm) (sdktypes.PlusApiResultListPlusChannelAccountVO, error) {
    raw, err := a.client.Post(BackendApiPath("/channel/account/list_sms"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusChannelAccountVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusChannelAccountVO](raw)
}

// Get payment channel accounts
func (a *ChannelApi) ListPayment(body *sdktypes.PlusChannelAccountQueryForm) (sdktypes.PlusApiResultListPlusChannelAccountVO, error) {
    raw, err := a.client.Post(BackendApiPath("/channel/account/list_payment"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusChannelAccountVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusChannelAccountVO](raw)
}

// Get OSS channel accounts
func (a *ChannelApi) ListOss(body *sdktypes.PlusChannelAccountQueryForm) (sdktypes.PlusApiResultListPlusChannelAccountVO, error) {
    raw, err := a.client.Post(BackendApiPath("/channel/account/list_oss"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusChannelAccountVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusChannelAccountVO](raw)
}

// Get official account channel accounts
func (a *ChannelApi) ListOfficialAccount(body *sdktypes.PlusChannelAccountQueryForm) (sdktypes.PlusApiResultListPlusChannelAccountVO, error) {
    raw, err := a.client.Post(BackendApiPath("/channel/account/list_official_account"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusChannelAccountVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusChannelAccountVO](raw)
}

// Get mini program channel accounts
func (a *ChannelApi) ListMiniProgram(body *sdktypes.PlusChannelAccountQueryForm) (sdktypes.PlusApiResultListPlusChannelAccountVO, error) {
    raw, err := a.client.Post(BackendApiPath("/channel/account/list_mini_program"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusChannelAccountVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusChannelAccountVO](raw)
}

// Get channel accounts by page
func (a *ChannelApi) CreateListByPageAccount(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusChannelAccountVO, error) {
    raw, err := a.client.Post(BackendApiPath("/channel/account/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusChannelAccountVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusChannelAccountVO](raw)
}

// Get all channel accounts
func (a *ChannelApi) CreateListAllEntitiesAccount(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusChannelAccountVO, error) {
    raw, err := a.client.Post(BackendApiPath("/channel/account/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusChannelAccountVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusChannelAccountVO](raw)
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

// Get a channel resource by ID
func (a *ChannelApi) GetByIdResource(id string) (sdktypes.PlusApiResultPlusChannelResourceVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/channel/resource/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusChannelResourceVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusChannelResourceVO](raw)
}

// Delete a channel resource
func (a *ChannelApi) DeleteResource(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/channel/resource/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Get channel proxy by ID
func (a *ChannelApi) GetByIdProxy(id string) (sdktypes.PlusApiResultPlusChannelProxyVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/channel/proxy/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusChannelProxyVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusChannelProxyVO](raw)
}

// Delete channel proxy
func (a *ChannelApi) DeleteProxy(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/channel/proxy/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Get channel account by ID
func (a *ChannelApi) GetByIdAccount(id string) (sdktypes.PlusApiResultPlusChannelAccountVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/channel/account/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusChannelAccountVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusChannelAccountVO](raw)
}

// Delete channel account
func (a *ChannelApi) DeleteAccount(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/channel/account/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
