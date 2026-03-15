package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type NoteApi struct {
    client *sdkhttp.Client
}

func NewNoteApi(client *sdkhttp.Client) *NoteApi {
    return &NoteApi{client: client}
}

// Update a note
func (a *NoteApi) Update(body sdktypes.PlusNotesForm) (sdktypes.PlusApiResultPlusNotesVO, error) {
    raw, err := a.client.Put(BackendApiPath("/notes"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusNotesVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusNotesVO](raw)
}

// Create a note
func (a *NoteApi) Create(body sdktypes.PlusNotesForm) (sdktypes.PlusApiResultPlusNotesVO, error) {
    raw, err := a.client.Post(BackendApiPath("/notes"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusNotesVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusNotesVO](raw)
}

// Publish notes directly
func (a *NoteApi) PublishNotesToMedia(body sdktypes.PlusNotesMediaDraftForm) (sdktypes.PlusApiResultPlusMediaPublishResultDTO, error) {
    raw, err := a.client.Post(BackendApiPath("/notes/media/publish"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusMediaPublishResultDTO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusMediaPublishResultDTO](raw)
}

// Query publish status
func (a *NoteApi) QueryMediaPublishStatus(body sdktypes.PlusNotesMediaPublishStatusForm) (sdktypes.PlusApiResultPlusMediaPublishResultDTO, error) {
    raw, err := a.client.Post(BackendApiPath("/notes/media/publish/status"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusMediaPublishResultDTO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusMediaPublishResultDTO](raw)
}

// Query published article
func (a *NoteApi) QueryPublishedArticle(body sdktypes.PlusNotesMediaPublishedArticleForm) (sdktypes.PlusApiResultPlusMediaPublishResultDTO, error) {
    raw, err := a.client.Post(BackendApiPath("/notes/media/publish/article"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusMediaPublishResultDTO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusMediaPublishResultDTO](raw)
}

// Create media draft
func (a *NoteApi) CreateMediaDraft(body sdktypes.PlusNotesMediaDraftForm) (sdktypes.PlusApiResultPlusMediaPublishResultDTO, error) {
    raw, err := a.client.Post(BackendApiPath("/notes/media/drafts"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusMediaPublishResultDTO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusMediaPublishResultDTO](raw)
}

// Publish media draft
func (a *NoteApi) PublishMediaDraft(body sdktypes.PlusNotesMediaPublishDraftForm) (sdktypes.PlusApiResultPlusMediaPublishResultDTO, error) {
    raw, err := a.client.Post(BackendApiPath("/notes/media/drafts/publish"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusMediaPublishResultDTO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusMediaPublishResultDTO](raw)
}

// Preview media draft
func (a *NoteApi) PreviewMediaDraft(body sdktypes.PlusNotesMediaPreviewForm) (sdktypes.PlusApiResultPlusMediaPublishResultDTO, error) {
    raw, err := a.client.Post(BackendApiPath("/notes/media/drafts/preview"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusMediaPublishResultDTO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusMediaPublishResultDTO](raw)
}

// Get note by UUID
func (a *NoteApi) GetByUuid(uuid string) (sdktypes.PlusApiResultPlusNotesVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/notes/%s", uuid)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusNotesVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusNotesVO](raw)
}

// Search notes
func (a *NoteApi) Search(query map[string]interface{}) (sdktypes.PlusApiResultPagePlusNotesVO, error) {
    raw, err := a.client.Get(BackendApiPath("/notes/search"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusNotesVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusNotesVO](raw)
}

// Get paginated notes by user
func (a *NoteApi) PageByUser(userId string, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusNotesVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/notes/page_by_user/%s", userId)), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusNotesVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusNotesVO](raw)
}

// Get paginated notes by tag
func (a *NoteApi) PageByTag(query map[string]interface{}) (sdktypes.PlusApiResultPagePlusNotesVO, error) {
    raw, err := a.client.Get(BackendApiPath("/notes/page_by_tag"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusNotesVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusNotesVO](raw)
}

// Get paginated notes by category
func (a *NoteApi) PageByCategory(categoryId string, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusNotesVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/notes/page_by_category/%s", categoryId)), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusNotesVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusNotesVO](raw)
}

// Get paginated notes
func (a *NoteApi) ListByPage(query map[string]interface{}) (sdktypes.PlusApiResultPagePlusNotesVO, error) {
    raw, err := a.client.Get(BackendApiPath("/notes/page"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusNotesVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusNotesVO](raw)
}

// List media publish records
func (a *NoteApi) ListMediaPublishRecords(noteId string, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusMediaPublishRecordDTO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/notes/media/records/%s", noteId)), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusMediaPublishRecordDTO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusMediaPublishRecordDTO](raw)
}

// List notes by user
func (a *NoteApi) ListByUserId(userId string) (sdktypes.PlusApiResultListPlusNotesVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/notes/list_by_user/%s", userId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusNotesVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusNotesVO](raw)
}

// List notes by tag
func (a *NoteApi) ListByTag(query map[string]interface{}) (sdktypes.PlusApiResultListPlusNotesVO, error) {
    raw, err := a.client.Get(BackendApiPath("/notes/list_by_tag"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusNotesVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusNotesVO](raw)
}

// List notes by category
func (a *NoteApi) ListByCategoryId(categoryId string) (sdktypes.PlusApiResultListPlusNotesVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/notes/list_by_category/%s", categoryId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusNotesVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusNotesVO](raw)
}

// Get note by ID
func (a *NoteApi) GetById(id string) (sdktypes.PlusApiResultPlusNotesVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/notes/id/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusNotesVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusNotesVO](raw)
}

// List all notes
func (a *NoteApi) ListAll() (sdktypes.PlusApiResultListPlusNotesVO, error) {
    raw, err := a.client.Get(BackendApiPath("/notes/all"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusNotesVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusNotesVO](raw)
}

// Delete a note
func (a *NoteApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/notes/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
