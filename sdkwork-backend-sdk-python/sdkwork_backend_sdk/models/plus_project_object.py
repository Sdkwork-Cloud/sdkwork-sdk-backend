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
    files: List[PlusFileObject] = None
    uuid: str = None
    disk_id: int = None
    author: str = None
    owner_id: int = None
    created_at: str = None
    screen_type: str = None
    description: str = None
    tags: TagsContent = None
    title: str = None
