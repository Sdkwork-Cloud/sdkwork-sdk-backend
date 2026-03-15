package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type ChatApi struct {
    client *sdkhttp.Client
}

func NewChatApi(client *sdkhttp.Client) *ChatApi {
    return &ChatApi{client: client}
}

// Update an existing chat message
func (a *ChatApi) UpdateMessage(body sdktypes.PlusChatMessageForm) (sdktypes.PlusApiResultPlusChatMessageVO, error) {
    raw, err := a.client.Put(BackendApiPath("/chat/message"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusChatMessageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusChatMessageVO](raw)
}

// Create a new chat message
func (a *ChatApi) CreateMessage(body sdktypes.PlusChatMessageForm) (sdktypes.PlusApiResultPlusChatMessageVO, error) {
    raw, err := a.client.Post(BackendApiPath("/chat/message"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusChatMessageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusChatMessageVO](raw)
}

// Stop a chat completion stream
func (a *ChatApi) Stop(query map[string]interface{}, headers map[string]string) (sdktypes.PlusApiResult, error) {
    raw, err := a.client.Post(BackendApiPath("/chat/stop"), nil, query, headers, "")
    if err != nil {
        var zero sdktypes.PlusApiResult
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResult](raw)
}

// Get chat messages by page
func (a *ChatApi) LoadMore(body *sdktypes.ChatMessageQueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusChatMessageVO, error) {
    raw, err := a.client.Post(BackendApiPath("/chat/message/load_more"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusChatMessageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusChatMessageVO](raw)
}

// Get chat messages by page
func (a *ChatApi) CreateListByPage(body *sdktypes.ChatMessageQueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusChatMessageVO, error) {
    raw, err := a.client.Post(BackendApiPath("/chat/message/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusChatMessageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusChatMessageVO](raw)
}

// Get all chat messages
func (a *ChatApi) CreateListAllEntities(body *sdktypes.ChatMessageQueryListForm) (sdktypes.PlusApiResultListPlusChatMessageVO, error) {
    raw, err := a.client.Post(BackendApiPath("/chat/message/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusChatMessageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusChatMessageVO](raw)
}

// Create a chat completion
func (a *ChatApi) Create(body sdktypes.ChatCompletionCreateForm, query map[string]interface{}, headers map[string]string) (sdktypes.ChatCompletionChunk, error) {
    raw, err := a.client.Post(BackendApiPath("/chat/completions"), body, query, headers, "")
    if err != nil {
        var zero sdktypes.ChatCompletionChunk
        return zero, err
    }
    return decodeResult[sdktypes.ChatCompletionChunk](raw)
}

// Get a chat message by ID
func (a *ChatApi) GetByIdMessage(id string) (sdktypes.PlusApiResultPlusChatMessageVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/chat/message/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusChatMessageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusChatMessageVO](raw)
}

// Delete a chat message
func (a *ChatApi) DeleteMessage(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/chat/message/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
