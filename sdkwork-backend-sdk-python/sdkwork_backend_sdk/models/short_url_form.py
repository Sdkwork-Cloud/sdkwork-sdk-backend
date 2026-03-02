from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ShortUrlForm:
    """Short URL creation parameters"""
    original_url: str
    short_code: str
    expires_at: str = None
    status: str
    created_by: int = None
    description: str = None
