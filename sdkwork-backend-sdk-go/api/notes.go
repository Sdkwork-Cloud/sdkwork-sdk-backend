package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type NotesApi struct {
    client *sdkhttp.Client
}

func NewNotesApi(client *sdkhttp.Client) *NotesApi {
    return &NotesApi{client: client}
}

// Update a note
func (a *NotesApi) Update(body sdktypes.PlusNotesForm) (sdktypes.PlusApiResultPlusNotesVO, error) {
    raw, err := a.client.Put(BackendApiPath("/notes"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusNotesVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusNotesVO](raw)
}

// Create a note
func (a *NotesApi) Create(body sdktypes.PlusNotesForm) (sdktypes.PlusApiResultPlusNotesVO, error) {
    raw, err := a.client.Post(BackendApiPath("/notes"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusNotesVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusNotesVO](raw)
}

// Get note by UUID
func (a *NotesApi) GetByUuid(uuid string) (sdktypes.PlusApiResultPlusNotesVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/notes/%s", uuid)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusNotesVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusNotesVO](raw)
}

// Search notes
func (a *NotesApi) Search(query map[string]interface{}) (sdktypes.PlusApiResultPagePlusNotesVO, error) {
    raw, err := a.client.Get(BackendApiPath("/notes/search"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusNotesVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusNotesVO](raw)
}

// Get paginated notes by user
func (a *NotesApi) PageByUser(userId string, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusNotesVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/notes/page_by_user/%s", userId)), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusNotesVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusNotesVO](raw)
}

// Get paginated notes by tag
func (a *NotesApi) PageByTag(query map[string]interface{}) (sdktypes.PlusApiResultPagePlusNotesVO, error) {
    raw, err := a.client.Get(BackendApiPath("/notes/page_by_tag"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusNotesVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusNotesVO](raw)
}

// Get paginated notes by category
func (a *NotesApi) PageByCategory(categoryId string, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusNotesVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/notes/page_by_category/%s", categoryId)), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusNotesVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusNotesVO](raw)
}

// Get paginated notes
func (a *NotesApi) ListByPage(query map[string]interface{}) (sdktypes.PlusApiResultPagePlusNotesVO, error) {
    raw, err := a.client.Get(BackendApiPath("/notes/page"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusNotesVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusNotesVO](raw)
}

// List notes by user
func (a *NotesApi) ListByUserId(userId string) (sdktypes.PlusApiResultListPlusNotesVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/notes/list_by_user/%s", userId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusNotesVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusNotesVO](raw)
}

// List notes by tag
func (a *NotesApi) ListByTag(query map[string]interface{}) (sdktypes.PlusApiResultListPlusNotesVO, error) {
    raw, err := a.client.Get(BackendApiPath("/notes/list_by_tag"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusNotesVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusNotesVO](raw)
}

// List notes by category
func (a *NotesApi) ListByCategoryId(categoryId string) (sdktypes.PlusApiResultListPlusNotesVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/notes/list_by_category/%s", categoryId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusNotesVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusNotesVO](raw)
}

// Get note by ID
func (a *NotesApi) GetById(id string) (sdktypes.PlusApiResultPlusNotesVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/notes/id/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusNotesVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusNotesVO](raw)
}

// List all notes
func (a *NotesApi) ListAll() (sdktypes.PlusApiResultListPlusNotesVO, error) {
    raw, err := a.client.Get(BackendApiPath("/notes/all"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusNotesVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusNotesVO](raw)
}

// Delete a note
func (a *NotesApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/notes/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
