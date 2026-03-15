# sdkwork-backend-sdk (C#)

Professional C# SDK for SDKWork API.

## Installation

```bash
dotnet add package Backend
```

Or add to your `.csproj`:

```xml
<PackageReference Include="Backend" Version="1.0.9" />
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
- `client.Vote` - vote API
- `client.Voice` - voice API
- `client.VisitHistory` - visit_history API
- `client.Vip` - vip API
- `client.Video` - video API
- `client.User` - user API
- `client.Usage` - usage API
- `client.Trade` - trade API
- `client.Tool` - tool API
- `client.Tenant` - tenant API
- `client.Table` - table API
- `client.Sku` - sku API
- `client.Skill` - skill API
- `client.ShortUrl` - short_url API
- `client.Shop` - shop API
- `client.Share` - share API
- `client.Sharding` - sharding API
- `client.Security` - security API
- `client.Schema` - schema API
- `client.Role` - role API
- `client.Record` - record API
- `client.Rbac` - rbac API
- `client.Prompt` - prompt API
- `client.Project` - project API
- `client.Product` - product API
- `client.Ppt` - ppt API
- `client.Permission` - permission API
- `client.Partner` - partner API
- `client.Participant` - participant API
- `client.Oss` - oss API
- `client.Organization` - organization API
- `client.OrganizationMember` - organization_member API
- `client.Notification` - notification API
- `client.Note` - note API
- `client.News` - news API
- `client.Net` - net API
- `client.Music` - music API
- `client.Model` - model API
- `client.Message` - message API
- `client.Member` - member API
- `client.KnowledgeBase` - knowledge_base API
- `client.Invitation` - invitation API
- `client.Image` - image API
- `client.Im` - im API
- `client.Generation` - generation API
- `client.Game` - game API
- `client.File` - file API
- `client.Feed` - feed API
- `client.Feedback` - feedback API
- `client.Favorite` - favorite API
- `client.Disk` - disk API
- `client.Detail` - detail API
- `client.Department` - department API
- `client.Datasource` - datasource API
- `client.Coupon` - coupon API
- `client.Conversation` - conversation API
- `client.ContentWriting` - content_writing API
- `client.Comment` - comment API
- `client.Column` - column API
- `client.Collection` - collection API
- `client.CollectionItem` - collection_item API
- `client.Chat` - chat API
- `client.Character` - character API
- `client.Channel` - channel API
- `client.Category` - category API
- `client.Card` - card API
- `client.Attribute` - attribute API
- `client.Article` - article API
- `client.App` - app API
- `client.Apikey` - apikey API
- `client.Agent` - agent API
- `client.Account` - account API
- `client.System` - system API
- `client.Search` - search API
- `client.Auth` - auth API

## Usage Examples

### workspace

```csharp
// Update an existing workspace
var result = await client.Workspace.UpdateAsync();
Console.WriteLine(result);
```

### vote

```csharp
// Update an existing content vote
var result = await client.Vote.UpdateAsync();
Console.WriteLine(result);
```

### voice

```csharp
// Update an existing voice speaker
var result = await client.Voice.UpdateAsync();
Console.WriteLine(result);
```

### visit_history

```csharp
// Update Visit History
var result = await client.VisitHistory.UpdateAsync();
Console.WriteLine(result);
```

### vip

```csharp
// Update an existing VIP user
var result = await client.Vip.UpdateAsync();
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

### usage

```csharp
// Update an existing usage record
var result = await client.Usage.UpdateAsync();
Console.WriteLine(result);
```

### trade

```csharp
// Update shopping cart
var result = await client.Trade.UpdateAsync();
Console.WriteLine(result);
```

### tool

```csharp
// Update an existing AI tool
var result = await client.Tool.UpdateAsync();
Console.WriteLine(result);
```

### tenant

```csharp
// Update an existing tenant
var result = await client.Tenant.UpdateAsync();
Console.WriteLine(result);
```

### table

```csharp
// Update an existing database table
var result = await client.Table.UpdateAsync();
Console.WriteLine(result);
```

### sku

```csharp
// Update an existing SKU
var result = await client.Sku.UpdateAsync();
Console.WriteLine(result);
```

### skill

```csharp
// Get one skill detail
var result = await client.Skill.GetByIdAsync();
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

### sharding

```csharp
// Update Sharding Key
var result = await client.Sharding.UpdateAsync();
Console.WriteLine(result);
```

### security

```csharp
// PUT /backend/v3/api/security/policy
var result = await client.Security.UpdateAsync();
Console.WriteLine(result);
```

### schema

```csharp
// Update an existing database schema
var result = await client.Schema.UpdateAsync();
Console.WriteLine(result);
```

### role

```csharp
// Update an existing system role
var result = await client.Role.UpdateAsync();
Console.WriteLine(result);
```

### record

```csharp
// Update an existing invocation record
var result = await client.Record.UpdateAsync();
Console.WriteLine(result);
```

### rbac

```csharp
// Update user-role relationship
var result = await client.Rbac.UpdateAsync();
Console.WriteLine(result);
```

### prompt

```csharp
// Update an existing AI prompt
var result = await client.Prompt.UpdateAsync();
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

### ppt

```csharp
// Update an existing PPT template
var result = await client.Ppt.UpdateAsync();
Console.WriteLine(result);
```

### permission

```csharp
// PUT /backend/v3/api/permission
var result = await client.Permission.UpdateAsync();
Console.WriteLine(result);
```

### partner

```csharp
// Update a partner
var result = await client.Partner.UpdateAsync();
Console.WriteLine(result);
```

### participant

```csharp
// Update an existing chat participant
var result = await client.Participant.UpdateAsync();
Console.WriteLine(result);
```

### oss

```csharp
// Update an existing OSS bucket
var result = await client.Oss.UpdateAsync();
Console.WriteLine(result);
```

### organization

```csharp
// Update an existing organization
var result = await client.Organization.UpdateAsync();
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

### note

```csharp
// Update a note
var result = await client.Note.UpdateAsync();
Console.WriteLine(result);
```

### news

```csharp
// Update an existing news
var result = await client.News.UpdateAsync();
Console.WriteLine(result);
```

### net

```csharp
// 更新域名
var result = await client.Net.UpdateAsync();
Console.WriteLine(result);
```

### music

```csharp
// Update music
var result = await client.Music.UpdateAsync();
Console.WriteLine(result);
```

### model

```csharp
// Update existing AI model information
var result = await client.Model.UpdateAsync();
Console.WriteLine(result);
```

### message

```csharp
// Update an existing chat message
var result = await client.Message.UpdateAsync();
Console.WriteLine(result);
```

### member

```csharp
// Update an existing member level
var result = await client.Member.UpdateAsync();
Console.WriteLine(result);
```

### knowledge_base

```csharp
// Update an existing knowledge base
var result = await client.KnowledgeBase.UpdateAsync();
Console.WriteLine(result);
```

### invitation

```csharp
// Update an invitation relation
var result = await client.Invitation.UpdateAsync();
Console.WriteLine(result);
```

### image

```csharp
// Update an existing image
var result = await client.Image.UpdateAsync();
Console.WriteLine(result);
```

### im

```csharp
// Update an existing chat group
var result = await client.Im.UpdateAsync();
Console.WriteLine(result);
```

### generation

```csharp
// Update an existing AI generation record
var result = await client.Generation.UpdateAsync();
Console.WriteLine(result);
```

### game

```csharp
// Update game definition
var result = await client.Game.UpdateAsync();
Console.WriteLine(result);
```

### file

```csharp
// Update existing file metadata
var result = await client.File.UpdateAsync();
Console.WriteLine(result);
```

### feed

```csharp
// Update an existing feeds entry
var result = await client.Feed.UpdateAsync();
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

### disk

```csharp
// Update an existing file disk
var result = await client.Disk.UpdateAsync();
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

### conversation

```csharp
// Update an existing conversation
var result = await client.Conversation.UpdateAsync();
Console.WriteLine(result);
```

### content_writing

```csharp
// Rename chapter
var result = await client.ContentWriting.RenameChapterAsync();
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

### chat

```csharp
// Update an existing chat message
var result = await client.Chat.UpdateMessageAsync();
Console.WriteLine(result);
```

### character

```csharp
// Update character
var result = await client.Character.UpdateAsync();
Console.WriteLine(result);
```

### channel

```csharp
// Update channel
var result = await client.Channel.UpdateAsync();
Console.WriteLine(result);
```

### category

```csharp
// Update an existing category
var result = await client.Category.UpdateAsync();
Console.WriteLine(result);
```

### card

```csharp
// Update an existing membership card
var result = await client.Card.UpdateAsync();
Console.WriteLine(result);
```

### attribute

```csharp
// Update attribute
var result = await client.Attribute.UpdateAsync();
Console.WriteLine(result);
```

### article

```csharp
// Update an existing AI article
var result = await client.Article.UpdateAsync();
Console.WriteLine(result);
```

### app

```csharp
// Update application
var result = await client.App.UpdateAsync();
Console.WriteLine(result);
```

### apikey

```csharp
// Update an existing API key
var result = await client.Apikey.UpdateAsync();
Console.WriteLine(result);
```

### agent

```csharp
// Update an existing AI agent
var result = await client.Agent.UpdateAsync();
Console.WriteLine(result);
```

### account

```csharp
// Update an existing account
var result = await client.Account.UpdateAsync();
Console.WriteLine(result);
```

### system

```csharp
// Apply invoice
var result = await client.System.ApplyAsync();
Console.WriteLine(result);
```

### search

```csharp
// POST /backend/v3/api/search/chat/stop
var result = await client.Search.StopAsync();
Console.WriteLine(result);
```

### auth

```csharp
// Verify phone
var result = await client.Auth.VerifyPhoneAsync();
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
