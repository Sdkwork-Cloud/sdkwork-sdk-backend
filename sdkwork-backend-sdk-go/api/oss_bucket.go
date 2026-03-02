package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type OssBucketApi struct {
    client *sdkhttp.Client
}

func NewOssBucketApi(client *sdkhttp.Client) *OssBucketApi {
    return &OssBucketApi{client: client}
}

// Update an existing OSS bucket
func (a *OssBucketApi) Update(body sdktypes.PlusOssBucketForm) (sdktypes.PlusApiResultPlusOssBucketVO, error) {
    raw, err := a.client.Put(BackendApiPath("/oss/bucket"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusOssBucketVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusOssBucketVO](raw)
}

// Create a new OSS bucket
func (a *OssBucketApi) Create(body sdktypes.PlusOssBucketForm) (sdktypes.PlusApiResultPlusOssBucketVO, error) {
    raw, err := a.client.Post(BackendApiPath("/oss/bucket"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusOssBucketVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusOssBucketVO](raw)
}

// Get OSS buckets by page
func (a *OssBucketApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusOssBucketVO, error) {
    raw, err := a.client.Post(BackendApiPath("/oss/bucket/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusOssBucketVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusOssBucketVO](raw)
}

// Get all OSS buckets
func (a *OssBucketApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusOssBucketVO, error) {
    raw, err := a.client.Post(BackendApiPath("/oss/bucket/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusOssBucketVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusOssBucketVO](raw)
}

// Get an OSS bucket by ID
func (a *OssBucketApi) GetById(id string) (sdktypes.PlusApiResultPlusOssBucketVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/oss/bucket/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusOssBucketVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusOssBucketVO](raw)
}

// Delete an OSS bucket
func (a *OssBucketApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/oss/bucket/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
