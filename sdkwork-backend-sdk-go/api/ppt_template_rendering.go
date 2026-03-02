package api

import (
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type PptTemplateRenderingApi struct {
    client *sdkhttp.Client
}

func NewPptTemplateRenderingApi(client *sdkhttp.Client) *PptTemplateRenderingApi {
    return &PptTemplateRenderingApi{client: client}
}

// Render PPT template
func (a *PptTemplateRenderingApi) Render(body sdktypes.PlusPptTemplateRenderForm) (sdktypes.PlusApiResult, error) {
    raw, err := a.client.Post(BackendApiPath("/ppt/template/render"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResult
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResult](raw)
}
