package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type SkillApi struct {
    client *sdkhttp.Client
}

func NewSkillApi(client *sdkhttp.Client) *SkillApi {
    return &SkillApi{client: client}
}

// Get one skill detail
func (a *SkillApi) GetById(id string) (sdktypes.PlusApiResultPlusAgentSkillVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/skill/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAgentSkillVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAgentSkillVO](raw)
}

// Update skill
func (a *SkillApi) Update(id string, body sdktypes.PlusAgentSkillForm) (sdktypes.PlusApiResultPlusAgentSkillVO, error) {
    raw, err := a.client.Put(BackendApiPath(fmt.Sprintf("/skill/%s", id)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAgentSkillVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAgentSkillVO](raw)
}

// Get skill package detail
func (a *SkillApi) GetByIdPackage(id string) (sdktypes.PlusApiResultPlusAgentSkillPackageVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/skill/package/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAgentSkillPackageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAgentSkillPackageVO](raw)
}

// Update skill package
func (a *SkillApi) UpdatePackage(id string, body sdktypes.PlusAgentSkillPackageForm) (sdktypes.PlusApiResultPlusAgentSkillPackageVO, error) {
    raw, err := a.client.Put(BackendApiPath(fmt.Sprintf("/skill/package/%s", id)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAgentSkillPackageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAgentSkillPackageVO](raw)
}

// Delete skill package
func (a *SkillApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/skill/package/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Create skill
func (a *SkillApi) Create(body sdktypes.PlusAgentSkillForm) (sdktypes.PlusApiResultPlusAgentSkillVO, error) {
    raw, err := a.client.Post(BackendApiPath("/skill"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAgentSkillVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAgentSkillVO](raw)
}

// Submit skill for review
func (a *SkillApi) SubmitForReview(id string) (sdktypes.PlusApiResultPlusAgentSkillVO, error) {
    raw, err := a.client.Post(BackendApiPath(fmt.Sprintf("/skill/%s/review/submit", id)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAgentSkillVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAgentSkillVO](raw)
}

// Reject skill review
func (a *SkillApi) RejectReview(id string, body *sdktypes.PlusAgentSkillReviewForm) (sdktypes.PlusApiResultPlusAgentSkillVO, error) {
    raw, err := a.client.Post(BackendApiPath(fmt.Sprintf("/skill/%s/review/reject", id)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAgentSkillVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAgentSkillVO](raw)
}

// Approve skill review
func (a *SkillApi) ApproveReview(id string, body *sdktypes.PlusAgentSkillReviewForm) (sdktypes.PlusApiResultPlusAgentSkillVO, error) {
    raw, err := a.client.Post(BackendApiPath(fmt.Sprintf("/skill/%s/review/approve", id)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAgentSkillVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAgentSkillVO](raw)
}

// Publish skill
func (a *SkillApi) Publish(id string) (sdktypes.PlusApiResultPlusAgentSkillVO, error) {
    raw, err := a.client.Post(BackendApiPath(fmt.Sprintf("/skill/%s/publish", id)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAgentSkillVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAgentSkillVO](raw)
}

// Offline skill
func (a *SkillApi) Offline(id string) (sdktypes.PlusApiResultPlusAgentSkillVO, error) {
    raw, err := a.client.Post(BackendApiPath(fmt.Sprintf("/skill/%s/offline", id)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAgentSkillVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAgentSkillVO](raw)
}

// Update skill featured status
func (a *SkillApi) UpdateFeature(id string, body sdktypes.PlusAgentSkillFeatureForm) (sdktypes.PlusApiResultPlusAgentSkillVO, error) {
    raw, err := a.client.Post(BackendApiPath(fmt.Sprintf("/skill/%s/feature", id)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAgentSkillVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAgentSkillVO](raw)
}

// Enable skill
func (a *SkillApi) CreateEnable(id string) (sdktypes.PlusApiResultPlusAgentSkillVO, error) {
    raw, err := a.client.Post(BackendApiPath(fmt.Sprintf("/skill/%s/enable", id)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAgentSkillVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAgentSkillVO](raw)
}

// Disable skill
func (a *SkillApi) CreateDisable(id string) (sdktypes.PlusApiResultPlusAgentSkillVO, error) {
    raw, err := a.client.Post(BackendApiPath(fmt.Sprintf("/skill/%s/disable", id)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAgentSkillVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAgentSkillVO](raw)
}

// List pending review skills by page
func (a *SkillApi) ListPendingReviewByPage(body *sdktypes.PlusAgentSkillQueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusAgentSkillVO, error) {
    raw, err := a.client.Post(BackendApiPath("/skill/review/pending/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusAgentSkillVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusAgentSkillVO](raw)
}

// Batch reject skill review
func (a *SkillApi) BatchRejectReview(body sdktypes.PlusAgentSkillBatchReviewForm) (sdktypes.PlusApiResultListPlusAgentSkillVO, error) {
    raw, err := a.client.Post(BackendApiPath("/skill/review/batch/reject"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusAgentSkillVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusAgentSkillVO](raw)
}

// Batch approve skill review
func (a *SkillApi) BatchApproveReview(body sdktypes.PlusAgentSkillBatchReviewForm) (sdktypes.PlusApiResultListPlusAgentSkillVO, error) {
    raw, err := a.client.Post(BackendApiPath("/skill/review/batch/approve"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusAgentSkillVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusAgentSkillVO](raw)
}

// Create skill package
func (a *SkillApi) CreatePackage(body sdktypes.PlusAgentSkillPackageForm) (sdktypes.PlusApiResultPlusAgentSkillPackageVO, error) {
    raw, err := a.client.Post(BackendApiPath("/skill/package"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAgentSkillPackageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAgentSkillPackageVO](raw)
}

// Enable skill package
func (a *SkillApi) CreateEnablePackage(id string) (sdktypes.PlusApiResultPlusAgentSkillPackageVO, error) {
    raw, err := a.client.Post(BackendApiPath(fmt.Sprintf("/skill/package/%s/enable", id)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAgentSkillPackageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAgentSkillPackageVO](raw)
}

// Disable skill package
func (a *SkillApi) CreateDisablePackage(id string) (sdktypes.PlusApiResultPlusAgentSkillPackageVO, error) {
    raw, err := a.client.Post(BackendApiPath(fmt.Sprintf("/skill/package/%s/disable", id)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAgentSkillPackageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAgentSkillPackageVO](raw)
}

// Query skill package list by page
func (a *SkillApi) CreateListByPage(body *sdktypes.PlusAgentSkillPackageQueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusAgentSkillPackageVO, error) {
    raw, err := a.client.Post(BackendApiPath("/skill/package/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusAgentSkillPackageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusAgentSkillPackageVO](raw)
}

// Query all skill packages
func (a *SkillApi) CreateListAll(body *sdktypes.PlusAgentSkillPackageQueryListForm) (sdktypes.PlusApiResultListPlusAgentSkillPackageVO, error) {
    raw, err := a.client.Post(BackendApiPath("/skill/package/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusAgentSkillPackageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusAgentSkillPackageVO](raw)
}

// Query skill list by page
func (a *SkillApi) CreateListByPageSkill(body *sdktypes.PlusAgentSkillQueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusAgentSkillVO, error) {
    raw, err := a.client.Post(BackendApiPath("/skill/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusAgentSkillVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusAgentSkillVO](raw)
}

// Query all skills
func (a *SkillApi) CreateListAllSkill(body *sdktypes.PlusAgentSkillQueryListForm) (sdktypes.PlusApiResultListPlusAgentSkillVO, error) {
    raw, err := a.client.Post(BackendApiPath("/skill/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusAgentSkillVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusAgentSkillVO](raw)
}
