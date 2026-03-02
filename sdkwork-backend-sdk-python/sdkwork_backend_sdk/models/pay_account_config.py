from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PayAccountConfig:
    id: int = None
    uuid: str = None
    region: str = None
    weight: int = None
    channel: str = None
    product: str = None
    functions: List[str] = None
    metadata: AccountConfigMetadata = None
    properties: Dict[str, Any] = None
    merchant_id: str = None
    app_id: str = None
    private_key: str = None
    public_key: str = None
    secret_key: str = None
    notify_url: str = None
    return_url: str = None
    gateway_url: str = None
    pay_type: str = None
