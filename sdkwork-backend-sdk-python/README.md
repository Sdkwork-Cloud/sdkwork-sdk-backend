# sdkwork-backend-sdk (Python)

Professional Python SDK for SDKWork API.

## Installation

```bash
pip install sdkwork-backend-sdk
```

## Quick Start

```python
from sdkwork_backend_sdk import SdkworkBackendClient, SdkConfig

config = SdkConfig(
    base_url="http://localhost:8080",
)

client = SdkworkBackendClient(config)
client.set_api_key("your-api-key")

# Use the SDK
result = client.workspace.update()
```

## Authentication Modes (Mutually Exclusive)

Choose exactly one mode for the same client instance.

### Mode A: API Key

```python
config = SdkConfig(base_url="http://localhost:8080")
client = SdkworkBackendClient(config)
client.set_api_key("your-api-key")
# Sends: Authorization: Bearer <apiKey>
```

### Mode B: Dual Token

```python
config = SdkConfig(base_url="http://localhost:8080")
client = SdkworkBackendClient(config)
client.set_auth_token("your-auth-token")
client.set_access_token("your-access-token")
# Sends:
# Authorization: Bearer <authToken>
# Access-Token: <accessToken>
```

> Do not call `set_api_key(...)` together with `set_auth_token(...)` + `set_access_token(...)` on the same client.

## API Modules

- `client.workspace` - workspace API
- `client.vote` - vote API
- `client.voice` - voice API
- `client.visit_history` - visit_history API
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
- `client.short_url` - short_url API
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
- `client.organization_member` - organization_member API
- `client.notification` - notification API
- `client.note` - note API
- `client.news` - news API
- `client.net` - net API
- `client.music` - music API
- `client.model` - model API
- `client.message` - message API
- `client.member` - member API
- `client.knowledge_base` - knowledge_base API
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
- `client.content_writing` - content_writing API
- `client.comment` - comment API
- `client.column` - column API
- `client.collection` - collection API
- `client.collection_item` - collection_item API
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

> Set `PYPI_TOKEN` for release (or `TEST_PYPI_TOKEN` for test channel).

## License

MIT
