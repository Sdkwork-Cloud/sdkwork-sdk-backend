# sdkwork-backend-sdk

Professional TypeScript SDK for SDKWork API.

## Installation

```bash
npm install @sdkwork/backend-sdk
# or
yarn add @sdkwork/backend-sdk
# or
pnpm add @sdkwork/backend-sdk
```

## Quick Start

```typescript
import { SdkworkBackendClient } from '@sdkwork/backend-sdk';

const client = new SdkworkBackendClient({
  baseUrl: 'http://localhost:8080',
  timeout: 30000,
});

// Mode A: API Key (recommended for server-to-server calls)
client.setApiKey('your-api-key');

// Use the SDK
const result = await client.user.getProfile();
```

## Authentication Modes (Mutually Exclusive)

Choose exactly one mode for the same client instance.

### Mode A: API Key

```typescript
const client = new SdkworkBackendClient({ baseUrl: 'http://localhost:8080' });
client.setApiKey('your-api-key');
// Sends: Authorization: Bearer <apiKey>
```

### Mode B: Dual Token

```typescript
const client = new SdkworkBackendClient({ baseUrl: 'http://localhost:8080' });
client.setAuthToken('your-auth-token');
client.setAccessToken('your-access-token');
// Sends:
// Authorization: Bearer <authToken>
// Access-Token: <accessToken>
```

> Do not call `setApiKey(...)` together with `setAuthToken(...)` + `setAccessToken(...)` on the same client.

## Configuration (Non-Auth)

```typescript
import { SdkworkBackendClient } from '@sdkwork/backend-sdk';

const client = new SdkworkBackendClient({
  baseUrl: 'http://localhost:8080',
  timeout: 30000, // Request timeout in ms
  headers: {      // Custom headers
    'X-Custom-Header': 'value',
  },
});
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

```typescript
// Get all workspaces
const body = {} as any;
const result = await client.workspace.listAllEntities(body);
```

### content_vote

```typescript
// Get all content votes
const body = {} as any;
const result = await client.contentVote.listAllEntities(body);
```

### voice_speaker

```typescript
// Get all voice speakers
const body = {} as any;
const result = await client.voiceSpeaker.listAllEntities(body);
```

### visit_history

```typescript
// List All Visit Histories
const body = {} as any;
const result = await client.visitHistory.listAllEntities(body);
```

### vip_user

```typescript
// Get a VIP user by ID
const result = await client.vipUser.getCurrentUser();
```

### vip_recharge

```typescript
// Get all VIP recharge records
const body = {} as any;
const result = await client.vipRecharge.listAllEntities(body);
```

### vip_recharge_package

```typescript
// Get all VIP recharge packages
const body = {} as any;
const result = await client.vipRechargePackage.listAllEntities(body);
```

### vip_point_change

```typescript
// Get all VIP point change records
const body = {} as any;
const result = await client.vipPointChange.listAllEntities(body);
```

### vip_package_group

```typescript
// Get all VIP package groups
const body = {} as any;
const result = await client.vipPackageGroup.listAllEntities(body);
```

### vip_package

```typescript
// Get All VIP Packages
const body = {} as any;
const result = await client.vipPackage.listAllEntities(body);
```

### vip_level

```typescript
// Get all VIP levels
const body = {} as any;
const result = await client.vipLevel.listAllEntities(body);
```

### vip_level_benefit

```typescript
// Get all VIP level benefits
const body = {} as any;
const result = await client.vipLevelBenefit.listAllEntities(body);
```

### vip_benefit

```typescript
// Get all VIP benefits
const body = {} as any;
const result = await client.vipBenefit.listAllEntities(body);
```

### vip_benefit_usage

```typescript
// Get all VIP benefit usage records
const body = {} as any;
const result = await client.vipBenefitUsage.listAllEntities(body);
```

### video

```typescript
// Get all videos
const body = {} as any;
const result = await client.video.listAllEntities(body);
```

### user

```typescript
// Get current user profile
const result = await client.user.getProfile();
```

### user_oauth_account

```typescript
// Get all user OAuth accounts
const body = {} as any;
const result = await client.userOauthAccount.listAllEntities(body);
```

### user_coupon

```typescript
// Get all user coupons
const body = {} as any;
const result = await client.userCoupon.listAllEntities(body);
```

### user_card

```typescript
// Get all user-card bindings
const body = {} as any;
const result = await client.userCard.listAllEntities(body);
```

### user_address

```typescript
// Get all user addresses
const body = {} as any;
const result = await client.userAddress.listAllEntities(body);
```

### ai_usage_record

```typescript
// Get all usage records
const body = {} as any;
const result = await client.aiUsageRecord.listAllEntities(body);
```

### shopping_cart

```typescript
// Get all shopping carts
const body = {} as any;
const result = await client.shoppingCart.listAllEntities(body);
```

### shopping_cart_item

```typescript
// Get all shopping cart items
const body = {} as any;
const result = await client.shoppingCartItem.listAllEntities(body);
```

### refund

```typescript
// Get all refund records
const body = {} as any;
const result = await client.refund.listAllEntities(body);
```

### payment

```typescript
// Get all payment records
const body = {} as any;
const result = await client.payment.listAllEntities(body);
```

### order

```typescript
// Get all orders
const body = {} as any;
const result = await client.order.listAllEntities(body);
```

### order_item

```typescript
// Get all order items
const body = {} as any;
const result = await client.orderItem.listAllEntities(body);
```

### ai_tool

```typescript
// Get all AI tools
const body = {} as any;
const result = await client.aiTool.listAllEntities(body);
```

### tenant

```typescript
// Get all tenants
const body = {} as any;
const result = await client.tenant.listAllEntities(body);
```

### database_table

```typescript
// Get all database tables
const body = {} as any;
const result = await client.databaseTable.listAllEntities(body);
```

### product_sku

```typescript
// Get all SKUs
const body = {} as any;
const result = await client.productSku.listAllEntities(body);
```

### short_url

```typescript
// Get all short URLs
const body = {} as any;
const result = await client.shortUrl.listAllEntities(body);
```

### shop

```typescript
// Get all shops
const body = {} as any;
const result = await client.shop.listAllEntities(body);
```

### share

```typescript
// 获取所有分享
const body = {} as any;
const result = await client.share.listAllEntities(body);
```

### share_visit_record

```typescript
// Get all visit records
const body = {} as any;
const result = await client.shareVisitRecord.listAllEntities(body);
```

### sharding_key

```typescript
// List All Sharding Keys
const body = {} as any;
const result = await client.shardingKey.listAllEntities(body);
```

### schema

```typescript
// Get all database schemas
const body = {} as any;
const result = await client.schema.listAllEntities(body);
```

### rbac_role

```typescript
// Get all system roles
const body = {} as any;
const result = await client.rbacRole.listAllEntities(body);
```

### role_permission

```typescript
// Get all role-permission associations
const body = {} as any;
const result = await client.rolePermission.listAllEntities(body);
```

### invocation_record

```typescript
// Get all invocation records
const body = {} as any;
const result = await client.invocationRecord.listAllEntities(body);
```

### rbac_user_role

```typescript
// Get all user-role relationships
const body = {} as any;
const result = await client.rbacUserRole.listAllEntities(body);
```

### ai_prompt

```typescript
// Get all AI prompts
const body = {} as any;
const result = await client.aiPrompt.listAllEntities(body);
```

### project

```typescript
// Get all projects
const body = {} as any;
const result = await client.project.listAllEntities(body);
```

### product

```typescript
// Get a product by ID
const params = {} as Record<string, any>;
const result = await client.product.getDetail(params);
```

### ppt_template

```typescript
// Get all PPT templates
const body = {} as any;
const result = await client.pptTemplate.listAllEntities(body);
```

### ppt_template_slide

```typescript
// Get all PPT template slides
const body = {} as any;
const result = await client.pptTemplateSlide.listAllEntities(body);
```

### partner

```typescript
// Get all partners
const body = {} as any;
const result = await client.partner.listAllEntities(body);
```

### chat_participant

```typescript
// Get all chat participants
const body = {} as any;
const result = await client.chatParticipant.listAllEntities(body);
```

### oss_bucket

```typescript
// Get all OSS buckets
const body = {} as any;
const result = await client.ossBucket.listAllEntities(body);
```

### organization

```typescript
// Get all organizations
const body = {} as any;
const result = await client.organization.listAllEntities(body);
```

### position

```typescript
// Get all positions
const body = {} as any;
const result = await client.position.listAllEntities(body);
```

### member_relations

```typescript
// Get all member relations
const body = {} as any;
const result = await client.memberRelations.listAllEntities(body);
```

### organization_member

```typescript
// Get all organization members
const body = {} as any;
const result = await client.organizationMember.listAllEntities(body);
```

### notification

```typescript
// Get all notifications
const body = {} as any;
const result = await client.notification.listAllEntities(body);
```

### notes

```typescript
// List all notes
const result = await client.notes.listAll();
```

### news

```typescript
// Get all news
const body = {} as any;
const result = await client.news.listAllEntities(body);
```

### host

```typescript
// 获取所有域名
const body = {} as any;
const result = await client.host.listAllEntities(body);
```

### dns_record

```typescript
// Get all DNS records
const body = {} as any;
const result = await client.dnsRecord.listAllEntities(body);
```

### music

```typescript
// Get all music records
const body = {} as any;
const result = await client.music.listAllEntities(body);
```

### ai_model_information

```typescript
// Get all AI model information
const body = {} as any;
const result = await client.aiModelInformation.listAllEntities(body);
```

### ai_model_price

```typescript
// Get all AI model prices
const body = {} as any;
const result = await client.aiModelPrice.listAllEntities(body);
```

### chat_message

```typescript
// Get all chat messages
const body = {} as any;
const result = await client.chatMessage.listAllEntities(body);
```

### member_level

```typescript
// Get all member levels
const body = {} as any;
const result = await client.memberLevel.listAllEntities(body);
```

### member_card

```typescript
// Get all member cards
const body = {} as any;
const result = await client.memberCard.listAllEntities(body);
```

### knowledge_base

```typescript
// Get all knowledge bases
const body = {} as any;
const result = await client.knowledgeBase.listAllEntities(body);
```

### invitation_relation

```typescript
// Get all invitation relations
const body = {} as any;
const result = await client.invitationRelation.listAllEntities(body);
```

### invitation_code

```typescript
// Get all invitation codes
const body = {} as any;
const result = await client.invitationCode.listAllEntities(body);
```

### image

```typescript
// Get all images
const body = {} as any;
const result = await client.image.listAllEntities(body);
```

### chat_group

```typescript
// Get all chat groups
const body = {} as any;
const result = await client.chatGroup.listAllEntities(body);
```

### ai_generation

```typescript
// Get all AI generation records
const body = {} as any;
const result = await client.aiGeneration.listAllEntities(body);
```

### ai_generation_content

```typescript
// Get all AI generated content
const body = {} as any;
const result = await client.aiGenerationContent.listAllEntities(body);
```

### file

```typescript
// 获取文件列表
const params = {} as Record<string, any>;
const result = await client.file.listFiles(params);
```

### file_part

```typescript
// Get all file parts
const body = {} as any;
const result = await client.filePart.listAllEntities(body);
```

### file_content

```typescript
// Get all file contents
const body = {} as any;
const result = await client.fileContent.listAllEntities(body);
```

### feeds

```typescript
// Get all feeds entries
const body = {} as any;
const result = await client.feeds.listAllEntities(body);
```

### feedback

```typescript
// Get all feedback records
const body = {} as any;
const result = await client.feedback.listAllEntities(body);
```

### favorite

```typescript
// Get all favorites
const body = {} as any;
const result = await client.favorite.listAllEntities(body);
```

### file_disk

```typescript
// Get all file disks
const body = {} as any;
const result = await client.fileDisk.listAllEntities(body);
```

### disk_member

```typescript
// Get all disk members
const body = {} as any;
const result = await client.diskMember.listAllEntities(body);
```

### detail

```typescript
// Get all detail contents
const body = {} as any;
const result = await client.detail.listAllEntities(body);
```

### department

```typescript
// Get all departments
const body = {} as any;
const result = await client.department.listAllEntities(body);
```

### datasource

```typescript
// Get all data sources
const body = {} as any;
const result = await client.datasource.listAllEntities(body);
```

### coupon

```typescript
// Get all coupon templates
const body = {} as any;
const result = await client.coupon.listAllEntities(body);
```

### coupon_template

```typescript
// Get all coupon templates
const body = {} as any;
const result = await client.couponTemplate.listAllEntities(body);
```

### ai_conversation

```typescript
// Get all open conversations
const body = {} as any;
const result = await client.aiConversation.open(body);
```

### comment

```typescript
// Get all comments
const body = {} as any;
const result = await client.comment.listAllEntities(body);
```

### column

```typescript
// Get all columns
const body = {} as any;
const result = await client.column.listAllEntities(body);
```

### collection

```typescript
// Get all collections
const body = {} as any;
const result = await client.collection.listAllEntities(body);
```

### collection_item

```typescript
// Get all collection items
const body = {} as any;
const result = await client.collectionItem.listAllEntities(body);
```

### character

```typescript
// Get all characters
const body = {} as any;
const result = await client.character.listAllEntities(body);
```

### channel_resource

```typescript
// Get all channel resources
const body = {} as any;
const result = await client.channelResource.listAllEntities(body);
```

### channel_account

```typescript
// Get SMS channel accounts
const body = {} as any;
const result = await client.channelAccount.listSms(body);
```

### ai_category

```typescript
// Get all categories
const body = {} as any;
const result = await client.aiCategory.listAllEntities(body);
```

### membership_card

```typescript
// Get all membership cards
const body = {} as any;
const result = await client.membershipCard.listAllEntities(body);
```

### card_template

```typescript
// Get all card templates
const body = {} as any;
const result = await client.cardTemplate.listAllEntities(body);
```

### attribute

```typescript
// Get all attributes
const body = {} as any;
const result = await client.attribute.listAllEntities(body);
```

### ai_article

```typescript
// Get all AI articles
const body = {} as any;
const result = await client.aiArticle.listAllEntities(body);
```

### application

```typescript
// Get all applications
const body = {} as any;
const result = await client.application.listAllEntities(body);
```

### api_key

```typescript
// Get all API keys
const body = {} as any;
const result = await client.apiKey.listAllEntities(body);
```

### ai_agent

```typescript
// Get all AI agents
const body = {} as any;
const result = await client.aiAgent.listAllEntities(body);
```

### ai_agent_tool_relationship

```typescript
// Get all agent-tool relationships
const body = {} as any;
const result = await client.aiAgentToolRelationship.listAllEntities(body);
```

### account

```typescript
// Get all accounts
const body = {} as any;
const result = await client.account.listAllEntities(body);
```

### account_history

```typescript
// Get all account history records
const body = {} as any;
const result = await client.accountHistory.listAllEntities(body);
```

### search_chat

```typescript
// POST /backend/v3/api/search/chat/stop
const headers = {} as Record<string, string>;
const result = await client.searchChat.stop(headers);
```

### ppt_template_rendering

```typescript
// Render PPT template
const body = {} as any;
const result = await client.pptTemplateRendering.render(body);
```

### ppt_template_chat

```typescript
// POST /backend/v3/api/ppt/template/chat/stop
const headers = {} as Record<string, string>;
const result = await client.pptTemplateChat.stop(headers);
```

### knowledge_base_file

```typescript
// 获取文件列表
const params = {} as Record<string, any>;
const result = await client.knowledgeBaseFile.listFiles(params);
```

### knowledge_base_chat

```typescript
// POST /backend/v3/api/knowledge_base/chat/stop
const headers = {} as Record<string, string>;
const result = await client.knowledgeBaseChat.stop(headers);
```

### im_message

```typescript
// Get messages by page
const body = {} as any;
const params = {} as Record<string, any>;
const result = await client.imMessage.listByPage(body, params);
```

### ai_voice_speaker_generation

```typescript
// Create voice speaker generation task
const body = {} as any;
const result = await client.aiVoiceSpeakerGeneration.create(body);
```

### ai_video_generation

```typescript
// Create video generation task
const body = {} as any;
const result = await client.aiVideoGeneration.create(body);
```

### ai_music_generation

```typescript
// Create music generation task
const body = {} as any;
const result = await client.aiMusicGeneration.create(body);
```

### ai_image_generation

```typescript
// Create image generation task
const body = {} as any;
const result = await client.aiImageGeneration.create(body);
```

### ai_character_generation

```typescript
// Create character generation task
const body = {} as any;
const result = await client.aiCharacterGeneration.create(body);
```

### ai_audio_generation

```typescript
// Create audio generation task
const body = {} as any;
const result = await client.aiAudioGeneration.create(body);
```

### ai_audio_effect_generation

```typescript
// Create audio effect generation task
const body = {} as any;
const result = await client.aiAudioEffectGeneration.create(body);
```

### ai_chat

```typescript
// Stop a chat completion stream
const headers = {} as Record<string, string>;
const result = await client.aiChat.stop(headers);
```

### verification

```typescript
// Verify phone
const body = {} as any;
const result = await client.verification.verifyPhone(body);
```

### oauth_authentication

```typescript
// Get OAuth authorization URL
const body = {} as any;
const result = await client.oauthAuthentication.getAuthUrl(body);
```

### authorization

```typescript
// 获取用户角色列表
const result = await client.authorization.getRoles();
```

### authentication

```typescript
// 获取当前用户信息
const result = await client.authentication.getCurrentUser();
```

### app

```typescript
// Get app info
const result = await client.app.getAppInfo();
```

### ai_agent_chat

```typescript
// Stop a chat completion stream
const headers = {} as Record<string, string>;
const result = await client.aiAgentChat.stop(headers);
```

## Error Handling

```typescript
import { SdkworkBackendClient, NetworkError, TimeoutError, AuthenticationError } from '@sdkwork/backend-sdk';

try {
  const result = await client.user.getProfile();
} catch (error) {
  if (error instanceof AuthenticationError) {
    console.error('Authentication failed:', error.message);
  } else if (error instanceof TimeoutError) {
    console.error('Request timed out:', error.message);
  } else if (error instanceof NetworkError) {
    console.error('Network error:', error.message);
  } else {
    throw error;
  }
}
```

## License

MIT
