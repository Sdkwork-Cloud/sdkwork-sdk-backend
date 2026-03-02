package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type DnsRecordApi struct {
    client *sdkhttp.Client
}

func NewDnsRecordApi(client *sdkhttp.Client) *DnsRecordApi {
    return &DnsRecordApi{client: client}
}

// Update an existing DNS record
func (a *DnsRecordApi) Update(body sdktypes.PlusDnsRecordForm) (sdktypes.PlusApiResultPlusDnsRecordVO, error) {
    raw, err := a.client.Put(BackendApiPath("/net/dns/record"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusDnsRecordVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusDnsRecordVO](raw)
}

// Create a new DNS record
func (a *DnsRecordApi) Create(body sdktypes.PlusDnsRecordForm) (sdktypes.PlusApiResultPlusDnsRecordVO, error) {
    raw, err := a.client.Post(BackendApiPath("/net/dns/record"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusDnsRecordVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusDnsRecordVO](raw)
}

// Get DNS records by page
func (a *DnsRecordApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusDnsRecordVO, error) {
    raw, err := a.client.Post(BackendApiPath("/net/dns/record/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusDnsRecordVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusDnsRecordVO](raw)
}

// Get all DNS records
func (a *DnsRecordApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusDnsRecordVO, error) {
    raw, err := a.client.Post(BackendApiPath("/net/dns/record/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusDnsRecordVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusDnsRecordVO](raw)
}

// Get a DNS record by ID
func (a *DnsRecordApi) GetById(id string) (sdktypes.PlusApiResultPlusDnsRecordVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/net/dns/record/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusDnsRecordVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusDnsRecordVO](raw)
}

// Delete a DNS record
func (a *DnsRecordApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/net/dns/record/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
