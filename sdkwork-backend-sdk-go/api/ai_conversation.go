package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type AiConversationApi struct {
    client *sdkhttp.Client
}

func NewAiConversationApi(client *sdkhttp.Client) *AiConversationApi {
    return &AiConversationApi{client: client}
}

// Update an existing conversation
func (a *AiConversationApi) Update(body sdktypes.PlusConversationForm) (sdktypes.PlusApiResultPlusConversationVO, error) {
    raw, err := a.client.Put(BackendApiPath("/conversation"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusConversationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusConversationVO](raw)
}

// Create a new conversation
func (a *AiConversationApi) Create(body sdktypes.PlusConversationForm) (sdktypes.PlusApiResultPlusConversationVO, error) {
    raw, err := a.client.Post(BackendApiPath("/conversation"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusConversationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusConversationVO](raw)
}

// Pin/Unpin a conversation
func (a *AiConversationApi) PinConversation(id string, query map[string]interface{}) (sdktypes.PlusApiResultPlusConversationVO, error) {
    raw, err := a.client.Post(BackendApiPath(fmt.Sprintf("/conversation/%s/pin", id)), nil, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusConversationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusConversationVO](raw)
}

// Get all open conversations
func (a *AiConversationApi) Open(body *sdktypes.PlusConversationOpenForm) (sdktypes.PlusApiResultPlusConversationVO, error) {
    raw, err := a.client.Post(BackendApiPath("/conversation/open"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusConversationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusConversationVO](raw)
}

// Update an existing conversation
func (a *AiConversationApi) MessageFeedback(body sdktypes.PlusMessageFeedbackForm) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Post(BackendApiPath("/conversation/message_feedback"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Get conversations by page
func (a *AiConversationApi) ListByPage(body *sdktypes.PlusConversationQueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusConversationVO, error) {
    raw, err := a.client.Post(BackendApiPath("/conversation/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusConversationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusConversationVO](raw)
}

// Get all conversations
func (a *AiConversationApi) ListAllEntities(body *sdktypes.PlusConversationQueryListForm) (sdktypes.PlusApiResultListPlusConversationVO, error) {
    raw, err := a.client.Post(BackendApiPath("/conversation/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusConversationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusConversationVO](raw)
}

// Get a conversation by ID
func (a *AiConversationApi) GetById(id string) (sdktypes.PlusApiResultPlusConversationVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/conversation/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusConversationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusConversationVO](raw)
}

// Delete a conversation
func (a *AiConversationApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/conversation/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
