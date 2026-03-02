from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VectorAccountConfig:
    id: int = None
    uuid: str = None
    region: str = None
    weight: int = None
    channel: str = None
    product: str = None
    functions: List[str] = None
    metadata: AccountConfigMetadata = None
    properties: Dict[str, Any] = None
    dimension: int = None
    index_type: str = None
    index_name: str = None
    embedding_config_id: int = None
    database_name: str = None
    collection_name: str = None
    embedding_config: EmbeddingAccountConfig = None
