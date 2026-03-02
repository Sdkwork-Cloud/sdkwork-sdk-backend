package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type NotificationApi struct {
    client *sdkhttp.Client
}

func NewNotificationApi(client *sdkhttp.Client) *NotificationApi {
    return &NotificationApi{client: client}
}

// Update an existing notification
func (a *NotificationApi) Update(body sdktypes.PlusNotificationForm) (sdktypes.PlusApiResultPlusNotificationVO, error) {
    raw, err := a.client.Put(BackendApiPath("/notification"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusNotificationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusNotificationVO](raw)
}

// Create a new notification
func (a *NotificationApi) Create(body sdktypes.PlusNotificationForm) (sdktypes.PlusApiResultPlusNotificationVO, error) {
    raw, err := a.client.Post(BackendApiPath("/notification"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusNotificationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusNotificationVO](raw)
}

// Get notifications by page
func (a *NotificationApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusNotificationVO, error) {
    raw, err := a.client.Post(BackendApiPath("/notification/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusNotificationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusNotificationVO](raw)
}

// Get all notifications
func (a *NotificationApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusNotificationVO, error) {
    raw, err := a.client.Post(BackendApiPath("/notification/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusNotificationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusNotificationVO](raw)
}

// Get a notification by ID
func (a *NotificationApi) GetById(id string) (sdktypes.PlusApiResultPlusNotificationVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/notification/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusNotificationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusNotificationVO](raw)
}

// Delete a notification
func (a *NotificationApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/notification/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
