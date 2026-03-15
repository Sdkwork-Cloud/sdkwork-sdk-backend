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

// Update an existing DNS record
func (a *NetApi) UpdateRecord(body sdktypes.PlusDnsRecordForm) (sdktypes.PlusApiResultPlusDnsRecordVO, error) {
    raw, err := a.client.Put(BackendApiPath("/net/dns/record"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusDnsRecordVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusDnsRecordVO](raw)
}

// Create a new DNS record
func (a *NetApi) CreateRecord(body sdktypes.PlusDnsRecordForm) (sdktypes.PlusApiResultPlusDnsRecordVO, error) {
    raw, err := a.client.Post(BackendApiPath("/net/dns/record"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusDnsRecordVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusDnsRecordVO](raw)
}

// 分页获取域名
func (a *NetApi) CreateListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusHostDomainVO, error) {
    raw, err := a.client.Post(BackendApiPath("/net/host/domain/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusHostDomainVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusHostDomainVO](raw)
}

// 获取所有域名
func (a *NetApi) CreateListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusHostDomainVO, error) {
    raw, err := a.client.Post(BackendApiPath("/net/host/domain/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusHostDomainVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusHostDomainVO](raw)
}

// Get DNS records by page
func (a *NetApi) CreateListByPageRecord(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusDnsRecordVO, error) {
    raw, err := a.client.Post(BackendApiPath("/net/dns/record/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusDnsRecordVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusDnsRecordVO](raw)
}

// Get all DNS records
func (a *NetApi) CreateListAllEntitiesRecord(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusDnsRecordVO, error) {
    raw, err := a.client.Post(BackendApiPath("/net/dns/record/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusDnsRecordVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusDnsRecordVO](raw)
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

// Get a DNS record by ID
func (a *NetApi) GetByIdRecord(id string) (sdktypes.PlusApiResultPlusDnsRecordVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/net/dns/record/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusDnsRecordVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusDnsRecordVO](raw)
}

// Delete a DNS record
func (a *NetApi) DeleteRecord(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/net/dns/record/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
