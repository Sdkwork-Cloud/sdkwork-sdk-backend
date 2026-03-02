package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type ShareVisitRecordApi struct {
    client *sdkhttp.Client
}

func NewShareVisitRecordApi(client *sdkhttp.Client) *ShareVisitRecordApi {
    return &ShareVisitRecordApi{client: client}
}

// Update visit record
func (a *ShareVisitRecordApi) Update(body sdktypes.PlusShareVisitRecordForm) (sdktypes.PlusApiResultPlusShareVisitRecordVO, error) {
    raw, err := a.client.Put(BackendApiPath("/share/visit_record"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusShareVisitRecordVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusShareVisitRecordVO](raw)
}

// Create visit record
func (a *ShareVisitRecordApi) Create(body sdktypes.PlusShareVisitRecordForm) (sdktypes.PlusApiResultPlusShareVisitRecordVO, error) {
    raw, err := a.client.Post(BackendApiPath("/share/visit_record"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusShareVisitRecordVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusShareVisitRecordVO](raw)
}

// Get visit records by page
func (a *ShareVisitRecordApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusShareVisitRecordVO, error) {
    raw, err := a.client.Post(BackendApiPath("/share/visit_record/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusShareVisitRecordVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusShareVisitRecordVO](raw)
}

// Get all visit records
func (a *ShareVisitRecordApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusShareVisitRecordVO, error) {
    raw, err := a.client.Post(BackendApiPath("/share/visit_record/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusShareVisitRecordVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusShareVisitRecordVO](raw)
}

// Get visit record by ID
func (a *ShareVisitRecordApi) GetById(id string) (sdktypes.PlusApiResultPlusShareVisitRecordVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/share/visit_record/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusShareVisitRecordVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusShareVisitRecordVO](raw)
}

// Delete visit record
func (a *ShareVisitRecordApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/share/visit_record/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
