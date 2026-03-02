package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type FeedbackApi struct {
    client *sdkhttp.Client
}

func NewFeedbackApi(client *sdkhttp.Client) *FeedbackApi {
    return &FeedbackApi{client: client}
}

// Update feedback
func (a *FeedbackApi) Update(body sdktypes.PlusFeedbackForm) (sdktypes.PlusApiResultPlusFeedbackVO, error) {
    raw, err := a.client.Put(BackendApiPath("/feedback"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusFeedbackVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusFeedbackVO](raw)
}

// Create new feedback
func (a *FeedbackApi) Create(body sdktypes.PlusFeedbackForm) (sdktypes.PlusApiResultPlusFeedbackVO, error) {
    raw, err := a.client.Post(BackendApiPath("/feedback"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusFeedbackVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusFeedbackVO](raw)
}

// Get feedback by page
func (a *FeedbackApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusFeedbackVO, error) {
    raw, err := a.client.Post(BackendApiPath("/feedback/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusFeedbackVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusFeedbackVO](raw)
}

// Get all feedback records
func (a *FeedbackApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusFeedbackVO, error) {
    raw, err := a.client.Post(BackendApiPath("/feedback/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusFeedbackVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusFeedbackVO](raw)
}

// Get feedback by ID
func (a *FeedbackApi) GetById(id string) (sdktypes.PlusApiResultPlusFeedbackVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/feedback/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusFeedbackVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusFeedbackVO](raw)
}

// Delete feedback
func (a *FeedbackApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/feedback/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
