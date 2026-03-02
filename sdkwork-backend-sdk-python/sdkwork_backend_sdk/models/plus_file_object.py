from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusFileObject:
    """文件对象DTO"""
    id: int = None
    uuid: str = None
    disk_id: int = None
    name: str = None
    size: int = None
    path: str = None
    relative_path: str = None
    type: str = None
    extension: str = None
    last_modified_time: str = None
    created_at: str = None
    version_id: str = None
    description: str = None
    project_uuid: str = None
    project_id: int = None
    owner: str = None
    owner_id: int = None
    author: str = None
    prompt: str = None
    content: str = None
    tags: TagsContent = None
    readonly: bool = None
    permission: List[str] = None
    reference_file_id: int = None
    children: List[PlusFileObject] = None
