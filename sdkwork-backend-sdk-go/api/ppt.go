package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type PptApi struct {
    client *sdkhttp.Client
}

func NewPptApi(client *sdkhttp.Client) *PptApi {
    return &PptApi{client: client}
}

// Update an existing PPT template
func (a *PptApi) Update(body sdktypes.PlusPptTemplateForm) (sdktypes.PlusApiResultPlusPptTemplateVO, error) {
    raw, err := a.client.Put(BackendApiPath("/ppt/template"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusPptTemplateVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusPptTemplateVO](raw)
}

// Create a new PPT template
func (a *PptApi) Create(body sdktypes.PlusPptTemplateForm) (sdktypes.PlusApiResultPlusPptTemplateVO, error) {
    raw, err := a.client.Post(BackendApiPath("/ppt/template"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusPptTemplateVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusPptTemplateVO](raw)
}

// Update an existing PPT template slide
func (a *PptApi) UpdateSlide(body sdktypes.PlusPptTemplateSlideForm) (sdktypes.PlusApiResultPlusPptTemplateSlideVO, error) {
    raw, err := a.client.Put(BackendApiPath("/ppt/template/slide"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusPptTemplateSlideVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusPptTemplateSlideVO](raw)
}

// Create a new PPT template slide
func (a *PptApi) CreateSlide(body sdktypes.PlusPptTemplateSlideForm) (sdktypes.PlusApiResultPlusPptTemplateSlideVO, error) {
    raw, err := a.client.Post(BackendApiPath("/ppt/template/slide"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusPptTemplateSlideVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusPptTemplateSlideVO](raw)
}

// Get PPT template slides by page
func (a *PptApi) CreateListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusPptTemplateSlideVO, error) {
    raw, err := a.client.Post(BackendApiPath("/ppt/template/slide/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusPptTemplateSlideVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusPptTemplateSlideVO](raw)
}

// Get all PPT template slides
func (a *PptApi) CreateListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusPptTemplateSlideVO, error) {
    raw, err := a.client.Post(BackendApiPath("/ppt/template/slide/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusPptTemplateSlideVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusPptTemplateSlideVO](raw)
}

// Render PPT template
func (a *PptApi) Render(body sdktypes.PlusPptTemplateRenderForm) (sdktypes.PlusApiResult, error) {
    raw, err := a.client.Post(BackendApiPath("/ppt/template/render"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResult
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResult](raw)
}

// Get PPT templates by page
func (a *PptApi) CreateListByPageTemplate(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusPptTemplateVO, error) {
    raw, err := a.client.Post(BackendApiPath("/ppt/template/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusPptTemplateVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusPptTemplateVO](raw)
}

// Get all PPT templates
func (a *PptApi) CreateListAllEntitiesTemplate(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusPptTemplateVO, error) {
    raw, err := a.client.Post(BackendApiPath("/ppt/template/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusPptTemplateVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusPptTemplateVO](raw)
}

func (a *PptApi) Stop(query map[string]interface{}, headers map[string]string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Post(BackendApiPath("/ppt/template/chat/stop"), nil, query, headers, "")
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Create a chat completion with PPT template
func (a *PptApi) CreateCompletions(body sdktypes.ChatCompletionCreateForm, query map[string]interface{}, headers map[string]string) (sdktypes.ChatCompletionChunk, error) {
    raw, err := a.client.Post(BackendApiPath("/ppt/template/chat/completions"), body, query, headers, "")
    if err != nil {
        var zero sdktypes.ChatCompletionChunk
        return zero, err
    }
    return decodeResult[sdktypes.ChatCompletionChunk](raw)
}

// Get a PPT template by ID
func (a *PptApi) GetById(id string) (sdktypes.PlusApiResultPlusPptTemplateVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/ppt/template/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusPptTemplateVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusPptTemplateVO](raw)
}

// Delete a PPT template
func (a *PptApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/ppt/template/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Get a PPT template slide by ID
func (a *PptApi) GetByIdSlide(id string) (sdktypes.PlusApiResultPlusPptTemplateSlideVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/ppt/template/slide/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusPptTemplateSlideVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusPptTemplateSlideVO](raw)
}

// Delete a PPT template slide
func (a *PptApi) DeleteSlide(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/ppt/template/slide/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
