# sdkwork-backend-sdk (C#)

Professional C# SDK for SDKWork API.

## Installation

```bash
dotnet add package Backend
```

Or add to your `.csproj`:

```xml
<PackageReference Include="Backend" Version="1.0.1" />
```

## Quick Start

```csharp
using Backend;
using SDKwork.Common.Core;

var config = new SdkConfig("http://localhost:8080");
var client = new SdkworkBackendClient(config);
client.SetApiKey("your-api-key");

// Use the SDK
var result = await client.Workspace.UpdateAsync();
Console.WriteLine(result);
```

## Authentication Modes (Mutually Exclusive)

Choose exactly one mode for the same client instance.

### Mode A: API Key

```csharp
var config = new SdkConfig("http://localhost:8080");
var client = new SdkworkBackendClient(config);
client.SetApiKey("your-api-key");
// Sends: Authorization: Bearer <apiKey>
```

### Mode B: Dual Token

```csharp
var config = new SdkConfig("http://localhost:8080");
var client = new SdkworkBackendClient(config);
client.SetAuthToken("your-auth-token");
client.SetAccessToken("your-access-token");
// Sends:
// Authorization: Bearer <authToken>
// Access-Token: <accessToken>
```

> Do not call `SetApiKey(...)` together with `SetAuthToken(...)` + `SetAccessToken(...)` on the same client.

## Configuration (Non-Auth)

```csharp
var config = new SdkConfig("http://localhost:8080");
var client = new SdkworkBackendClient(config);

// Set custom headers
client.SetHeader("X-Custom-Header", "value");
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

```csharp
// Update an existing workspace
var result = await client.Workspace.UpdateAsync();
Console.WriteLine(result);
```

### content_vote

```csharp
// Update an existing content vote
var result = await client.ContentVote.UpdateAsync();
Console.WriteLine(result);
```

### voice_speaker

```csharp
// Update an existing voice speaker
var result = await client.VoiceSpeaker.UpdateAsync();
Console.WriteLine(result);
```

### visit_history

```csharp
// Update Visit History
var result = await client.VisitHistory.UpdateAsync();
Console.WriteLine(result);
```

### vip_user

```csharp
// Update an existing VIP user
var result = await client.VipUser.UpdateAsync();
Console.WriteLine(result);
```

### vip_recharge

```csharp
// Update an existing VIP recharge record
var result = await client.VipRecharge.UpdateAsync();
Console.WriteLine(result);
```

### vip_recharge_package

```csharp
// Update an existing VIP recharge package
var result = await client.VipRechargePackage.UpdateAsync();
Console.WriteLine(result);
```

### vip_point_change

```csharp
// Update an existing VIP point change record
var result = await client.VipPointChange.UpdateAsync();
Console.WriteLine(result);
```

### vip_package_group

```csharp
// Update an existing VIP package group
var result = await client.VipPackageGroup.UpdateAsync();
Console.WriteLine(result);
```

### vip_package

```csharp
// Update VIP Package
var result = await client.VipPackage.UpdateAsync();
Console.WriteLine(result);
```

### vip_level

```csharp
// Update an existing VIP level
var result = await client.VipLevel.UpdateAsync();
Console.WriteLine(result);
```

### vip_level_benefit

```csharp
// Update an existing VIP level benefit
var result = await client.VipLevelBenefit.UpdateAsync();
Console.WriteLine(result);
```

### vip_benefit

```csharp
// Update an existing VIP benefit
var result = await client.VipBenefit.UpdateAsync();
Console.WriteLine(result);
```

### vip_benefit_usage

```csharp
// Update an existing VIP benefit usage record
var result = await client.VipBenefitUsage.UpdateAsync();
Console.WriteLine(result);
```

### video

```csharp
// Update an existing video
var result = await client.Video.UpdateAsync();
Console.WriteLine(result);
```

### user

```csharp
// Update an existing user
var result = await client.User.UpdateAsync();
Console.WriteLine(result);
```

### user_oauth_account

```csharp
// Update user OAuth account
var result = await client.UserOauthAccount.UpdateAsync();
Console.WriteLine(result);
```

### user_coupon

```csharp
// Update an existing user coupon
var result = await client.UserCoupon.UpdateAsync();
Console.WriteLine(result);
```

### user_card

```csharp
// Update user-card binding
var result = await client.UserCard.UpdateAsync();
Console.WriteLine(result);
```

### user_address

```csharp
// Update an existing user address
var result = await client.UserAddress.UpdateAsync();
Console.WriteLine(result);
```

### ai_usage_record

```csharp
// Update an existing usage record
var result = await client.AiUsageRecord.UpdateAsync();
Console.WriteLine(result);
```

### shopping_cart

```csharp
// Update shopping cart
var result = await client.ShoppingCart.UpdateAsync();
Console.WriteLine(result);
```

### shopping_cart_item

```csharp
// Update an existing shopping cart item
var result = await client.ShoppingCartItem.UpdateAsync();
Console.WriteLine(result);
```

### refund

```csharp
// Update an existing refund record
var result = await client.Refund.UpdateAsync();
Console.WriteLine(result);
```

### payment

```csharp
// Update an existing payment record
var result = await client.Payment.UpdateAsync();
Console.WriteLine(result);
```

### order

```csharp
// Update an existing order
var result = await client.Order.UpdateAsync();
Console.WriteLine(result);
```

### order_item

```csharp
// Update an existing order item
var result = await client.OrderItem.UpdateAsync();
Console.WriteLine(result);
```

### ai_tool

```csharp
// Update an existing AI tool
var result = await client.AiTool.UpdateAsync();
Console.WriteLine(result);
```

### tenant

```csharp
// Update an existing tenant
var result = await client.Tenant.UpdateAsync();
Console.WriteLine(result);
```

### database_table

```csharp
// Update an existing database table
var result = await client.DatabaseTable.UpdateAsync();
Console.WriteLine(result);
```

### product_sku

```csharp
// Update an existing SKU
var result = await client.ProductSku.UpdateAsync();
Console.WriteLine(result);
```

### short_url

```csharp
// Update short URL
var result = await client.ShortUrl.UpdateAsync();
Console.WriteLine(result);
```

### shop

```csharp
// Update an existing shop
var result = await client.Shop.UpdateAsync();
Console.WriteLine(result);
```

### share

```csharp
// 更新分享
var result = await client.Share.UpdateAsync();
Console.WriteLine(result);
```

### share_visit_record

```csharp
// Update visit record
var result = await client.ShareVisitRecord.UpdateAsync();
Console.WriteLine(result);
```

### sharding_key

```csharp
// Update Sharding Key
var result = await client.ShardingKey.UpdateAsync();
Console.WriteLine(result);
```

### schema

```csharp
// Update an existing database schema
var result = await client.Schema.UpdateAsync();
Console.WriteLine(result);
```

### rbac_role

```csharp
// Update an existing system role
var result = await client.RbacRole.UpdateAsync();
Console.WriteLine(result);
```

### role_permission

```csharp
// Update role-permission association
var result = await client.RolePermission.UpdateAsync();
Console.WriteLine(result);
```

### invocation_record

```csharp
// Update an existing invocation record
var result = await client.InvocationRecord.UpdateAsync();
Console.WriteLine(result);
```

### rbac_user_role

```csharp
// Update user-role relationship
var result = await client.RbacUserRole.UpdateAsync();
Console.WriteLine(result);
```

### ai_prompt

```csharp
// Update an existing AI prompt
var result = await client.AiPrompt.UpdateAsync();
Console.WriteLine(result);
```

### project

```csharp
// Update an existing project
var result = await client.Project.UpdateAsync();
Console.WriteLine(result);
```

### product

```csharp
// Update an existing product
var result = await client.Product.UpdateAsync();
Console.WriteLine(result);
```

### ppt_template

```csharp
// Update an existing PPT template
var result = await client.PptTemplate.UpdateAsync();
Console.WriteLine(result);
```

### ppt_template_slide

```csharp
// Update an existing PPT template slide
var result = await client.PptTemplateSlide.UpdateAsync();
Console.WriteLine(result);
```

### partner

```csharp
// Update a partner
var result = await client.Partner.UpdateAsync();
Console.WriteLine(result);
```

### chat_participant

```csharp
// Update an existing chat participant
var result = await client.ChatParticipant.UpdateAsync();
Console.WriteLine(result);
```

### oss_bucket

```csharp
// Update an existing OSS bucket
var result = await client.OssBucket.UpdateAsync();
Console.WriteLine(result);
```

### organization

```csharp
// Update an existing organization
var result = await client.Organization.UpdateAsync();
Console.WriteLine(result);
```

### position

```csharp
// Update an existing position
var result = await client.Position.UpdateAsync();
Console.WriteLine(result);
```

### member_relations

```csharp
// Update member relation
var result = await client.MemberRelations.UpdateAsync();
Console.WriteLine(result);
```

### organization_member

```csharp
// Update organization member
var result = await client.OrganizationMember.UpdateAsync();
Console.WriteLine(result);
```

### notification

```csharp
// Update an existing notification
var result = await client.Notification.UpdateAsync();
Console.WriteLine(result);
```

### notes

```csharp
// Update a note
var result = await client.Notes.UpdateAsync();
Console.WriteLine(result);
```

### news

```csharp
// Update an existing news
var result = await client.News.UpdateAsync();
Console.WriteLine(result);
```

### host

```csharp
// 更新域名
var result = await client.Host.UpdateAsync();
Console.WriteLine(result);
```

### dns_record

```csharp
// Update an existing DNS record
var result = await client.DnsRecord.UpdateAsync();
Console.WriteLine(result);
```

### music

```csharp
// Update music
var result = await client.Music.UpdateAsync();
Console.WriteLine(result);
```

### ai_model_information

```csharp
// Update existing AI model information
var result = await client.AiModelInformation.UpdateAsync();
Console.WriteLine(result);
```

### ai_model_price

```csharp
// Update an existing AI model price
var result = await client.AiModelPrice.UpdateAsync();
Console.WriteLine(result);
```

### chat_message

```csharp
// Update an existing chat message
var result = await client.ChatMessage.UpdateAsync();
Console.WriteLine(result);
```

### member_level

```csharp
// Update an existing member level
var result = await client.MemberLevel.UpdateAsync();
Console.WriteLine(result);
```

### member_card

```csharp
// Update an existing member card
var result = await client.MemberCard.UpdateAsync();
Console.WriteLine(result);
```

### knowledge_base

```csharp
// Update an existing knowledge base
var result = await client.KnowledgeBase.UpdateAsync();
Console.WriteLine(result);
```

### invitation_relation

```csharp
// Update an invitation relation
var result = await client.InvitationRelation.UpdateAsync();
Console.WriteLine(result);
```

### invitation_code

```csharp
// Update an existing invitation code
var result = await client.InvitationCode.UpdateAsync();
Console.WriteLine(result);
```

### image

```csharp
// Update an existing image
var result = await client.Image.UpdateAsync();
Console.WriteLine(result);
```

### chat_group

```csharp
// Update an existing chat group
var result = await client.ChatGroup.UpdateAsync();
Console.WriteLine(result);
```

### ai_generation

```csharp
// Update an existing AI generation record
var result = await client.AiGeneration.UpdateAsync();
Console.WriteLine(result);
```

### ai_generation_content

```csharp
// Update AI generated content
var result = await client.AiGenerationContent.UpdateAsync();
Console.WriteLine(result);
```

### file

```csharp
// Update existing file metadata
var result = await client.File.UpdateAsync();
Console.WriteLine(result);
```

### file_part

```csharp
// Update an existing file part
var result = await client.FilePart.UpdateAsync();
Console.WriteLine(result);
```

### file_content

```csharp
// Update file content
var result = await client.FileContent.UpdateAsync();
Console.WriteLine(result);
```

### feeds

```csharp
// Update an existing feeds entry
var result = await client.Feeds.UpdateAsync();
Console.WriteLine(result);
```

### feedback

```csharp
// Update feedback
var result = await client.Feedback.UpdateAsync();
Console.WriteLine(result);
```

### favorite

```csharp
// Update an existing favorite
var result = await client.Favorite.UpdateAsync();
Console.WriteLine(result);
```

### file_disk

```csharp
// Update an existing file disk
var result = await client.FileDisk.UpdateAsync();
Console.WriteLine(result);
```

### disk_member

```csharp
// Update an existing disk member
var result = await client.DiskMember.UpdateAsync();
Console.WriteLine(result);
```

### detail

```csharp
// Update existing detail content
var result = await client.Detail.UpdateAsync();
Console.WriteLine(result);
```

### department

```csharp
// Update an existing department
var result = await client.Department.UpdateAsync();
Console.WriteLine(result);
```

### datasource

```csharp
// Update an existing data source
var result = await client.Datasource.UpdateAsync();
Console.WriteLine(result);
```

### coupon

```csharp
// Update an existing coupon template
var result = await client.Coupon.UpdateAsync();
Console.WriteLine(result);
```

### coupon_template

```csharp
// Update an existing coupon template
var result = await client.CouponTemplate.UpdateAsync();
Console.WriteLine(result);
```

### ai_conversation

```csharp
// Update an existing conversation
var result = await client.AiConversation.UpdateAsync();
Console.WriteLine(result);
```

### comment

```csharp
// Update an existing comment
var result = await client.Comment.UpdateAsync();
Console.WriteLine(result);
```

### column

```csharp
// Update column
var result = await client.Column.UpdateAsync();
Console.WriteLine(result);
```

### collection

```csharp
// Update an existing collection
var result = await client.Collection.UpdateAsync();
Console.WriteLine(result);
```

### collection_item

```csharp
// Update an existing collection item
var result = await client.CollectionItem.UpdateAsync();
Console.WriteLine(result);
```

### character

```csharp
// Update character
var result = await client.Character.UpdateAsync();
Console.WriteLine(result);
```

### channel_resource

```csharp
// Update an existing channel resource
var result = await client.ChannelResource.UpdateAsync();
Console.WriteLine(result);
```

### channel_account

```csharp
// Update channel account
var result = await client.ChannelAccount.UpdateAsync();
Console.WriteLine(result);
```

### ai_category

```csharp
// Update an existing category
var result = await client.AiCategory.UpdateAsync();
Console.WriteLine(result);
```

### membership_card

```csharp
// Update an existing membership card
var result = await client.MembershipCard.UpdateAsync();
Console.WriteLine(result);
```

### card_template

```csharp
// Update an existing card template
var result = await client.CardTemplate.UpdateAsync();
Console.WriteLine(result);
```

### attribute

```csharp
// Update attribute
var result = await client.Attribute.UpdateAsync();
Console.WriteLine(result);
```

### ai_article

```csharp
// Update an existing AI article
var result = await client.AiArticle.UpdateAsync();
Console.WriteLine(result);
```

### application

```csharp
// Update application
var result = await client.Application.UpdateAsync();
Console.WriteLine(result);
```

### api_key

```csharp
// Update an existing API key
var result = await client.ApiKey.UpdateAsync();
Console.WriteLine(result);
```

### ai_agent

```csharp
// Update an existing AI agent
var result = await client.AiAgent.UpdateAsync();
Console.WriteLine(result);
```

### ai_agent_tool_relationship

```csharp
// Update an existing agent-tool relationship
var result = await client.AiAgentToolRelationship.UpdateAsync();
Console.WriteLine(result);
```

### account

```csharp
// Update an existing account
var result = await client.Account.UpdateAsync();
Console.WriteLine(result);
```

### account_history

```csharp
// Update an existing account history record
var result = await client.AccountHistory.UpdateAsync();
Console.WriteLine(result);
```

### search_chat

```csharp
// POST /backend/v3/api/search/chat/stop
var result = await client.SearchChat.StopAsync();
Console.WriteLine(result);
```

### ppt_template_rendering

```csharp
// Render PPT template
var result = await client.PptTemplateRendering.RenderAsync();
Console.WriteLine(result);
```

### ppt_template_chat

```csharp
// POST /backend/v3/api/ppt/template/chat/stop
var result = await client.PptTemplateChat.StopAsync();
Console.WriteLine(result);
```

### knowledge_base_file

```csharp
// 获取文件列表
var result = await client.KnowledgeBaseFile.ListFilesAsync();
Console.WriteLine(result);
```

### knowledge_base_chat

```csharp
// POST /backend/v3/api/knowledge_base/chat/stop
var result = await client.KnowledgeBaseChat.StopAsync();
Console.WriteLine(result);
```

### im_message

```csharp
// Get messages by page
var result = await client.ImMessage.ListByPageAsync();
Console.WriteLine(result);
```

### ai_voice_speaker_generation

```csharp
// Create voice speaker generation task
var result = await client.AiVoiceSpeakerGeneration.CreateAsync();
Console.WriteLine(result);
```

### ai_video_generation

```csharp
// Create video generation task
var result = await client.AiVideoGeneration.CreateAsync();
Console.WriteLine(result);
```

### ai_music_generation

```csharp
// Create music generation task
var result = await client.AiMusicGeneration.CreateAsync();
Console.WriteLine(result);
```

### ai_image_generation

```csharp
// Create image generation task
var result = await client.AiImageGeneration.CreateAsync();
Console.WriteLine(result);
```

### ai_character_generation

```csharp
// Create character generation task
var result = await client.AiCharacterGeneration.CreateAsync();
Console.WriteLine(result);
```

### ai_audio_generation

```csharp
// Create audio generation task
var result = await client.AiAudioGeneration.CreateAsync();
Console.WriteLine(result);
```

### ai_audio_effect_generation

```csharp
// Create audio effect generation task
var result = await client.AiAudioEffectGeneration.CreateAsync();
Console.WriteLine(result);
```

### ai_chat

```csharp
// Stop a chat completion stream
var result = await client.AiChat.StopAsync();
Console.WriteLine(result);
```

### verification

```csharp
// Verify phone
var result = await client.Verification.VerifyPhoneAsync();
Console.WriteLine(result);
```

### oauth_authentication

```csharp
// Get OAuth authorization URL
var result = await client.OauthAuthentication.GetAuthUrlAsync();
Console.WriteLine(result);
```

### authorization

```csharp
// 检查用户角色
var result = await client.Authorization.HasRoleAsync();
Console.WriteLine(result);
```

### authentication

```csharp
// 重置密码
var result = await client.Authentication.ResetPasswordAsync();
Console.WriteLine(result);
```

### app

```csharp
// Get app SDK config
var result = await client.App.GetSdkConfigAsync();
Console.WriteLine(result);
```

### ai_agent_chat

```csharp
// Create a chat completion with agent
var result = await client.AiAgentChat.WithContextAsync();
Console.WriteLine(result);
```

## Error Handling

```csharp
try
{
    var result = await client.Workspace.UpdateAsync();
}
catch (HttpRequestException ex)
{
    Console.WriteLine($"Error: {ex.Message}");
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

> Set `NUGET_API_KEY` for release (or `NUGET_TEST_API_KEY` for test channel).

## License

MIT
