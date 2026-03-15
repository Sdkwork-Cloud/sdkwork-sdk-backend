package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type SecurityApi struct {
    client *sdkhttp.Client
}

func NewSecurityApi(client *sdkhttp.Client) *SecurityApi {
    return &SecurityApi{client: client}
}

func (a *SecurityApi) Update(body sdktypes.PlusApiSecurityPolicyForm) (sdktypes.PlusApiResultPlusApiSecurityPolicyVO, error) {
    raw, err := a.client.Put(BackendApiPath("/security/policy"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusApiSecurityPolicyVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusApiSecurityPolicyVO](raw)
}

func (a *SecurityApi) Create(body sdktypes.PlusApiSecurityPolicyForm) (sdktypes.PlusApiResultPlusApiSecurityPolicyVO, error) {
    raw, err := a.client.Post(BackendApiPath("/security/policy"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusApiSecurityPolicyVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusApiSecurityPolicyVO](raw)
}

// List policies by page
func (a *SecurityApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusApiSecurityPolicyVO, error) {
    raw, err := a.client.Post(BackendApiPath("/security/policy/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusApiSecurityPolicyVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusApiSecurityPolicyVO](raw)
}

// List all policies
func (a *SecurityApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusApiSecurityPolicyVO, error) {
    raw, err := a.client.Post(BackendApiPath("/security/policy/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusApiSecurityPolicyVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusApiSecurityPolicyVO](raw)
}

func (a *SecurityApi) GetById(id string) (sdktypes.PlusApiResultPlusApiSecurityPolicyVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/security/policy/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusApiSecurityPolicyVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusApiSecurityPolicyVO](raw)
}

func (a *SecurityApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/security/policy/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
