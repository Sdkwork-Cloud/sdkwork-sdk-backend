package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type PptTemplateSlideApi struct {
    client *sdkhttp.Client
}

func NewPptTemplateSlideApi(client *sdkhttp.Client) *PptTemplateSlideApi {
    return &PptTemplateSlideApi{client: client}
}

// Update an existing PPT template slide
func (a *PptTemplateSlideApi) Update(body sdktypes.PlusPptTemplateSlideForm) (sdktypes.PlusApiResultPlusPptTemplateSlideVO, error) {
    raw, err := a.client.Put(BackendApiPath("/ppt/template/slide"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusPptTemplateSlideVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusPptTemplateSlideVO](raw)
}

// Create a new PPT template slide
func (a *PptTemplateSlideApi) Create(body sdktypes.PlusPptTemplateSlideForm) (sdktypes.PlusApiResultPlusPptTemplateSlideVO, error) {
    raw, err := a.client.Post(BackendApiPath("/ppt/template/slide"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusPptTemplateSlideVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusPptTemplateSlideVO](raw)
}

// Get PPT template slides by page
func (a *PptTemplateSlideApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusPptTemplateSlideVO, error) {
    raw, err := a.client.Post(BackendApiPath("/ppt/template/slide/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusPptTemplateSlideVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusPptTemplateSlideVO](raw)
}

// Get all PPT template slides
func (a *PptTemplateSlideApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusPptTemplateSlideVO, error) {
    raw, err := a.client.Post(BackendApiPath("/ppt/template/slide/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusPptTemplateSlideVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusPptTemplateSlideVO](raw)
}

// Get a PPT template slide by ID
func (a *PptTemplateSlideApi) GetById(id string) (sdktypes.PlusApiResultPlusPptTemplateSlideVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/ppt/template/slide/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusPptTemplateSlideVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusPptTemplateSlideVO](raw)
}

// Delete a PPT template slide
func (a *PptTemplateSlideApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/ppt/template/slide/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
