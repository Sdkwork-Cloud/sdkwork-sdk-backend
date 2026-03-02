package api

import (
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type PptTemplateChatApi struct {
    client *sdkhttp.Client
}

func NewPptTemplateChatApi(client *sdkhttp.Client) *PptTemplateChatApi {
    return &PptTemplateChatApi{client: client}
}

func (a *PptTemplateChatApi) Stop(headers map[string]string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Post(BackendApiPath("/ppt/template/chat/stop"), nil, nil, headers, "")
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Create a chat completion with PPT template
func (a *PptTemplateChatApi) Create(body sdktypes.ChatCompletionCreateForm, headers map[string]string) (sdktypes.ChatCompletionChunk, error) {
    raw, err := a.client.Post(BackendApiPath("/ppt/template/chat/completions"), body, nil, headers, "")
    if err != nil {
        var zero sdktypes.ChatCompletionChunk
        return zero, err
    }
    return decodeResult[sdktypes.ChatCompletionChunk](raw)
}
