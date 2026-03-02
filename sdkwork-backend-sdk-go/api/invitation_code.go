package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type InvitationCodeApi struct {
    client *sdkhttp.Client
}

func NewInvitationCodeApi(client *sdkhttp.Client) *InvitationCodeApi {
    return &InvitationCodeApi{client: client}
}

// Update an existing invitation code
func (a *InvitationCodeApi) Update(body sdktypes.InvitationCodeForm) (sdktypes.PlusApiResultInvitationCodeVO, error) {
    raw, err := a.client.Put(BackendApiPath("/invitation/code"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultInvitationCodeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultInvitationCodeVO](raw)
}

// Create a new invitation code
func (a *InvitationCodeApi) Create(body sdktypes.InvitationCodeForm) (sdktypes.PlusApiResultInvitationCodeVO, error) {
    raw, err := a.client.Post(BackendApiPath("/invitation/code"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultInvitationCodeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultInvitationCodeVO](raw)
}

// Get invitation codes by page
func (a *InvitationCodeApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPageInvitationCodeVO, error) {
    raw, err := a.client.Post(BackendApiPath("/invitation/code/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPageInvitationCodeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageInvitationCodeVO](raw)
}

// Get all invitation codes
func (a *InvitationCodeApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListInvitationCodeVO, error) {
    raw, err := a.client.Post(BackendApiPath("/invitation/code/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListInvitationCodeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListInvitationCodeVO](raw)
}

// Get an invitation code by ID
func (a *InvitationCodeApi) GetById(id string) (sdktypes.PlusApiResultInvitationCodeVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/invitation/code/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultInvitationCodeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultInvitationCodeVO](raw)
}

// Delete an invitation code
func (a *InvitationCodeApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/invitation/code/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
