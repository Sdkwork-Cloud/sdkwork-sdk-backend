package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type ApplicationApi struct {
    client *sdkhttp.Client
}

func NewApplicationApi(client *sdkhttp.Client) *ApplicationApi {
    return &ApplicationApi{client: client}
}

// Update application
func (a *ApplicationApi) Update(body sdktypes.PlusAppForm) (sdktypes.PlusApiResultPlusAppVO, error) {
    raw, err := a.client.Put(BackendApiPath("/app"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAppVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAppVO](raw)
}

// Create application
func (a *ApplicationApi) Create(body sdktypes.PlusAppForm) (sdktypes.PlusApiResultPlusAppVO, error) {
    raw, err := a.client.Post(BackendApiPath("/app"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAppVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAppVO](raw)
}

// Get applications by page
func (a *ApplicationApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusAppVO, error) {
    raw, err := a.client.Post(BackendApiPath("/app/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusAppVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusAppVO](raw)
}

// Get all applications
func (a *ApplicationApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusAppVO, error) {
    raw, err := a.client.Post(BackendApiPath("/app/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusAppVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusAppVO](raw)
}

// Get application by ID
func (a *ApplicationApi) GetById(id string) (sdktypes.PlusApiResultPlusAppVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/app/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAppVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAppVO](raw)
}

// Delete application
func (a *ApplicationApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/app/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
