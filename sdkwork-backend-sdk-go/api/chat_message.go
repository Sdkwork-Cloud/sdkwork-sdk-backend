package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type ChatMessageApi struct {
    client *sdkhttp.Client
}

func NewChatMessageApi(client *sdkhttp.Client) *ChatMessageApi {
    return &ChatMessageApi{client: client}
}

// Update an existing chat message
func (a *ChatMessageApi) Update(body sdktypes.PlusChatMessageContentForm) (sdktypes.PlusApiResultPlusChatMessageContentVO, error) {
    raw, err := a.client.Put(BackendApiPath("/message"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusChatMessageContentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusChatMessageContentVO](raw)
}

// Create a new chat message
func (a *ChatMessageApi) Create(body sdktypes.PlusChatMessageContentForm) (sdktypes.PlusApiResultPlusChatMessageContentVO, error) {
    raw, err := a.client.Post(BackendApiPath("/message"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusChatMessageContentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusChatMessageContentVO](raw)
}

// Update an existing chat message
func (a *ChatMessageApi) UpdateMessage(body sdktypes.PlusChatMessageForm) (sdktypes.PlusApiResultPlusChatMessageVO, error) {
    raw, err := a.client.Put(BackendApiPath("/chat/message"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusChatMessageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusChatMessageVO](raw)
}

// Create a new chat message
func (a *ChatMessageApi) CreateMessage(body sdktypes.PlusChatMessageForm) (sdktypes.PlusApiResultPlusChatMessageVO, error) {
    raw, err := a.client.Post(BackendApiPath("/chat/message"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusChatMessageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusChatMessageVO](raw)
}

// Get chat messages by page
func (a *ChatMessageApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusChatMessageContentVO, error) {
    raw, err := a.client.Post(BackendApiPath("/message/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusChatMessageContentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusChatMessageContentVO](raw)
}

// Get all chat messages
func (a *ChatMessageApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusChatMessageContentVO, error) {
    raw, err := a.client.Post(BackendApiPath("/message/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusChatMessageContentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusChatMessageContentVO](raw)
}

// Get chat messages by page
func (a *ChatMessageApi) LoadMore(body *sdktypes.ChatMessageQueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusChatMessageVO, error) {
    raw, err := a.client.Post(BackendApiPath("/chat/message/load_more"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusChatMessageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusChatMessageVO](raw)
}

// Get chat messages by page
func (a *ChatMessageApi) CreateListByPage(body *sdktypes.ChatMessageQueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusChatMessageVO, error) {
    raw, err := a.client.Post(BackendApiPath("/chat/message/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusChatMessageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusChatMessageVO](raw)
}

// Get all chat messages
func (a *ChatMessageApi) CreateListAllEntities(body *sdktypes.ChatMessageQueryListForm) (sdktypes.PlusApiResultListPlusChatMessageVO, error) {
    raw, err := a.client.Post(BackendApiPath("/chat/message/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusChatMessageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusChatMessageVO](raw)
}

// Get chat message by ID
func (a *ChatMessageApi) GetById(id string) (sdktypes.PlusApiResultPlusChatMessageContentVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/message/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusChatMessageContentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusChatMessageContentVO](raw)
}

// Delete a chat message
func (a *ChatMessageApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/message/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Get a chat message by ID
func (a *ChatMessageApi) GetByIdMessage(id string) (sdktypes.PlusApiResultPlusChatMessageVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/chat/message/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusChatMessageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusChatMessageVO](raw)
}

// Delete a chat message
func (a *ChatMessageApi) DeleteMessage(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/chat/message/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
