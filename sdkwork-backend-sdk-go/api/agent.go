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

// Update an existing agent-tool relationship
func (a *AgentApi) UpdateTool(body sdktypes.PlusAiAgentToolForm) (sdktypes.PlusApiResultPlusAiAgentToolVO, error) {
    raw, err := a.client.Put(BackendApiPath("/agent/tool"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAiAgentToolVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAiAgentToolVO](raw)
}

// Create a new agent-tool relationship
func (a *AgentApi) CreateTool(body sdktypes.PlusAiAgentToolForm) (sdktypes.PlusApiResultPlusAiAgentToolVO, error) {
    raw, err := a.client.Post(BackendApiPath("/agent/tool"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAiAgentToolVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAiAgentToolVO](raw)
}

// Get agent-tool relationships by page
func (a *AgentApi) CreateListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusAiAgentToolVO, error) {
    raw, err := a.client.Post(BackendApiPath("/agent/tool/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusAiAgentToolVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusAiAgentToolVO](raw)
}

// Get all agent-tool relationships
func (a *AgentApi) CreateListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusAiAgentToolVO, error) {
    raw, err := a.client.Post(BackendApiPath("/agent/tool/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusAiAgentToolVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusAiAgentToolVO](raw)
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
func (a *AgentApi) CreateListByPageAgent(body *sdktypes.PlusAiAgentQueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusAiAgentVO, error) {
    raw, err := a.client.Post(BackendApiPath("/agent/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusAiAgentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusAiAgentVO](raw)
}

// Get all AI agents
func (a *AgentApi) CreateListAllEntitiesAgent(body *sdktypes.PlusAiAgentQueryListForm) (sdktypes.PlusApiResultListPlusAiAgentVO, error) {
    raw, err := a.client.Post(BackendApiPath("/agent/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusAiAgentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusAiAgentVO](raw)
}

// Create a chat completion with agent
func (a *AgentApi) WithContext(body sdktypes.ChatCompletionCreateForm, query map[string]interface{}, headers map[string]string) (sdktypes.ChatCompletionChunk, error) {
    raw, err := a.client.Post(BackendApiPath("/agent/chat/with_context"), body, query, headers, "")
    if err != nil {
        var zero sdktypes.ChatCompletionChunk
        return zero, err
    }
    return decodeResult[sdktypes.ChatCompletionChunk](raw)
}

// Stop a chat completion stream
func (a *AgentApi) Stop(query map[string]interface{}, headers map[string]string) (sdktypes.PlusApiResult, error) {
    raw, err := a.client.Post(BackendApiPath("/agent/chat/stop"), nil, query, headers, "")
    if err != nil {
        var zero sdktypes.PlusApiResult
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResult](raw)
}

// Create a chat completion with agent
func (a *AgentApi) ResumeStream(body sdktypes.ChatCompletionCreateForm, query map[string]interface{}, headers map[string]string) (sdktypes.ChatCompletionChunk, error) {
    raw, err := a.client.Post(BackendApiPath("/agent/chat/resume_stream"), body, query, headers, "")
    if err != nil {
        var zero sdktypes.ChatCompletionChunk
        return zero, err
    }
    return decodeResult[sdktypes.ChatCompletionChunk](raw)
}

// Create a chat completion with agent
func (a *AgentApi) CreateCompletions(body sdktypes.ChatCompletionCreateForm, query map[string]interface{}, headers map[string]string) (sdktypes.ChatCompletionChunk, error) {
    raw, err := a.client.Post(BackendApiPath("/agent/chat/completions"), body, query, headers, "")
    if err != nil {
        var zero sdktypes.ChatCompletionChunk
        return zero, err
    }
    return decodeResult[sdktypes.ChatCompletionChunk](raw)
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

// Get an agent-tool relationship by ID
func (a *AgentApi) GetByIdTool(id string) (sdktypes.PlusApiResultPlusAiAgentToolVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/agent/tool/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAiAgentToolVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAiAgentToolVO](raw)
}

// Delete an agent-tool relationship
func (a *AgentApi) DeleteTool(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/agent/tool/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
