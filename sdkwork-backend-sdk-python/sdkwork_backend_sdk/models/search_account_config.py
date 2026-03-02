from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class SearchAccountConfig:
    id: int = None
    uuid: str = None
    region: str = None
    weight: int = None
    channel: str = None
    product: str = None
    functions: List[str] = None
    metadata: AccountConfigMetadata = None
    properties: Dict[str, Any] = None
    api_key: str = None
    base_url: str = None
    access_key: str = None
    secret_key: str = None
    default_model: str = None
