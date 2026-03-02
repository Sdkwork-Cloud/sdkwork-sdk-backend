from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ShortUrlVO:
    """Short URL VO (stores short URL metadata and access statistics)"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    original_url: str = None
    short_code: str = None
    expires_at: str = None
    click_count: int = None
    status: str = None
    created_by: int = None
    description: str = None
