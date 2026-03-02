from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusSchemaVO:
    """数据库Schema定义VO"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    name: str = None
    description: str = None
    status: int = None
    table_count: int = None
    last_sync_time: str = None
    is_default: bool = None
    datasource_id: int = None
    table_ids: List[int] = None
