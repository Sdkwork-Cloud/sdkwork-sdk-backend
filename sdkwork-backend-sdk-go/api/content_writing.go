package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type ContentWritingApi struct {
    client *sdkhttp.Client
}

func NewContentWritingApi(client *sdkhttp.Client) *ContentWritingApi {
    return &ContentWritingApi{client: client}
}

// Rename chapter
func (a *ContentWritingApi) RenameChapter(fileId string, body string) (sdktypes.FileTreeNodeVO, error) {
    raw, err := a.client.Put(BackendApiPath(fmt.Sprintf("/content-writing/chapters/%s/rename", fileId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.FileTreeNodeVO
        return zero, err
    }
    return decodeResult[sdktypes.FileTreeNodeVO](raw)
}

// Move chapter
func (a *ContentWritingApi) MoveChapter(fileId string, body int) (sdktypes.FileTreeNodeVO, error) {
    raw, err := a.client.Put(BackendApiPath(fmt.Sprintf("/content-writing/chapters/%s/move", fileId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.FileTreeNodeVO
        return zero, err
    }
    return decodeResult[sdktypes.FileTreeNodeVO](raw)
}

// Get chapter content
func (a *ContentWritingApi) GetChapterContent(fileId string) (string, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/content-writing/chapters/%s", fileId)), nil, nil)
    if err != nil {
        var zero string
        return zero, err
    }
    return decodeResult[string](raw)
}

// Update chapter
func (a *ContentWritingApi) UpdateChapter(fileId string, body string) (sdktypes.FileTreeNodeVO, error) {
    raw, err := a.client.Put(BackendApiPath(fmt.Sprintf("/content-writing/chapters/%s", fileId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.FileTreeNodeVO
        return zero, err
    }
    return decodeResult[sdktypes.FileTreeNodeVO](raw)
}

// Delete chapter
func (a *ContentWritingApi) DeleteChapter(fileId string) (struct{}, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/content-writing/chapters/%s", fileId)), nil, nil)
    if err != nil {
        var zero struct{}
        return zero, err
    }
    return decodeResult[struct{}](raw)
}

// Create chapter
func (a *ContentWritingApi) CreateChapter(body sdktypes.CreateChapterForm) (sdktypes.FileTreeNodeVO, error) {
    raw, err := a.client.Post(BackendApiPath("/content-writing/chapters"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.FileTreeNodeVO
        return zero, err
    }
    return decodeResult[sdktypes.FileTreeNodeVO](raw)
}

// Get all contents
func (a *ContentWritingApi) GetAllContents() (sdktypes.GetAllContentsResponse, error) {
    raw, err := a.client.Get(BackendApiPath("/content-writing"), nil, nil)
    if err != nil {
        var zero sdktypes.GetAllContentsResponse
        return zero, err
    }
    return decodeResult[sdktypes.GetAllContentsResponse](raw)
}

// Create content
func (a *ContentWritingApi) CreateContent(body sdktypes.CreateContentForm) (sdktypes.ContentWorkVO, error) {
    raw, err := a.client.Post(BackendApiPath("/content-writing"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.ContentWorkVO
        return zero, err
    }
    return decodeResult[sdktypes.ContentWorkVO](raw)
}

// Get content
func (a *ContentWritingApi) GetContent(id string) (sdktypes.ContentWorkVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/content-writing/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.ContentWorkVO
        return zero, err
    }
    return decodeResult[sdktypes.ContentWorkVO](raw)
}

// Delete content
func (a *ContentWritingApi) DeleteContent(id string) (struct{}, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/content-writing/%s", id)), nil, nil)
    if err != nil {
        var zero struct{}
        return zero, err
    }
    return decodeResult[struct{}](raw)
}

// Get directory tree
func (a *ContentWritingApi) GetDirectoryTree(contentWorkId string) (sdktypes.FileTreeNodeVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/content-writing/%s/tree", contentWorkId)), nil, nil)
    if err != nil {
        var zero sdktypes.FileTreeNodeVO
        return zero, err
    }
    return decodeResult[sdktypes.FileTreeNodeVO](raw)
}

// Get content stats
func (a *ContentWritingApi) GetContentStats(contentWorkId string) (sdktypes.ContentStatsVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/content-writing/%s/stats", contentWorkId)), nil, nil)
    if err != nil {
        var zero sdktypes.ContentStatsVO
        return zero, err
    }
    return decodeResult[sdktypes.ContentStatsVO](raw)
}

// Get all scripts
func (a *ContentWritingApi) GetAllScripts() (sdktypes.GetAllScriptsResponse, error) {
    raw, err := a.client.Get(BackendApiPath("/content-writing/scripts"), nil, nil)
    if err != nil {
        var zero sdktypes.GetAllScriptsResponse
        return zero, err
    }
    return decodeResult[sdktypes.GetAllScriptsResponse](raw)
}

// Get all prose
func (a *ContentWritingApi) GetAllProse() (sdktypes.GetAllProseResponse, error) {
    raw, err := a.client.Get(BackendApiPath("/content-writing/prose"), nil, nil)
    if err != nil {
        var zero sdktypes.GetAllProseResponse
        return zero, err
    }
    return decodeResult[sdktypes.GetAllProseResponse](raw)
}

// Get all novels
func (a *ContentWritingApi) GetAllNovels() (sdktypes.GetAllNovelsResponse, error) {
    raw, err := a.client.Get(BackendApiPath("/content-writing/novels"), nil, nil)
    if err != nil {
        var zero sdktypes.GetAllNovelsResponse
        return zero, err
    }
    return decodeResult[sdktypes.GetAllNovelsResponse](raw)
}

// Get all articles
func (a *ContentWritingApi) GetAllArticles() (sdktypes.GetAllArticlesResponse, error) {
    raw, err := a.client.Get(BackendApiPath("/content-writing/articles"), nil, nil)
    if err != nil {
        var zero sdktypes.GetAllArticlesResponse
        return zero, err
    }
    return decodeResult[sdktypes.GetAllArticlesResponse](raw)
}
