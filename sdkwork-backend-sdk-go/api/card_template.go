package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type CardTemplateApi struct {
    client *sdkhttp.Client
}

func NewCardTemplateApi(client *sdkhttp.Client) *CardTemplateApi {
    return &CardTemplateApi{client: client}
}

// Update an existing card template
func (a *CardTemplateApi) Update(body sdktypes.PlusCardTemplateForm) (sdktypes.PlusApiResultPlusCardTemplateVO, error) {
    raw, err := a.client.Put(BackendApiPath("/card/template"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusCardTemplateVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusCardTemplateVO](raw)
}

// Create a new card template
func (a *CardTemplateApi) Create(body sdktypes.PlusCardTemplateForm) (sdktypes.PlusApiResultPlusCardTemplateVO, error) {
    raw, err := a.client.Post(BackendApiPath("/card/template"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusCardTemplateVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusCardTemplateVO](raw)
}

// Get card templates by page
func (a *CardTemplateApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusCardTemplateVO, error) {
    raw, err := a.client.Post(BackendApiPath("/card/template/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusCardTemplateVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusCardTemplateVO](raw)
}

// Get all card templates
func (a *CardTemplateApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusCardTemplateVO, error) {
    raw, err := a.client.Post(BackendApiPath("/card/template/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusCardTemplateVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusCardTemplateVO](raw)
}

// Get a card template by ID
func (a *CardTemplateApi) GetById(id string) (sdktypes.PlusApiResultPlusCardTemplateVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/card/template/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusCardTemplateVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusCardTemplateVO](raw)
}

// Delete a card template
func (a *CardTemplateApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/card/template/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
