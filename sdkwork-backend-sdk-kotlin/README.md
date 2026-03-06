# sdkwork-backend-sdk (Kotlin)

Professional Kotlin SDK for SDKWork API.

## Installation

Add to your `build.gradle.kts`:

```kotlin
implementation("com.sdkwork:backend-sdk:1.0.0")
```

Or with Gradle Groovy:

```groovy
implementation 'com.sdkwork:backend-sdk:1.0.0'
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
- `client.contentVote` - content_vote API
- `client.voiceSpeaker` - voice_speaker API
- `client.visitHistory` - visit_history API
- `client.vipUser` - vip_user API
- `client.vipRecharge` - vip_recharge API
- `client.vipRechargePackage` - vip_recharge_package API
- `client.vipPointChange` - vip_point_change API
- `client.vipPackageGroup` - vip_package_group API
- `client.vipPackage` - vip_package API
- `client.vipLevel` - vip_level API
- `client.vipLevelBenefit` - vip_level_benefit API
- `client.vipBenefit` - vip_benefit API
- `client.vipBenefitUsage` - vip_benefit_usage API
- `client.video` - video API
- `client.user` - user API
- `client.userOauthAccount` - user_oauth_account API
- `client.userCoupon` - user_coupon API
- `client.userCard` - user_card API
- `client.userAddress` - user_address API
- `client.usageRecord` - usage_record API
- `client.shoppingCart` - shopping_cart API
- `client.shoppingCartItem` - shopping_cart_item API
- `client.refund` - refund API
- `client.payment` - payment API
- `client.order` - order API
- `client.orderItem` - order_item API
- `client.tool` - tool API
- `client.tenant` - tenant API
- `client.databaseTable` - database_table API
- `client.productSku` - product_sku API
- `client.skill` - skill API
- `client.skillPackage` - skill_package API
- `client.shortUrl` - short_url API
- `client.shop` - shop API
- `client.share` - share API
- `client.shareVisitRecord` - share_visit_record API
- `client.shardingKey` - sharding_key API
- `client.apiSecurityPolicy` - api_security_policy API
- `client.schema` - schema API
- `client.rbacRole` - rbac_role API
- `client.rolePermission` - role_permission API
- `client.invocationRecord` - invocation_record API
- `client.rbacUserRole` - rbac_user_role API
- `client.prompt` - prompt API
- `client.project` - project API
- `client.product` - product API
- `client.pptTemplate` - ppt_template API
- `client.pptTemplateSlide` - ppt_template_slide API
- `client.rbacPermission` - rbac_permission API
- `client.partner` - partner API
- `client.chatParticipant` - chat_participant API
- `client.ossBucket` - oss_bucket API
- `client.organization` - organization API
- `client.position` - position API
- `client.memberRelations` - member_relations API
- `client.organizationMember` - organization_member API
- `client.notification` - notification API
- `client.notes` - notes API
- `client.news` - news API
- `client.net` - net API
- `client.dnsRecord` - dns_record API
- `client.music` - music API
- `client.modelInformation` - model_information API
- `client.modelPrice` - model_price API
- `client.chatMessage` - chat_message API
- `client.memberLevel` - member_level API
- `client.memberCard` - member_card API
- `client.knowledgeBase` - knowledge_base API
- `client.invitationRelation` - invitation_relation API
- `client.invitationCode` - invitation_code API
- `client.image` - image API
- `client.chatGroup` - chat_group API
- `client.generation` - generation API
- `client.generationContent` - generation_content API
- `client.file` - file API
- `client.filePart` - file_part API
- `client.fileContent` - file_content API
- `client.feeds` - feeds API
- `client.feedback` - feedback API
- `client.favorite` - favorite API
- `client.fileDisk` - file_disk API
- `client.diskMember` - disk_member API
- `client.detail` - detail API
- `client.department` - department API
- `client.datasource` - datasource API
- `client.coupon` - coupon API
- `client.couponTemplate` - coupon_template API
- `client.conversation` - conversation API
- `client.contentWriting` - content_writing API
- `client.comment` - comment API
- `client.column` - column API
- `client.collection` - collection API
- `client.collectionItem` - collection_item API
- `client.character` - character API
- `client.channel` - channel API
- `client.channelResource` - channel_resource API
- `client.channelProxy` - channel_proxy API
- `client.channelAccount` - channel_account API
- `client.category` - category API
- `client.membershipCard` - membership_card API
- `client.cardTemplate` - card_template API
- `client.attribute` - attribute API
- `client.article` - article API
- `client.app` - app API
- `client.apiKey` - api_key API
- `client.agent` - agent API
- `client.agentToolRelationship` - agent_tool_relationship API
- `client.account` - account API
- `client.accountHistory` - account_history API
- `client.accountExchangeConfig` - account_exchange_config API
- `client.invoice` - invoice API
- `client.searchChat` - search_chat API
- `client.pptTemplateRendering` - ppt_template_rendering API
- `client.pptTemplateChat` - ppt_template_chat API
- `client.knowledgeBaseFile` - knowledge_base_file API
- `client.knowledgeBaseChat` - knowledge_base_chat API
- `client.imMessage` - im_message API
- `client.voiceSpeakerGeneration` - voice_speaker_generation API
- `client.videoGeneration` - video_generation API
- `client.musicGeneration` - music_generation API
- `client.imageGeneration` - image_generation API
- `client.characterGeneration` - character_generation API
- `client.audioGeneration` - audio_generation API
- `client.audioEffectGeneration` - audio_effect_generation API
- `client.chat` - chat API
- `client.auth` - auth API
- `client.agentChat` - agent_chat API

## Usage Examples

### workspace

```kotlin
// Update an existing workspace
val result = client.workspace.update()
println(result)
```

### content_vote

```kotlin
// Update an existing content vote
val result = client.contentVote.update()
println(result)
```

### voice_speaker

```kotlin
// Update an existing voice speaker
val result = client.voiceSpeaker.update()
println(result)
```

### visit_history

```kotlin
// Update Visit History
val result = client.visitHistory.update()
println(result)
```

### vip_user

```kotlin
// Update an existing VIP user
val result = client.vipUser.update()
println(result)
```

### vip_recharge

```kotlin
// Update an existing VIP recharge record
val result = client.vipRecharge.update()
println(result)
```

### vip_recharge_package

```kotlin
// Update an existing VIP recharge package
val result = client.vipRechargePackage.update()
println(result)
```

### vip_point_change

```kotlin
// Update an existing VIP point change record
val result = client.vipPointChange.update()
println(result)
```

### vip_package_group

```kotlin
// Update an existing VIP package group
val result = client.vipPackageGroup.update()
println(result)
```

### vip_package

```kotlin
// Update VIP Package
val result = client.vipPackage.update()
println(result)
```

### vip_level

```kotlin
// Update an existing VIP level
val result = client.vipLevel.update()
println(result)
```

### vip_level_benefit

```kotlin
// Update an existing VIP level benefit
val result = client.vipLevelBenefit.update()
println(result)
```

### vip_benefit

```kotlin
// Update an existing VIP benefit
val result = client.vipBenefit.update()
println(result)
```

### vip_benefit_usage

```kotlin
// Update an existing VIP benefit usage record
val result = client.vipBenefitUsage.update()
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

### user_oauth_account

```kotlin
// Update user OAuth account
val result = client.userOauthAccount.update()
println(result)
```

### user_coupon

```kotlin
// Update an existing user coupon
val result = client.userCoupon.update()
println(result)
```

### user_card

```kotlin
// Update user-card binding
val result = client.userCard.update()
println(result)
```

### user_address

```kotlin
// Update an existing user address
val result = client.userAddress.update()
println(result)
```

### usage_record

```kotlin
// Update an existing usage record
val result = client.usageRecord.update()
println(result)
```

### shopping_cart

```kotlin
// Update shopping cart
val result = client.shoppingCart.update()
println(result)
```

### shopping_cart_item

```kotlin
// Update an existing shopping cart item
val result = client.shoppingCartItem.update()
println(result)
```

### refund

```kotlin
// Update an existing refund record
val result = client.refund.update()
println(result)
```

### payment

```kotlin
// Update an existing payment record
val result = client.payment.update()
println(result)
```

### order

```kotlin
// Update an existing order
val result = client.order.update()
println(result)
```

### order_item

```kotlin
// Update an existing order item
val result = client.orderItem.update()
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

### database_table

```kotlin
// Update an existing database table
val result = client.databaseTable.update()
println(result)
```

### product_sku

```kotlin
// Update an existing SKU
val result = client.productSku.update()
println(result)
```

### skill

```kotlin
// Get one skill detail
val result = client.skill.getById()
println(result)
```

### skill_package

```kotlin
// Get skill package detail
val result = client.skillPackage.getById()
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

### share_visit_record

```kotlin
// Update visit record
val result = client.shareVisitRecord.update()
println(result)
```

### sharding_key

```kotlin
// Update Sharding Key
val result = client.shardingKey.update()
println(result)
```

### api_security_policy

```kotlin
// PUT /backend/v3/api/security/policy
val result = client.apiSecurityPolicy.update()
println(result)
```

### schema

```kotlin
// Update an existing database schema
val result = client.schema.update()
println(result)
```

### rbac_role

```kotlin
// Update an existing system role
val result = client.rbacRole.update()
println(result)
```

### role_permission

```kotlin
// Update role-permission association
val result = client.rolePermission.update()
println(result)
```

### invocation_record

```kotlin
// Update an existing invocation record
val result = client.invocationRecord.update()
println(result)
```

### rbac_user_role

```kotlin
// Update user-role relationship
val result = client.rbacUserRole.update()
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

### ppt_template

```kotlin
// Update an existing PPT template
val result = client.pptTemplate.update()
println(result)
```

### ppt_template_slide

```kotlin
// Update an existing PPT template slide
val result = client.pptTemplateSlide.update()
println(result)
```

### rbac_permission

```kotlin
// PUT /backend/v3/api/permission
val result = client.rbacPermission.update()
println(result)
```

### partner

```kotlin
// Update a partner
val result = client.partner.update()
println(result)
```

### chat_participant

```kotlin
// Update an existing chat participant
val result = client.chatParticipant.update()
println(result)
```

### oss_bucket

```kotlin
// Update an existing OSS bucket
val result = client.ossBucket.update()
println(result)
```

### organization

```kotlin
// Update an existing organization
val result = client.organization.update()
println(result)
```

### position

```kotlin
// Update an existing position
val result = client.position.update()
println(result)
```

### member_relations

```kotlin
// Update member relation
val result = client.memberRelations.update()
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

### notes

```kotlin
// Update a note
val result = client.notes.update()
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

### dns_record

```kotlin
// Update an existing DNS record
val result = client.dnsRecord.update()
println(result)
```

### music

```kotlin
// Update music
val result = client.music.update()
println(result)
```

### model_information

```kotlin
// Update existing AI model information
val result = client.modelInformation.update()
println(result)
```

### model_price

```kotlin
// Update an existing AI model price
val result = client.modelPrice.update()
println(result)
```

### chat_message

```kotlin
// Update an existing chat message
val result = client.chatMessage.update()
println(result)
```

### member_level

```kotlin
// Update an existing member level
val result = client.memberLevel.update()
println(result)
```

### member_card

```kotlin
// Update an existing member card
val result = client.memberCard.update()
println(result)
```

### knowledge_base

```kotlin
// Update an existing knowledge base
val result = client.knowledgeBase.update()
println(result)
```

### invitation_relation

```kotlin
// Update an invitation relation
val result = client.invitationRelation.update()
println(result)
```

### invitation_code

```kotlin
// Update an existing invitation code
val result = client.invitationCode.update()
println(result)
```

### image

```kotlin
// Update an existing image
val result = client.image.update()
println(result)
```

### chat_group

```kotlin
// Update an existing chat group
val result = client.chatGroup.update()
println(result)
```

### generation

```kotlin
// Update an existing AI generation record
val result = client.generation.update()
println(result)
```

### generation_content

```kotlin
// Update AI generated content
val result = client.generationContent.update()
println(result)
```

### file

```kotlin
// Update existing file metadata
val result = client.file.update()
println(result)
```

### file_part

```kotlin
// Update an existing file part
val result = client.filePart.update()
println(result)
```

### file_content

```kotlin
// Update file content
val result = client.fileContent.update()
println(result)
```

### feeds

```kotlin
// Update an existing feeds entry
val result = client.feeds.update()
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

### file_disk

```kotlin
// Update an existing file disk
val result = client.fileDisk.update()
println(result)
```

### disk_member

```kotlin
// Update an existing disk member
val result = client.diskMember.update()
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

### coupon_template

```kotlin
// Update an existing coupon template
val result = client.couponTemplate.update()
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

### channel_resource

```kotlin
// Update an existing channel resource
val result = client.channelResource.update()
println(result)
```

### channel_proxy

```kotlin
// Update channel proxy
val result = client.channelProxy.update()
println(result)
```

### channel_account

```kotlin
// Update channel account
val result = client.channelAccount.update()
println(result)
```

### category

```kotlin
// Update an existing category
val result = client.category.update()
println(result)
```

### membership_card

```kotlin
// Update an existing membership card
val result = client.membershipCard.update()
println(result)
```

### card_template

```kotlin
// Update an existing card template
val result = client.cardTemplate.update()
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

### api_key

```kotlin
// Update an existing API key
val result = client.apiKey.update()
println(result)
```

### agent

```kotlin
// Update an existing AI agent
val result = client.agent.update()
println(result)
```

### agent_tool_relationship

```kotlin
// Update an existing agent-tool relationship
val result = client.agentToolRelationship.update()
println(result)
```

### account

```kotlin
// Update an existing account
val result = client.account.update()
println(result)
```

### account_history

```kotlin
// Update an existing account history record
val result = client.accountHistory.update()
println(result)
```

### account_exchange_config

```kotlin
// Get points-to-cash rate
val result = client.accountExchangeConfig.getPointsToCashRate()
println(result)
```

### invoice

```kotlin
// Apply invoice
val result = client.invoice.apply()
println(result)
```

### search_chat

```kotlin
// POST /backend/v3/api/search/chat/stop
val result = client.searchChat.stop()
println(result)
```

### ppt_template_rendering

```kotlin
// Render PPT template
val result = client.pptTemplateRendering.render()
println(result)
```

### ppt_template_chat

```kotlin
// POST /backend/v3/api/ppt/template/chat/stop
val result = client.pptTemplateChat.stop()
println(result)
```

### knowledge_base_file

```kotlin
// List files
val result = client.knowledgeBaseFile.listFiles()
println(result)
```

### knowledge_base_chat

```kotlin
// POST /backend/v3/api/knowledge_base/chat/stop
val result = client.knowledgeBaseChat.stop()
println(result)
```

### im_message

```kotlin
// Mark conversation messages as read
val result = client.imMessage.markRead()
println(result)
```

### voice_speaker_generation

```kotlin
// Create voice speaker generation task
val result = client.voiceSpeakerGeneration.create()
println(result)
```

### video_generation

```kotlin
// Create video generation task
val result = client.videoGeneration.create()
println(result)
```

### music_generation

```kotlin
// Create music generation task
val result = client.musicGeneration.create()
println(result)
```

### image_generation

```kotlin
// Create image generation task
val result = client.imageGeneration.create()
println(result)
```

### character_generation

```kotlin
// Create character generation task
val result = client.characterGeneration.create()
println(result)
```

### audio_generation

```kotlin
// Create audio generation task
val result = client.audioGeneration.create()
println(result)
```

### audio_effect_generation

```kotlin
// Create audio effect generation task
val result = client.audioEffectGeneration.create()
println(result)
```

### chat

```kotlin
// Stop a chat completion stream
val result = client.chat.stop()
println(result)
```

### auth

```kotlin
// Verify phone
val result = client.auth.verifyPhone()
println(result)
```

### agent_chat

```kotlin
// Create a chat completion with agent
val result = client.agentChat.withContext()
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
