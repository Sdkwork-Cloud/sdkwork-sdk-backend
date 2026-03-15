# sdkwork-backend-sdk (Swift)

Professional Swift SDK for SDKWork API.

## Installation

Add to `Package.swift`:

```swift
dependencies: [
    .package(url: "https://github.com/sdkwork/backend-sdk-swift", from: "1.0.9")
]
```

## Quick Start

```swift
import SdkworkBackend
import SDKworkCommon

let config = SdkConfig(baseUrl: "http://localhost:8080")
let client = SdkworkBackendClient(config: config)
client.setApiKey("your-api-key")

// Use the SDK
let result = try await client.workspace.update()
print(result)
```

## Authentication Modes (Mutually Exclusive)

Choose exactly one mode for the same client instance.

### Mode A: API Key

```swift
let config = SdkConfig(baseUrl: "http://localhost:8080")
let client = SdkworkBackendClient(config: config)
client.setApiKey("your-api-key")
// Sends: Authorization: Bearer <apiKey>
```

### Mode B: Dual Token

```swift
let config = SdkConfig(baseUrl: "http://localhost:8080")
let client = SdkworkBackendClient(config: config)
client.setAuthToken("your-auth-token")
client.setAccessToken("your-access-token")
// Sends:
// Authorization: Bearer <authToken>
// Access-Token: <accessToken>
```

> Do not call `setApiKey(...)` together with `setAuthToken(...)` + `setAccessToken(...)` on the same client.

## Configuration (Non-Auth)

```swift
let config = SdkConfig(baseUrl: "http://localhost:8080")
let client = SdkworkBackendClient(config: config)

// Set custom headers
client.setHeader("X-Custom-Header", value: "value")
```

## API Modules

- `client.workspace` - workspace API
- `client.vote` - vote API
- `client.voice` - voice API
- `client.visitHistory` - visit_history API
- `client.vip` - vip API
- `client.video` - video API
- `client.user` - user API
- `client.usage` - usage API
- `client.trade` - trade API
- `client.tool` - tool API
- `client.tenant` - tenant API
- `client.table` - table API
- `client.sku` - sku API
- `client.skill` - skill API
- `client.shortUrl` - short_url API
- `client.shop` - shop API
- `client.share` - share API
- `client.sharding` - sharding API
- `client.security` - security API
- `client.schema` - schema API
- `client.role` - role API
- `client.record` - record API
- `client.rbac` - rbac API
- `client.prompt` - prompt API
- `client.project` - project API
- `client.product` - product API
- `client.ppt` - ppt API
- `client.permission` - permission API
- `client.partner` - partner API
- `client.participant` - participant API
- `client.oss` - oss API
- `client.organization` - organization API
- `client.organizationMember` - organization_member API
- `client.notification` - notification API
- `client.note` - note API
- `client.news` - news API
- `client.net` - net API
- `client.music` - music API
- `client.model` - model API
- `client.message` - message API
- `client.member` - member API
- `client.knowledgeBase` - knowledge_base API
- `client.invitation` - invitation API
- `client.image` - image API
- `client.im` - im API
- `client.generation` - generation API
- `client.game` - game API
- `client.file` - file API
- `client.feed` - feed API
- `client.feedback` - feedback API
- `client.favorite` - favorite API
- `client.disk` - disk API
- `client.detail` - detail API
- `client.department` - department API
- `client.datasource` - datasource API
- `client.coupon` - coupon API
- `client.conversation` - conversation API
- `client.contentWriting` - content_writing API
- `client.comment` - comment API
- `client.column` - column API
- `client.collection` - collection API
- `client.collectionItem` - collection_item API
- `client.chat` - chat API
- `client.character` - character API
- `client.channel` - channel API
- `client.category` - category API
- `client.card` - card API
- `client.attribute` - attribute API
- `client.article` - article API
- `client.app` - app API
- `client.apikey` - apikey API
- `client.agent` - agent API
- `client.account` - account API
- `client.system` - system API
- `client.search` - search API
- `client.auth` - auth API

## Usage Examples

### workspace

```swift
// Update an existing workspace
let result = try await client.workspace.update()
print(result)
```

### vote

```swift
// Update an existing content vote
let result = try await client.vote.update()
print(result)
```

### voice

```swift
// Update an existing voice speaker
let result = try await client.voice.update()
print(result)
```

### visit_history

```swift
// Update Visit History
let result = try await client.visitHistory.update()
print(result)
```

### vip

```swift
// Update an existing VIP user
let result = try await client.vip.update()
print(result)
```

### video

```swift
// Update an existing video
let result = try await client.video.update()
print(result)
```

### user

```swift
// Update an existing user
let result = try await client.user.update()
print(result)
```

### usage

```swift
// Update an existing usage record
let result = try await client.usage.update()
print(result)
```

### trade

```swift
// Update shopping cart
let result = try await client.trade.update()
print(result)
```

### tool

```swift
// Update an existing AI tool
let result = try await client.tool.update()
print(result)
```

### tenant

```swift
// Update an existing tenant
let result = try await client.tenant.update()
print(result)
```

### table

```swift
// Update an existing database table
let result = try await client.table.update()
print(result)
```

### sku

```swift
// Update an existing SKU
let result = try await client.sku.update()
print(result)
```

### skill

```swift
// Get one skill detail
let result = try await client.skill.getById()
print(result)
```

### short_url

```swift
// Update short URL
let result = try await client.shortUrl.update()
print(result)
```

### shop

```swift
// Update an existing shop
let result = try await client.shop.update()
print(result)
```

### share

```swift
// 更新分享
let result = try await client.share.update()
print(result)
```

### sharding

```swift
// Update Sharding Key
let result = try await client.sharding.update()
print(result)
```

### security

```swift
// PUT /backend/v3/api/security/policy
let result = try await client.security.update()
print(result)
```

### schema

```swift
// Update an existing database schema
let result = try await client.schema.update()
print(result)
```

### role

```swift
// Update an existing system role
let result = try await client.role.update()
print(result)
```

### record

```swift
// Update an existing invocation record
let result = try await client.record.update()
print(result)
```

### rbac

```swift
// Update user-role relationship
let result = try await client.rbac.update()
print(result)
```

### prompt

```swift
// Update an existing AI prompt
let result = try await client.prompt.update()
print(result)
```

### project

```swift
// Update an existing project
let result = try await client.project.update()
print(result)
```

### product

```swift
// Update an existing product
let result = try await client.product.update()
print(result)
```

### ppt

```swift
// Update an existing PPT template
let result = try await client.ppt.update()
print(result)
```

### permission

```swift
// PUT /backend/v3/api/permission
let result = try await client.permission.update()
print(result)
```

### partner

```swift
// Update a partner
let result = try await client.partner.update()
print(result)
```

### participant

```swift
// Update an existing chat participant
let result = try await client.participant.update()
print(result)
```

### oss

```swift
// Update an existing OSS bucket
let result = try await client.oss.update()
print(result)
```

### organization

```swift
// Update an existing organization
let result = try await client.organization.update()
print(result)
```

### organization_member

```swift
// Update organization member
let result = try await client.organizationMember.update()
print(result)
```

### notification

```swift
// Update an existing notification
let result = try await client.notification.update()
print(result)
```

### note

```swift
// Update a note
let result = try await client.note.update()
print(result)
```

### news

```swift
// Update an existing news
let result = try await client.news.update()
print(result)
```

### net

```swift
// 更新域名
let result = try await client.net.update()
print(result)
```

### music

```swift
// Update music
let result = try await client.music.update()
print(result)
```

### model

```swift
// Update existing AI model information
let result = try await client.model.update()
print(result)
```

### message

```swift
// Update an existing chat message
let result = try await client.message.update()
print(result)
```

### member

```swift
// Update an existing member level
let result = try await client.member.update()
print(result)
```

### knowledge_base

```swift
// Update an existing knowledge base
let result = try await client.knowledgeBase.update()
print(result)
```

### invitation

```swift
// Update an invitation relation
let result = try await client.invitation.update()
print(result)
```

### image

```swift
// Update an existing image
let result = try await client.image.update()
print(result)
```

### im

```swift
// Update an existing chat group
let result = try await client.im.update()
print(result)
```

### generation

```swift
// Update an existing AI generation record
let result = try await client.generation.update()
print(result)
```

### game

```swift
// Update game definition
let result = try await client.game.update()
print(result)
```

### file

```swift
// Update existing file metadata
let result = try await client.file.update()
print(result)
```

### feed

```swift
// Update an existing feeds entry
let result = try await client.feed.update()
print(result)
```

### feedback

```swift
// Update feedback
let result = try await client.feedback.update()
print(result)
```

### favorite

```swift
// Update an existing favorite
let result = try await client.favorite.update()
print(result)
```

### disk

```swift
// Update an existing file disk
let result = try await client.disk.update()
print(result)
```

### detail

```swift
// Update existing detail content
let result = try await client.detail.update()
print(result)
```

### department

```swift
// Update an existing department
let result = try await client.department.update()
print(result)
```

### datasource

```swift
// Update an existing data source
let result = try await client.datasource.update()
print(result)
```

### coupon

```swift
// Update an existing coupon template
let result = try await client.coupon.update()
print(result)
```

### conversation

```swift
// Update an existing conversation
let result = try await client.conversation.update()
print(result)
```

### content_writing

```swift
// Rename chapter
let result = try await client.contentWriting.renameChapter()
print(result)
```

### comment

```swift
// Update an existing comment
let result = try await client.comment.update()
print(result)
```

### column

```swift
// Update column
let result = try await client.column.update()
print(result)
```

### collection

```swift
// Update an existing collection
let result = try await client.collection.update()
print(result)
```

### collection_item

```swift
// Update an existing collection item
let result = try await client.collectionItem.update()
print(result)
```

### chat

```swift
// Update an existing chat message
let result = try await client.chat.updateMessage()
print(result)
```

### character

```swift
// Update character
let result = try await client.character.update()
print(result)
```

### channel

```swift
// Update channel
let result = try await client.channel.update()
print(result)
```

### category

```swift
// Update an existing category
let result = try await client.category.update()
print(result)
```

### card

```swift
// Update an existing membership card
let result = try await client.card.update()
print(result)
```

### attribute

```swift
// Update attribute
let result = try await client.attribute.update()
print(result)
```

### article

```swift
// Update an existing AI article
let result = try await client.article.update()
print(result)
```

### app

```swift
// Update application
let result = try await client.app.update()
print(result)
```

### apikey

```swift
// Update an existing API key
let result = try await client.apikey.update()
print(result)
```

### agent

```swift
// Update an existing AI agent
let result = try await client.agent.update()
print(result)
```

### account

```swift
// Update an existing account
let result = try await client.account.update()
print(result)
```

### system

```swift
// Apply invoice
let result = try await client.system.apply()
print(result)
```

### search

```swift
// POST /backend/v3/api/search/chat/stop
let result = try await client.search.stop()
print(result)
```

### auth

```swift
// Verify phone
let result = try await client.auth.verifyPhone()
print(result)
```

## Error Handling

```swift
do {
    let result = try await client.workspace.update()
} catch {
    print("Error: \(error)")
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

> Set `SWIFT_RELEASE_TAG` (or `SDKWORK_RELEASE_TAG`) for tag-based release.

## License

MIT
