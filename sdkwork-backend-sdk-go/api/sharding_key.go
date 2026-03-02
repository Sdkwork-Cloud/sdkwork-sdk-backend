package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type ShardingKeyApi struct {
    client *sdkhttp.Client
}

func NewShardingKeyApi(client *sdkhttp.Client) *ShardingKeyApi {
    return &ShardingKeyApi{client: client}
}

// Update Sharding Key
func (a *ShardingKeyApi) Update(body sdktypes.PlusShardingKeyForm) (sdktypes.PlusApiResultPlusShardingKeyVO, error) {
    raw, err := a.client.Put(BackendApiPath("/sharding/key"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusShardingKeyVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusShardingKeyVO](raw)
}

// Create Sharding Key
func (a *ShardingKeyApi) Create(body sdktypes.PlusShardingKeyForm) (sdktypes.PlusApiResultPlusShardingKeyVO, error) {
    raw, err := a.client.Post(BackendApiPath("/sharding/key"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusShardingKeyVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusShardingKeyVO](raw)
}

// List Sharding Keys by Page
func (a *ShardingKeyApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusShardingKeyVO, error) {
    raw, err := a.client.Post(BackendApiPath("/sharding/key/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusShardingKeyVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusShardingKeyVO](raw)
}

// List All Sharding Keys
func (a *ShardingKeyApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusShardingKeyVO, error) {
    raw, err := a.client.Post(BackendApiPath("/sharding/key/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusShardingKeyVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusShardingKeyVO](raw)
}

// Get Sharding Key by ID
func (a *ShardingKeyApi) GetById(id string) (sdktypes.PlusApiResultPlusShardingKeyVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/sharding/key/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusShardingKeyVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusShardingKeyVO](raw)
}

// Delete Sharding Key
func (a *ShardingKeyApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/sharding/key/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
