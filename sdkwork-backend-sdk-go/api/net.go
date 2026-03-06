package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type NetApi struct {
    client *sdkhttp.Client
}

func NewNetApi(client *sdkhttp.Client) *NetApi {
    return &NetApi{client: client}
}

// 更新域名
func (a *NetApi) Update(body sdktypes.PlusHostDomainForm) (sdktypes.PlusApiResultPlusHostDomainVO, error) {
    raw, err := a.client.Put(BackendApiPath("/net/host/domain"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusHostDomainVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusHostDomainVO](raw)
}

// 创建域名
func (a *NetApi) Create(body sdktypes.PlusHostDomainForm) (sdktypes.PlusApiResultPlusHostDomainVO, error) {
    raw, err := a.client.Post(BackendApiPath("/net/host/domain"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusHostDomainVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusHostDomainVO](raw)
}

// 分页获取域名
func (a *NetApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusHostDomainVO, error) {
    raw, err := a.client.Post(BackendApiPath("/net/host/domain/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusHostDomainVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusHostDomainVO](raw)
}

// 获取所有域名
func (a *NetApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusHostDomainVO, error) {
    raw, err := a.client.Post(BackendApiPath("/net/host/domain/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusHostDomainVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusHostDomainVO](raw)
}

// 获取域名详情
func (a *NetApi) GetById(id string) (sdktypes.PlusApiResultPlusHostDomainVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/net/host/domain/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusHostDomainVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusHostDomainVO](raw)
}

// 删除域名
func (a *NetApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/net/host/domain/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
