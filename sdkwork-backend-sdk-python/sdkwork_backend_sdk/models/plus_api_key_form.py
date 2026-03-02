from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusApiKeyForm:
    """API key creation form"""
    name: str
    key_value: str
    type: str
    status: str
    expire_time: str = None
    description: str = None
    last_used_time: str = None
