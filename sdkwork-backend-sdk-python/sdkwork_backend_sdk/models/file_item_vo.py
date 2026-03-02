from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FileItemVO:
    """文件视图对象"""
    id: str = None
    object: str = None
    bytes: int = None
    created_at: int = None
    filename: str = None
    purpose: str = None
    expires_at: int = None
    status: str = None
    status_details: str = None
    deleted: bool = None
