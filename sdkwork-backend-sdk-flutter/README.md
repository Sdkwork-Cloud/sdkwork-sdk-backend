# sdkwork-backend-sdk (Flutter)

Professional Flutter SDK for SDKWork API.

## Installation

Add to `pubspec.yaml`:

```yaml
dependencies:
  backend_sdk: ^1.0.9
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

```dart
// Update an existing workspace
final result = await client.workspace.update();
print(result);
```

### vote

```dart
// Update an existing content vote
final result = await client.vote.update();
print(result);
```

### voice

```dart
// Update an existing voice speaker
final result = await client.voice.update();
print(result);
```

### visit_history

```dart
// Update Visit History
final result = await client.visitHistory.update();
print(result);
```

### vip

```dart
// Update an existing VIP user
final result = await client.vip.update();
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

### usage

```dart
// Update an existing usage record
final result = await client.usage.update();
print(result);
```

### trade

```dart
// Update shopping cart
final result = await client.trade.update();
print(result);
```

### tool

```dart
// Update an existing AI tool
final result = await client.tool.update();
print(result);
```

### tenant

```dart
// Update an existing tenant
final result = await client.tenant.update();
print(result);
```

### table

```dart
// Update an existing database table
final result = await client.table.update();
print(result);
```

### sku

```dart
// Update an existing SKU
final result = await client.sku.update();
print(result);
```

### skill

```dart
// Get one skill detail
final result = await client.skill.getById();
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

### sharding

```dart
// Update Sharding Key
final result = await client.sharding.update();
print(result);
```

### security

```dart
// PUT /backend/v3/api/security/policy
final result = await client.security.update();
print(result);
```

### schema

```dart
// Update an existing database schema
final result = await client.schema.update();
print(result);
```

### role

```dart
// Update an existing system role
final result = await client.role.update();
print(result);
```

### record

```dart
// Update an existing invocation record
final result = await client.record.update();
print(result);
```

### rbac

```dart
// Update user-role relationship
final result = await client.rbac.update();
print(result);
```

### prompt

```dart
// Update an existing AI prompt
final result = await client.prompt.update();
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

### ppt

```dart
// Update an existing PPT template
final result = await client.ppt.update();
print(result);
```

### permission

```dart
// PUT /backend/v3/api/permission
final result = await client.permission.update();
print(result);
```

### partner

```dart
// Update a partner
final result = await client.partner.update();
print(result);
```

### participant

```dart
// Update an existing chat participant
final result = await client.participant.update();
print(result);
```

### oss

```dart
// Update an existing OSS bucket
final result = await client.oss.update();
print(result);
```

### organization

```dart
// Update an existing organization
final result = await client.organization.update();
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

### note

```dart
// Update a note
final result = await client.note.update();
print(result);
```

### news

```dart
// Update an existing news
final result = await client.news.update();
print(result);
```

### net

```dart
// 更新域名
final result = await client.net.update();
print(result);
```

### music

```dart
// Update music
final result = await client.music.update();
print(result);
```

### model

```dart
// Update existing AI model information
final result = await client.model.update();
print(result);
```

### message

```dart
// Update an existing chat message
final result = await client.message.update();
print(result);
```

### member

```dart
// Update an existing member level
final result = await client.member.update();
print(result);
```

### knowledge_base

```dart
// Update an existing knowledge base
final result = await client.knowledgeBase.update();
print(result);
```

### invitation

```dart
// Update an invitation relation
final result = await client.invitation.update();
print(result);
```

### image

```dart
// Update an existing image
final result = await client.image.update();
print(result);
```

### im

```dart
// Update an existing chat group
final result = await client.im.update();
print(result);
```

### generation

```dart
// Update an existing AI generation record
final result = await client.generation.update();
print(result);
```

### game

```dart
// Update game definition
final result = await client.game.update();
print(result);
```

### file

```dart
// Update existing file metadata
final result = await client.file.update();
print(result);
```

### feed

```dart
// Update an existing feeds entry
final result = await client.feed.update();
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

### disk

```dart
// Update an existing file disk
final result = await client.disk.update();
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

### conversation

```dart
// Update an existing conversation
final result = await client.conversation.update();
print(result);
```

### content_writing

```dart
// Rename chapter
final result = await client.contentWriting.renameChapter();
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

### chat

```dart
// Update an existing chat message
final result = await client.chat.updateMessage();
print(result);
```

### character

```dart
// Update character
final result = await client.character.update();
print(result);
```

### channel

```dart
// Update channel
final result = await client.channel.update();
print(result);
```

### category

```dart
// Update an existing category
final result = await client.category.update();
print(result);
```

### card

```dart
// Update an existing membership card
final result = await client.card.update();
print(result);
```

### attribute

```dart
// Update attribute
final result = await client.attribute.update();
print(result);
```

### article

```dart
// Update an existing AI article
final result = await client.article.update();
print(result);
```

### app

```dart
// Update application
final result = await client.app.update();
print(result);
```

### apikey

```dart
// Update an existing API key
final result = await client.apikey.update();
print(result);
```

### agent

```dart
// Update an existing AI agent
final result = await client.agent.update();
print(result);
```

### account

```dart
// Update an existing account
final result = await client.account.update();
print(result);
```

### system

```dart
// Apply invoice
final result = await client.system.apply();
print(result);
```

### search

```dart
// POST /backend/v3/api/search/chat/stop
final result = await client.search.stop();
print(result);
```

### auth

```dart
// Verify phone
final result = await client.auth.verifyPhone();
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
