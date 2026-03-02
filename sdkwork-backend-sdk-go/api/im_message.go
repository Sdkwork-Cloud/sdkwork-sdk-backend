package api

import (
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type ImMessageApi struct {
    client *sdkhttp.Client
}

func NewImMessageApi(client *sdkhttp.Client) *ImMessageApi {
    return &ImMessageApi{client: client}
}

// Get messages by page
func (a *ImMessageApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusMessage, error) {
    raw, err := a.client.Post(BackendApiPath("/im/message/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusMessage
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusMessage](raw)
}
