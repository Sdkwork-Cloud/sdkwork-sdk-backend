package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type InvitationApi struct {
    client *sdkhttp.Client
}

func NewInvitationApi(client *sdkhttp.Client) *InvitationApi {
    return &InvitationApi{client: client}
}

// Update an invitation relation
func (a *InvitationApi) Update(body sdktypes.InvitationRelationForm) (sdktypes.PlusApiResultInvitationRelationVO, error) {
    raw, err := a.client.Put(BackendApiPath("/invitation/relation"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultInvitationRelationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultInvitationRelationVO](raw)
}

// Create a new invitation relation
func (a *InvitationApi) Create(body sdktypes.InvitationRelationForm) (sdktypes.PlusApiResultInvitationRelationVO, error) {
    raw, err := a.client.Post(BackendApiPath("/invitation/relation"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultInvitationRelationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultInvitationRelationVO](raw)
}

// Update an existing invitation code
func (a *InvitationApi) UpdateCode(body sdktypes.InvitationCodeForm) (sdktypes.PlusApiResultInvitationCodeVO, error) {
    raw, err := a.client.Put(BackendApiPath("/invitation/code"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultInvitationCodeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultInvitationCodeVO](raw)
}

// Create a new invitation code
func (a *InvitationApi) CreateCode(body sdktypes.InvitationCodeForm) (sdktypes.PlusApiResultInvitationCodeVO, error) {
    raw, err := a.client.Post(BackendApiPath("/invitation/code"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultInvitationCodeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultInvitationCodeVO](raw)
}

// Get invitation relations by page
func (a *InvitationApi) CreateListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPageInvitationRelationVO, error) {
    raw, err := a.client.Post(BackendApiPath("/invitation/relation/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPageInvitationRelationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageInvitationRelationVO](raw)
}

// Get all invitation relations
func (a *InvitationApi) CreateListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListInvitationRelationVO, error) {
    raw, err := a.client.Post(BackendApiPath("/invitation/relation/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListInvitationRelationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListInvitationRelationVO](raw)
}

// Get invitation codes by page
func (a *InvitationApi) CreateListByPageCode(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPageInvitationCodeVO, error) {
    raw, err := a.client.Post(BackendApiPath("/invitation/code/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPageInvitationCodeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageInvitationCodeVO](raw)
}

// Get all invitation codes
func (a *InvitationApi) CreateListAllEntitiesCode(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListInvitationCodeVO, error) {
    raw, err := a.client.Post(BackendApiPath("/invitation/code/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListInvitationCodeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListInvitationCodeVO](raw)
}

// Get an invitation relation by ID
func (a *InvitationApi) GetById(id string) (sdktypes.PlusApiResultInvitationRelationVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/invitation/relation/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultInvitationRelationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultInvitationRelationVO](raw)
}

// Delete an invitation relation
func (a *InvitationApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/invitation/relation/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Get an invitation code by ID
func (a *InvitationApi) GetByIdCode(id string) (sdktypes.PlusApiResultInvitationCodeVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/invitation/code/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultInvitationCodeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultInvitationCodeVO](raw)
}

// Delete an invitation code
func (a *InvitationApi) DeleteCode(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/invitation/code/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
