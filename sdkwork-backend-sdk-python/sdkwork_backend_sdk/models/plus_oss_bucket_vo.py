from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusOssBucketVO:
    """OSS存储桶值对象"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    v: int = None
    user_id: int = None
    name: str = None
    region: str = None
    channel: str = None
    channel_config_id: int = None
    description: str = None
    status: str = None
    creation_date: str = None
    arn: str = None
    endpoint: str = None
    storage_class: str = None
    versioning_enabled: bool = None
    encryption_enabled: bool = None
    encryption_type: str = None
    acl: str = None
