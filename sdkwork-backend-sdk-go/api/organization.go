package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type OrganizationApi struct {
    client *sdkhttp.Client
}

func NewOrganizationApi(client *sdkhttp.Client) *OrganizationApi {
    return &OrganizationApi{client: client}
}

// Update an existing organization
func (a *OrganizationApi) Update(body sdktypes.PlusOrganizationForm) (sdktypes.PlusApiResultPlusOrganizationVO, error) {
    raw, err := a.client.Put(BackendApiPath("/organization"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusOrganizationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusOrganizationVO](raw)
}

// Create a new organization
func (a *OrganizationApi) Create(body sdktypes.PlusOrganizationForm) (sdktypes.PlusApiResultPlusOrganizationVO, error) {
    raw, err := a.client.Post(BackendApiPath("/organization"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusOrganizationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusOrganizationVO](raw)
}

// Update an existing position
func (a *OrganizationApi) UpdatePosition(body sdktypes.PlusPositionForm) (sdktypes.PlusApiResultPlusPositionVO, error) {
    raw, err := a.client.Put(BackendApiPath("/organization/position"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusPositionVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusPositionVO](raw)
}

// Create a new position
func (a *OrganizationApi) CreatePosition(body sdktypes.PlusPositionForm) (sdktypes.PlusApiResultPlusPositionVO, error) {
    raw, err := a.client.Post(BackendApiPath("/organization/position"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusPositionVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusPositionVO](raw)
}

// Update member relation
func (a *OrganizationApi) UpdateMemberRelations(body sdktypes.PlusMemberRelationsForm) (sdktypes.PlusApiResultPlusMemberRelationsVO, error) {
    raw, err := a.client.Put(BackendApiPath("/organization/member-relations"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusMemberRelationsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusMemberRelationsVO](raw)
}

// Create member relation
func (a *OrganizationApi) CreateMemberRelations(body sdktypes.PlusMemberRelationsForm) (sdktypes.PlusApiResultPlusMemberRelationsVO, error) {
    raw, err := a.client.Post(BackendApiPath("/organization/member-relations"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusMemberRelationsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusMemberRelationsVO](raw)
}

// Uninstall app from organization
func (a *OrganizationApi) Uninstall(id string, body sdktypes.PlusOrganizationForm) (sdktypes.PlusApiResultPlusOrganizationVO, error) {
    raw, err := a.client.Post(BackendApiPath(fmt.Sprintf("/organization/%s/uninstall", id)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusOrganizationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusOrganizationVO](raw)
}

// Install app for organization
func (a *OrganizationApi) Install(id string, body sdktypes.PlusOrganizationForm) (sdktypes.PlusApiResultPlusOrganizationVO, error) {
    raw, err := a.client.Post(BackendApiPath(fmt.Sprintf("/organization/%s/install", id)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusOrganizationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusOrganizationVO](raw)
}

// Get positions by page
func (a *OrganizationApi) CreateListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusPositionVO, error) {
    raw, err := a.client.Post(BackendApiPath("/organization/position/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusPositionVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusPositionVO](raw)
}

// Get all positions
func (a *OrganizationApi) CreateListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusPositionVO, error) {
    raw, err := a.client.Post(BackendApiPath("/organization/position/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusPositionVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusPositionVO](raw)
}

// Get member relations by page
func (a *OrganizationApi) CreateListByPageMemberRelations(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusMemberRelationsVO, error) {
    raw, err := a.client.Post(BackendApiPath("/organization/member-relations/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusMemberRelationsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusMemberRelationsVO](raw)
}

// Get all member relations
func (a *OrganizationApi) CreateListAllEntitiesMemberRelations(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusMemberRelationsVO, error) {
    raw, err := a.client.Post(BackendApiPath("/organization/member-relations/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusMemberRelationsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusMemberRelationsVO](raw)
}

// Get organizations by page
func (a *OrganizationApi) CreateListByPageOrganization(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusOrganizationVO, error) {
    raw, err := a.client.Post(BackendApiPath("/organization/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusOrganizationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusOrganizationVO](raw)
}

// Get all organizations
func (a *OrganizationApi) CreateListAllEntitiesOrganization(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusOrganizationVO, error) {
    raw, err := a.client.Post(BackendApiPath("/organization/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusOrganizationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusOrganizationVO](raw)
}

// Get access tokens
func (a *OrganizationApi) GetAccessTokens(body sdktypes.GetAccessTokenForm) (sdktypes.PlusApiResultListTokenResult, error) {
    raw, err := a.client.Post(BackendApiPath("/organization/get_access_tokens"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListTokenResult
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListTokenResult](raw)
}

// Get an organization by ID
func (a *OrganizationApi) GetById(id string) (sdktypes.PlusApiResultPlusOrganizationVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/organization/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusOrganizationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusOrganizationVO](raw)
}

// Delete an organization
func (a *OrganizationApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/organization/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Get child organizations
func (a *OrganizationApi) GetChildren(id string) (sdktypes.PlusApiResultListPlusOrganizationVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/organization/%s/children", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusOrganizationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusOrganizationVO](raw)
}

// Get a position by ID
func (a *OrganizationApi) GetByIdPosition(id string) (sdktypes.PlusApiResultPlusPositionVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/organization/position/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusPositionVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusPositionVO](raw)
}

// Delete a position
func (a *OrganizationApi) DeletePosition(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/organization/position/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Get member relation by ID
func (a *OrganizationApi) GetByIdMemberRelations(id string) (sdktypes.PlusApiResultPlusMemberRelationsVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/organization/member-relations/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusMemberRelationsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusMemberRelationsVO](raw)
}

// Delete member relation
func (a *OrganizationApi) DeleteMemberRelations(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/organization/member-relations/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
