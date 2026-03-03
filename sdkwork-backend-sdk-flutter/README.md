# sdkwork-backend-sdk (Flutter)

Professional Flutter SDK for SDKWork API.

## Installation

Add to `pubspec.yaml`:

```yaml
dependencies:
  backend_sdk: ^1.0.1
```

## Quick Start

```dart
import 'package:backend_sdk/backend_sdk.dart';
import 'package:sdkwork_common_flutter/sdkwork_common_flutter.dart';

final client = SdkworkBackendClient(
  config: SdkConfig(
    baseUrl: 'http://localhost:8080',
  ),
);
client.setApiKey('your-api-key');

// Use the SDK
final result = await client.workspace.update();
print(result);
```

## Authentication Modes (Mutually Exclusive)

Choose exactly one mode for the same client instance.

### Mode A: API Key

```dart
final client = SdkworkBackendClient.withBaseUrl(baseUrl: 'http://localhost:8080');
client.setApiKey('your-api-key');
// Sends: Authorization: Bearer <apiKey>
```

### Mode B: Dual Token

```dart
final client = SdkworkBackendClient.withBaseUrl(baseUrl: 'http://localhost:8080');
client.setAuthToken('your-auth-token');
client.setAccessToken('your-access-token');
// Sends:
// Authorization: Bearer <authToken>
// Access-Token: <accessToken>
```

> Do not call `setApiKey(...)` together with `setAuthToken(...)` + `setAccessToken(...)` on the same client.

## Configuration (Non-Auth)

```dart
final client = SdkworkBackendClient.withBaseUrl(baseUrl: 'http://localhost:8080');

// Set custom headers
client.setHeader('X-Custom-Header', 'value');
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

```dart
// Update an existing workspace
final result = await client.workspace.update();
print(result);
```

### content_vote

```dart
// Update an existing content vote
final result = await client.contentVote.update();
print(result);
```

### voice_speaker

```dart
// Update an existing voice speaker
final result = await client.voiceSpeaker.update();
print(result);
```

### visit_history

```dart
// Update Visit History
final result = await client.visitHistory.update();
print(result);
```

### vip_user

```dart
// Update an existing VIP user
final result = await client.vipUser.update();
print(result);
```

### vip_recharge

```dart
// Update an existing VIP recharge record
final result = await client.vipRecharge.update();
print(result);
```

### vip_recharge_package

```dart
// Update an existing VIP recharge package
final result = await client.vipRechargePackage.update();
print(result);
```

### vip_point_change

```dart
// Update an existing VIP point change record
final result = await client.vipPointChange.update();
print(result);
```

### vip_package_group

```dart
// Update an existing VIP package group
final result = await client.vipPackageGroup.update();
print(result);
```

### vip_package

```dart
// Update VIP Package
final result = await client.vipPackage.update();
print(result);
```

### vip_level

```dart
// Update an existing VIP level
final result = await client.vipLevel.update();
print(result);
```

### vip_level_benefit

```dart
// Update an existing VIP level benefit
final result = await client.vipLevelBenefit.update();
print(result);
```

### vip_benefit

```dart
// Update an existing VIP benefit
final result = await client.vipBenefit.update();
print(result);
```

### vip_benefit_usage

```dart
// Update an existing VIP benefit usage record
final result = await client.vipBenefitUsage.update();
print(result);
```

### video

```dart
// Update an existing video
final result = await client.video.update();
print(result);
```

### user

```dart
// Update an existing user
final result = await client.user.update();
print(result);
```

### user_oauth_account

```dart
// Update user OAuth account
final result = await client.userOauthAccount.update();
print(result);
```

### user_coupon

```dart
// Update an existing user coupon
final result = await client.userCoupon.update();
print(result);
```

### user_card

```dart
// Update user-card binding
final result = await client.userCard.update();
print(result);
```

### user_address

```dart
// Update an existing user address
final result = await client.userAddress.update();
print(result);
```

### ai_usage_record

```dart
// Update an existing usage record
final result = await client.aiUsageRecord.update();
print(result);
```

### shopping_cart

```dart
// Update shopping cart
final result = await client.shoppingCart.update();
print(result);
```

### shopping_cart_item

```dart
// Update an existing shopping cart item
final result = await client.shoppingCartItem.update();
print(result);
```

### refund

```dart
// Update an existing refund record
final result = await client.refund.update();
print(result);
```

### payment

```dart
// Update an existing payment record
final result = await client.payment.update();
print(result);
```

### order

```dart
// Update an existing order
final result = await client.order.update();
print(result);
```

### order_item

```dart
// Update an existing order item
final result = await client.orderItem.update();
print(result);
```

### ai_tool

```dart
// Update an existing AI tool
final result = await client.aiTool.update();
print(result);
```

### tenant

```dart
// Update an existing tenant
final result = await client.tenant.update();
print(result);
```

### database_table

```dart
// Update an existing database table
final result = await client.databaseTable.update();
print(result);
```

### product_sku

```dart
// Update an existing SKU
final result = await client.productSku.update();
print(result);
```

### short_url

```dart
// Update short URL
final result = await client.shortUrl.update();
print(result);
```

### shop

```dart
// Update an existing shop
final result = await client.shop.update();
print(result);
```

### share

```dart
// 更新分享
final result = await client.share.update();
print(result);
```

### share_visit_record

```dart
// Update visit record
final result = await client.shareVisitRecord.update();
print(result);
```

### sharding_key

```dart
// Update Sharding Key
final result = await client.shardingKey.update();
print(result);
```

### schema

```dart
// Update an existing database schema
final result = await client.schema.update();
print(result);
```

### rbac_role

```dart
// Update an existing system role
final result = await client.rbacRole.update();
print(result);
```

### role_permission

```dart
// Update role-permission association
final result = await client.rolePermission.update();
print(result);
```

### invocation_record

```dart
// Update an existing invocation record
final result = await client.invocationRecord.update();
print(result);
```

### rbac_user_role

```dart
// Update user-role relationship
final result = await client.rbacUserRole.update();
print(result);
```

### ai_prompt

```dart
// Update an existing AI prompt
final result = await client.aiPrompt.update();
print(result);
```

### project

```dart
// Update an existing project
final result = await client.project.update();
print(result);
```

### product

```dart
// Update an existing product
final result = await client.product.update();
print(result);
```

### ppt_template

```dart
// Update an existing PPT template
final result = await client.pptTemplate.update();
print(result);
```

### ppt_template_slide

```dart
// Update an existing PPT template slide
final result = await client.pptTemplateSlide.update();
print(result);
```

### partner

```dart
// Update a partner
final result = await client.partner.update();
print(result);
```

### chat_participant

```dart
// Update an existing chat participant
final result = await client.chatParticipant.update();
print(result);
```

### oss_bucket

```dart
// Update an existing OSS bucket
final result = await client.ossBucket.update();
print(result);
```

### organization

```dart
// Update an existing organization
final result = await client.organization.update();
print(result);
```

### position

```dart
// Update an existing position
final result = await client.position.update();
print(result);
```

### member_relations

```dart
// Update member relation
final result = await client.memberRelations.update();
print(result);
```

### organization_member

```dart
// Update organization member
final result = await client.organizationMember.update();
print(result);
```

### notification

```dart
// Update an existing notification
final result = await client.notification.update();
print(result);
```

### notes

```dart
// Update a note
final result = await client.notes.update();
print(result);
```

### news

```dart
// Update an existing news
final result = await client.news.update();
print(result);
```

### host

```dart
// 更新域名
final result = await client.host.update();
print(result);
```

### dns_record

```dart
// Update an existing DNS record
final result = await client.dnsRecord.update();
print(result);
```

### music

```dart
// Update music
final result = await client.music.update();
print(result);
```

### ai_model_information

```dart
// Update existing AI model information
final result = await client.aiModelInformation.update();
print(result);
```

### ai_model_price

```dart
// Update an existing AI model price
final result = await client.aiModelPrice.update();
print(result);
```

### chat_message

```dart
// Update an existing chat message
final result = await client.chatMessage.update();
print(result);
```

### member_level

```dart
// Update an existing member level
final result = await client.memberLevel.update();
print(result);
```

### member_card

```dart
// Update an existing member card
final result = await client.memberCard.update();
print(result);
```

### knowledge_base

```dart
// Update an existing knowledge base
final result = await client.knowledgeBase.update();
print(result);
```

### invitation_relation

```dart
// Update an invitation relation
final result = await client.invitationRelation.update();
print(result);
```

### invitation_code

```dart
// Update an existing invitation code
final result = await client.invitationCode.update();
print(result);
```

### image

```dart
// Update an existing image
final result = await client.image.update();
print(result);
```

### chat_group

```dart
// Update an existing chat group
final result = await client.chatGroup.update();
print(result);
```

### ai_generation

```dart
// Update an existing AI generation record
final result = await client.aiGeneration.update();
print(result);
```

### ai_generation_content

```dart
// Update AI generated content
final result = await client.aiGenerationContent.update();
print(result);
```

### file

```dart
// Update existing file metadata
final result = await client.file.update();
print(result);
```

### file_part

```dart
// Update an existing file part
final result = await client.filePart.update();
print(result);
```

### file_content

```dart
// Update file content
final result = await client.fileContent.update();
print(result);
```

### feeds

```dart
// Update an existing feeds entry
final result = await client.feeds.update();
print(result);
```

### feedback

```dart
// Update feedback
final result = await client.feedback.update();
print(result);
```

### favorite

```dart
// Update an existing favorite
final result = await client.favorite.update();
print(result);
```

### file_disk

```dart
// Update an existing file disk
final result = await client.fileDisk.update();
print(result);
```

### disk_member

```dart
// Update an existing disk member
final result = await client.diskMember.update();
print(result);
```

### detail

```dart
// Update existing detail content
final result = await client.detail.update();
print(result);
```

### department

```dart
// Update an existing department
final result = await client.department.update();
print(result);
```

### datasource

```dart
// Update an existing data source
final result = await client.datasource.update();
print(result);
```

### coupon

```dart
// Update an existing coupon template
final result = await client.coupon.update();
print(result);
```

### coupon_template

```dart
// Update an existing coupon template
final result = await client.couponTemplate.update();
print(result);
```

### ai_conversation

```dart
// Update an existing conversation
final result = await client.aiConversation.update();
print(result);
```

### comment

```dart
// Update an existing comment
final result = await client.comment.update();
print(result);
```

### column

```dart
// Update column
final result = await client.column.update();
print(result);
```

### collection

```dart
// Update an existing collection
final result = await client.collection.update();
print(result);
```

### collection_item

```dart
// Update an existing collection item
final result = await client.collectionItem.update();
print(result);
```

### character

```dart
// Update character
final result = await client.character.update();
print(result);
```

### channel_resource

```dart
// Update an existing channel resource
final result = await client.channelResource.update();
print(result);
```

### channel_account

```dart
// Update channel account
final result = await client.channelAccount.update();
print(result);
```

### ai_category

```dart
// Update an existing category
final result = await client.aiCategory.update();
print(result);
```

### membership_card

```dart
// Update an existing membership card
final result = await client.membershipCard.update();
print(result);
```

### card_template

```dart
// Update an existing card template
final result = await client.cardTemplate.update();
print(result);
```

### attribute

```dart
// Update attribute
final result = await client.attribute.update();
print(result);
```

### ai_article

```dart
// Update an existing AI article
final result = await client.aiArticle.update();
print(result);
```

### application

```dart
// Update application
final result = await client.application.update();
print(result);
```

### api_key

```dart
// Update an existing API key
final result = await client.apiKey.update();
print(result);
```

### ai_agent

```dart
// Update an existing AI agent
final result = await client.aiAgent.update();
print(result);
```

### ai_agent_tool_relationship

```dart
// Update an existing agent-tool relationship
final result = await client.aiAgentToolRelationship.update();
print(result);
```

### account

```dart
// Update an existing account
final result = await client.account.update();
print(result);
```

### account_history

```dart
// Update an existing account history record
final result = await client.accountHistory.update();
print(result);
```

### search_chat

```dart
// POST /backend/v3/api/search/chat/stop
final result = await client.searchChat.stop();
print(result);
```

### ppt_template_rendering

```dart
// Render PPT template
final result = await client.pptTemplateRendering.render();
print(result);
```

### ppt_template_chat

```dart
// POST /backend/v3/api/ppt/template/chat/stop
final result = await client.pptTemplateChat.stop();
print(result);
```

### knowledge_base_file

```dart
// 获取文件列表
final result = await client.knowledgeBaseFile.listFiles();
print(result);
```

### knowledge_base_chat

```dart
// POST /backend/v3/api/knowledge_base/chat/stop
final result = await client.knowledgeBaseChat.stop();
print(result);
```

### im_message

```dart
// Get messages by page
final result = await client.imMessage.listByPage();
print(result);
```

### ai_voice_speaker_generation

```dart
// Create voice speaker generation task
final result = await client.aiVoiceSpeakerGeneration.create();
print(result);
```

### ai_video_generation

```dart
// Create video generation task
final result = await client.aiVideoGeneration.create();
print(result);
```

### ai_music_generation

```dart
// Create music generation task
final result = await client.aiMusicGeneration.create();
print(result);
```

### ai_image_generation

```dart
// Create image generation task
final result = await client.aiImageGeneration.create();
print(result);
```

### ai_character_generation

```dart
// Create character generation task
final result = await client.aiCharacterGeneration.create();
print(result);
```

### ai_audio_generation

```dart
// Create audio generation task
final result = await client.aiAudioGeneration.create();
print(result);
```

### ai_audio_effect_generation

```dart
// Create audio effect generation task
final result = await client.aiAudioEffectGeneration.create();
print(result);
```

### ai_chat

```dart
// Stop a chat completion stream
final result = await client.aiChat.stop();
print(result);
```

### verification

```dart
// Verify phone
final result = await client.verification.verifyPhone();
print(result);
```

### oauth_authentication

```dart
// Get OAuth authorization URL
final result = await client.oauthAuthentication.getAuthUrl();
print(result);
```

### authorization

```dart
// 检查用户角色
final result = await client.authorization.hasRole();
print(result);
```

### authentication

```dart
// 重置密码
final result = await client.authentication.resetPassword();
print(result);
```

### app

```dart
// Get app SDK config
final result = await client.app.getSdkConfig();
print(result);
```

### ai_agent_chat

```dart
// Create a chat completion with agent
final result = await client.aiAgentChat.withContext();
print(result);
```

## Error Handling

```dart
try {
  final result = await client.workspace.update();
} catch (e) {
  print('Error: $e');
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

> Ensure `dart pub publish --dry-run` passes before release publish.

## License

MIT
