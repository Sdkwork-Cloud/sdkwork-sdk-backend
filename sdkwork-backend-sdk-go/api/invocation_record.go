package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type InvocationRecordApi struct {
    client *sdkhttp.Client
}

func NewInvocationRecordApi(client *sdkhttp.Client) *InvocationRecordApi {
    return &InvocationRecordApi{client: client}
}

// Update an existing invocation record
func (a *InvocationRecordApi) Update(body sdktypes.PlusInvokeRecordForm) (sdktypes.PlusApiResultPlusInvokeRecordVO, error) {
    raw, err := a.client.Put(BackendApiPath("/record"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusInvokeRecordVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusInvokeRecordVO](raw)
}

// Create a new invocation record
func (a *InvocationRecordApi) Create(body sdktypes.PlusInvokeRecordForm) (sdktypes.PlusApiResultPlusInvokeRecordVO, error) {
    raw, err := a.client.Post(BackendApiPath("/record"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusInvokeRecordVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusInvokeRecordVO](raw)
}

// Get invocation records by page
func (a *InvocationRecordApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusInvokeRecordVO, error) {
    raw, err := a.client.Post(BackendApiPath("/record/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusInvokeRecordVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusInvokeRecordVO](raw)
}

// Get all invocation records
func (a *InvocationRecordApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusInvokeRecordVO, error) {
    raw, err := a.client.Post(BackendApiPath("/record/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusInvokeRecordVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusInvokeRecordVO](raw)
}

// Get an invocation record by ID
func (a *InvocationRecordApi) GetById(id string) (sdktypes.PlusApiResultPlusInvokeRecordVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/record/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusInvokeRecordVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusInvokeRecordVO](raw)
}

// Delete an invocation record
func (a *InvocationRecordApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/record/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
