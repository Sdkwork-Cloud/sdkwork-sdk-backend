from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusDatasourceVO:
    """数据源信息VO"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    name: str = None
    type: int = None
    status: int = None
    description: str = None
    connection_config: Any = None
    url: str = None
    owner: str = None
    last_connected_at: str = None
    connection_timeout: int = None
    tags: TagsContent = None
    db_version: str = None
    security_level: int = None
    access_count: int = None
    icon: str = None
    color: str = None
    schema_ids: List[int] = None
