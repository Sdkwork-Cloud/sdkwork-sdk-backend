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
- `client.content_vote` - content_vote API
- `client.voice_speaker` - voice_speaker API
- `client.visit_history` - visit_history API
- `client.vip_user` - vip_user API
- `client.vip_recharge` - vip_recharge API
- `client.vip_recharge_package` - vip_recharge_package API
- `client.vip_point_change` - vip_point_change API
- `client.vip_package_group` - vip_package_group API
- `client.vip_package` - vip_package API
- `client.vip_level` - vip_level API
- `client.vip_level_benefit` - vip_level_benefit API
- `client.vip_benefit` - vip_benefit API
- `client.vip_benefit_usage` - vip_benefit_usage API
- `client.video` - video API
- `client.user` - user API
- `client.user_oauth_account` - user_oauth_account API
- `client.user_coupon` - user_coupon API
- `client.user_card` - user_card API
- `client.user_address` - user_address API
- `client.ai_usage_record` - ai_usage_record API
- `client.shopping_cart` - shopping_cart API
- `client.shopping_cart_item` - shopping_cart_item API
- `client.refund` - refund API
- `client.payment` - payment API
- `client.order` - order API
- `client.order_item` - order_item API
- `client.ai_tool` - ai_tool API
- `client.tenant` - tenant API
- `client.database_table` - database_table API
- `client.product_sku` - product_sku API
- `client.short_url` - short_url API
- `client.shop` - shop API
- `client.share` - share API
- `client.share_visit_record` - share_visit_record API
- `client.sharding_key` - sharding_key API
- `client.schema` - schema API
- `client.rbac_role` - rbac_role API
- `client.role_permission` - role_permission API
- `client.invocation_record` - invocation_record API
- `client.rbac_user_role` - rbac_user_role API
- `client.ai_prompt` - ai_prompt API
- `client.project` - project API
- `client.product` - product API
- `client.ppt_template` - ppt_template API
- `client.ppt_template_slide` - ppt_template_slide API
- `client.partner` - partner API
- `client.chat_participant` - chat_participant API
- `client.oss_bucket` - oss_bucket API
- `client.organization` - organization API
- `client.position` - position API
- `client.member_relations` - member_relations API
- `client.organization_member` - organization_member API
- `client.notification` - notification API
- `client.notes` - notes API
- `client.news` - news API
- `client.host` - host API
- `client.dns_record` - dns_record API
- `client.music` - music API
- `client.ai_model_information` - ai_model_information API
- `client.ai_model_price` - ai_model_price API
- `client.chat_message` - chat_message API
- `client.member_level` - member_level API
- `client.member_card` - member_card API
- `client.knowledge_base` - knowledge_base API
- `client.invitation_relation` - invitation_relation API
- `client.invitation_code` - invitation_code API
- `client.image` - image API
- `client.chat_group` - chat_group API
- `client.ai_generation` - ai_generation API
- `client.ai_generation_content` - ai_generation_content API
- `client.file` - file API
- `client.file_part` - file_part API
- `client.file_content` - file_content API
- `client.feeds` - feeds API
- `client.feedback` - feedback API
- `client.favorite` - favorite API
- `client.file_disk` - file_disk API
- `client.disk_member` - disk_member API
- `client.detail` - detail API
- `client.department` - department API
- `client.datasource` - datasource API
- `client.coupon` - coupon API
- `client.coupon_template` - coupon_template API
- `client.ai_conversation` - ai_conversation API
- `client.comment` - comment API
- `client.column` - column API
- `client.collection` - collection API
- `client.collection_item` - collection_item API
- `client.character` - character API
- `client.channel_resource` - channel_resource API
- `client.channel_account` - channel_account API
- `client.ai_category` - ai_category API
- `client.membership_card` - membership_card API
- `client.card_template` - card_template API
- `client.attribute` - attribute API
- `client.ai_article` - ai_article API
- `client.application` - application API
- `client.api_key` - api_key API
- `client.ai_agent` - ai_agent API
- `client.ai_agent_tool_relationship` - ai_agent_tool_relationship API
- `client.account` - account API
- `client.account_history` - account_history API
- `client.search_chat` - search_chat API
- `client.ppt_template_rendering` - ppt_template_rendering API
- `client.ppt_template_chat` - ppt_template_chat API
- `client.knowledge_base_file` - knowledge_base_file API
- `client.knowledge_base_chat` - knowledge_base_chat API
- `client.im_message` - im_message API
- `client.ai_voice_speaker_generation` - ai_voice_speaker_generation API
- `client.ai_video_generation` - ai_video_generation API
- `client.ai_music_generation` - ai_music_generation API
- `client.ai_image_generation` - ai_image_generation API
- `client.ai_character_generation` - ai_character_generation API
- `client.ai_audio_generation` - ai_audio_generation API
- `client.ai_audio_effect_generation` - ai_audio_effect_generation API
- `client.ai_chat` - ai_chat API
- `client.verification` - verification API
- `client.oauth_authentication` - oauth_authentication API
- `client.authorization` - authorization API
- `client.authentication` - authentication API
- `client.app` - app API
- `client.ai_agent_chat` - ai_agent_chat API


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
