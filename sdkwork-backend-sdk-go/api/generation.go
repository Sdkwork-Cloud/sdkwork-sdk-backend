package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type GenerationApi struct {
    client *sdkhttp.Client
}

func NewGenerationApi(client *sdkhttp.Client) *GenerationApi {
    return &GenerationApi{client: client}
}

// Update an existing AI generation record
func (a *GenerationApi) Update(body sdktypes.PlusAiGenerationForm) (sdktypes.PlusApiResultPlusAiGenerationVO, error) {
    raw, err := a.client.Put(BackendApiPath("/generation"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAiGenerationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAiGenerationVO](raw)
}

// Create a new AI generation record
func (a *GenerationApi) Create(body sdktypes.PlusAiGenerationForm) (sdktypes.PlusApiResultPlusAiGenerationVO, error) {
    raw, err := a.client.Post(BackendApiPath("/generation"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAiGenerationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAiGenerationVO](raw)
}

// Update AI generated content
func (a *GenerationApi) UpdateContent(body sdktypes.PlusAiGenerationContentForm) (sdktypes.PlusApiResultPlusAiGenerationContentVO, error) {
    raw, err := a.client.Put(BackendApiPath("/generation/content"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAiGenerationContentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAiGenerationContentVO](raw)
}

// Create new AI generated content
func (a *GenerationApi) CreateContent(body sdktypes.PlusAiGenerationContentForm) (sdktypes.PlusApiResultPlusAiGenerationContentVO, error) {
    raw, err := a.client.Post(BackendApiPath("/generation/content"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAiGenerationContentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAiGenerationContentVO](raw)
}

// Create voice speaker generation task
func (a *GenerationApi) CreateVoiceSpeaker(body sdktypes.GenerateVoiceSpeakerForm) (sdktypes.PlusApiResultGenerateVoiceSpeakerVO, error) {
    raw, err := a.client.Post(BackendApiPath("/generation/voice-speaker/create"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultGenerateVoiceSpeakerVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerateVoiceSpeakerVO](raw)
}

// Create video generation task
func (a *GenerationApi) CreateVideo(body sdktypes.GenerateVideoForm) (sdktypes.PlusApiResultGenerateVideoVO, error) {
    raw, err := a.client.Post(BackendApiPath("/generation/video/create"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultGenerateVideoVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerateVideoVO](raw)
}

// Create music generation task
func (a *GenerationApi) CreateMusic(body sdktypes.GenerateMusicForm) (sdktypes.PlusApiResultGenerateMusicVO, error) {
    raw, err := a.client.Post(BackendApiPath("/generation/music/create"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultGenerateMusicVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerateMusicVO](raw)
}

// Get AI generation records by page
func (a *GenerationApi) CreateListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusAiGenerationVO, error) {
    raw, err := a.client.Post(BackendApiPath("/generation/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusAiGenerationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusAiGenerationVO](raw)
}

// Get all AI generation records
func (a *GenerationApi) CreateListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusAiGenerationVO, error) {
    raw, err := a.client.Post(BackendApiPath("/generation/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusAiGenerationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusAiGenerationVO](raw)
}

// Create image generation task
func (a *GenerationApi) CreateImage(body sdktypes.GenerateImageForm) (sdktypes.PlusApiResultGenerateImageVO, error) {
    raw, err := a.client.Post(BackendApiPath("/generation/image/create"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultGenerateImageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerateImageVO](raw)
}

// Get AI generated content by page
func (a *GenerationApi) CreateListByPageContent(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusAiGenerationContentVO, error) {
    raw, err := a.client.Post(BackendApiPath("/generation/content/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusAiGenerationContentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusAiGenerationContentVO](raw)
}

// Get all AI generated content
func (a *GenerationApi) CreateListAllEntitiesContent(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusAiGenerationContentVO, error) {
    raw, err := a.client.Post(BackendApiPath("/generation/content/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusAiGenerationContentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusAiGenerationContentVO](raw)
}

// Create character generation task
func (a *GenerationApi) CreateCharacter(body sdktypes.GenerateCharacterForm) (sdktypes.PlusApiResultGenerateCharacterVO, error) {
    raw, err := a.client.Post(BackendApiPath("/generation/character/create"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultGenerateCharacterVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerateCharacterVO](raw)
}

// Create audio generation task
func (a *GenerationApi) CreateAudio(body sdktypes.GenerateAudioForm) (sdktypes.PlusApiResultGenerateAudioVO, error) {
    raw, err := a.client.Post(BackendApiPath("/generation/audio/create"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultGenerateAudioVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerateAudioVO](raw)
}

// Create audio effect generation task
func (a *GenerationApi) CreateAudioEffect(body sdktypes.GenerateAudioEffectForm) (sdktypes.PlusApiResultGenerateAudioEffectVO, error) {
    raw, err := a.client.Post(BackendApiPath("/generation/audio-effect/create"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultGenerateAudioEffectVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerateAudioEffectVO](raw)
}

// Get an AI generation record by ID
func (a *GenerationApi) GetById(id string) (sdktypes.PlusApiResultPlusAiGenerationVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/generation/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAiGenerationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAiGenerationVO](raw)
}

// Delete an AI generation record
func (a *GenerationApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/generation/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Get voice speaker generation result
func (a *GenerationApi) GetResultByTaskId(taskId string) (sdktypes.PlusApiResultGenerateVoiceSpeakerVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/generation/voice-speaker/result/%s", taskId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultGenerateVoiceSpeakerVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerateVoiceSpeakerVO](raw)
}

// Get video generation result
func (a *GenerationApi) GetResult(taskId string) (sdktypes.PlusApiResultGenerateVideoVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/generation/video/result/%s", taskId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultGenerateVideoVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerateVideoVO](raw)
}

// Get music generation result
func (a *GenerationApi) GetResultMusic(taskId string) (sdktypes.PlusApiResultGenerateMusicVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/generation/music/result/%s", taskId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultGenerateMusicVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerateMusicVO](raw)
}

// Get image generation result
func (a *GenerationApi) GetResultImage(taskId string) (sdktypes.PlusApiResultGenerateImageVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/generation/image/result/%s", taskId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultGenerateImageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerateImageVO](raw)
}

// Get AI generated content by ID
func (a *GenerationApi) GetByIdContent(id string) (sdktypes.PlusApiResultPlusAiGenerationContentVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/generation/content/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAiGenerationContentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAiGenerationContentVO](raw)
}

// Delete AI generated content
func (a *GenerationApi) DeleteContent(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/generation/content/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Get character generation result
func (a *GenerationApi) GetResultCharacter(taskId string) (sdktypes.PlusApiResultGenerateCharacterVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/generation/character/result/%s", taskId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultGenerateCharacterVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerateCharacterVO](raw)
}

// Get audio generation result
func (a *GenerationApi) GetResultAudio(taskId string) (sdktypes.PlusApiResultGenerateAudioVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/generation/audio/result/%s", taskId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultGenerateAudioVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerateAudioVO](raw)
}

// Get audio effect generation result
func (a *GenerationApi) GetResultAudioEffect(taskId string) (sdktypes.PlusApiResultGenerateAudioEffectVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/generation/audio-effect/result/%s", taskId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultGenerateAudioEffectVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerateAudioEffectVO](raw)
}
