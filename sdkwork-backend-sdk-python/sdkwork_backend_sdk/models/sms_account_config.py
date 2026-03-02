from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class SmsAccountConfig:
    id: int = None
    uuid: str = None
    region: str = None
    weight: int = None
    channel: str = None
    product: str = None
    functions: List[str] = None
    metadata: AccountConfigMetadata = None
    properties: Dict[str, Any] = None
    base_url: str = None
    app_id: str = None
    access_key: str = None
    secret_key: str = None
    sign_name: str = None
    sender_id: str = None
