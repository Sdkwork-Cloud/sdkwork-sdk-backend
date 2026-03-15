from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusApiKeySelfUpdateForm:
    """Current user API key update form"""
    name: str = None
    expire_time: str = None
    clear_expire_time: bool = None
    description: str = None
