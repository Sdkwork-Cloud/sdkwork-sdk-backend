from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusOssBucketForm:
    """OSS bucket creation form"""
    name: str
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
