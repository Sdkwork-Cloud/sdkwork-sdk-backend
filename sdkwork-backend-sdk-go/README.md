# sdkwork-backend-sdk (Go)

Professional Go SDK for SDKWork API.

## Installation

```bash
go get github.com/sdkwork/backend-sdk
```

## Quick Start

```go
package main

import (
    "fmt"
    "github.com/sdkwork/backend-sdk"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

func main() {
    cfg := sdkhttp.NewDefaultConfig("http://localhost:8080")
    client := github.com/sdkwork/backend-sdk.NewSdkworkBackendClientWithConfig(cfg)
    client.SetApiKey("your-api-key")
    
    // Use the SDK
    result, err := client.Workspace.Update()
    if err != nil {
        panic(err)
    }
    fmt.Println(result)
}
```

## Authentication Modes (Mutually Exclusive)

Choose exactly one mode for the same client instance.

### Mode A: API Key

```go
cfg := sdkhttp.NewDefaultConfig("http://localhost:8080")
client := github.com/sdkwork/backend-sdk.NewSdkworkBackendClientWithConfig(cfg)
client.SetApiKey("your-api-key")
// Sends: Authorization: Bearer <apiKey>
```

### Mode B: Dual Token

```go
cfg := sdkhttp.NewDefaultConfig("http://localhost:8080")
client := github.com/sdkwork/backend-sdk.NewSdkworkBackendClientWithConfig(cfg)
client.SetAuthToken("your-auth-token")
client.SetAccessToken("your-access-token")
// Sends:
// Authorization: Bearer <authToken>
// Access-Token: <accessToken>
```

> Do not call `SetApiKey(...)` together with `SetAuthToken(...)` + `SetAccessToken(...)` on the same client.

## Configuration (Non-Auth)

```go
cfg := sdkhttp.NewDefaultConfig("http://localhost:8080")
client := github.com/sdkwork/backend-sdk.NewSdkworkBackendClientWithConfig(cfg)

// Set custom headers
client.SetHeader("X-Custom-Header", "value")
```

## API Modules

- `client.Workspace` - workspace API
- `client.Vote` - vote API
- `client.Voice` - voice API
- `client.VisitHistory` - visit_history API
- `client.Vip` - vip API
- `client.Video` - video API
- `client.User` - user API
- `client.Usage` - usage API
- `client.Trade` - trade API
- `client.Tool` - tool API
- `client.Tenant` - tenant API
- `client.Table` - table API
- `client.Sku` - sku API
- `client.Skill` - skill API
- `client.ShortUrl` - short_url API
- `client.Shop` - shop API
- `client.Share` - share API
- `client.Sharding` - sharding API
- `client.Security` - security API
- `client.Schema` - schema API
- `client.Role` - role API
- `client.Record` - record API
- `client.Rbac` - rbac API
- `client.Prompt` - prompt API
- `client.Project` - project API
- `client.Product` - product API
- `client.Ppt` - ppt API
- `client.Permission` - permission API
- `client.Partner` - partner API
- `client.Participant` - participant API
- `client.Oss` - oss API
- `client.Organization` - organization API
- `client.OrganizationMember` - organization_member API
- `client.Notification` - notification API
- `client.Note` - note API
- `client.News` - news API
- `client.Net` - net API
- `client.Music` - music API
- `client.Model` - model API
- `client.Message` - message API
- `client.Member` - member API
- `client.KnowledgeBase` - knowledge_base API
- `client.Invitation` - invitation API
- `client.Image` - image API
- `client.Im` - im API
- `client.Generation` - generation API
- `client.Game` - game API
- `client.File` - file API
- `client.Feed` - feed API
- `client.Feedback` - feedback API
- `client.Favorite` - favorite API
- `client.Disk` - disk API
- `client.Detail` - detail API
- `client.Department` - department API
- `client.Datasource` - datasource API
- `client.Coupon` - coupon API
- `client.Conversation` - conversation API
- `client.ContentWriting` - content_writing API
- `client.Comment` - comment API
- `client.Column` - column API
- `client.Collection` - collection API
- `client.CollectionItem` - collection_item API
- `client.Chat` - chat API
- `client.Character` - character API
- `client.Channel` - channel API
- `client.Category` - category API
- `client.Card` - card API
- `client.Attribute` - attribute API
- `client.Article` - article API
- `client.App` - app API
- `client.Apikey` - apikey API
- `client.Agent` - agent API
- `client.Account` - account API
- `client.System` - system API
- `client.Search` - search API
- `client.Auth` - auth API

## Usage Examples

### workspace

```go
// Update an existing workspace
result, err := client.Workspace.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### vote

```go
// Update an existing content vote
result, err := client.Vote.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### voice

```go
// Update an existing voice speaker
result, err := client.Voice.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### visit_history

```go
// Update Visit History
result, err := client.VisitHistory.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### vip

```go
// Update an existing VIP user
result, err := client.Vip.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### video

```go
// Update an existing video
result, err := client.Video.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### user

```go
// Update an existing user
result, err := client.User.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### usage

```go
// Update an existing usage record
result, err := client.Usage.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### trade

```go
// Update shopping cart
result, err := client.Trade.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### tool

```go
// Update an existing AI tool
result, err := client.Tool.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### tenant

```go
// Update an existing tenant
result, err := client.Tenant.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### table

```go
// Update an existing database table
result, err := client.Table.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### sku

```go
// Update an existing SKU
result, err := client.Sku.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### skill

```go
// Get one skill detail
result, err := client.Skill.GetById()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### short_url

```go
// Update short URL
result, err := client.ShortUrl.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### shop

```go
// Update an existing shop
result, err := client.Shop.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### share

```go
// 更新分享
result, err := client.Share.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### sharding

```go
// Update Sharding Key
result, err := client.Sharding.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### security

```go
// PUT /backend/v3/api/security/policy
result, err := client.Security.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### schema

```go
// Update an existing database schema
result, err := client.Schema.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### role

```go
// Update an existing system role
result, err := client.Role.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### record

```go
// Update an existing invocation record
result, err := client.Record.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### rbac

```go
// Update user-role relationship
result, err := client.Rbac.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### prompt

```go
// Update an existing AI prompt
result, err := client.Prompt.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### project

```go
// Update an existing project
result, err := client.Project.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### product

```go
// Update an existing product
result, err := client.Product.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### ppt

```go
// Update an existing PPT template
result, err := client.Ppt.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### permission

```go
// PUT /backend/v3/api/permission
result, err := client.Permission.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### partner

```go
// Update a partner
result, err := client.Partner.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### participant

```go
// Update an existing chat participant
result, err := client.Participant.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### oss

```go
// Update an existing OSS bucket
result, err := client.Oss.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### organization

```go
// Update an existing organization
result, err := client.Organization.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### organization_member

```go
// Update organization member
result, err := client.OrganizationMember.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### notification

```go
// Update an existing notification
result, err := client.Notification.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### note

```go
// Update a note
result, err := client.Note.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### news

```go
// Update an existing news
result, err := client.News.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### net

```go
// 更新域名
result, err := client.Net.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### music

```go
// Update music
result, err := client.Music.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### model

```go
// Update existing AI model information
result, err := client.Model.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### message

```go
// Update an existing chat message
result, err := client.Message.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### member

```go
// Update an existing member level
result, err := client.Member.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### knowledge_base

```go
// Update an existing knowledge base
result, err := client.KnowledgeBase.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### invitation

```go
// Update an invitation relation
result, err := client.Invitation.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### image

```go
// Update an existing image
result, err := client.Image.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### im

```go
// Update an existing chat group
result, err := client.Im.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### generation

```go
// Update an existing AI generation record
result, err := client.Generation.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### game

```go
// Update game definition
result, err := client.Game.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### file

```go
// Update existing file metadata
result, err := client.File.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### feed

```go
// Update an existing feeds entry
result, err := client.Feed.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### feedback

```go
// Update feedback
result, err := client.Feedback.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### favorite

```go
// Update an existing favorite
result, err := client.Favorite.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### disk

```go
// Update an existing file disk
result, err := client.Disk.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### detail

```go
// Update existing detail content
result, err := client.Detail.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### department

```go
// Update an existing department
result, err := client.Department.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### datasource

```go
// Update an existing data source
result, err := client.Datasource.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### coupon

```go
// Update an existing coupon template
result, err := client.Coupon.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### conversation

```go
// Update an existing conversation
result, err := client.Conversation.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### content_writing

```go
// Rename chapter
result, err := client.ContentWriting.RenameChapter()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### comment

```go
// Update an existing comment
result, err := client.Comment.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### column

```go
// Update column
result, err := client.Column.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### collection

```go
// Update an existing collection
result, err := client.Collection.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### collection_item

```go
// Update an existing collection item
result, err := client.CollectionItem.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### chat

```go
// Update an existing chat message
result, err := client.Chat.UpdateMessage()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### character

```go
// Update character
result, err := client.Character.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### channel

```go
// Update channel
result, err := client.Channel.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### category

```go
// Update an existing category
result, err := client.Category.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### card

```go
// Update an existing membership card
result, err := client.Card.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### attribute

```go
// Update attribute
result, err := client.Attribute.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### article

```go
// Update an existing AI article
result, err := client.Article.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### app

```go
// Update application
result, err := client.App.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### apikey

```go
// Update an existing API key
result, err := client.Apikey.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### agent

```go
// Update an existing AI agent
result, err := client.Agent.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### account

```go
// Update an existing account
result, err := client.Account.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### system

```go
// Apply invoice
result, err := client.System.Apply()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### search

```go
// POST /backend/v3/api/search/chat/stop
result, err := client.Search.Stop()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### auth

```go
// Verify phone
result, err := client.Auth.VerifyPhone()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

## Error Handling

```go
result, err := client.Workspace.Update()
if err != nil {
    // Handle error
    fmt.Println("Error:", err)
    return
}
```

## Publishing

This SDK includes cross-platform publish scripts in `bin/`:
- `bin/publish-core.mjs`
- `bin/publish.sh`
- `bin/publish.ps1`

### Check

```bash
./bin/publish.sh --action check
```

### Publish

```bash
./bin/publish.sh --action publish --channel release
```

```powershell
.\bin\publish.ps1 --action publish --channel test --dry-run
```

> Set `GO_RELEASE_TAG` (or `SDKWORK_RELEASE_TAG`) and push tag if needed.

## License

MIT
