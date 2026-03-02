package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type VisitHistoryApi struct {
    client *sdkhttp.Client
}

func NewVisitHistoryApi(client *sdkhttp.Client) *VisitHistoryApi {
    return &VisitHistoryApi{client: client}
}

// Update Visit History
func (a *VisitHistoryApi) Update(body sdktypes.PlusVisitHistoryForm) (sdktypes.PlusApiResultPlusVisitHistoryVO, error) {
    raw, err := a.client.Put(BackendApiPath("/visit_history"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVisitHistoryVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVisitHistoryVO](raw)
}

// Create Visit History
func (a *VisitHistoryApi) Create(body sdktypes.PlusVisitHistoryForm) (sdktypes.PlusApiResultPlusVisitHistoryVO, error) {
    raw, err := a.client.Post(BackendApiPath("/visit_history"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVisitHistoryVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVisitHistoryVO](raw)
}

// List Visit Histories by Page
func (a *VisitHistoryApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusVisitHistoryVO, error) {
    raw, err := a.client.Post(BackendApiPath("/visit_history/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusVisitHistoryVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusVisitHistoryVO](raw)
}

// List All Visit Histories
func (a *VisitHistoryApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusVisitHistoryVO, error) {
    raw, err := a.client.Post(BackendApiPath("/visit_history/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusVisitHistoryVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusVisitHistoryVO](raw)
}

// Get Visit History by ID
func (a *VisitHistoryApi) GetById(id string) (sdktypes.PlusApiResultPlusVisitHistoryVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/visit_history/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVisitHistoryVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVisitHistoryVO](raw)
}

// Delete Visit History
func (a *VisitHistoryApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/visit_history/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
