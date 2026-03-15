from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusApiKeySelfCreateForm:
    """Current user API key creation form"""
    name: str
    type: str
    expire_time: str = None
    description: str = None
