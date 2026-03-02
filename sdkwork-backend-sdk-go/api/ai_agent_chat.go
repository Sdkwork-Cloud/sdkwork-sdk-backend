package api

import (
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type AiAgentChatApi struct {
    client *sdkhttp.Client
}

func NewAiAgentChatApi(client *sdkhttp.Client) *AiAgentChatApi {
    return &AiAgentChatApi{client: client}
}

// Create a chat completion with agent
func (a *AiAgentChatApi) WithContext(body sdktypes.ChatCompletionCreateForm, headers map[string]string) (sdktypes.ChatCompletionChunk, error) {
    raw, err := a.client.Post(BackendApiPath("/agent/chat/with_context"), body, nil, headers, "")
    if err != nil {
        var zero sdktypes.ChatCompletionChunk
        return zero, err
    }
    return decodeResult[sdktypes.ChatCompletionChunk](raw)
}

// Stop a chat completion stream
func (a *AiAgentChatApi) Stop(headers map[string]string) (sdktypes.PlusApiResult, error) {
    raw, err := a.client.Post(BackendApiPath("/agent/chat/stop"), nil, nil, headers, "")
    if err != nil {
        var zero sdktypes.PlusApiResult
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResult](raw)
}

// Create a chat completion with agent
func (a *AiAgentChatApi) ResumeStream(body sdktypes.ChatCompletionCreateForm, headers map[string]string) (sdktypes.ChatCompletionChunk, error) {
    raw, err := a.client.Post(BackendApiPath("/agent/chat/resume_stream"), body, nil, headers, "")
    if err != nil {
        var zero sdktypes.ChatCompletionChunk
        return zero, err
    }
    return decodeResult[sdktypes.ChatCompletionChunk](raw)
}

// Create a chat completion with agent
func (a *AiAgentChatApi) Create(body sdktypes.ChatCompletionCreateForm, headers map[string]string) (sdktypes.ChatCompletionChunk, error) {
    raw, err := a.client.Post(BackendApiPath("/agent/chat/completions"), body, nil, headers, "")
    if err != nil {
        var zero sdktypes.ChatCompletionChunk
        return zero, err
    }
    return decodeResult[sdktypes.ChatCompletionChunk](raw)
}
