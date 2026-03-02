package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type MemberRelationsApi struct {
    client *sdkhttp.Client
}

func NewMemberRelationsApi(client *sdkhttp.Client) *MemberRelationsApi {
    return &MemberRelationsApi{client: client}
}

// Update member relation
func (a *MemberRelationsApi) Update(body sdktypes.PlusMemberRelationsForm) (sdktypes.PlusApiResultPlusMemberRelationsVO, error) {
    raw, err := a.client.Put(BackendApiPath("/organization/member-relations"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusMemberRelationsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusMemberRelationsVO](raw)
}

// Create member relation
func (a *MemberRelationsApi) Create(body sdktypes.PlusMemberRelationsForm) (sdktypes.PlusApiResultPlusMemberRelationsVO, error) {
    raw, err := a.client.Post(BackendApiPath("/organization/member-relations"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusMemberRelationsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusMemberRelationsVO](raw)
}

// Get member relations by page
func (a *MemberRelationsApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusMemberRelationsVO, error) {
    raw, err := a.client.Post(BackendApiPath("/organization/member-relations/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusMemberRelationsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusMemberRelationsVO](raw)
}

// Get all member relations
func (a *MemberRelationsApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusMemberRelationsVO, error) {
    raw, err := a.client.Post(BackendApiPath("/organization/member-relations/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusMemberRelationsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusMemberRelationsVO](raw)
}

// Get member relation by ID
func (a *MemberRelationsApi) GetById(id string) (sdktypes.PlusApiResultPlusMemberRelationsVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/organization/member-relations/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusMemberRelationsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusMemberRelationsVO](raw)
}

// Delete member relation
func (a *MemberRelationsApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/organization/member-relations/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
