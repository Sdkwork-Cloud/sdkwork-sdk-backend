# sdkwork-backend-sdk (Swift)

Professional Swift SDK for SDKWork API.

## Installation

Add to `Package.swift`:

```swift
dependencies: [
    .package(url: "https://github.com/sdkwork/backend-sdk-swift", from: "1.0.0")
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
- `client.aiUsageRecord` - ai_usage_record API
- `client.shoppingCart` - shopping_cart API
- `client.shoppingCartItem` - shopping_cart_item API
- `client.refund` - refund API
- `client.payment` - payment API
- `client.order` - order API
- `client.orderItem` - order_item API
- `client.aiTool` - ai_tool API
- `client.tenant` - tenant API
- `client.databaseTable` - database_table API
- `client.productSku` - product_sku API
- `client.shortUrl` - short_url API
- `client.shop` - shop API
- `client.share` - share API
- `client.shareVisitRecord` - share_visit_record API
- `client.shardingKey` - sharding_key API
- `client.schema` - schema API
- `client.rbacRole` - rbac_role API
- `client.rolePermission` - role_permission API
- `client.invocationRecord` - invocation_record API
- `client.rbacUserRole` - rbac_user_role API
- `client.aiPrompt` - ai_prompt API
- `client.project` - project API
- `client.product` - product API
- `client.pptTemplate` - ppt_template API
- `client.pptTemplateSlide` - ppt_template_slide API
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
- `client.host` - host API
- `client.dnsRecord` - dns_record API
- `client.music` - music API
- `client.aiModelInformation` - ai_model_information API
- `client.aiModelPrice` - ai_model_price API
- `client.chatMessage` - chat_message API
- `client.memberLevel` - member_level API
- `client.memberCard` - member_card API
- `client.knowledgeBase` - knowledge_base API
- `client.invitationRelation` - invitation_relation API
- `client.invitationCode` - invitation_code API
- `client.image` - image API
- `client.chatGroup` - chat_group API
- `client.aiGeneration` - ai_generation API
- `client.aiGenerationContent` - ai_generation_content API
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
- `client.aiConversation` - ai_conversation API
- `client.comment` - comment API
- `client.column` - column API
- `client.collection` - collection API
- `client.collectionItem` - collection_item API
- `client.character` - character API
- `client.channelResource` - channel_resource API
- `client.channelAccount` - channel_account API
- `client.aiCategory` - ai_category API
- `client.membershipCard` - membership_card API
- `client.cardTemplate` - card_template API
- `client.attribute` - attribute API
- `client.aiArticle` - ai_article API
- `client.application` - application API
- `client.apiKey` - api_key API
- `client.aiAgent` - ai_agent API
- `client.aiAgentToolRelationship` - ai_agent_tool_relationship API
- `client.account` - account API
- `client.accountHistory` - account_history API
- `client.searchChat` - search_chat API
- `client.pptTemplateRendering` - ppt_template_rendering API
- `client.pptTemplateChat` - ppt_template_chat API
- `client.knowledgeBaseFile` - knowledge_base_file API
- `client.knowledgeBaseChat` - knowledge_base_chat API
- `client.imMessage` - im_message API
- `client.aiVoiceSpeakerGeneration` - ai_voice_speaker_generation API
- `client.aiVideoGeneration` - ai_video_generation API
- `client.aiMusicGeneration` - ai_music_generation API
- `client.aiImageGeneration` - ai_image_generation API
- `client.aiCharacterGeneration` - ai_character_generation API
- `client.aiAudioGeneration` - ai_audio_generation API
- `client.aiAudioEffectGeneration` - ai_audio_effect_generation API
- `client.aiChat` - ai_chat API
- `client.verification` - verification API
- `client.oauthAuthentication` - oauth_authentication API
- `client.authorization` - authorization API
- `client.authentication` - authentication API
- `client.app` - app API
- `client.aiAgentChat` - ai_agent_chat API

## Usage Examples

### workspace

```swift
// Update an existing workspace
let result = try await client.workspace.update()
print(result)
```

### content_vote

```swift
// Update an existing content vote
let result = try await client.contentVote.update()
print(result)
```

### voice_speaker

```swift
// Update an existing voice speaker
let result = try await client.voiceSpeaker.update()
print(result)
```

### visit_history

```swift
// Update Visit History
let result = try await client.visitHistory.update()
print(result)
```

### vip_user

```swift
// Update an existing VIP user
let result = try await client.vipUser.update()
print(result)
```

### vip_recharge

```swift
// Update an existing VIP recharge record
let result = try await client.vipRecharge.update()
print(result)
```

### vip_recharge_package

```swift
// Update an existing VIP recharge package
let result = try await client.vipRechargePackage.update()
print(result)
```

### vip_point_change

```swift
// Update an existing VIP point change record
let result = try await client.vipPointChange.update()
print(result)
```

### vip_package_group

```swift
// Update an existing VIP package group
let result = try await client.vipPackageGroup.update()
print(result)
```

### vip_package

```swift
// Update VIP Package
let result = try await client.vipPackage.update()
print(result)
```

### vip_level

```swift
// Update an existing VIP level
let result = try await client.vipLevel.update()
print(result)
```

### vip_level_benefit

```swift
// Update an existing VIP level benefit
let result = try await client.vipLevelBenefit.update()
print(result)
```

### vip_benefit

```swift
// Update an existing VIP benefit
let result = try await client.vipBenefit.update()
print(result)
```

### vip_benefit_usage

```swift
// Update an existing VIP benefit usage record
let result = try await client.vipBenefitUsage.update()
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

### user_oauth_account

```swift
// Update user OAuth account
let result = try await client.userOauthAccount.update()
print(result)
```

### user_coupon

```swift
// Update an existing user coupon
let result = try await client.userCoupon.update()
print(result)
```

### user_card

```swift
// Update user-card binding
let result = try await client.userCard.update()
print(result)
```

### user_address

```swift
// Update an existing user address
let result = try await client.userAddress.update()
print(result)
```

### ai_usage_record

```swift
// Update an existing usage record
let result = try await client.aiUsageRecord.update()
print(result)
```

### shopping_cart

```swift
// Update shopping cart
let result = try await client.shoppingCart.update()
print(result)
```

### shopping_cart_item

```swift
// Update an existing shopping cart item
let result = try await client.shoppingCartItem.update()
print(result)
```

### refund

```swift
// Update an existing refund record
let result = try await client.refund.update()
print(result)
```

### payment

```swift
// Update an existing payment record
let result = try await client.payment.update()
print(result)
```

### order

```swift
// Update an existing order
let result = try await client.order.update()
print(result)
```

### order_item

```swift
// Update an existing order item
let result = try await client.orderItem.update()
print(result)
```

### ai_tool

```swift
// Update an existing AI tool
let result = try await client.aiTool.update()
print(result)
```

### tenant

```swift
// Update an existing tenant
let result = try await client.tenant.update()
print(result)
```

### database_table

```swift
// Update an existing database table
let result = try await client.databaseTable.update()
print(result)
```

### product_sku

```swift
// Update an existing SKU
let result = try await client.productSku.update()
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

### share_visit_record

```swift
// Update visit record
let result = try await client.shareVisitRecord.update()
print(result)
```

### sharding_key

```swift
// Update Sharding Key
let result = try await client.shardingKey.update()
print(result)
```

### schema

```swift
// Update an existing database schema
let result = try await client.schema.update()
print(result)
```

### rbac_role

```swift
// Update an existing system role
let result = try await client.rbacRole.update()
print(result)
```

### role_permission

```swift
// Update role-permission association
let result = try await client.rolePermission.update()
print(result)
```

### invocation_record

```swift
// Update an existing invocation record
let result = try await client.invocationRecord.update()
print(result)
```

### rbac_user_role

```swift
// Update user-role relationship
let result = try await client.rbacUserRole.update()
print(result)
```

### ai_prompt

```swift
// Update an existing AI prompt
let result = try await client.aiPrompt.update()
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

### ppt_template

```swift
// Update an existing PPT template
let result = try await client.pptTemplate.update()
print(result)
```

### ppt_template_slide

```swift
// Update an existing PPT template slide
let result = try await client.pptTemplateSlide.update()
print(result)
```

### partner

```swift
// Update a partner
let result = try await client.partner.update()
print(result)
```

### chat_participant

```swift
// Update an existing chat participant
let result = try await client.chatParticipant.update()
print(result)
```

### oss_bucket

```swift
// Update an existing OSS bucket
let result = try await client.ossBucket.update()
print(result)
```

### organization

```swift
// Update an existing organization
let result = try await client.organization.update()
print(result)
```

### position

```swift
// Update an existing position
let result = try await client.position.update()
print(result)
```

### member_relations

```swift
// Update member relation
let result = try await client.memberRelations.update()
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

### notes

```swift
// Update a note
let result = try await client.notes.update()
print(result)
```

### news

```swift
// Update an existing news
let result = try await client.news.update()
print(result)
```

### host

```swift
// 更新域名
let result = try await client.host.update()
print(result)
```

### dns_record

```swift
// Update an existing DNS record
let result = try await client.dnsRecord.update()
print(result)
```

### music

```swift
// Update music
let result = try await client.music.update()
print(result)
```

### ai_model_information

```swift
// Update existing AI model information
let result = try await client.aiModelInformation.update()
print(result)
```

### ai_model_price

```swift
// Update an existing AI model price
let result = try await client.aiModelPrice.update()
print(result)
```

### chat_message

```swift
// Update an existing chat message
let result = try await client.chatMessage.update()
print(result)
```

### member_level

```swift
// Update an existing member level
let result = try await client.memberLevel.update()
print(result)
```

### member_card

```swift
// Update an existing member card
let result = try await client.memberCard.update()
print(result)
```

### knowledge_base

```swift
// Update an existing knowledge base
let result = try await client.knowledgeBase.update()
print(result)
```

### invitation_relation

```swift
// Update an invitation relation
let result = try await client.invitationRelation.update()
print(result)
```

### invitation_code

```swift
// Update an existing invitation code
let result = try await client.invitationCode.update()
print(result)
```

### image

```swift
// Update an existing image
let result = try await client.image.update()
print(result)
```

### chat_group

```swift
// Update an existing chat group
let result = try await client.chatGroup.update()
print(result)
```

### ai_generation

```swift
// Update an existing AI generation record
let result = try await client.aiGeneration.update()
print(result)
```

### ai_generation_content

```swift
// Update AI generated content
let result = try await client.aiGenerationContent.update()
print(result)
```

### file

```swift
// Update existing file metadata
let result = try await client.file.update()
print(result)
```

### file_part

```swift
// Update an existing file part
let result = try await client.filePart.update()
print(result)
```

### file_content

```swift
// Update file content
let result = try await client.fileContent.update()
print(result)
```

### feeds

```swift
// Update an existing feeds entry
let result = try await client.feeds.update()
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

### file_disk

```swift
// Update an existing file disk
let result = try await client.fileDisk.update()
print(result)
```

### disk_member

```swift
// Update an existing disk member
let result = try await client.diskMember.update()
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

### coupon_template

```swift
// Update an existing coupon template
let result = try await client.couponTemplate.update()
print(result)
```

### ai_conversation

```swift
// Update an existing conversation
let result = try await client.aiConversation.update()
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

### character

```swift
// Update character
let result = try await client.character.update()
print(result)
```

### channel_resource

```swift
// Update an existing channel resource
let result = try await client.channelResource.update()
print(result)
```

### channel_account

```swift
// Update channel account
let result = try await client.channelAccount.update()
print(result)
```

### ai_category

```swift
// Update an existing category
let result = try await client.aiCategory.update()
print(result)
```

### membership_card

```swift
// Update an existing membership card
let result = try await client.membershipCard.update()
print(result)
```

### card_template

```swift
// Update an existing card template
let result = try await client.cardTemplate.update()
print(result)
```

### attribute

```swift
// Update attribute
let result = try await client.attribute.update()
print(result)
```

### ai_article

```swift
// Update an existing AI article
let result = try await client.aiArticle.update()
print(result)
```

### application

```swift
// Update application
let result = try await client.application.update()
print(result)
```

### api_key

```swift
// Update an existing API key
let result = try await client.apiKey.update()
print(result)
```

### ai_agent

```swift
// Update an existing AI agent
let result = try await client.aiAgent.update()
print(result)
```

### ai_agent_tool_relationship

```swift
// Update an existing agent-tool relationship
let result = try await client.aiAgentToolRelationship.update()
print(result)
```

### account

```swift
// Update an existing account
let result = try await client.account.update()
print(result)
```

### account_history

```swift
// Update an existing account history record
let result = try await client.accountHistory.update()
print(result)
```

### search_chat

```swift
// POST /backend/v3/api/search/chat/stop
let result = try await client.searchChat.stop()
print(result)
```

### ppt_template_rendering

```swift
// Render PPT template
let result = try await client.pptTemplateRendering.render()
print(result)
```

### ppt_template_chat

```swift
// POST /backend/v3/api/ppt/template/chat/stop
let result = try await client.pptTemplateChat.stop()
print(result)
```

### knowledge_base_file

```swift
// 获取文件列表
let result = try await client.knowledgeBaseFile.listFiles()
print(result)
```

### knowledge_base_chat

```swift
// POST /backend/v3/api/knowledge_base/chat/stop
let result = try await client.knowledgeBaseChat.stop()
print(result)
```

### im_message

```swift
// Get messages by page
let result = try await client.imMessage.listByPage()
print(result)
```

### ai_voice_speaker_generation

```swift
// Create voice speaker generation task
let result = try await client.aiVoiceSpeakerGeneration.create()
print(result)
```

### ai_video_generation

```swift
// Create video generation task
let result = try await client.aiVideoGeneration.create()
print(result)
```

### ai_music_generation

```swift
// Create music generation task
let result = try await client.aiMusicGeneration.create()
print(result)
```

### ai_image_generation

```swift
// Create image generation task
let result = try await client.aiImageGeneration.create()
print(result)
```

### ai_character_generation

```swift
// Create character generation task
let result = try await client.aiCharacterGeneration.create()
print(result)
```

### ai_audio_generation

```swift
// Create audio generation task
let result = try await client.aiAudioGeneration.create()
print(result)
```

### ai_audio_effect_generation

```swift
// Create audio effect generation task
let result = try await client.aiAudioEffectGeneration.create()
print(result)
```

### ai_chat

```swift
// Stop a chat completion stream
let result = try await client.aiChat.stop()
print(result)
```

### verification

```swift
// Verify phone
let result = try await client.verification.verifyPhone()
print(result)
```

### oauth_authentication

```swift
// Get OAuth authorization URL
let result = try await client.oauthAuthentication.getAuthUrl()
print(result)
```

### authorization

```swift
// 检查用户角色
let result = try await client.authorization.hasRole()
print(result)
```

### authentication

```swift
// 重置密码
let result = try await client.authentication.resetPassword()
print(result)
```

### app

```swift
// Get app SDK config
let result = try await client.app.getSdkConfig()
print(result)
```

### ai_agent_chat

```swift
// Create a chat completion with agent
let result = try await client.aiAgentChat.withContext()
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

## License

MIT
