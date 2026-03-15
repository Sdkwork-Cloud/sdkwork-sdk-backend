package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type DiskApi struct {
    client *sdkhttp.Client
}

func NewDiskApi(client *sdkhttp.Client) *DiskApi {
    return &DiskApi{client: client}
}

// Update an existing file disk
func (a *DiskApi) Update(body sdktypes.PlusDiskForm) (sdktypes.PlusApiResultPlusDiskVO, error) {
    raw, err := a.client.Put(BackendApiPath("/disk"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusDiskVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusDiskVO](raw)
}

// Create a new file disk
func (a *DiskApi) Create(body sdktypes.PlusDiskForm) (sdktypes.PlusApiResultPlusDiskVO, error) {
    raw, err := a.client.Post(BackendApiPath("/disk"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusDiskVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusDiskVO](raw)
}

// Update an existing disk member
func (a *DiskApi) UpdateMember(body sdktypes.PlusDiskMemberForm) (sdktypes.PlusApiResultPlusDiskMemberVO, error) {
    raw, err := a.client.Put(BackendApiPath("/disk/member"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusDiskMemberVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusDiskMemberVO](raw)
}

// Create a new disk member
func (a *DiskApi) CreateMember(body sdktypes.PlusDiskMemberForm) (sdktypes.PlusApiResultPlusDiskMemberVO, error) {
    raw, err := a.client.Post(BackendApiPath("/disk/member"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusDiskMemberVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusDiskMemberVO](raw)
}

// Get disk members by page
func (a *DiskApi) CreateListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusDiskMemberVO, error) {
    raw, err := a.client.Post(BackendApiPath("/disk/member/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusDiskMemberVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusDiskMemberVO](raw)
}

// Get all disk members
func (a *DiskApi) CreateListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusDiskMemberVO, error) {
    raw, err := a.client.Post(BackendApiPath("/disk/member/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusDiskMemberVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusDiskMemberVO](raw)
}

// Get file disks by page
func (a *DiskApi) CreateListByPageDisk(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusDiskVO, error) {
    raw, err := a.client.Post(BackendApiPath("/disk/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusDiskVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusDiskVO](raw)
}

// Get all file disks
func (a *DiskApi) CreateListAllEntitiesDisk(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusDiskVO, error) {
    raw, err := a.client.Post(BackendApiPath("/disk/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusDiskVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusDiskVO](raw)
}

// List files
func (a *DiskApi) GetListFiles(query map[string]interface{}) (sdktypes.PlusApiResultFileListVO, error) {
    raw, err := a.client.Get(BackendApiPath("/disk/files"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultFileListVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFileListVO](raw)
}

// Upload file
func (a *DiskApi) CreateUploadFile(body *sdktypes.CreateUploadFileRequest, query map[string]interface{}) (sdktypes.PlusApiResultFileItemVO, error) {
    raw, err := a.client.Post(BackendApiPath("/disk/files"), body, query, nil, "multipart/form-data")
    if err != nil {
        var zero sdktypes.PlusApiResultFileItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFileItemVO](raw)
}

// Get a file disk by ID
func (a *DiskApi) GetById(id string) (sdktypes.PlusApiResultPlusDiskVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/disk/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusDiskVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusDiskVO](raw)
}

// Delete a file disk
func (a *DiskApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/disk/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Get a disk member by ID
func (a *DiskApi) GetByIdMember(id string) (sdktypes.PlusApiResultPlusDiskMemberVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/disk/member/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusDiskMemberVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusDiskMemberVO](raw)
}

// Delete a disk member
func (a *DiskApi) DeleteMember(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/disk/member/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Get file
func (a *DiskApi) GetFile(fileId string) (sdktypes.PlusApiResultFileItemVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/disk/files/%s", fileId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultFileItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFileItemVO](raw)
}

// Delete file
func (a *DiskApi) DeleteFile(fileId string) (sdktypes.PlusApiResultFileItemVO, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/disk/files/%s", fileId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultFileItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFileItemVO](raw)
}

// Get file content
func (a *DiskApi) GetFileContent(fileId string) (string, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/disk/files/%s/content", fileId)), nil, nil)
    if err != nil {
        var zero string
        return zero, err
    }
    return decodeResult[string](raw)
}
