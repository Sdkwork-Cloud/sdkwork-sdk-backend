from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class OAuthAccountConfig:
    """OAuth第三方登录账户配置"""
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
    encoding_aeskey: str = None
