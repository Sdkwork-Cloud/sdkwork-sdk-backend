package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type MemberLevelApi struct {
    client *sdkhttp.Client
}

func NewMemberLevelApi(client *sdkhttp.Client) *MemberLevelApi {
    return &MemberLevelApi{client: client}
}

// Update an existing member level
func (a *MemberLevelApi) Update(body sdktypes.PlusMemberLevelForm) (sdktypes.PlusApiResultPlusMemberLevelVO, error) {
    raw, err := a.client.Put(BackendApiPath("/member/level"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusMemberLevelVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusMemberLevelVO](raw)
}

// Create a new member level
func (a *MemberLevelApi) Create(body sdktypes.PlusMemberLevelForm) (sdktypes.PlusApiResultPlusMemberLevelVO, error) {
    raw, err := a.client.Post(BackendApiPath("/member/level"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusMemberLevelVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusMemberLevelVO](raw)
}

// Get member levels by page
func (a *MemberLevelApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusMemberLevelVO, error) {
    raw, err := a.client.Post(BackendApiPath("/member/level/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusMemberLevelVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusMemberLevelVO](raw)
}

// Get all member levels
func (a *MemberLevelApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusMemberLevelVO, error) {
    raw, err := a.client.Post(BackendApiPath("/member/level/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusMemberLevelVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusMemberLevelVO](raw)
}

// Get a member level by ID
func (a *MemberLevelApi) GetById(id string) (sdktypes.PlusApiResultPlusMemberLevelVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/member/level/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusMemberLevelVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusMemberLevelVO](raw)
}

// Delete a member level
func (a *MemberLevelApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/member/level/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
