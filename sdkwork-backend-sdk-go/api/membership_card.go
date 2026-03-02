package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type MembershipCardApi struct {
    client *sdkhttp.Client
}

func NewMembershipCardApi(client *sdkhttp.Client) *MembershipCardApi {
    return &MembershipCardApi{client: client}
}

// Update an existing membership card
func (a *MembershipCardApi) Update(body sdktypes.PlusCardForm) (sdktypes.PlusApiResultPlusCardVO, error) {
    raw, err := a.client.Put(BackendApiPath("/card"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusCardVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusCardVO](raw)
}

// Create a new membership card
func (a *MembershipCardApi) Create(body sdktypes.PlusCardForm) (sdktypes.PlusApiResultPlusCardVO, error) {
    raw, err := a.client.Post(BackendApiPath("/card"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusCardVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusCardVO](raw)
}

// Get membership cards by page
func (a *MembershipCardApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusCardVO, error) {
    raw, err := a.client.Post(BackendApiPath("/card/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusCardVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusCardVO](raw)
}

// Get all membership cards
func (a *MembershipCardApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusCardVO, error) {
    raw, err := a.client.Post(BackendApiPath("/card/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusCardVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusCardVO](raw)
}

// Get a membership card by ID
func (a *MembershipCardApi) GetById(id string) (sdktypes.PlusApiResultPlusCardVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/card/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusCardVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusCardVO](raw)
}

// Delete a membership card
func (a *MembershipCardApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/card/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
