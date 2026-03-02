from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusRoleForm:
    """Role creation form"""
    code: str
    name: str
    description: str = None
    status: str
