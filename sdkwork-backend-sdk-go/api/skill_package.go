package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type SkillPackageApi struct {
    client *sdkhttp.Client
}

func NewSkillPackageApi(client *sdkhttp.Client) *SkillPackageApi {
    return &SkillPackageApi{client: client}
}

// Get skill package detail
func (a *SkillPackageApi) GetById(id string) (sdktypes.PlusApiResultPlusAgentSkillPackageVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/skill/package/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAgentSkillPackageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAgentSkillPackageVO](raw)
}

// Update skill package
func (a *SkillPackageApi) Update(id string, body sdktypes.PlusAgentSkillPackageForm) (sdktypes.PlusApiResultPlusAgentSkillPackageVO, error) {
    raw, err := a.client.Put(BackendApiPath(fmt.Sprintf("/skill/package/%s", id)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAgentSkillPackageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAgentSkillPackageVO](raw)
}

// Delete skill package
func (a *SkillPackageApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/skill/package/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Create skill package
func (a *SkillPackageApi) Create(body sdktypes.PlusAgentSkillPackageForm) (sdktypes.PlusApiResultPlusAgentSkillPackageVO, error) {
    raw, err := a.client.Post(BackendApiPath("/skill/package"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAgentSkillPackageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAgentSkillPackageVO](raw)
}

// Enable skill package
func (a *SkillPackageApi) Enable(id string) (sdktypes.PlusApiResultPlusAgentSkillPackageVO, error) {
    raw, err := a.client.Post(BackendApiPath(fmt.Sprintf("/skill/package/%s/enable", id)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAgentSkillPackageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAgentSkillPackageVO](raw)
}

// Disable skill package
func (a *SkillPackageApi) Disable(id string) (sdktypes.PlusApiResultPlusAgentSkillPackageVO, error) {
    raw, err := a.client.Post(BackendApiPath(fmt.Sprintf("/skill/package/%s/disable", id)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAgentSkillPackageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAgentSkillPackageVO](raw)
}

// Query skill package list by page
func (a *SkillPackageApi) ListByPage(body *sdktypes.PlusAgentSkillPackageQueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusAgentSkillPackageVO, error) {
    raw, err := a.client.Post(BackendApiPath("/skill/package/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusAgentSkillPackageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusAgentSkillPackageVO](raw)
}

// Query all skill packages
func (a *SkillPackageApi) ListAll(body *sdktypes.PlusAgentSkillPackageQueryListForm) (sdktypes.PlusApiResultListPlusAgentSkillPackageVO, error) {
    raw, err := a.client.Post(BackendApiPath("/skill/package/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusAgentSkillPackageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusAgentSkillPackageVO](raw)
}
