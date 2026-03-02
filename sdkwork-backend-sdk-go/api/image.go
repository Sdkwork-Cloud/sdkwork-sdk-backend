package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type ImageApi struct {
    client *sdkhttp.Client
}

func NewImageApi(client *sdkhttp.Client) *ImageApi {
    return &ImageApi{client: client}
}

// Update an existing image
func (a *ImageApi) Update(body sdktypes.PlusImageForm) (sdktypes.PlusApiResultPlusImageVO, error) {
    raw, err := a.client.Put(BackendApiPath("/image"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusImageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusImageVO](raw)
}

// Create a new image
func (a *ImageApi) Create(body sdktypes.PlusImageForm) (sdktypes.PlusApiResultPlusImageVO, error) {
    raw, err := a.client.Post(BackendApiPath("/image"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusImageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusImageVO](raw)
}

// Get images by page
func (a *ImageApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusImageVO, error) {
    raw, err := a.client.Post(BackendApiPath("/image/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusImageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusImageVO](raw)
}

// Get all images
func (a *ImageApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusImageVO, error) {
    raw, err := a.client.Post(BackendApiPath("/image/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusImageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusImageVO](raw)
}

// Get an image by ID
func (a *ImageApi) GetById(id string) (sdktypes.PlusApiResultPlusImageVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/image/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusImageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusImageVO](raw)
}

// Delete an image
func (a *ImageApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/image/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
