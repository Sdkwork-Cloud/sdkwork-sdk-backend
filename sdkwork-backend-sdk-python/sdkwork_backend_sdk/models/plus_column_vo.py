from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusColumnVO:
    """Column view object"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    name: str = None
    description: str = None
    data_type: str = None
    column_type: str = None
    ordinal_position: int = None
    is_nullable: bool = None
    is_primary_key: bool = None
    is_auto_increment: bool = None
    default_value: str = None
    comment: str = None
    character_set: str = None
    collation_rule: str = None
    table_id: int = None
