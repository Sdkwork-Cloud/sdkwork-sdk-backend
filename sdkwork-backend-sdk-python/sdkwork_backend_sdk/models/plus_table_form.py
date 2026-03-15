from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusTableForm:
    """Table creation form"""
    name: str
    description: str = None
    type: str = None
    column_count: int = None
    row_count: int = None
    last_sync_time: str = None
    primary_keys: str = None
    engine: str = None
    create_sql: str = None
    comment: str = None
    schema_id: int
