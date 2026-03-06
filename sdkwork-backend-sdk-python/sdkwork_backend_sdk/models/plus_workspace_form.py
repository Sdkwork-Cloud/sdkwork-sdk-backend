from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusWorkspaceForm:
    """Workspace creation form"""
    name: str
    code: str
    title: str
    description: str = None
    icon: str = None
    color: str = None
    type: str
    status: str
    owner_id: int = None
    leader_id: int = None
    start_time: str = None
    end_time: str = None
    max_members: int = None
    current_members: int = None
    max_storage: int = None
    used_storage: int = None
    settings: Dict[str, Any] = None
    is_deleted: bool
    is_public: bool
    is_template: bool
