from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusFileVO:
    """文件VO类，用于存储文件的元数据信息"""
    parent_uuid: str = None
    parent_metadata: PlusTreeParentMetadata = None
    id: int = None
    parent_id: int = None
    name: str = None
    path: str = None
    full_path: str = None
    object_key: str = None
    size: int = None
    content_type: str = None
    extension: str = None
    storage_class: str = None
    version_id: str = None
    resource: FileMediaResource = None
    url: str = None
    upload_time: str = None
    last_access_time: str = None
    description: str = None
    tags: TagsContent = None
    file_type: str = None
    file_category: str = None
    permission: FilePermission = None
    is_public: bool = None
    pinned_at: str = None
    status: str = None
    content: FileContentObject = None
    etag: str = None
