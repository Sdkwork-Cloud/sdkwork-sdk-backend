from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusOrganizationForm:
    """Install app list"""
    name: str
    code: str
    status: str
    description: str = None
    parent_id: int = None
    install_app_list: InstallAppList = None
