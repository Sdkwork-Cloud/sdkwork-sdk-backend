from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusSchemaForm:
    """Schema creation form"""
    name: str
    description: str = None
    status: int
    table_count: int = None
    last_sync_time: str = None
    is_default: bool = None
    datasource_id: int
