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

```typescript
// Get all workspaces
const body = {} as any;
const result = await client.workspace.listAllEntities(body);
```

### vote

```typescript
// Get all content votes
const body = {} as any;
const result = await client.vote.listAllEntities(body);
```

### voice

```typescript
// Get all voice speakers
const body = {} as any;
const result = await client.voice.listAllEntities(body);
```

### visit_history

```typescript
// List All Visit Histories
const body = {} as any;
const result = await client.visitHistory.listAllEntities(body);
```

### vip

```typescript
// Get a VIP user by ID
const result = await client.vip.getCurrentUser();
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

### usage

```typescript
// Get all usage records
const body = {} as any;
const result = await client.usage.listAllEntities(body);
```

### trade

```typescript
// Get all shopping carts
const body = {} as any;
const result = await client.trade.createListAllEntities(body);
```

### tool

```typescript
// Get all AI tools
const body = {} as any;
const result = await client.tool.listAllEntities(body);
```

### tenant

```typescript
// Get all tenants
const body = {} as any;
const result = await client.tenant.listAllEntities(body);
```

### table

```typescript
// Get all database tables
const body = {} as any;
const result = await client.table.listAllEntities(body);
```

### sku

```typescript
// Get all SKUs
const body = {} as any;
const result = await client.sku.listAllEntities(body);
```

### skill

```typescript
// Query all skill packages
const body = {} as any;
const result = await client.skill.createListAll(body);
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
// Get all visit records
const body = {} as any;
const result = await client.share.createListAllEntities(body);
```

### sharding

```typescript
// List All Sharding Keys
const body = {} as any;
const result = await client.sharding.listAllEntities(body);
```

### security

```typescript
// List all policies
const body = {} as any;
const result = await client.security.listAllEntities(body);
```

### schema

```typescript
// Get all database schemas
const body = {} as any;
const result = await client.schema.listAllEntities(body);
```

### role

```typescript
// Get all role-permission associations
const body = {} as any;
const result = await client.role.createListAllEntities(body);
```

### record

```typescript
// Get all invocation records
const body = {} as any;
const result = await client.record.listAllEntities(body);
```

### rbac

```typescript
// Get all user-role relationships
const body = {} as any;
const result = await client.rbac.listAllEntities(body);
```

### prompt

```typescript
// Get all AI prompts
const body = {} as any;
const result = await client.prompt.listAllEntities(body);
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

### ppt

```typescript
// Get all PPT template slides
const body = {} as any;
const result = await client.ppt.createListAllEntities(body);
```

### permission

```typescript
// List all permissions
const body = {} as any;
const result = await client.permission.listAllEntities(body);
```

### partner

```typescript
// Get all partners
const body = {} as any;
const result = await client.partner.listAllEntities(body);
```

### participant

```typescript
// Get all chat participants
const body = {} as any;
const result = await client.participant.listAllEntities(body);
```

### oss

```typescript
// List files
const params = {} as Record<string, any>;
const result = await client.oss.listFiles(params);
```

### organization

```typescript
// Get all positions
const body = {} as any;
const result = await client.organization.createListAllEntities(body);
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

### note

```typescript
// List all notes
const result = await client.note.listAll();
```

### news

```typescript
// Get all news
const body = {} as any;
const result = await client.news.listAllEntities(body);
```

### net

```typescript
// 获取所有域名
const body = {} as any;
const result = await client.net.createListAllEntities(body);
```

### music

```typescript
// Get all music records
const body = {} as any;
const result = await client.music.listAllEntities(body);
```

### model

```typescript
// Get all AI model prices
const body = {} as any;
const result = await client.model.createListAllEntities(body);
```

### message

```typescript
// Get all chat messages
const body = {} as any;
const result = await client.message.listAllEntities(body);
```

### member

```typescript
// Get all member levels
const body = {} as any;
const result = await client.member.createListAllEntities(body);
```

### knowledge_base

```typescript
// List files
const params = {} as Record<string, any>;
const result = await client.knowledgeBase.listFiles(params);
```

### invitation

```typescript
// Get all invitation relations
const body = {} as any;
const result = await client.invitation.createListAllEntities(body);
```

### image

```typescript
// Get all images
const body = {} as any;
const result = await client.image.listAllEntities(body);
```

### im

```typescript
// Get all chat groups
const body = {} as any;
const result = await client.im.listAllEntities(body);
```

### generation

```typescript
// Get all AI generation records
const body = {} as any;
const result = await client.generation.createListAllEntities(body);
```

### game

```typescript
// List growth reward claims
const body = {} as any;
const result = await client.game.listGrowthRewardClaims(body);
```

### file

```typescript
// Get all file parts
const body = {} as any;
const result = await client.file.createListAllEntities(body);
```

### feed

```typescript
// Get all feeds entries
const body = {} as any;
const result = await client.feed.listAllEntities(body);
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

### disk

```typescript
// List files
const params = {} as Record<string, any>;
const result = await client.disk.getListFiles(params);
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
const result = await client.coupon.createListAllEntities(body);
```

### conversation

```typescript
// Get all open conversations
const body = {} as any;
const result = await client.conversation.open(body);
```

### content_writing

```typescript
// Get all contents
const result = await client.contentWriting.getAllContents();
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

### chat

```typescript
// Get all chat messages
const body = {} as any;
const result = await client.chat.createListAllEntities(body);
```

### character

```typescript
// Get all characters
const body = {} as any;
const result = await client.character.listAllEntities(body);
```

### channel

```typescript
// Get all channel resources
const body = {} as any;
const result = await client.channel.createListAllEntities(body);
```

### category

```typescript
// Get all categories
const body = {} as any;
const result = await client.category.listAllEntities(body);
```

### card

```typescript
// Get all card templates
const body = {} as any;
const result = await client.card.createListAllEntities(body);
```

### attribute

```typescript
// Get all attributes
const body = {} as any;
const result = await client.attribute.listAllEntities(body);
```

### article

```typescript
// Get all AI articles
const body = {} as any;
const result = await client.article.listAllEntities(body);
```

### app

```typescript
// Get app info
const result = await client.app.getAppInfo();
```

### apikey

```typescript
// List API keys for current user
const result = await client.apikey.listMyApiKeys();
```

### agent

```typescript
// Get all agent-tool relationships
const body = {} as any;
const result = await client.agent.createListAllEntities(body);
```

### account

```typescript
// Get points-to-cash rate
const result = await client.account.getPointsToCashRate();
```

### system

```typescript
// Query invoice page
const params = {} as Record<string, any>;
const result = await client.system.listByPage(params);
```

### search

```typescript
// POST /backend/v3/api/search/chat/stop
const params = {} as Record<string, any>;
const headers = {} as Record<string, string>;
const result = await client.search.stop(params, headers);
```

### auth

```typescript
// Get roles
const result = await client.auth.getRoles();
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

> Set `NPM_TOKEN` (and optional `NPM_REGISTRY_URL`) before release publish.

## License

MIT
