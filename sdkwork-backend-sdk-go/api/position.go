package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type PositionApi struct {
    client *sdkhttp.Client
}

func NewPositionApi(client *sdkhttp.Client) *PositionApi {
    return &PositionApi{client: client}
}

// Update an existing position
func (a *PositionApi) Update(body sdktypes.PlusPositionForm) (sdktypes.PlusApiResultPlusPositionVO, error) {
    raw, err := a.client.Put(BackendApiPath("/organization/position"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusPositionVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusPositionVO](raw)
}

// Create a new position
func (a *PositionApi) Create(body sdktypes.PlusPositionForm) (sdktypes.PlusApiResultPlusPositionVO, error) {
    raw, err := a.client.Post(BackendApiPath("/organization/position"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusPositionVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusPositionVO](raw)
}

// Get positions by page
func (a *PositionApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusPositionVO, error) {
    raw, err := a.client.Post(BackendApiPath("/organization/position/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusPositionVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusPositionVO](raw)
}

// Get all positions
func (a *PositionApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusPositionVO, error) {
    raw, err := a.client.Post(BackendApiPath("/organization/position/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusPositionVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusPositionVO](raw)
}

// Get a position by ID
func (a *PositionApi) GetById(id string) (sdktypes.PlusApiResultPlusPositionVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/organization/position/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusPositionVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusPositionVO](raw)
}

// Delete a position
func (a *PositionApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/organization/position/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
