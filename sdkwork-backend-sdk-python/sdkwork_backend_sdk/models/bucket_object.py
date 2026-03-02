from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class BucketObject:
    """存储桶对象，包含名称和区域信息"""
    name: str
    region: str = None
    creation_date: str = None
    arn: str = None
