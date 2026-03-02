from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusOrganizationVO:
    """组织VO对象"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    name: str = None
    code: str = None
    status: str = None
    description: str = None
    parent_id: int = None
    install_app_list: InstallAppList = None
