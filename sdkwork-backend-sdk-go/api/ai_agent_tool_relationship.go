package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type AiAgentToolRelationshipApi struct {
    client *sdkhttp.Client
}

func NewAiAgentToolRelationshipApi(client *sdkhttp.Client) *AiAgentToolRelationshipApi {
    return &AiAgentToolRelationshipApi{client: client}
}

// Update an existing agent-tool relationship
func (a *AiAgentToolRelationshipApi) Update(body sdktypes.PlusAiAgentToolForm) (sdktypes.PlusApiResultPlusAiAgentToolVO, error) {
    raw, err := a.client.Put(BackendApiPath("/agent/tool"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAiAgentToolVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAiAgentToolVO](raw)
}

// Create a new agent-tool relationship
func (a *AiAgentToolRelationshipApi) Create(body sdktypes.PlusAiAgentToolForm) (sdktypes.PlusApiResultPlusAiAgentToolVO, error) {
    raw, err := a.client.Post(BackendApiPath("/agent/tool"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAiAgentToolVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAiAgentToolVO](raw)
}

// Get agent-tool relationships by page
func (a *AiAgentToolRelationshipApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusAiAgentToolVO, error) {
    raw, err := a.client.Post(BackendApiPath("/agent/tool/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusAiAgentToolVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusAiAgentToolVO](raw)
}

// Get all agent-tool relationships
func (a *AiAgentToolRelationshipApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusAiAgentToolVO, error) {
    raw, err := a.client.Post(BackendApiPath("/agent/tool/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusAiAgentToolVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusAiAgentToolVO](raw)
}

// Get an agent-tool relationship by ID
func (a *AiAgentToolRelationshipApi) GetById(id string) (sdktypes.PlusApiResultPlusAiAgentToolVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/agent/tool/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAiAgentToolVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAiAgentToolVO](raw)
}

// Delete an agent-tool relationship
func (a *AiAgentToolRelationshipApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/agent/tool/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
