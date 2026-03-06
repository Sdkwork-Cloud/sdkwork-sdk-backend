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

// Get organizations by page
func (a *OrganizationApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusOrganizationVO, error) {
    raw, err := a.client.Post(BackendApiPath("/organization/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusOrganizationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusOrganizationVO](raw)
}

// Get all organizations
func (a *OrganizationApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusOrganizationVO, error) {
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
