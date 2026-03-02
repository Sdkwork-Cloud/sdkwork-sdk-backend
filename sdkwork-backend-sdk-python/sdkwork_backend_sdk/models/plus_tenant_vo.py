from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusTenantVO:
    """租户Value Object"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    name: str = None
    code: str = None
    status: str = None
    description: str = None
    admin_user_id: int = None
    expire_time: str = None
    install_app_list: InstallAppList = None
