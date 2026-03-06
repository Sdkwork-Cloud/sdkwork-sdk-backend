from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FileTreeNodeVO:
    """File directory tree node VO"""
    id: int = None
    uuid: str = None
    name: str = None
    type: str = None
    is_directory: bool = None
    path: str = None
    relative_path: str = None
    size: int = None
    content: str = None
    parent_id: int = None
    children: List[FileTreeNodeVO] = None
    created_at: str = None
    updated_at: str = None
    extension: str = None
    description: str = None
    read_only: bool = None
