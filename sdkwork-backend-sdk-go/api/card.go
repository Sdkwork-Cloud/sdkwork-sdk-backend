package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type CardApi struct {
    client *sdkhttp.Client
}

func NewCardApi(client *sdkhttp.Client) *CardApi {
    return &CardApi{client: client}
}

// Update an existing membership card
func (a *CardApi) Update(body sdktypes.PlusCardForm) (sdktypes.PlusApiResultPlusCardVO, error) {
    raw, err := a.client.Put(BackendApiPath("/card"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusCardVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusCardVO](raw)
}

// Create a new membership card
func (a *CardApi) Create(body sdktypes.PlusCardForm) (sdktypes.PlusApiResultPlusCardVO, error) {
    raw, err := a.client.Post(BackendApiPath("/card"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusCardVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusCardVO](raw)
}

// Update an existing card template
func (a *CardApi) UpdateTemplate(body sdktypes.PlusCardTemplateForm) (sdktypes.PlusApiResultPlusCardTemplateVO, error) {
    raw, err := a.client.Put(BackendApiPath("/card/template"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusCardTemplateVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusCardTemplateVO](raw)
}

// Create a new card template
func (a *CardApi) CreateTemplate(body sdktypes.PlusCardTemplateForm) (sdktypes.PlusApiResultPlusCardTemplateVO, error) {
    raw, err := a.client.Post(BackendApiPath("/card/template"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusCardTemplateVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusCardTemplateVO](raw)
}

// Get card templates by page
func (a *CardApi) CreateListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusCardTemplateVO, error) {
    raw, err := a.client.Post(BackendApiPath("/card/template/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusCardTemplateVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusCardTemplateVO](raw)
}

// Get all card templates
func (a *CardApi) CreateListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusCardTemplateVO, error) {
    raw, err := a.client.Post(BackendApiPath("/card/template/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusCardTemplateVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusCardTemplateVO](raw)
}

// Get membership cards by page
func (a *CardApi) CreateListByPageCard(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusCardVO, error) {
    raw, err := a.client.Post(BackendApiPath("/card/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusCardVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusCardVO](raw)
}

// Get all membership cards
func (a *CardApi) CreateListAllEntitiesCard(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusCardVO, error) {
    raw, err := a.client.Post(BackendApiPath("/card/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusCardVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusCardVO](raw)
}

// Get a membership card by ID
func (a *CardApi) GetById(id string) (sdktypes.PlusApiResultPlusCardVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/card/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusCardVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusCardVO](raw)
}

// Delete a membership card
func (a *CardApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/card/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Get a card template by ID
func (a *CardApi) GetByIdTemplate(id string) (sdktypes.PlusApiResultPlusCardTemplateVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/card/template/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusCardTemplateVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusCardTemplateVO](raw)
}

// Delete a card template
func (a *CardApi) DeleteTemplate(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/card/template/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
