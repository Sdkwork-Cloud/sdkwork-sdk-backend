package api

import (
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type SearchChatApi struct {
    client *sdkhttp.Client
}

func NewSearchChatApi(client *sdkhttp.Client) *SearchChatApi {
    return &SearchChatApi{client: client}
}

func (a *SearchChatApi) Stop(headers map[string]string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Post(BackendApiPath("/search/chat/stop"), nil, nil, headers, "")
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Create a chat completion with Search
func (a *SearchChatApi) Create(body sdktypes.ChatCompletionCreateForm, headers map[string]string) (sdktypes.ChatCompletionChunk, error) {
    raw, err := a.client.Post(BackendApiPath("/search/chat/completions"), body, nil, headers, "")
    if err != nil {
        var zero sdktypes.ChatCompletionChunk
        return zero, err
    }
    return decodeResult[sdktypes.ChatCompletionChunk](raw)
}
