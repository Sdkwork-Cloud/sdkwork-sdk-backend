package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type CharacterApi struct {
    client *sdkhttp.Client
}

func NewCharacterApi(client *sdkhttp.Client) *CharacterApi {
    return &CharacterApi{client: client}
}

// Update character
func (a *CharacterApi) Update(body sdktypes.PlusCharacterForm) (sdktypes.PlusApiResultPlusCharacterVO, error) {
    raw, err := a.client.Put(BackendApiPath("/character"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusCharacterVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusCharacterVO](raw)
}

// Create character
func (a *CharacterApi) Create(body sdktypes.PlusCharacterForm) (sdktypes.PlusApiResultPlusCharacterVO, error) {
    raw, err := a.client.Post(BackendApiPath("/character"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusCharacterVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusCharacterVO](raw)
}

// Get characters by page
func (a *CharacterApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusCharacterVO, error) {
    raw, err := a.client.Post(BackendApiPath("/character/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusCharacterVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusCharacterVO](raw)
}

// Get all characters
func (a *CharacterApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusCharacterVO, error) {
    raw, err := a.client.Post(BackendApiPath("/character/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusCharacterVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusCharacterVO](raw)
}

// Get character by ID
func (a *CharacterApi) GetById(id string) (sdktypes.PlusApiResultPlusCharacterVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/character/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusCharacterVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusCharacterVO](raw)
}

// Delete character
func (a *CharacterApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/character/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
