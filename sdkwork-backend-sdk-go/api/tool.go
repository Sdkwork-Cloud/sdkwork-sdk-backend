package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type ToolApi struct {
    client *sdkhttp.Client
}

func NewToolApi(client *sdkhttp.Client) *ToolApi {
    return &ToolApi{client: client}
}

// Update an existing AI tool
func (a *ToolApi) Update(body sdktypes.PlusAiToolForm) (sdktypes.PlusApiResultPlusAiToolVO, error) {
    raw, err := a.client.Put(BackendApiPath("/tool"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAiToolVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAiToolVO](raw)
}

// Create a new AI tool
func (a *ToolApi) Create(body sdktypes.PlusAiToolForm) (sdktypes.PlusApiResultPlusAiToolVO, error) {
    raw, err := a.client.Post(BackendApiPath("/tool"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAiToolVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAiToolVO](raw)
}

// Get AI tools by page
func (a *ToolApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusAiToolVO, error) {
    raw, err := a.client.Post(BackendApiPath("/tool/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusAiToolVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusAiToolVO](raw)
}

// Get all AI tools
func (a *ToolApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusAiToolVO, error) {
    raw, err := a.client.Post(BackendApiPath("/tool/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusAiToolVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusAiToolVO](raw)
}

// Get an AI tool by ID
func (a *ToolApi) GetById(id string) (sdktypes.PlusApiResultPlusAiToolVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/tool/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAiToolVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAiToolVO](raw)
}

// Delete an AI tool
func (a *ToolApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/tool/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
