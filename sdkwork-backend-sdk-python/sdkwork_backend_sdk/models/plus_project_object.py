from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusProjectObject:
    name: str = None
    id: str = None
    type: str = None
    owner: str = None
    last_modified_time: str = None
    version: str = None
    tags: TagsContent = None
    description: str = None
    title: str = None
    created_at: str = None
    owner_id: int = None
    uuid: str = None
    disk_id: int = None
    author: str = None
    files: List[PlusFileObject] = None
    screen_type: str = None
