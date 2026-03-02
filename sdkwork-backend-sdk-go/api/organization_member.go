package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type OrganizationMemberApi struct {
    client *sdkhttp.Client
}

func NewOrganizationMemberApi(client *sdkhttp.Client) *OrganizationMemberApi {
    return &OrganizationMemberApi{client: client}
}

// Update organization member
func (a *OrganizationMemberApi) Update(body sdktypes.PlusOrganizationMemberForm) (sdktypes.PlusApiResultPlusOrganizationMemberVO, error) {
    raw, err := a.client.Put(BackendApiPath("/organization-member"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusOrganizationMemberVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusOrganizationMemberVO](raw)
}

// Create organization member
func (a *OrganizationMemberApi) Create(body sdktypes.PlusOrganizationMemberForm) (sdktypes.PlusApiResultPlusOrganizationMemberVO, error) {
    raw, err := a.client.Post(BackendApiPath("/organization-member"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusOrganizationMemberVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusOrganizationMemberVO](raw)
}

// Get organization members by page
func (a *OrganizationMemberApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusOrganizationMemberVO, error) {
    raw, err := a.client.Post(BackendApiPath("/organization-member/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusOrganizationMemberVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusOrganizationMemberVO](raw)
}

// Get all organization members
func (a *OrganizationMemberApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusOrganizationMemberVO, error) {
    raw, err := a.client.Post(BackendApiPath("/organization-member/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusOrganizationMemberVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusOrganizationMemberVO](raw)
}

// Get organization member by ID
func (a *OrganizationMemberApi) GetById(id string) (sdktypes.PlusApiResultPlusOrganizationMemberVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/organization-member/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusOrganizationMemberVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusOrganizationMemberVO](raw)
}

// Delete organization member
func (a *OrganizationMemberApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/organization-member/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
