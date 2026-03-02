package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type InvitationRelationApi struct {
    client *sdkhttp.Client
}

func NewInvitationRelationApi(client *sdkhttp.Client) *InvitationRelationApi {
    return &InvitationRelationApi{client: client}
}

// Update an invitation relation
func (a *InvitationRelationApi) Update(body sdktypes.InvitationRelationForm) (sdktypes.PlusApiResultInvitationRelationVO, error) {
    raw, err := a.client.Put(BackendApiPath("/invitation/relation"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultInvitationRelationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultInvitationRelationVO](raw)
}

// Create a new invitation relation
func (a *InvitationRelationApi) Create(body sdktypes.InvitationRelationForm) (sdktypes.PlusApiResultInvitationRelationVO, error) {
    raw, err := a.client.Post(BackendApiPath("/invitation/relation"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultInvitationRelationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultInvitationRelationVO](raw)
}

// Get invitation relations by page
func (a *InvitationRelationApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPageInvitationRelationVO, error) {
    raw, err := a.client.Post(BackendApiPath("/invitation/relation/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPageInvitationRelationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageInvitationRelationVO](raw)
}

// Get all invitation relations
func (a *InvitationRelationApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListInvitationRelationVO, error) {
    raw, err := a.client.Post(BackendApiPath("/invitation/relation/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListInvitationRelationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListInvitationRelationVO](raw)
}

// Get an invitation relation by ID
func (a *InvitationRelationApi) GetById(id string) (sdktypes.PlusApiResultInvitationRelationVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/invitation/relation/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultInvitationRelationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultInvitationRelationVO](raw)
}

// Delete an invitation relation
func (a *InvitationRelationApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/invitation/relation/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
