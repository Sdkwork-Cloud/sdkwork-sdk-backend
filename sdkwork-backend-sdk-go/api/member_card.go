package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type MemberCardApi struct {
    client *sdkhttp.Client
}

func NewMemberCardApi(client *sdkhttp.Client) *MemberCardApi {
    return &MemberCardApi{client: client}
}

// Update an existing member card
func (a *MemberCardApi) Update(body sdktypes.PlusMemberCardForm) (sdktypes.PlusApiResultPlusMemberCardVO, error) {
    raw, err := a.client.Put(BackendApiPath("/member/card"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusMemberCardVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusMemberCardVO](raw)
}

// Create a new member card
func (a *MemberCardApi) Create(body sdktypes.PlusMemberCardForm) (sdktypes.PlusApiResultPlusMemberCardVO, error) {
    raw, err := a.client.Post(BackendApiPath("/member/card"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusMemberCardVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusMemberCardVO](raw)
}

// Get member cards by page
func (a *MemberCardApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusMemberCardVO, error) {
    raw, err := a.client.Post(BackendApiPath("/member/card/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusMemberCardVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusMemberCardVO](raw)
}

// Get all member cards
func (a *MemberCardApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusMemberCardVO, error) {
    raw, err := a.client.Post(BackendApiPath("/member/card/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusMemberCardVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusMemberCardVO](raw)
}

// Get a member card by ID
func (a *MemberCardApi) GetById(id string) (sdktypes.PlusApiResultPlusMemberCardVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/member/card/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusMemberCardVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusMemberCardVO](raw)
}

// Delete a member card
func (a *MemberCardApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/member/card/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
