from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusDatasourceForm:
    """Data source creation form (includes name, type, connection config)"""
    project_id: int
    name: str
    channel: str
    channel_id: str
    type: int
    status: int
    description: str = None
    connection_config: DatasourceConfig
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
