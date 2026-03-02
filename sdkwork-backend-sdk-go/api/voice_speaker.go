package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type VoiceSpeakerApi struct {
    client *sdkhttp.Client
}

func NewVoiceSpeakerApi(client *sdkhttp.Client) *VoiceSpeakerApi {
    return &VoiceSpeakerApi{client: client}
}

// Update an existing voice speaker
func (a *VoiceSpeakerApi) Update(body sdktypes.PlusVoiceSpeakerForm) (sdktypes.PlusApiResultPlusVoiceSpeakerVO, error) {
    raw, err := a.client.Put(BackendApiPath("/voice/speaker"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVoiceSpeakerVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVoiceSpeakerVO](raw)
}

// Create a new voice speaker
func (a *VoiceSpeakerApi) Create(body sdktypes.PlusVoiceSpeakerForm) (sdktypes.PlusApiResultPlusVoiceSpeakerVO, error) {
    raw, err := a.client.Post(BackendApiPath("/voice/speaker"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVoiceSpeakerVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVoiceSpeakerVO](raw)
}

// Get voice speakers by page
func (a *VoiceSpeakerApi) ListPublic(body *sdktypes.PlusVoiceSpeakerQueryForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusVoiceSpeakerVO, error) {
    raw, err := a.client.Post(BackendApiPath("/voice/speaker/list_public"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusVoiceSpeakerVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusVoiceSpeakerVO](raw)
}

// Get voice speakers by page
func (a *VoiceSpeakerApi) ListByPage(body *sdktypes.PlusVoiceSpeakerQueryForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusVoiceSpeakerVO, error) {
    raw, err := a.client.Post(BackendApiPath("/voice/speaker/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusVoiceSpeakerVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusVoiceSpeakerVO](raw)
}

// Get all voice speakers
func (a *VoiceSpeakerApi) ListAllEntities(body *sdktypes.PlusVoiceSpeakerQueryForm) (sdktypes.PlusApiResultListPlusVoiceSpeakerVO, error) {
    raw, err := a.client.Post(BackendApiPath("/voice/speaker/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusVoiceSpeakerVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusVoiceSpeakerVO](raw)
}

// Get a voice speaker by ID
func (a *VoiceSpeakerApi) GetById(id string) (sdktypes.PlusApiResultPlusVoiceSpeakerVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/voice/speaker/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVoiceSpeakerVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVoiceSpeakerVO](raw)
}

// Delete a voice speaker
func (a *VoiceSpeakerApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/voice/speaker/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
