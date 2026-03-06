from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CreateContentForm:
    """Form for creating content work"""
    title: str
    type: str
    description: str = None
    cover_url: str = None
