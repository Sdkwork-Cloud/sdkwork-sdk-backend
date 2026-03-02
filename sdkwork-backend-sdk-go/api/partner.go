package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type PartnerApi struct {
    client *sdkhttp.Client
}

func NewPartnerApi(client *sdkhttp.Client) *PartnerApi {
    return &PartnerApi{client: client}
}

// Update a partner
func (a *PartnerApi) Update(body sdktypes.PlusPartnerForm) (sdktypes.PlusApiResultPlusPartnerVO, error) {
    raw, err := a.client.Put(BackendApiPath("/partner"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusPartnerVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusPartnerVO](raw)
}

// Create a new partner
func (a *PartnerApi) Create(body sdktypes.PlusPartnerForm) (sdktypes.PlusApiResultPlusPartnerVO, error) {
    raw, err := a.client.Post(BackendApiPath("/partner"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusPartnerVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusPartnerVO](raw)
}

// Get partners by page
func (a *PartnerApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusPartnerVO, error) {
    raw, err := a.client.Post(BackendApiPath("/partner/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusPartnerVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusPartnerVO](raw)
}

// Get all partners
func (a *PartnerApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusPartnerVO, error) {
    raw, err := a.client.Post(BackendApiPath("/partner/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusPartnerVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusPartnerVO](raw)
}

// Get a partner by ID
func (a *PartnerApi) GetById(id string) (sdktypes.PlusApiResultPlusPartnerVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/partner/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusPartnerVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusPartnerVO](raw)
}

// Delete a partner
func (a *PartnerApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/partner/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
