from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusFileForm:
    """File creation form"""
    name: str
    path: str = None
    object_key: str = None
    size: int = None
    content_type: str = None
    extension: str = None
    storage_class: str = None
    version_id: str = None
    resource: FileMediaResource = None
    upload_time: str = None
    last_access_time: str = None
    description: str = None
    tags: TagsContent = None
    file_type: str
    file_category: str = None
    is_public: bool
    status: str
    parent_id: int = None
    etag: str = None
