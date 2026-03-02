from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class OfficialAccountConfig:
    id: int = None
    uuid: str = None
    region: str = None
    weight: int = None
    channel: str = None
    product: str = None
    functions: List[str] = None
    metadata: AccountConfigMetadata = None
    properties: Dict[str, Any] = None
    auth_provider: str = None
    app_id: str = None
    app_secret: str = None
    token: str = None
    redirect_uri: str = None
    scope: str = None
    is_service_account: bool = None
    team_id: str = None
    key_id: str = None
    private_key: str = None
    public_key: str = None
    secret: str = None
    aes_key: str = None
    qr_code_url: str = None
    original_id: str = None
    notify_url: str = None
    security_mode_enabled: bool = None
    access_token: str = None
    access_token_expires_in: int = None
    access_token_fetch_time: int = None
    js_sdk_enabled: bool = None
    js_api_domain: str = None
    encoding_aeskey: str = None
