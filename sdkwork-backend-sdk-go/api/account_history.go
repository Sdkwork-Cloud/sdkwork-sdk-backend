package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type AccountHistoryApi struct {
    client *sdkhttp.Client
}

func NewAccountHistoryApi(client *sdkhttp.Client) *AccountHistoryApi {
    return &AccountHistoryApi{client: client}
}

// Update an existing account history record
func (a *AccountHistoryApi) Update(body sdktypes.PlusAccountHistoryForm) (sdktypes.PlusApiResultPlusAccountHistoryVO, error) {
    raw, err := a.client.Put(BackendApiPath("/account/history"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAccountHistoryVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAccountHistoryVO](raw)
}

// Create a new account history record
func (a *AccountHistoryApi) Create(body sdktypes.PlusAccountHistoryForm) (sdktypes.PlusApiResultPlusAccountHistoryVO, error) {
    raw, err := a.client.Post(BackendApiPath("/account/history"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAccountHistoryVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAccountHistoryVO](raw)
}

// Get account history records by page
func (a *AccountHistoryApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusAccountHistoryVO, error) {
    raw, err := a.client.Post(BackendApiPath("/account/history/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusAccountHistoryVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusAccountHistoryVO](raw)
}

// Get all account history records
func (a *AccountHistoryApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusAccountHistoryVO, error) {
    raw, err := a.client.Post(BackendApiPath("/account/history/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusAccountHistoryVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusAccountHistoryVO](raw)
}

// Get an account history record by ID
func (a *AccountHistoryApi) GetById(id string) (sdktypes.PlusApiResultPlusAccountHistoryVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/account/history/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAccountHistoryVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAccountHistoryVO](raw)
}

// Delete an account history record
func (a *AccountHistoryApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/account/history/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
