package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type CommentApi struct {
    client *sdkhttp.Client
}

func NewCommentApi(client *sdkhttp.Client) *CommentApi {
    return &CommentApi{client: client}
}

// Update an existing comment
func (a *CommentApi) Update(body sdktypes.PlusCommentsForm) (sdktypes.PlusApiResultPlusCommentsVO, error) {
    raw, err := a.client.Put(BackendApiPath("/comments"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusCommentsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusCommentsVO](raw)
}

// Create a new comment
func (a *CommentApi) Create(body sdktypes.PlusCommentsForm) (sdktypes.PlusApiResultPlusCommentsVO, error) {
    raw, err := a.client.Post(BackendApiPath("/comments"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusCommentsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusCommentsVO](raw)
}

// Unlike a comment
func (a *CommentApi) Unlike(id string) (sdktypes.PlusApiResultPlusCommentsVO, error) {
    raw, err := a.client.Post(BackendApiPath(fmt.Sprintf("/comments/%s/unlike", id)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusCommentsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusCommentsVO](raw)
}

// Reply to a comment
func (a *CommentApi) Reply(id string, body sdktypes.PlusCommentsReplyForm) (sdktypes.PlusApiResultPlusCommentsVO, error) {
    raw, err := a.client.Post(BackendApiPath(fmt.Sprintf("/comments/%s/reply", id)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusCommentsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusCommentsVO](raw)
}

// Like a comment
func (a *CommentApi) Like(id string) (sdktypes.PlusApiResultPlusCommentsVO, error) {
    raw, err := a.client.Post(BackendApiPath(fmt.Sprintf("/comments/%s/like", id)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusCommentsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusCommentsVO](raw)
}

// Get comments by page
func (a *CommentApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusCommentsVO, error) {
    raw, err := a.client.Post(BackendApiPath("/comments/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusCommentsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusCommentsVO](raw)
}

// Get all comments
func (a *CommentApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusCommentsVO, error) {
    raw, err := a.client.Post(BackendApiPath("/comments/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusCommentsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusCommentsVO](raw)
}

// Get a comment by ID
func (a *CommentApi) GetById(id string) (sdktypes.PlusApiResultPlusCommentsVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/comments/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusCommentsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusCommentsVO](raw)
}

// Delete a comment
func (a *CommentApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/comments/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
