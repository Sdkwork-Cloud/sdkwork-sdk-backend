package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type PptTemplateApi struct {
    client *sdkhttp.Client
}

func NewPptTemplateApi(client *sdkhttp.Client) *PptTemplateApi {
    return &PptTemplateApi{client: client}
}

// Update an existing PPT template
func (a *PptTemplateApi) Update(body sdktypes.PlusPptTemplateForm) (sdktypes.PlusApiResultPlusPptTemplateVO, error) {
    raw, err := a.client.Put(BackendApiPath("/ppt/template"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusPptTemplateVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusPptTemplateVO](raw)
}

// Create a new PPT template
func (a *PptTemplateApi) Create(body sdktypes.PlusPptTemplateForm) (sdktypes.PlusApiResultPlusPptTemplateVO, error) {
    raw, err := a.client.Post(BackendApiPath("/ppt/template"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusPptTemplateVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusPptTemplateVO](raw)
}

// Get PPT templates by page
func (a *PptTemplateApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusPptTemplateVO, error) {
    raw, err := a.client.Post(BackendApiPath("/ppt/template/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusPptTemplateVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusPptTemplateVO](raw)
}

// Get all PPT templates
func (a *PptTemplateApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusPptTemplateVO, error) {
    raw, err := a.client.Post(BackendApiPath("/ppt/template/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusPptTemplateVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusPptTemplateVO](raw)
}

// Get a PPT template by ID
func (a *PptTemplateApi) GetById(id string) (sdktypes.PlusApiResultPlusPptTemplateVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/ppt/template/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusPptTemplateVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusPptTemplateVO](raw)
}

// Delete a PPT template
func (a *PptTemplateApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/ppt/template/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
