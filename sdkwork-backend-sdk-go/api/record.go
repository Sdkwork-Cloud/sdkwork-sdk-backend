package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type RecordApi struct {
    client *sdkhttp.Client
}

func NewRecordApi(client *sdkhttp.Client) *RecordApi {
    return &RecordApi{client: client}
}

// Update an existing invocation record
func (a *RecordApi) Update(body sdktypes.PlusInvokeRecordForm) (sdktypes.PlusApiResultPlusInvokeRecordVO, error) {
    raw, err := a.client.Put(BackendApiPath("/record"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusInvokeRecordVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusInvokeRecordVO](raw)
}

// Create a new invocation record
func (a *RecordApi) Create(body sdktypes.PlusInvokeRecordForm) (sdktypes.PlusApiResultPlusInvokeRecordVO, error) {
    raw, err := a.client.Post(BackendApiPath("/record"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusInvokeRecordVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusInvokeRecordVO](raw)
}

// Get invocation records by page
func (a *RecordApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusInvokeRecordVO, error) {
    raw, err := a.client.Post(BackendApiPath("/record/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusInvokeRecordVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusInvokeRecordVO](raw)
}

// Get all invocation records
func (a *RecordApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusInvokeRecordVO, error) {
    raw, err := a.client.Post(BackendApiPath("/record/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusInvokeRecordVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusInvokeRecordVO](raw)
}

// Get an invocation record by ID
func (a *RecordApi) GetById(id string) (sdktypes.PlusApiResultPlusInvokeRecordVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/record/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusInvokeRecordVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusInvokeRecordVO](raw)
}

// Delete an invocation record
func (a *RecordApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/record/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
