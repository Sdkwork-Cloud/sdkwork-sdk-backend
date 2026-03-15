package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type MessageApi struct {
    client *sdkhttp.Client
}

func NewMessageApi(client *sdkhttp.Client) *MessageApi {
    return &MessageApi{client: client}
}

// Update an existing chat message
func (a *MessageApi) Update(body sdktypes.PlusChatMessageContentForm) (sdktypes.PlusApiResultPlusChatMessageContentVO, error) {
    raw, err := a.client.Put(BackendApiPath("/message"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusChatMessageContentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusChatMessageContentVO](raw)
}

// Create a new chat message
func (a *MessageApi) Create(body sdktypes.PlusChatMessageContentForm) (sdktypes.PlusApiResultPlusChatMessageContentVO, error) {
    raw, err := a.client.Post(BackendApiPath("/message"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusChatMessageContentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusChatMessageContentVO](raw)
}

// Get chat messages by page
func (a *MessageApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusChatMessageContentVO, error) {
    raw, err := a.client.Post(BackendApiPath("/message/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusChatMessageContentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusChatMessageContentVO](raw)
}

// Get all chat messages
func (a *MessageApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusChatMessageContentVO, error) {
    raw, err := a.client.Post(BackendApiPath("/message/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusChatMessageContentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusChatMessageContentVO](raw)
}

// Get chat message by ID
func (a *MessageApi) GetById(id string) (sdktypes.PlusApiResultPlusChatMessageContentVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/message/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusChatMessageContentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusChatMessageContentVO](raw)
}

// Delete a chat message
func (a *MessageApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/message/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
