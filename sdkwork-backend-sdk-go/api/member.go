package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type MemberApi struct {
    client *sdkhttp.Client
}

func NewMemberApi(client *sdkhttp.Client) *MemberApi {
    return &MemberApi{client: client}
}

// Update an existing member level
func (a *MemberApi) Update(body sdktypes.PlusMemberLevelForm) (sdktypes.PlusApiResultPlusMemberLevelVO, error) {
    raw, err := a.client.Put(BackendApiPath("/member/level"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusMemberLevelVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusMemberLevelVO](raw)
}

// Create a new member level
func (a *MemberApi) Create(body sdktypes.PlusMemberLevelForm) (sdktypes.PlusApiResultPlusMemberLevelVO, error) {
    raw, err := a.client.Post(BackendApiPath("/member/level"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusMemberLevelVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusMemberLevelVO](raw)
}

// Update an existing member card
func (a *MemberApi) UpdateCard(body sdktypes.PlusMemberCardForm) (sdktypes.PlusApiResultPlusMemberCardVO, error) {
    raw, err := a.client.Put(BackendApiPath("/member/card"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusMemberCardVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusMemberCardVO](raw)
}

// Create a new member card
func (a *MemberApi) CreateCard(body sdktypes.PlusMemberCardForm) (sdktypes.PlusApiResultPlusMemberCardVO, error) {
    raw, err := a.client.Post(BackendApiPath("/member/card"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusMemberCardVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusMemberCardVO](raw)
}

// Get member levels by page
func (a *MemberApi) CreateListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusMemberLevelVO, error) {
    raw, err := a.client.Post(BackendApiPath("/member/level/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusMemberLevelVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusMemberLevelVO](raw)
}

// Get all member levels
func (a *MemberApi) CreateListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusMemberLevelVO, error) {
    raw, err := a.client.Post(BackendApiPath("/member/level/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusMemberLevelVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusMemberLevelVO](raw)
}

// Get member cards by page
func (a *MemberApi) CreateListByPageCard(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusMemberCardVO, error) {
    raw, err := a.client.Post(BackendApiPath("/member/card/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusMemberCardVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusMemberCardVO](raw)
}

// Get all member cards
func (a *MemberApi) CreateListAllEntitiesCard(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusMemberCardVO, error) {
    raw, err := a.client.Post(BackendApiPath("/member/card/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusMemberCardVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusMemberCardVO](raw)
}

// Get a member level by ID
func (a *MemberApi) GetById(id string) (sdktypes.PlusApiResultPlusMemberLevelVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/member/level/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusMemberLevelVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusMemberLevelVO](raw)
}

// Delete a member level
func (a *MemberApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/member/level/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Get a member card by ID
func (a *MemberApi) GetByIdCard(id string) (sdktypes.PlusApiResultPlusMemberCardVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/member/card/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusMemberCardVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusMemberCardVO](raw)
}

// Delete a member card
func (a *MemberApi) DeleteCard(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/member/card/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
