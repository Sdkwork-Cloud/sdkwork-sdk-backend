package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type ChannelAccountApi struct {
    client *sdkhttp.Client
}

func NewChannelAccountApi(client *sdkhttp.Client) *ChannelAccountApi {
    return &ChannelAccountApi{client: client}
}

// Update channel account
func (a *ChannelAccountApi) Update(body sdktypes.PlusChannelAccountForm) (sdktypes.PlusApiResultPlusChannelAccountVO, error) {
    raw, err := a.client.Put(BackendApiPath("/channel/account"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusChannelAccountVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusChannelAccountVO](raw)
}

// Create channel account
func (a *ChannelAccountApi) Create(body sdktypes.PlusChannelAccountForm) (sdktypes.PlusApiResultPlusChannelAccountVO, error) {
    raw, err := a.client.Post(BackendApiPath("/channel/account"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusChannelAccountVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusChannelAccountVO](raw)
}

// Get SMS channel accounts
func (a *ChannelAccountApi) ListSms(body *sdktypes.PlusChannelAccountQueryForm) (sdktypes.PlusApiResultListPlusChannelAccountVO, error) {
    raw, err := a.client.Post(BackendApiPath("/channel/account/list_sms"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusChannelAccountVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusChannelAccountVO](raw)
}

// Get payment channel accounts
func (a *ChannelAccountApi) ListPayment(body *sdktypes.PlusChannelAccountQueryForm) (sdktypes.PlusApiResultListPlusChannelAccountVO, error) {
    raw, err := a.client.Post(BackendApiPath("/channel/account/list_payment"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusChannelAccountVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusChannelAccountVO](raw)
}

// Get OSS channel accounts
func (a *ChannelAccountApi) ListOss(body *sdktypes.PlusChannelAccountQueryForm) (sdktypes.PlusApiResultListPlusChannelAccountVO, error) {
    raw, err := a.client.Post(BackendApiPath("/channel/account/list_oss"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusChannelAccountVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusChannelAccountVO](raw)
}

// Get official account channel accounts
func (a *ChannelAccountApi) ListOfficialAccount(body *sdktypes.PlusChannelAccountQueryForm) (sdktypes.PlusApiResultListPlusChannelAccountVO, error) {
    raw, err := a.client.Post(BackendApiPath("/channel/account/list_official_account"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusChannelAccountVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusChannelAccountVO](raw)
}

// Get mini program channel accounts
func (a *ChannelAccountApi) ListMiniProgram(body *sdktypes.PlusChannelAccountQueryForm) (sdktypes.PlusApiResultListPlusChannelAccountVO, error) {
    raw, err := a.client.Post(BackendApiPath("/channel/account/list_mini_program"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusChannelAccountVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusChannelAccountVO](raw)
}

// Get channel accounts by page
func (a *ChannelAccountApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusChannelAccountVO, error) {
    raw, err := a.client.Post(BackendApiPath("/channel/account/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusChannelAccountVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusChannelAccountVO](raw)
}

// Get all channel accounts
func (a *ChannelAccountApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusChannelAccountVO, error) {
    raw, err := a.client.Post(BackendApiPath("/channel/account/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusChannelAccountVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusChannelAccountVO](raw)
}

// Get channel account by ID
func (a *ChannelAccountApi) GetById(id string) (sdktypes.PlusApiResultPlusChannelAccountVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/channel/account/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusChannelAccountVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusChannelAccountVO](raw)
}

// Delete channel account
func (a *ChannelAccountApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/channel/account/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
