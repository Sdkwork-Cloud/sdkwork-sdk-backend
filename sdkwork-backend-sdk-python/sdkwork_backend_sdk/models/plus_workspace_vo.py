from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusWorkspaceVO:
    """工作区信息VO"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    name: str = None
    code: str = None
    title: str = None
    description: str = None
    icon: str = None
    color: str = None
    type: str = None
    status: str = None
    owner_id: int = None
    leader_id: int = None
    start_time: str = None
    end_time: str = None
    max_members: int = None
    current_members: int = None
    max_storage: int = None
    used_storage: int = None
    settings: str = None
    is_deleted: bool = None
    is_public: bool = None
    is_template: bool = None
