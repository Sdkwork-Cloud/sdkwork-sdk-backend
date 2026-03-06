package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type AgentApi struct {
    client *sdkhttp.Client
}

func NewAgentApi(client *sdkhttp.Client) *AgentApi {
    return &AgentApi{client: client}
}

// Update an existing AI agent
func (a *AgentApi) Update(body sdktypes.PlusAiAgentForm) (sdktypes.PlusApiResultPlusAiAgentVO, error) {
    raw, err := a.client.Put(BackendApiPath("/agent"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAiAgentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAiAgentVO](raw)
}

// Create a new AI agent
func (a *AgentApi) Create(body sdktypes.PlusAiAgentForm) (sdktypes.PlusApiResultPlusAiAgentVO, error) {
    raw, err := a.client.Post(BackendApiPath("/agent"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAiAgentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAiAgentVO](raw)
}

// Get public AI agents by page
func (a *AgentApi) ListPublic(body *sdktypes.PlusAiAgentQueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusAiAgentVO, error) {
    raw, err := a.client.Post(BackendApiPath("/agent/list_public"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusAiAgentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusAiAgentVO](raw)
}

// Get AI agents by page
func (a *AgentApi) ListByPage(body *sdktypes.PlusAiAgentQueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusAiAgentVO, error) {
    raw, err := a.client.Post(BackendApiPath("/agent/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusAiAgentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusAiAgentVO](raw)
}

// Get all AI agents
func (a *AgentApi) ListAllEntities(body *sdktypes.PlusAiAgentQueryListForm) (sdktypes.PlusApiResultListPlusAiAgentVO, error) {
    raw, err := a.client.Post(BackendApiPath("/agent/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusAiAgentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusAiAgentVO](raw)
}

// Get an AI agent by ID
func (a *AgentApi) GetById(id string) (sdktypes.PlusApiResultPlusAiAgentVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/agent/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAiAgentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAiAgentVO](raw)
}

// Delete an AI agent
func (a *AgentApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/agent/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
