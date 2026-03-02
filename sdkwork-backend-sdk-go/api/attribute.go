package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type AttributeApi struct {
    client *sdkhttp.Client
}

func NewAttributeApi(client *sdkhttp.Client) *AttributeApi {
    return &AttributeApi{client: client}
}

// Update attribute
func (a *AttributeApi) Update(body sdktypes.PlusAttributeForm) (sdktypes.PlusApiResultPlusAttributeVO, error) {
    raw, err := a.client.Put(BackendApiPath("/attribute"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAttributeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAttributeVO](raw)
}

// Create attribute
func (a *AttributeApi) Create(body sdktypes.PlusAttributeForm) (sdktypes.PlusApiResultPlusAttributeVO, error) {
    raw, err := a.client.Post(BackendApiPath("/attribute"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAttributeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAttributeVO](raw)
}

// Get attributes by page
func (a *AttributeApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusAttributeVO, error) {
    raw, err := a.client.Post(BackendApiPath("/attribute/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusAttributeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusAttributeVO](raw)
}

// Get all attributes
func (a *AttributeApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusAttributeVO, error) {
    raw, err := a.client.Post(BackendApiPath("/attribute/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusAttributeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusAttributeVO](raw)
}

// Get attribute by ID
func (a *AttributeApi) GetById(id string) (sdktypes.PlusApiResultPlusAttributeVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/attribute/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAttributeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAttributeVO](raw)
}

// Delete attribute
func (a *AttributeApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/attribute/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
