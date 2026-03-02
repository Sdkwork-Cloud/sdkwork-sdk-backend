package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type AiUsageRecordApi struct {
    client *sdkhttp.Client
}

func NewAiUsageRecordApi(client *sdkhttp.Client) *AiUsageRecordApi {
    return &AiUsageRecordApi{client: client}
}

// Update an existing usage record
func (a *AiUsageRecordApi) Update(body sdktypes.UsageRecordForm) (sdktypes.PlusApiResultUsageRecordVO, error) {
    raw, err := a.client.Put(BackendApiPath("/usage/record"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultUsageRecordVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultUsageRecordVO](raw)
}

// Create a new usage record
func (a *AiUsageRecordApi) Create(body sdktypes.UsageRecordForm) (sdktypes.PlusApiResultUsageRecordVO, error) {
    raw, err := a.client.Post(BackendApiPath("/usage/record"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultUsageRecordVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultUsageRecordVO](raw)
}

// Get usage records by page
func (a *AiUsageRecordApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPageUsageRecordVO, error) {
    raw, err := a.client.Post(BackendApiPath("/usage/record/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPageUsageRecordVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageUsageRecordVO](raw)
}

// Get all usage records
func (a *AiUsageRecordApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListUsageRecordVO, error) {
    raw, err := a.client.Post(BackendApiPath("/usage/record/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListUsageRecordVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListUsageRecordVO](raw)
}

// Get a usage record by ID
func (a *AiUsageRecordApi) GetById(id string) (sdktypes.PlusApiResultUsageRecordVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/usage/record/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultUsageRecordVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultUsageRecordVO](raw)
}

// Delete a usage record
func (a *AiUsageRecordApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/usage/record/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
