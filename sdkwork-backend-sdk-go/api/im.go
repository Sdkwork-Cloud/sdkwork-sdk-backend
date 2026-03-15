package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type ImApi struct {
    client *sdkhttp.Client
}

func NewImApi(client *sdkhttp.Client) *ImApi {
    return &ImApi{client: client}
}

// Update an existing chat group
func (a *ImApi) Update(body sdktypes.PlusImGroupForm) (sdktypes.PlusApiResultPlusImGroupVO, error) {
    raw, err := a.client.Put(BackendApiPath("/im/group"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusImGroupVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusImGroupVO](raw)
}

// Create a new chat group
func (a *ImApi) Create(body sdktypes.PlusImGroupForm) (sdktypes.PlusApiResultPlusImGroupVO, error) {
    raw, err := a.client.Post(BackendApiPath("/im/group"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusImGroupVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusImGroupVO](raw)
}

// Mark conversation messages as read
func (a *ImApi) MarkRead(body sdktypes.PlusImMessageMarkReadForm) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Post(BackendApiPath("/im/message/mark_read"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Get messages by page
func (a *ImApi) CreateListByPage(body *sdktypes.PlusImMessageQueryForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusMessage, error) {
    raw, err := a.client.Post(BackendApiPath("/im/message/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusMessage
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusMessage](raw)
}

// Get chat groups by page
func (a *ImApi) CreateListByPageGroup(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusImGroupVO, error) {
    raw, err := a.client.Post(BackendApiPath("/im/group/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusImGroupVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusImGroupVO](raw)
}

// Get all chat groups
func (a *ImApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusImGroupVO, error) {
    raw, err := a.client.Post(BackendApiPath("/im/group/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusImGroupVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusImGroupVO](raw)
}

// Get a chat group by ID
func (a *ImApi) GetById(id string) (sdktypes.PlusApiResultPlusImGroupVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/im/group/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusImGroupVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusImGroupVO](raw)
}

// Delete a chat group
func (a *ImApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/im/group/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
