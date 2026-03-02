package api

import (
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type AiChatApi struct {
    client *sdkhttp.Client
}

func NewAiChatApi(client *sdkhttp.Client) *AiChatApi {
    return &AiChatApi{client: client}
}

// Stop a chat completion stream
func (a *AiChatApi) Stop(headers map[string]string) (sdktypes.PlusApiResult, error) {
    raw, err := a.client.Post(BackendApiPath("/chat/stop"), nil, nil, headers, "")
    if err != nil {
        var zero sdktypes.PlusApiResult
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResult](raw)
}

// Create a chat completion
func (a *AiChatApi) Create(body sdktypes.ChatCompletionCreateForm, headers map[string]string) (sdktypes.ChatCompletionChunk, error) {
    raw, err := a.client.Post(BackendApiPath("/chat/completions"), body, nil, headers, "")
    if err != nil {
        var zero sdktypes.ChatCompletionChunk
        return zero, err
    }
    return decodeResult[sdktypes.ChatCompletionChunk](raw)
}
