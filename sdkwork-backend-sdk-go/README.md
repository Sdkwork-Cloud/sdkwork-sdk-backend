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
- `client.ContentVote` - content_vote API
- `client.VoiceSpeaker` - voice_speaker API
- `client.VisitHistory` - visit_history API
- `client.VipUser` - vip_user API
- `client.VipRecharge` - vip_recharge API
- `client.VipRechargePackage` - vip_recharge_package API
- `client.VipPointChange` - vip_point_change API
- `client.VipPackageGroup` - vip_package_group API
- `client.VipPackage` - vip_package API
- `client.VipLevel` - vip_level API
- `client.VipLevelBenefit` - vip_level_benefit API
- `client.VipBenefit` - vip_benefit API
- `client.VipBenefitUsage` - vip_benefit_usage API
- `client.Video` - video API
- `client.User` - user API
- `client.UserOauthAccount` - user_oauth_account API
- `client.UserCoupon` - user_coupon API
- `client.UserCard` - user_card API
- `client.UserAddress` - user_address API
- `client.AiUsageRecord` - ai_usage_record API
- `client.ShoppingCart` - shopping_cart API
- `client.ShoppingCartItem` - shopping_cart_item API
- `client.Refund` - refund API
- `client.Payment` - payment API
- `client.Order` - order API
- `client.OrderItem` - order_item API
- `client.AiTool` - ai_tool API
- `client.Tenant` - tenant API
- `client.DatabaseTable` - database_table API
- `client.ProductSku` - product_sku API
- `client.ShortUrl` - short_url API
- `client.Shop` - shop API
- `client.Share` - share API
- `client.ShareVisitRecord` - share_visit_record API
- `client.ShardingKey` - sharding_key API
- `client.Schema` - schema API
- `client.RbacRole` - rbac_role API
- `client.RolePermission` - role_permission API
- `client.InvocationRecord` - invocation_record API
- `client.RbacUserRole` - rbac_user_role API
- `client.AiPrompt` - ai_prompt API
- `client.Project` - project API
- `client.Product` - product API
- `client.PptTemplate` - ppt_template API
- `client.PptTemplateSlide` - ppt_template_slide API
- `client.Partner` - partner API
- `client.ChatParticipant` - chat_participant API
- `client.OssBucket` - oss_bucket API
- `client.Organization` - organization API
- `client.Position` - position API
- `client.MemberRelations` - member_relations API
- `client.OrganizationMember` - organization_member API
- `client.Notification` - notification API
- `client.Notes` - notes API
- `client.News` - news API
- `client.Host` - host API
- `client.DnsRecord` - dns_record API
- `client.Music` - music API
- `client.AiModelInformation` - ai_model_information API
- `client.AiModelPrice` - ai_model_price API
- `client.ChatMessage` - chat_message API
- `client.MemberLevel` - member_level API
- `client.MemberCard` - member_card API
- `client.KnowledgeBase` - knowledge_base API
- `client.InvitationRelation` - invitation_relation API
- `client.InvitationCode` - invitation_code API
- `client.Image` - image API
- `client.ChatGroup` - chat_group API
- `client.AiGeneration` - ai_generation API
- `client.AiGenerationContent` - ai_generation_content API
- `client.File` - file API
- `client.FilePart` - file_part API
- `client.FileContent` - file_content API
- `client.Feeds` - feeds API
- `client.Feedback` - feedback API
- `client.Favorite` - favorite API
- `client.FileDisk` - file_disk API
- `client.DiskMember` - disk_member API
- `client.Detail` - detail API
- `client.Department` - department API
- `client.Datasource` - datasource API
- `client.Coupon` - coupon API
- `client.CouponTemplate` - coupon_template API
- `client.AiConversation` - ai_conversation API
- `client.Comment` - comment API
- `client.Column` - column API
- `client.Collection` - collection API
- `client.CollectionItem` - collection_item API
- `client.Character` - character API
- `client.ChannelResource` - channel_resource API
- `client.ChannelAccount` - channel_account API
- `client.AiCategory` - ai_category API
- `client.MembershipCard` - membership_card API
- `client.CardTemplate` - card_template API
- `client.Attribute` - attribute API
- `client.AiArticle` - ai_article API
- `client.Application` - application API
- `client.ApiKey` - api_key API
- `client.AiAgent` - ai_agent API
- `client.AiAgentToolRelationship` - ai_agent_tool_relationship API
- `client.Account` - account API
- `client.AccountHistory` - account_history API
- `client.SearchChat` - search_chat API
- `client.PptTemplateRendering` - ppt_template_rendering API
- `client.PptTemplateChat` - ppt_template_chat API
- `client.KnowledgeBaseFile` - knowledge_base_file API
- `client.KnowledgeBaseChat` - knowledge_base_chat API
- `client.ImMessage` - im_message API
- `client.AiVoiceSpeakerGeneration` - ai_voice_speaker_generation API
- `client.AiVideoGeneration` - ai_video_generation API
- `client.AiMusicGeneration` - ai_music_generation API
- `client.AiImageGeneration` - ai_image_generation API
- `client.AiCharacterGeneration` - ai_character_generation API
- `client.AiAudioGeneration` - ai_audio_generation API
- `client.AiAudioEffectGeneration` - ai_audio_effect_generation API
- `client.AiChat` - ai_chat API
- `client.Verification` - verification API
- `client.OauthAuthentication` - oauth_authentication API
- `client.Authorization` - authorization API
- `client.Authentication` - authentication API
- `client.App` - app API
- `client.AiAgentChat` - ai_agent_chat API

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

### content_vote

```go
// Update an existing content vote
result, err := client.ContentVote.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### voice_speaker

```go
// Update an existing voice speaker
result, err := client.VoiceSpeaker.Update()
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

### vip_user

```go
// Update an existing VIP user
result, err := client.VipUser.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### vip_recharge

```go
// Update an existing VIP recharge record
result, err := client.VipRecharge.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### vip_recharge_package

```go
// Update an existing VIP recharge package
result, err := client.VipRechargePackage.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### vip_point_change

```go
// Update an existing VIP point change record
result, err := client.VipPointChange.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### vip_package_group

```go
// Update an existing VIP package group
result, err := client.VipPackageGroup.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### vip_package

```go
// Update VIP Package
result, err := client.VipPackage.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### vip_level

```go
// Update an existing VIP level
result, err := client.VipLevel.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### vip_level_benefit

```go
// Update an existing VIP level benefit
result, err := client.VipLevelBenefit.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### vip_benefit

```go
// Update an existing VIP benefit
result, err := client.VipBenefit.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### vip_benefit_usage

```go
// Update an existing VIP benefit usage record
result, err := client.VipBenefitUsage.Update()
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

### user_oauth_account

```go
// Update user OAuth account
result, err := client.UserOauthAccount.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### user_coupon

```go
// Update an existing user coupon
result, err := client.UserCoupon.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### user_card

```go
// Update user-card binding
result, err := client.UserCard.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### user_address

```go
// Update an existing user address
result, err := client.UserAddress.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### ai_usage_record

```go
// Update an existing usage record
result, err := client.AiUsageRecord.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### shopping_cart

```go
// Update shopping cart
result, err := client.ShoppingCart.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### shopping_cart_item

```go
// Update an existing shopping cart item
result, err := client.ShoppingCartItem.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### refund

```go
// Update an existing refund record
result, err := client.Refund.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### payment

```go
// Update an existing payment record
result, err := client.Payment.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### order

```go
// Update an existing order
result, err := client.Order.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### order_item

```go
// Update an existing order item
result, err := client.OrderItem.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### ai_tool

```go
// Update an existing AI tool
result, err := client.AiTool.Update()
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

### database_table

```go
// Update an existing database table
result, err := client.DatabaseTable.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### product_sku

```go
// Update an existing SKU
result, err := client.ProductSku.Update()
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

### share_visit_record

```go
// Update visit record
result, err := client.ShareVisitRecord.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### sharding_key

```go
// Update Sharding Key
result, err := client.ShardingKey.Update()
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

### rbac_role

```go
// Update an existing system role
result, err := client.RbacRole.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### role_permission

```go
// Update role-permission association
result, err := client.RolePermission.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### invocation_record

```go
// Update an existing invocation record
result, err := client.InvocationRecord.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### rbac_user_role

```go
// Update user-role relationship
result, err := client.RbacUserRole.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### ai_prompt

```go
// Update an existing AI prompt
result, err := client.AiPrompt.Update()
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

### ppt_template

```go
// Update an existing PPT template
result, err := client.PptTemplate.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### ppt_template_slide

```go
// Update an existing PPT template slide
result, err := client.PptTemplateSlide.Update()
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

### chat_participant

```go
// Update an existing chat participant
result, err := client.ChatParticipant.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### oss_bucket

```go
// Update an existing OSS bucket
result, err := client.OssBucket.Update()
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

### position

```go
// Update an existing position
result, err := client.Position.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### member_relations

```go
// Update member relation
result, err := client.MemberRelations.Update()
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

### notes

```go
// Update a note
result, err := client.Notes.Update()
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

### host

```go
// 更新域名
result, err := client.Host.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### dns_record

```go
// Update an existing DNS record
result, err := client.DnsRecord.Update()
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

### ai_model_information

```go
// Update existing AI model information
result, err := client.AiModelInformation.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### ai_model_price

```go
// Update an existing AI model price
result, err := client.AiModelPrice.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### chat_message

```go
// Update an existing chat message
result, err := client.ChatMessage.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### member_level

```go
// Update an existing member level
result, err := client.MemberLevel.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### member_card

```go
// Update an existing member card
result, err := client.MemberCard.Update()
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

### invitation_relation

```go
// Update an invitation relation
result, err := client.InvitationRelation.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### invitation_code

```go
// Update an existing invitation code
result, err := client.InvitationCode.Update()
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

### chat_group

```go
// Update an existing chat group
result, err := client.ChatGroup.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### ai_generation

```go
// Update an existing AI generation record
result, err := client.AiGeneration.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### ai_generation_content

```go
// Update AI generated content
result, err := client.AiGenerationContent.Update()
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

### file_part

```go
// Update an existing file part
result, err := client.FilePart.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### file_content

```go
// Update file content
result, err := client.FileContent.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### feeds

```go
// Update an existing feeds entry
result, err := client.Feeds.Update()
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

### file_disk

```go
// Update an existing file disk
result, err := client.FileDisk.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### disk_member

```go
// Update an existing disk member
result, err := client.DiskMember.Update()
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

### coupon_template

```go
// Update an existing coupon template
result, err := client.CouponTemplate.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### ai_conversation

```go
// Update an existing conversation
result, err := client.AiConversation.Update()
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

### character

```go
// Update character
result, err := client.Character.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### channel_resource

```go
// Update an existing channel resource
result, err := client.ChannelResource.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### channel_account

```go
// Update channel account
result, err := client.ChannelAccount.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### ai_category

```go
// Update an existing category
result, err := client.AiCategory.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### membership_card

```go
// Update an existing membership card
result, err := client.MembershipCard.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### card_template

```go
// Update an existing card template
result, err := client.CardTemplate.Update()
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

### ai_article

```go
// Update an existing AI article
result, err := client.AiArticle.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### application

```go
// Update application
result, err := client.Application.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### api_key

```go
// Update an existing API key
result, err := client.ApiKey.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### ai_agent

```go
// Update an existing AI agent
result, err := client.AiAgent.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### ai_agent_tool_relationship

```go
// Update an existing agent-tool relationship
result, err := client.AiAgentToolRelationship.Update()
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

### account_history

```go
// Update an existing account history record
result, err := client.AccountHistory.Update()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### search_chat

```go
// POST /backend/v3/api/search/chat/stop
result, err := client.SearchChat.Stop()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### ppt_template_rendering

```go
// Render PPT template
result, err := client.PptTemplateRendering.Render()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### ppt_template_chat

```go
// POST /backend/v3/api/ppt/template/chat/stop
result, err := client.PptTemplateChat.Stop()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### knowledge_base_file

```go
// 获取文件列表
result, err := client.KnowledgeBaseFile.ListFiles()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### knowledge_base_chat

```go
// POST /backend/v3/api/knowledge_base/chat/stop
result, err := client.KnowledgeBaseChat.Stop()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### im_message

```go
// Get messages by page
result, err := client.ImMessage.ListByPage()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### ai_voice_speaker_generation

```go
// Create voice speaker generation task
result, err := client.AiVoiceSpeakerGeneration.Create()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### ai_video_generation

```go
// Create video generation task
result, err := client.AiVideoGeneration.Create()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### ai_music_generation

```go
// Create music generation task
result, err := client.AiMusicGeneration.Create()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### ai_image_generation

```go
// Create image generation task
result, err := client.AiImageGeneration.Create()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### ai_character_generation

```go
// Create character generation task
result, err := client.AiCharacterGeneration.Create()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### ai_audio_generation

```go
// Create audio generation task
result, err := client.AiAudioGeneration.Create()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### ai_audio_effect_generation

```go
// Create audio effect generation task
result, err := client.AiAudioEffectGeneration.Create()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### ai_chat

```go
// Stop a chat completion stream
result, err := client.AiChat.Stop()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### verification

```go
// Verify phone
result, err := client.Verification.VerifyPhone()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### oauth_authentication

```go
// Get OAuth authorization URL
result, err := client.OauthAuthentication.GetAuthUrl()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### authorization

```go
// 检查用户角色
result, err := client.Authorization.HasRole()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### authentication

```go
// 重置密码
result, err := client.Authentication.ResetPassword()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### app

```go
// Get app SDK config
result, err := client.App.GetSdkConfig()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### ai_agent_chat

```go
// Create a chat completion with agent
result, err := client.AiAgentChat.WithContext()
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

## License

MIT
