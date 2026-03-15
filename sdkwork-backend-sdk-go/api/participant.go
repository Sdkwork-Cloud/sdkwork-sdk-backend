package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type ParticipantApi struct {
    client *sdkhttp.Client
}

func NewParticipantApi(client *sdkhttp.Client) *ParticipantApi {
    return &ParticipantApi{client: client}
}

// Update an existing chat participant
func (a *ParticipantApi) Update(body sdktypes.PlusParticipantForm) (sdktypes.PlusApiResultPlusParticipantVO, error) {
    raw, err := a.client.Put(BackendApiPath("/participant"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusParticipantVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusParticipantVO](raw)
}

// Create a new chat participant
func (a *ParticipantApi) Create(body sdktypes.PlusParticipantForm) (sdktypes.PlusApiResultPlusParticipantVO, error) {
    raw, err := a.client.Post(BackendApiPath("/participant"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusParticipantVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusParticipantVO](raw)
}

// Get chat participants by page
func (a *ParticipantApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusParticipantVO, error) {
    raw, err := a.client.Post(BackendApiPath("/participant/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusParticipantVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusParticipantVO](raw)
}

// Get all chat participants
func (a *ParticipantApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusParticipantVO, error) {
    raw, err := a.client.Post(BackendApiPath("/participant/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusParticipantVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusParticipantVO](raw)
}

// Get a chat participant by ID
func (a *ParticipantApi) GetById(id string) (sdktypes.PlusApiResultPlusParticipantVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/participant/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusParticipantVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusParticipantVO](raw)
}

// Delete a chat participant
func (a *ParticipantApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/participant/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
