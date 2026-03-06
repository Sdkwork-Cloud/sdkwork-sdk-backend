package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type ApiSecurityPolicyApi struct {
    client *sdkhttp.Client
}

func NewApiSecurityPolicyApi(client *sdkhttp.Client) *ApiSecurityPolicyApi {
    return &ApiSecurityPolicyApi{client: client}
}

func (a *ApiSecurityPolicyApi) Update(body sdktypes.PlusApiSecurityPolicyForm) (sdktypes.PlusApiResultPlusApiSecurityPolicyVO, error) {
    raw, err := a.client.Put(BackendApiPath("/security/policy"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusApiSecurityPolicyVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusApiSecurityPolicyVO](raw)
}

func (a *ApiSecurityPolicyApi) Create(body sdktypes.PlusApiSecurityPolicyForm) (sdktypes.PlusApiResultPlusApiSecurityPolicyVO, error) {
    raw, err := a.client.Post(BackendApiPath("/security/policy"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusApiSecurityPolicyVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusApiSecurityPolicyVO](raw)
}

// List policies by page
func (a *ApiSecurityPolicyApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusApiSecurityPolicyVO, error) {
    raw, err := a.client.Post(BackendApiPath("/security/policy/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusApiSecurityPolicyVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusApiSecurityPolicyVO](raw)
}

// List all policies
func (a *ApiSecurityPolicyApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusApiSecurityPolicyVO, error) {
    raw, err := a.client.Post(BackendApiPath("/security/policy/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusApiSecurityPolicyVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusApiSecurityPolicyVO](raw)
}

func (a *ApiSecurityPolicyApi) GetById(id string) (sdktypes.PlusApiResultPlusApiSecurityPolicyVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/security/policy/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusApiSecurityPolicyVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusApiSecurityPolicyVO](raw)
}

func (a *ApiSecurityPolicyApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/security/policy/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
