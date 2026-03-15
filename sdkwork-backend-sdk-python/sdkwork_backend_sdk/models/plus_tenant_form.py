from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusTenantForm:
    """Install app list"""
    name: str
    code: str
    status: str
    description: str = None
    admin_user_id: int
    expire_time: str = None
    install_app_list: InstallAppList = None
