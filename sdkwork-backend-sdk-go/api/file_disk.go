package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type FileDiskApi struct {
    client *sdkhttp.Client
}

func NewFileDiskApi(client *sdkhttp.Client) *FileDiskApi {
    return &FileDiskApi{client: client}
}

// Update an existing file disk
func (a *FileDiskApi) Update(body sdktypes.PlusDiskForm) (sdktypes.PlusApiResultPlusDiskVO, error) {
    raw, err := a.client.Put(BackendApiPath("/disk"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusDiskVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusDiskVO](raw)
}

// Create a new file disk
func (a *FileDiskApi) Create(body sdktypes.PlusDiskForm) (sdktypes.PlusApiResultPlusDiskVO, error) {
    raw, err := a.client.Post(BackendApiPath("/disk"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusDiskVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusDiskVO](raw)
}

// Get file disks by page
func (a *FileDiskApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusDiskVO, error) {
    raw, err := a.client.Post(BackendApiPath("/disk/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusDiskVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusDiskVO](raw)
}

// Get all file disks
func (a *FileDiskApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusDiskVO, error) {
    raw, err := a.client.Post(BackendApiPath("/disk/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusDiskVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusDiskVO](raw)
}

// Get a file disk by ID
func (a *FileDiskApi) GetById(id string) (sdktypes.PlusApiResultPlusDiskVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/disk/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusDiskVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusDiskVO](raw)
}

// Delete a file disk
func (a *FileDiskApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/disk/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
