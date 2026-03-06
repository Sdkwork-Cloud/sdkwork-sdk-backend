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

// Transfer member position
func (a *OrganizationMemberApi) TransferPosition(id string, query map[string]interface{}) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Put(BackendApiPath(fmt.Sprintf("/organization-member/%s/positions/transfer", id)), nil, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Set member primary department
func (a *OrganizationMemberApi) SetPrimaryDepartment(id string, departmentId string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Put(BackendApiPath(fmt.Sprintf("/organization-member/%s/departments/%s/primary", id, departmentId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Transfer member department
func (a *OrganizationMemberApi) TransferDepartment(id string, query map[string]interface{}) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Put(BackendApiPath(fmt.Sprintf("/organization-member/%s/departments/transfer", id)), nil, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Deactivate member
func (a *OrganizationMemberApi) DeactivateMember(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Put(BackendApiPath(fmt.Sprintf("/organization-member/%s/deactivate", id)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Activate member
func (a *OrganizationMemberApi) ActivateMember(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Put(BackendApiPath(fmt.Sprintf("/organization-member/%s/activate", id)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Bind member to department
func (a *OrganizationMemberApi) AddToDepartment(id string, departmentId string, query map[string]interface{}) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Post(BackendApiPath(fmt.Sprintf("/organization-member/%s/departments/%s", id, departmentId)), nil, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Unbind member from department
func (a *OrganizationMemberApi) RemoveFromDepartment(id string, departmentId string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/organization-member/%s/departments/%s", id, departmentId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
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

// Get member role ids
func (a *OrganizationMemberApi) GetMemberRoleIds(id string) (sdktypes.PlusApiResultListLong, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/organization-member/%s/roles", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListLong
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListLong](raw)
}

// Get member positions
func (a *OrganizationMemberApi) GetMemberPositions(id string) (sdktypes.PlusApiResultListPlusPositionVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/organization-member/%s/positions", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusPositionVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusPositionVO](raw)
}

// Get member departments
func (a *OrganizationMemberApi) GetMemberDepartments(id string) (sdktypes.PlusApiResultListPlusDepartmentVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/organization-member/%s/departments", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusDepartmentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusDepartmentVO](raw)
}
