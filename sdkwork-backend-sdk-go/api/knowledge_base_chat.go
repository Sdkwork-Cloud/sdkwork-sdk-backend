package api

import (
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type KnowledgeBaseChatApi struct {
    client *sdkhttp.Client
}

func NewKnowledgeBaseChatApi(client *sdkhttp.Client) *KnowledgeBaseChatApi {
    return &KnowledgeBaseChatApi{client: client}
}

func (a *KnowledgeBaseChatApi) Stop(headers map[string]string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Post(BackendApiPath("/knowledge_base/chat/stop"), nil, nil, headers, "")
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Create a chat completion with Knowledge base
func (a *KnowledgeBaseChatApi) Create(body sdktypes.ChatCompletionCreateForm, headers map[string]string) (sdktypes.ChatCompletionChunk, error) {
    raw, err := a.client.Post(BackendApiPath("/knowledge_base/chat/completions"), body, nil, headers, "")
    if err != nil {
        var zero sdktypes.ChatCompletionChunk
        return zero, err
    }
    return decodeResult[sdktypes.ChatCompletionChunk](raw)
}
