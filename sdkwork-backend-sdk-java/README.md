# sdkwork-backend-sdk (Java)

Professional Java SDK for SDKWork API.

## Installation

Add to your `pom.xml`:

```xml
<dependency>
    <groupId>com.sdkwork</groupId>
    <artifactId>backend-sdk</artifactId>
    <version>1.0.9</version>
</dependency>
```

Or with Gradle:

```groovy
implementation 'com.sdkwork:backend-sdk:1.0.9'
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
- `client.getVote()` - vote API
- `client.getVoice()` - voice API
- `client.getVisitHistory()` - visit_history API
- `client.getVip()` - vip API
- `client.getVideo()` - video API
- `client.getUser()` - user API
- `client.getUsage()` - usage API
- `client.getTrade()` - trade API
- `client.getTool()` - tool API
- `client.getTenant()` - tenant API
- `client.getTable()` - table API
- `client.getSku()` - sku API
- `client.getSkill()` - skill API
- `client.getShortUrl()` - short_url API
- `client.getShop()` - shop API
- `client.getShare()` - share API
- `client.getSharding()` - sharding API
- `client.getSecurity()` - security API
- `client.getSchema()` - schema API
- `client.getRole()` - role API
- `client.getRecord()` - record API
- `client.getRbac()` - rbac API
- `client.getPrompt()` - prompt API
- `client.getProject()` - project API
- `client.getProduct()` - product API
- `client.getPpt()` - ppt API
- `client.getPermission()` - permission API
- `client.getPartner()` - partner API
- `client.getParticipant()` - participant API
- `client.getOss()` - oss API
- `client.getOrganization()` - organization API
- `client.getOrganizationMember()` - organization_member API
- `client.getNotification()` - notification API
- `client.getNote()` - note API
- `client.getNews()` - news API
- `client.getNet()` - net API
- `client.getMusic()` - music API
- `client.getModel()` - model API
- `client.getMessage()` - message API
- `client.getMember()` - member API
- `client.getKnowledgeBase()` - knowledge_base API
- `client.getInvitation()` - invitation API
- `client.getImage()` - image API
- `client.getIm()` - im API
- `client.getGeneration()` - generation API
- `client.getGame()` - game API
- `client.getFile()` - file API
- `client.getFeed()` - feed API
- `client.getFeedback()` - feedback API
- `client.getFavorite()` - favorite API
- `client.getDisk()` - disk API
- `client.getDetail()` - detail API
- `client.getDepartment()` - department API
- `client.getDatasource()` - datasource API
- `client.getCoupon()` - coupon API
- `client.getConversation()` - conversation API
- `client.getContentWriting()` - content_writing API
- `client.getComment()` - comment API
- `client.getColumn()` - column API
- `client.getCollection()` - collection API
- `client.getCollectionItem()` - collection_item API
- `client.getChat()` - chat API
- `client.getCharacter()` - character API
- `client.getChannel()` - channel API
- `client.getCategory()` - category API
- `client.getCard()` - card API
- `client.getAttribute()` - attribute API
- `client.getArticle()` - article API
- `client.getApp()` - app API
- `client.getApikey()` - apikey API
- `client.getAgent()` - agent API
- `client.getAccount()` - account API
- `client.getSystem()` - system API
- `client.getSearch()` - search API
- `client.getAuth()` - auth API

## Usage Examples

### workspace

```java
// Update an existing workspace
Object result = client.getWorkspace().update();
System.out.println(result);
```

### vote

```java
// Update an existing content vote
Object result = client.getVote().update();
System.out.println(result);
```

### voice

```java
// Update an existing voice speaker
Object result = client.getVoice().update();
System.out.println(result);
```

### visit_history

```java
// Update Visit History
Object result = client.getVisitHistory().update();
System.out.println(result);
```

### vip

```java
// Update an existing VIP user
Object result = client.getVip().update();
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

### usage

```java
// Update an existing usage record
Object result = client.getUsage().update();
System.out.println(result);
```

### trade

```java
// Update shopping cart
Object result = client.getTrade().update();
System.out.println(result);
```

### tool

```java
// Update an existing AI tool
Object result = client.getTool().update();
System.out.println(result);
```

### tenant

```java
// Update an existing tenant
Object result = client.getTenant().update();
System.out.println(result);
```

### table

```java
// Update an existing database table
Object result = client.getTable().update();
System.out.println(result);
```

### sku

```java
// Update an existing SKU
Object result = client.getSku().update();
System.out.println(result);
```

### skill

```java
// Get one skill detail
Object result = client.getSkill().getById();
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

### sharding

```java
// Update Sharding Key
Object result = client.getSharding().update();
System.out.println(result);
```

### security

```java
// PUT /backend/v3/api/security/policy
Object result = client.getSecurity().update();
System.out.println(result);
```

### schema

```java
// Update an existing database schema
Object result = client.getSchema().update();
System.out.println(result);
```

### role

```java
// Update an existing system role
Object result = client.getRole().update();
System.out.println(result);
```

### record

```java
// Update an existing invocation record
Object result = client.getRecord().update();
System.out.println(result);
```

### rbac

```java
// Update user-role relationship
Object result = client.getRbac().update();
System.out.println(result);
```

### prompt

```java
// Update an existing AI prompt
Object result = client.getPrompt().update();
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

### ppt

```java
// Update an existing PPT template
Object result = client.getPpt().update();
System.out.println(result);
```

### permission

```java
// PUT /backend/v3/api/permission
Object result = client.getPermission().update();
System.out.println(result);
```

### partner

```java
// Update a partner
Object result = client.getPartner().update();
System.out.println(result);
```

### participant

```java
// Update an existing chat participant
Object result = client.getParticipant().update();
System.out.println(result);
```

### oss

```java
// Update an existing OSS bucket
Object result = client.getOss().update();
System.out.println(result);
```

### organization

```java
// Update an existing organization
Object result = client.getOrganization().update();
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

### note

```java
// Update a note
Object result = client.getNote().update();
System.out.println(result);
```

### news

```java
// Update an existing news
Object result = client.getNews().update();
System.out.println(result);
```

### net

```java
// 更新域名
Object result = client.getNet().update();
System.out.println(result);
```

### music

```java
// Update music
Object result = client.getMusic().update();
System.out.println(result);
```

### model

```java
// Update existing AI model information
Object result = client.getModel().update();
System.out.println(result);
```

### message

```java
// Update an existing chat message
Object result = client.getMessage().update();
System.out.println(result);
```

### member

```java
// Update an existing member level
Object result = client.getMember().update();
System.out.println(result);
```

### knowledge_base

```java
// Update an existing knowledge base
Object result = client.getKnowledgeBase().update();
System.out.println(result);
```

### invitation

```java
// Update an invitation relation
Object result = client.getInvitation().update();
System.out.println(result);
```

### image

```java
// Update an existing image
Object result = client.getImage().update();
System.out.println(result);
```

### im

```java
// Update an existing chat group
Object result = client.getIm().update();
System.out.println(result);
```

### generation

```java
// Update an existing AI generation record
Object result = client.getGeneration().update();
System.out.println(result);
```

### game

```java
// Update game definition
Object result = client.getGame().update();
System.out.println(result);
```

### file

```java
// Update existing file metadata
Object result = client.getFile().update();
System.out.println(result);
```

### feed

```java
// Update an existing feeds entry
Object result = client.getFeed().update();
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

### disk

```java
// Update an existing file disk
Object result = client.getDisk().update();
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

### conversation

```java
// Update an existing conversation
Object result = client.getConversation().update();
System.out.println(result);
```

### content_writing

```java
// Rename chapter
Object result = client.getContentWriting().renameChapter();
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

### chat

```java
// Update an existing chat message
Object result = client.getChat().updateMessage();
System.out.println(result);
```

### character

```java
// Update character
Object result = client.getCharacter().update();
System.out.println(result);
```

### channel

```java
// Update channel
Object result = client.getChannel().update();
System.out.println(result);
```

### category

```java
// Update an existing category
Object result = client.getCategory().update();
System.out.println(result);
```

### card

```java
// Update an existing membership card
Object result = client.getCard().update();
System.out.println(result);
```

### attribute

```java
// Update attribute
Object result = client.getAttribute().update();
System.out.println(result);
```

### article

```java
// Update an existing AI article
Object result = client.getArticle().update();
System.out.println(result);
```

### app

```java
// Update application
Object result = client.getApp().update();
System.out.println(result);
```

### apikey

```java
// Update an existing API key
Object result = client.getApikey().update();
System.out.println(result);
```

### agent

```java
// Update an existing AI agent
Object result = client.getAgent().update();
System.out.println(result);
```

### account

```java
// Update an existing account
Object result = client.getAccount().update();
System.out.println(result);
```

### system

```java
// Apply invoice
Object result = client.getSystem().apply();
System.out.println(result);
```

### search

```java
// POST /backend/v3/api/search/chat/stop
Object result = client.getSearch().stop();
System.out.println(result);
```

### auth

```java
// Verify phone
Object result = client.getAuth().verifyPhone();
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
