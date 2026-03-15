# sdkwork-backend-sdk (Kotlin)

Professional Kotlin SDK for SDKWork API.

## Installation

Add to your `build.gradle.kts`:

```kotlin
implementation("com.sdkwork:backend-sdk:1.0.9")
```

Or with Gradle Groovy:

```groovy
implementation 'com.sdkwork:backend-sdk:1.0.9'
```

## Quick Start

```kotlin
import com.sdkwork.backend.SdkworkBackendClient
import com.sdkwork.common.core.SdkConfig

suspend fun main() {
    val config = SdkConfig(baseUrl = "http://localhost:8080")
    val client = SdkworkBackendClient(config)
    client.setApiKey("your-api-key")
    
    // Use the SDK
    val result = client.workspace.update()
    println(result)
}
```

## Authentication Modes (Mutually Exclusive)

Choose exactly one mode for the same client instance.

### Mode A: API Key

```kotlin
val config = SdkConfig(baseUrl = "http://localhost:8080")
val client = SdkworkBackendClient(config)
client.setApiKey("your-api-key")
// Sends: Authorization: Bearer <apiKey>
```

### Mode B: Dual Token

```kotlin
val config = SdkConfig(baseUrl = "http://localhost:8080")
val client = SdkworkBackendClient(config)
client.setAuthToken("your-auth-token")
client.setAccessToken("your-access-token")
// Sends:
// Authorization: Bearer <authToken>
// Access-Token: <accessToken>
```

> Do not call `setApiKey(...)` together with `setAuthToken(...)` + `setAccessToken(...)` on the same client.

## Configuration (Non-Auth)

```kotlin
val config = SdkConfig(baseUrl = "http://localhost:8080")
val client = SdkworkBackendClient(config)
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

```kotlin
// Update an existing workspace
val result = client.workspace.update()
println(result)
```

### vote

```kotlin
// Update an existing content vote
val result = client.vote.update()
println(result)
```

### voice

```kotlin
// Update an existing voice speaker
val result = client.voice.update()
println(result)
```

### visit_history

```kotlin
// Update Visit History
val result = client.visitHistory.update()
println(result)
```

### vip

```kotlin
// Update an existing VIP user
val result = client.vip.update()
println(result)
```

### video

```kotlin
// Update an existing video
val result = client.video.update()
println(result)
```

### user

```kotlin
// Update an existing user
val result = client.user.update()
println(result)
```

### usage

```kotlin
// Update an existing usage record
val result = client.usage.update()
println(result)
```

### trade

```kotlin
// Update shopping cart
val result = client.trade.update()
println(result)
```

### tool

```kotlin
// Update an existing AI tool
val result = client.tool.update()
println(result)
```

### tenant

```kotlin
// Update an existing tenant
val result = client.tenant.update()
println(result)
```

### table

```kotlin
// Update an existing database table
val result = client.table.update()
println(result)
```

### sku

```kotlin
// Update an existing SKU
val result = client.sku.update()
println(result)
```

### skill

```kotlin
// Get one skill detail
val result = client.skill.getById()
println(result)
```

### short_url

```kotlin
// Update short URL
val result = client.shortUrl.update()
println(result)
```

### shop

```kotlin
// Update an existing shop
val result = client.shop.update()
println(result)
```

### share

```kotlin
// 更新分享
val result = client.share.update()
println(result)
```

### sharding

```kotlin
// Update Sharding Key
val result = client.sharding.update()
println(result)
```

### security

```kotlin
// PUT /backend/v3/api/security/policy
val result = client.security.update()
println(result)
```

### schema

```kotlin
// Update an existing database schema
val result = client.schema.update()
println(result)
```

### role

```kotlin
// Update an existing system role
val result = client.role.update()
println(result)
```

### record

```kotlin
// Update an existing invocation record
val result = client.record.update()
println(result)
```

### rbac

```kotlin
// Update user-role relationship
val result = client.rbac.update()
println(result)
```

### prompt

```kotlin
// Update an existing AI prompt
val result = client.prompt.update()
println(result)
```

### project

```kotlin
// Update an existing project
val result = client.project.update()
println(result)
```

### product

```kotlin
// Update an existing product
val result = client.product.update()
println(result)
```

### ppt

```kotlin
// Update an existing PPT template
val result = client.ppt.update()
println(result)
```

### permission

```kotlin
// PUT /backend/v3/api/permission
val result = client.permission.update()
println(result)
```

### partner

```kotlin
// Update a partner
val result = client.partner.update()
println(result)
```

### participant

```kotlin
// Update an existing chat participant
val result = client.participant.update()
println(result)
```

### oss

```kotlin
// Update an existing OSS bucket
val result = client.oss.update()
println(result)
```

### organization

```kotlin
// Update an existing organization
val result = client.organization.update()
println(result)
```

### organization_member

```kotlin
// Update organization member
val result = client.organizationMember.update()
println(result)
```

### notification

```kotlin
// Update an existing notification
val result = client.notification.update()
println(result)
```

### note

```kotlin
// Update a note
val result = client.note.update()
println(result)
```

### news

```kotlin
// Update an existing news
val result = client.news.update()
println(result)
```

### net

```kotlin
// 更新域名
val result = client.net.update()
println(result)
```

### music

```kotlin
// Update music
val result = client.music.update()
println(result)
```

### model

```kotlin
// Update existing AI model information
val result = client.model.update()
println(result)
```

### message

```kotlin
// Update an existing chat message
val result = client.message.update()
println(result)
```

### member

```kotlin
// Update an existing member level
val result = client.member.update()
println(result)
```

### knowledge_base

```kotlin
// Update an existing knowledge base
val result = client.knowledgeBase.update()
println(result)
```

### invitation

```kotlin
// Update an invitation relation
val result = client.invitation.update()
println(result)
```

### image

```kotlin
// Update an existing image
val result = client.image.update()
println(result)
```

### im

```kotlin
// Update an existing chat group
val result = client.im.update()
println(result)
```

### generation

```kotlin
// Update an existing AI generation record
val result = client.generation.update()
println(result)
```

### game

```kotlin
// Update game definition
val result = client.game.update()
println(result)
```

### file

```kotlin
// Update existing file metadata
val result = client.file.update()
println(result)
```

### feed

```kotlin
// Update an existing feeds entry
val result = client.feed.update()
println(result)
```

### feedback

```kotlin
// Update feedback
val result = client.feedback.update()
println(result)
```

### favorite

```kotlin
// Update an existing favorite
val result = client.favorite.update()
println(result)
```

### disk

```kotlin
// Update an existing file disk
val result = client.disk.update()
println(result)
```

### detail

```kotlin
// Update existing detail content
val result = client.detail.update()
println(result)
```

### department

```kotlin
// Update an existing department
val result = client.department.update()
println(result)
```

### datasource

```kotlin
// Update an existing data source
val result = client.datasource.update()
println(result)
```

### coupon

```kotlin
// Update an existing coupon template
val result = client.coupon.update()
println(result)
```

### conversation

```kotlin
// Update an existing conversation
val result = client.conversation.update()
println(result)
```

### content_writing

```kotlin
// Rename chapter
val result = client.contentWriting.renameChapter()
println(result)
```

### comment

```kotlin
// Update an existing comment
val result = client.comment.update()
println(result)
```

### column

```kotlin
// Update column
val result = client.column.update()
println(result)
```

### collection

```kotlin
// Update an existing collection
val result = client.collection.update()
println(result)
```

### collection_item

```kotlin
// Update an existing collection item
val result = client.collectionItem.update()
println(result)
```

### chat

```kotlin
// Update an existing chat message
val result = client.chat.updateMessage()
println(result)
```

### character

```kotlin
// Update character
val result = client.character.update()
println(result)
```

### channel

```kotlin
// Update channel
val result = client.channel.update()
println(result)
```

### category

```kotlin
// Update an existing category
val result = client.category.update()
println(result)
```

### card

```kotlin
// Update an existing membership card
val result = client.card.update()
println(result)
```

### attribute

```kotlin
// Update attribute
val result = client.attribute.update()
println(result)
```

### article

```kotlin
// Update an existing AI article
val result = client.article.update()
println(result)
```

### app

```kotlin
// Update application
val result = client.app.update()
println(result)
```

### apikey

```kotlin
// Update an existing API key
val result = client.apikey.update()
println(result)
```

### agent

```kotlin
// Update an existing AI agent
val result = client.agent.update()
println(result)
```

### account

```kotlin
// Update an existing account
val result = client.account.update()
println(result)
```

### system

```kotlin
// Apply invoice
val result = client.system.apply()
println(result)
```

### search

```kotlin
// POST /backend/v3/api/search/chat/stop
val result = client.search.stop()
println(result)
```

### auth

```kotlin
// Verify phone
val result = client.auth.verifyPhone()
println(result)
```

## Error Handling

```kotlin
try {
    val result = client.workspace.update()
} catch (e: Exception) {
    println("Error: ${e.message}")
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

> Configure Gradle publishing credentials and optional `GRADLE_PUBLISH_TASK`.

## License

MIT
