# sdkwork-backend-sdk (Java)

Professional Java SDK for SDKWork API.

## Installation

Add to your `pom.xml`:

```xml
<dependency>
    <groupId>com.sdkwork</groupId>
    <artifactId>backend-sdk</artifactId>
    <version>1.0.0</version>
</dependency>
```

Or with Gradle:

```groovy
implementation 'com.sdkwork:backend-sdk:1.0.0'
```

## Quick Start

```java
import com.sdkwork.backend.SdkworkBackendClient;
import com.sdkwork.common.core.Types;

public class Main {
    public static void main(String[] args) throws Exception {
        Types.SdkConfig config = new Types.SdkConfig("http://localhost:8080");
        SdkworkBackendClient client = new SdkworkBackendClient(config);
        client.setApiKey("your-api-key");
        
        // Use the SDK
        Object result = client.getWorkspace().update();
        System.out.println(result);
    }
}
```

## Authentication Modes (Mutually Exclusive)

Choose exactly one mode for the same client instance.

### Mode A: API Key

```java
Types.SdkConfig config = new Types.SdkConfig("http://localhost:8080");
SdkworkBackendClient client = new SdkworkBackendClient(config);
client.setApiKey("your-api-key");
// Sends: Authorization: Bearer <apiKey>
```

### Mode B: Dual Token

```java
Types.SdkConfig config = new Types.SdkConfig("http://localhost:8080");
SdkworkBackendClient client = new SdkworkBackendClient(config);
client.setAuthToken("your-auth-token");
client.setAccessToken("your-access-token");
// Sends:
// Authorization: Bearer <authToken>
// Access-Token: <accessToken>
```

> Do not call `setApiKey(...)` together with `setAuthToken(...)` + `setAccessToken(...)` on the same client.

## Configuration (Non-Auth)

```java
Types.SdkConfig config = new Types.SdkConfig("http://localhost:8080");
SdkworkBackendClient client = new SdkworkBackendClient(config);

// Set custom headers
client.getHttpClient().setHeader("X-Custom-Header", "value");
```

## API Modules

- `client.getWorkspace()` - workspace API
- `client.getContentVote()` - content_vote API
- `client.getVoiceSpeaker()` - voice_speaker API
- `client.getVisitHistory()` - visit_history API
- `client.getVipUser()` - vip_user API
- `client.getVipRecharge()` - vip_recharge API
- `client.getVipRechargePackage()` - vip_recharge_package API
- `client.getVipPointChange()` - vip_point_change API
- `client.getVipPackageGroup()` - vip_package_group API
- `client.getVipPackage()` - vip_package API
- `client.getVipLevel()` - vip_level API
- `client.getVipLevelBenefit()` - vip_level_benefit API
- `client.getVipBenefit()` - vip_benefit API
- `client.getVipBenefitUsage()` - vip_benefit_usage API
- `client.getVideo()` - video API
- `client.getUser()` - user API
- `client.getUserOauthAccount()` - user_oauth_account API
- `client.getUserCoupon()` - user_coupon API
- `client.getUserCard()` - user_card API
- `client.getUserAddress()` - user_address API
- `client.getAiUsageRecord()` - ai_usage_record API
- `client.getShoppingCart()` - shopping_cart API
- `client.getShoppingCartItem()` - shopping_cart_item API
- `client.getRefund()` - refund API
- `client.getPayment()` - payment API
- `client.getOrder()` - order API
- `client.getOrderItem()` - order_item API
- `client.getAiTool()` - ai_tool API
- `client.getTenant()` - tenant API
- `client.getDatabaseTable()` - database_table API
- `client.getProductSku()` - product_sku API
- `client.getShortUrl()` - short_url API
- `client.getShop()` - shop API
- `client.getShare()` - share API
- `client.getShareVisitRecord()` - share_visit_record API
- `client.getShardingKey()` - sharding_key API
- `client.getSchema()` - schema API
- `client.getRbacRole()` - rbac_role API
- `client.getRolePermission()` - role_permission API
- `client.getInvocationRecord()` - invocation_record API
- `client.getRbacUserRole()` - rbac_user_role API
- `client.getAiPrompt()` - ai_prompt API
- `client.getProject()` - project API
- `client.getProduct()` - product API
- `client.getPptTemplate()` - ppt_template API
- `client.getPptTemplateSlide()` - ppt_template_slide API
- `client.getPartner()` - partner API
- `client.getChatParticipant()` - chat_participant API
- `client.getOssBucket()` - oss_bucket API
- `client.getOrganization()` - organization API
- `client.getPosition()` - position API
- `client.getMemberRelations()` - member_relations API
- `client.getOrganizationMember()` - organization_member API
- `client.getNotification()` - notification API
- `client.getNotes()` - notes API
- `client.getNews()` - news API
- `client.getHost()` - host API
- `client.getDnsRecord()` - dns_record API
- `client.getMusic()` - music API
- `client.getAiModelInformation()` - ai_model_information API
- `client.getAiModelPrice()` - ai_model_price API
- `client.getChatMessage()` - chat_message API
- `client.getMemberLevel()` - member_level API
- `client.getMemberCard()` - member_card API
- `client.getKnowledgeBase()` - knowledge_base API
- `client.getInvitationRelation()` - invitation_relation API
- `client.getInvitationCode()` - invitation_code API
- `client.getImage()` - image API
- `client.getChatGroup()` - chat_group API
- `client.getAiGeneration()` - ai_generation API
- `client.getAiGenerationContent()` - ai_generation_content API
- `client.getFile()` - file API
- `client.getFilePart()` - file_part API
- `client.getFileContent()` - file_content API
- `client.getFeeds()` - feeds API
- `client.getFeedback()` - feedback API
- `client.getFavorite()` - favorite API
- `client.getFileDisk()` - file_disk API
- `client.getDiskMember()` - disk_member API
- `client.getDetail()` - detail API
- `client.getDepartment()` - department API
- `client.getDatasource()` - datasource API
- `client.getCoupon()` - coupon API
- `client.getCouponTemplate()` - coupon_template API
- `client.getAiConversation()` - ai_conversation API
- `client.getComment()` - comment API
- `client.getColumn()` - column API
- `client.getCollection()` - collection API
- `client.getCollectionItem()` - collection_item API
- `client.getCharacter()` - character API
- `client.getChannelResource()` - channel_resource API
- `client.getChannelAccount()` - channel_account API
- `client.getAiCategory()` - ai_category API
- `client.getMembershipCard()` - membership_card API
- `client.getCardTemplate()` - card_template API
- `client.getAttribute()` - attribute API
- `client.getAiArticle()` - ai_article API
- `client.getApplication()` - application API
- `client.getApiKey()` - api_key API
- `client.getAiAgent()` - ai_agent API
- `client.getAiAgentToolRelationship()` - ai_agent_tool_relationship API
- `client.getAccount()` - account API
- `client.getAccountHistory()` - account_history API
- `client.getSearchChat()` - search_chat API
- `client.getPptTemplateRendering()` - ppt_template_rendering API
- `client.getPptTemplateChat()` - ppt_template_chat API
- `client.getKnowledgeBaseFile()` - knowledge_base_file API
- `client.getKnowledgeBaseChat()` - knowledge_base_chat API
- `client.getImMessage()` - im_message API
- `client.getAiVoiceSpeakerGeneration()` - ai_voice_speaker_generation API
- `client.getAiVideoGeneration()` - ai_video_generation API
- `client.getAiMusicGeneration()` - ai_music_generation API
- `client.getAiImageGeneration()` - ai_image_generation API
- `client.getAiCharacterGeneration()` - ai_character_generation API
- `client.getAiAudioGeneration()` - ai_audio_generation API
- `client.getAiAudioEffectGeneration()` - ai_audio_effect_generation API
- `client.getAiChat()` - ai_chat API
- `client.getVerification()` - verification API
- `client.getOauthAuthentication()` - oauth_authentication API
- `client.getAuthorization()` - authorization API
- `client.getAuthentication()` - authentication API
- `client.getApp()` - app API
- `client.getAiAgentChat()` - ai_agent_chat API

## Usage Examples

### workspace

```java
// Update an existing workspace
Object result = client.getWorkspace().update();
System.out.println(result);
```

### content_vote

```java
// Update an existing content vote
Object result = client.getContentVote().update();
System.out.println(result);
```

### voice_speaker

```java
// Update an existing voice speaker
Object result = client.getVoiceSpeaker().update();
System.out.println(result);
```

### visit_history

```java
// Update Visit History
Object result = client.getVisitHistory().update();
System.out.println(result);
```

### vip_user

```java
// Update an existing VIP user
Object result = client.getVipUser().update();
System.out.println(result);
```

### vip_recharge

```java
// Update an existing VIP recharge record
Object result = client.getVipRecharge().update();
System.out.println(result);
```

### vip_recharge_package

```java
// Update an existing VIP recharge package
Object result = client.getVipRechargePackage().update();
System.out.println(result);
```

### vip_point_change

```java
// Update an existing VIP point change record
Object result = client.getVipPointChange().update();
System.out.println(result);
```

### vip_package_group

```java
// Update an existing VIP package group
Object result = client.getVipPackageGroup().update();
System.out.println(result);
```

### vip_package

```java
// Update VIP Package
Object result = client.getVipPackage().update();
System.out.println(result);
```

### vip_level

```java
// Update an existing VIP level
Object result = client.getVipLevel().update();
System.out.println(result);
```

### vip_level_benefit

```java
// Update an existing VIP level benefit
Object result = client.getVipLevelBenefit().update();
System.out.println(result);
```

### vip_benefit

```java
// Update an existing VIP benefit
Object result = client.getVipBenefit().update();
System.out.println(result);
```

### vip_benefit_usage

```java
// Update an existing VIP benefit usage record
Object result = client.getVipBenefitUsage().update();
System.out.println(result);
```

### video

```java
// Update an existing video
Object result = client.getVideo().update();
System.out.println(result);
```

### user

```java
// Update an existing user
Object result = client.getUser().update();
System.out.println(result);
```

### user_oauth_account

```java
// Update user OAuth account
Object result = client.getUserOauthAccount().update();
System.out.println(result);
```

### user_coupon

```java
// Update an existing user coupon
Object result = client.getUserCoupon().update();
System.out.println(result);
```

### user_card

```java
// Update user-card binding
Object result = client.getUserCard().update();
System.out.println(result);
```

### user_address

```java
// Update an existing user address
Object result = client.getUserAddress().update();
System.out.println(result);
```

### ai_usage_record

```java
// Update an existing usage record
Object result = client.getAiUsageRecord().update();
System.out.println(result);
```

### shopping_cart

```java
// Update shopping cart
Object result = client.getShoppingCart().update();
System.out.println(result);
```

### shopping_cart_item

```java
// Update an existing shopping cart item
Object result = client.getShoppingCartItem().update();
System.out.println(result);
```

### refund

```java
// Update an existing refund record
Object result = client.getRefund().update();
System.out.println(result);
```

### payment

```java
// Update an existing payment record
Object result = client.getPayment().update();
System.out.println(result);
```

### order

```java
// Update an existing order
Object result = client.getOrder().update();
System.out.println(result);
```

### order_item

```java
// Update an existing order item
Object result = client.getOrderItem().update();
System.out.println(result);
```

### ai_tool

```java
// Update an existing AI tool
Object result = client.getAiTool().update();
System.out.println(result);
```

### tenant

```java
// Update an existing tenant
Object result = client.getTenant().update();
System.out.println(result);
```

### database_table

```java
// Update an existing database table
Object result = client.getDatabaseTable().update();
System.out.println(result);
```

### product_sku

```java
// Update an existing SKU
Object result = client.getProductSku().update();
System.out.println(result);
```

### short_url

```java
// Update short URL
Object result = client.getShortUrl().update();
System.out.println(result);
```

### shop

```java
// Update an existing shop
Object result = client.getShop().update();
System.out.println(result);
```

### share

```java
// 更新分享
Object result = client.getShare().update();
System.out.println(result);
```

### share_visit_record

```java
// Update visit record
Object result = client.getShareVisitRecord().update();
System.out.println(result);
```

### sharding_key

```java
// Update Sharding Key
Object result = client.getShardingKey().update();
System.out.println(result);
```

### schema

```java
// Update an existing database schema
Object result = client.getSchema().update();
System.out.println(result);
```

### rbac_role

```java
// Update an existing system role
Object result = client.getRbacRole().update();
System.out.println(result);
```

### role_permission

```java
// Update role-permission association
Object result = client.getRolePermission().update();
System.out.println(result);
```

### invocation_record

```java
// Update an existing invocation record
Object result = client.getInvocationRecord().update();
System.out.println(result);
```

### rbac_user_role

```java
// Update user-role relationship
Object result = client.getRbacUserRole().update();
System.out.println(result);
```

### ai_prompt

```java
// Update an existing AI prompt
Object result = client.getAiPrompt().update();
System.out.println(result);
```

### project

```java
// Update an existing project
Object result = client.getProject().update();
System.out.println(result);
```

### product

```java
// Update an existing product
Object result = client.getProduct().update();
System.out.println(result);
```

### ppt_template

```java
// Update an existing PPT template
Object result = client.getPptTemplate().update();
System.out.println(result);
```

### ppt_template_slide

```java
// Update an existing PPT template slide
Object result = client.getPptTemplateSlide().update();
System.out.println(result);
```

### partner

```java
// Update a partner
Object result = client.getPartner().update();
System.out.println(result);
```

### chat_participant

```java
// Update an existing chat participant
Object result = client.getChatParticipant().update();
System.out.println(result);
```

### oss_bucket

```java
// Update an existing OSS bucket
Object result = client.getOssBucket().update();
System.out.println(result);
```

### organization

```java
// Update an existing organization
Object result = client.getOrganization().update();
System.out.println(result);
```

### position

```java
// Update an existing position
Object result = client.getPosition().update();
System.out.println(result);
```

### member_relations

```java
// Update member relation
Object result = client.getMemberRelations().update();
System.out.println(result);
```

### organization_member

```java
// Update organization member
Object result = client.getOrganizationMember().update();
System.out.println(result);
```

### notification

```java
// Update an existing notification
Object result = client.getNotification().update();
System.out.println(result);
```

### notes

```java
// Update a note
Object result = client.getNotes().update();
System.out.println(result);
```

### news

```java
// Update an existing news
Object result = client.getNews().update();
System.out.println(result);
```

### host

```java
// 更新域名
Object result = client.getHost().update();
System.out.println(result);
```

### dns_record

```java
// Update an existing DNS record
Object result = client.getDnsRecord().update();
System.out.println(result);
```

### music

```java
// Update music
Object result = client.getMusic().update();
System.out.println(result);
```

### ai_model_information

```java
// Update existing AI model information
Object result = client.getAiModelInformation().update();
System.out.println(result);
```

### ai_model_price

```java
// Update an existing AI model price
Object result = client.getAiModelPrice().update();
System.out.println(result);
```

### chat_message

```java
// Update an existing chat message
Object result = client.getChatMessage().update();
System.out.println(result);
```

### member_level

```java
// Update an existing member level
Object result = client.getMemberLevel().update();
System.out.println(result);
```

### member_card

```java
// Update an existing member card
Object result = client.getMemberCard().update();
System.out.println(result);
```

### knowledge_base

```java
// Update an existing knowledge base
Object result = client.getKnowledgeBase().update();
System.out.println(result);
```

### invitation_relation

```java
// Update an invitation relation
Object result = client.getInvitationRelation().update();
System.out.println(result);
```

### invitation_code

```java
// Update an existing invitation code
Object result = client.getInvitationCode().update();
System.out.println(result);
```

### image

```java
// Update an existing image
Object result = client.getImage().update();
System.out.println(result);
```

### chat_group

```java
// Update an existing chat group
Object result = client.getChatGroup().update();
System.out.println(result);
```

### ai_generation

```java
// Update an existing AI generation record
Object result = client.getAiGeneration().update();
System.out.println(result);
```

### ai_generation_content

```java
// Update AI generated content
Object result = client.getAiGenerationContent().update();
System.out.println(result);
```

### file

```java
// Update existing file metadata
Object result = client.getFile().update();
System.out.println(result);
```

### file_part

```java
// Update an existing file part
Object result = client.getFilePart().update();
System.out.println(result);
```

### file_content

```java
// Update file content
Object result = client.getFileContent().update();
System.out.println(result);
```

### feeds

```java
// Update an existing feeds entry
Object result = client.getFeeds().update();
System.out.println(result);
```

### feedback

```java
// Update feedback
Object result = client.getFeedback().update();
System.out.println(result);
```

### favorite

```java
// Update an existing favorite
Object result = client.getFavorite().update();
System.out.println(result);
```

### file_disk

```java
// Update an existing file disk
Object result = client.getFileDisk().update();
System.out.println(result);
```

### disk_member

```java
// Update an existing disk member
Object result = client.getDiskMember().update();
System.out.println(result);
```

### detail

```java
// Update existing detail content
Object result = client.getDetail().update();
System.out.println(result);
```

### department

```java
// Update an existing department
Object result = client.getDepartment().update();
System.out.println(result);
```

### datasource

```java
// Update an existing data source
Object result = client.getDatasource().update();
System.out.println(result);
```

### coupon

```java
// Update an existing coupon template
Object result = client.getCoupon().update();
System.out.println(result);
```

### coupon_template

```java
// Update an existing coupon template
Object result = client.getCouponTemplate().update();
System.out.println(result);
```

### ai_conversation

```java
// Update an existing conversation
Object result = client.getAiConversation().update();
System.out.println(result);
```

### comment

```java
// Update an existing comment
Object result = client.getComment().update();
System.out.println(result);
```

### column

```java
// Update column
Object result = client.getColumn().update();
System.out.println(result);
```

### collection

```java
// Update an existing collection
Object result = client.getCollection().update();
System.out.println(result);
```

### collection_item

```java
// Update an existing collection item
Object result = client.getCollectionItem().update();
System.out.println(result);
```

### character

```java
// Update character
Object result = client.getCharacter().update();
System.out.println(result);
```

### channel_resource

```java
// Update an existing channel resource
Object result = client.getChannelResource().update();
System.out.println(result);
```

### channel_account

```java
// Update channel account
Object result = client.getChannelAccount().update();
System.out.println(result);
```

### ai_category

```java
// Update an existing category
Object result = client.getAiCategory().update();
System.out.println(result);
```

### membership_card

```java
// Update an existing membership card
Object result = client.getMembershipCard().update();
System.out.println(result);
```

### card_template

```java
// Update an existing card template
Object result = client.getCardTemplate().update();
System.out.println(result);
```

### attribute

```java
// Update attribute
Object result = client.getAttribute().update();
System.out.println(result);
```

### ai_article

```java
// Update an existing AI article
Object result = client.getAiArticle().update();
System.out.println(result);
```

### application

```java
// Update application
Object result = client.getApplication().update();
System.out.println(result);
```

### api_key

```java
// Update an existing API key
Object result = client.getApiKey().update();
System.out.println(result);
```

### ai_agent

```java
// Update an existing AI agent
Object result = client.getAiAgent().update();
System.out.println(result);
```

### ai_agent_tool_relationship

```java
// Update an existing agent-tool relationship
Object result = client.getAiAgentToolRelationship().update();
System.out.println(result);
```

### account

```java
// Update an existing account
Object result = client.getAccount().update();
System.out.println(result);
```

### account_history

```java
// Update an existing account history record
Object result = client.getAccountHistory().update();
System.out.println(result);
```

### search_chat

```java
// POST /backend/v3/api/search/chat/stop
Object result = client.getSearchChat().stop();
System.out.println(result);
```

### ppt_template_rendering

```java
// Render PPT template
Object result = client.getPptTemplateRendering().render();
System.out.println(result);
```

### ppt_template_chat

```java
// POST /backend/v3/api/ppt/template/chat/stop
Object result = client.getPptTemplateChat().stop();
System.out.println(result);
```

### knowledge_base_file

```java
// 获取文件列表
Object result = client.getKnowledgeBaseFile().listFiles();
System.out.println(result);
```

### knowledge_base_chat

```java
// POST /backend/v3/api/knowledge_base/chat/stop
Object result = client.getKnowledgeBaseChat().stop();
System.out.println(result);
```

### im_message

```java
// Get messages by page
Object result = client.getImMessage().listByPage();
System.out.println(result);
```

### ai_voice_speaker_generation

```java
// Create voice speaker generation task
Object result = client.getAiVoiceSpeakerGeneration().create();
System.out.println(result);
```

### ai_video_generation

```java
// Create video generation task
Object result = client.getAiVideoGeneration().create();
System.out.println(result);
```

### ai_music_generation

```java
// Create music generation task
Object result = client.getAiMusicGeneration().create();
System.out.println(result);
```

### ai_image_generation

```java
// Create image generation task
Object result = client.getAiImageGeneration().create();
System.out.println(result);
```

### ai_character_generation

```java
// Create character generation task
Object result = client.getAiCharacterGeneration().create();
System.out.println(result);
```

### ai_audio_generation

```java
// Create audio generation task
Object result = client.getAiAudioGeneration().create();
System.out.println(result);
```

### ai_audio_effect_generation

```java
// Create audio effect generation task
Object result = client.getAiAudioEffectGeneration().create();
System.out.println(result);
```

### ai_chat

```java
// Stop a chat completion stream
Object result = client.getAiChat().stop();
System.out.println(result);
```

### verification

```java
// Verify phone
Object result = client.getVerification().verifyPhone();
System.out.println(result);
```

### oauth_authentication

```java
// Get OAuth authorization URL
Object result = client.getOauthAuthentication().getAuthUrl();
System.out.println(result);
```

### authorization

```java
// 检查用户角色
Object result = client.getAuthorization().hasRole();
System.out.println(result);
```

### authentication

```java
// 重置密码
Object result = client.getAuthentication().resetPassword();
System.out.println(result);
```

### app

```java
// Get app SDK config
Object result = client.getApp().getSdkConfig();
System.out.println(result);
```

### ai_agent_chat

```java
// Create a chat completion with agent
Object result = client.getAiAgentChat().withContext();
System.out.println(result);
```

## Error Handling

```java
try {
    Object result = client.getWorkspace().update();
} catch (Exception e) {
    System.err.println("Error: " + e.getMessage());
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

> Use Maven `settings.xml` credentials and optional `MAVEN_PUBLISH_PROFILE`.

## License

MIT
