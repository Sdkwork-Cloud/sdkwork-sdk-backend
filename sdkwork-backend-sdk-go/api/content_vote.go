package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type ContentVoteApi struct {
    client *sdkhttp.Client
}

func NewContentVoteApi(client *sdkhttp.Client) *ContentVoteApi {
    return &ContentVoteApi{client: client}
}

// Update an existing content vote
func (a *ContentVoteApi) Update(body sdktypes.ContentVoteForm) (sdktypes.PlusApiResultContentVoteVO, error) {
    raw, err := a.client.Put(BackendApiPath("/vote"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultContentVoteVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultContentVoteVO](raw)
}

// Create a new content vote
func (a *ContentVoteApi) Create(body sdktypes.ContentVoteForm) (sdktypes.PlusApiResultContentVoteVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vote"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultContentVoteVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultContentVoteVO](raw)
}

// Get content votes by page
func (a *ContentVoteApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPageContentVoteVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vote/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPageContentVoteVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageContentVoteVO](raw)
}

// Get all content votes
func (a *ContentVoteApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListContentVoteVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vote/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListContentVoteVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListContentVoteVO](raw)
}

// Get a content vote by ID
func (a *ContentVoteApi) GetById(id string) (sdktypes.PlusApiResultContentVoteVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/vote/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultContentVoteVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultContentVoteVO](raw)
}

// Delete a content vote
func (a *ContentVoteApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/vote/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
