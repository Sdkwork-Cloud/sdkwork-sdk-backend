package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type ChatGroupApi struct {
    client *sdkhttp.Client
}

func NewChatGroupApi(client *sdkhttp.Client) *ChatGroupApi {
    return &ChatGroupApi{client: client}
}

// Update an existing chat group
func (a *ChatGroupApi) Update(body sdktypes.PlusImGroupForm) (sdktypes.PlusApiResultPlusImGroupVO, error) {
    raw, err := a.client.Put(BackendApiPath("/im/group"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusImGroupVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusImGroupVO](raw)
}

// Create a new chat group
func (a *ChatGroupApi) Create(body sdktypes.PlusImGroupForm) (sdktypes.PlusApiResultPlusImGroupVO, error) {
    raw, err := a.client.Post(BackendApiPath("/im/group"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusImGroupVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusImGroupVO](raw)
}

// Get chat groups by page
func (a *ChatGroupApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusImGroupVO, error) {
    raw, err := a.client.Post(BackendApiPath("/im/group/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusImGroupVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusImGroupVO](raw)
}

// Get all chat groups
func (a *ChatGroupApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusImGroupVO, error) {
    raw, err := a.client.Post(BackendApiPath("/im/group/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusImGroupVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusImGroupVO](raw)
}

// Get a chat group by ID
func (a *ChatGroupApi) GetById(id string) (sdktypes.PlusApiResultPlusImGroupVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/im/group/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusImGroupVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusImGroupVO](raw)
}

// Delete a chat group
func (a *ChatGroupApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/im/group/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
