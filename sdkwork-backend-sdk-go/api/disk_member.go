package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type DiskMemberApi struct {
    client *sdkhttp.Client
}

func NewDiskMemberApi(client *sdkhttp.Client) *DiskMemberApi {
    return &DiskMemberApi{client: client}
}

// Update an existing disk member
func (a *DiskMemberApi) Update(body sdktypes.PlusDiskMemberForm) (sdktypes.PlusApiResultPlusDiskMemberVO, error) {
    raw, err := a.client.Put(BackendApiPath("/disk/member"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusDiskMemberVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusDiskMemberVO](raw)
}

// Create a new disk member
func (a *DiskMemberApi) Create(body sdktypes.PlusDiskMemberForm) (sdktypes.PlusApiResultPlusDiskMemberVO, error) {
    raw, err := a.client.Post(BackendApiPath("/disk/member"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusDiskMemberVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusDiskMemberVO](raw)
}

// Get disk members by page
func (a *DiskMemberApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusDiskMemberVO, error) {
    raw, err := a.client.Post(BackendApiPath("/disk/member/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusDiskMemberVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusDiskMemberVO](raw)
}

// Get all disk members
func (a *DiskMemberApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusDiskMemberVO, error) {
    raw, err := a.client.Post(BackendApiPath("/disk/member/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusDiskMemberVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusDiskMemberVO](raw)
}

// Get a disk member by ID
func (a *DiskMemberApi) GetById(id string) (sdktypes.PlusApiResultPlusDiskMemberVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/disk/member/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusDiskMemberVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusDiskMemberVO](raw)
}

// Delete a disk member
func (a *DiskMemberApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/disk/member/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
