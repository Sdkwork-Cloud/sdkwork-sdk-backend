package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type ShareApi struct {
    client *sdkhttp.Client
}

func NewShareApi(client *sdkhttp.Client) *ShareApi {
    return &ShareApi{client: client}
}

// 更新分享
func (a *ShareApi) Update(body sdktypes.PlusShareForm) (sdktypes.PlusApiResultPlusShareVO, error) {
    raw, err := a.client.Put(BackendApiPath("/share"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusShareVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusShareVO](raw)
}

// 创建分享
func (a *ShareApi) Create(body sdktypes.PlusShareForm) (sdktypes.PlusApiResultPlusShareVO, error) {
    raw, err := a.client.Post(BackendApiPath("/share"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusShareVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusShareVO](raw)
}

// 分页获取分享
func (a *ShareApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusShareVO, error) {
    raw, err := a.client.Post(BackendApiPath("/share/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusShareVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusShareVO](raw)
}

// 获取所有分享
func (a *ShareApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusShareVO, error) {
    raw, err := a.client.Post(BackendApiPath("/share/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusShareVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusShareVO](raw)
}

// 获取分享详情
func (a *ShareApi) GetById(id string) (sdktypes.PlusApiResultPlusShareVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/share/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusShareVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusShareVO](raw)
}

// 删除分享
func (a *ShareApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/share/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
