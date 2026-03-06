from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusTempSessionVO:
    """文件VO类，用于存储文件的元数据信息"""
    file_id: int = None
    tmp_access_key_id: str = None
    tmp_access_key_secret: str = None
    session_token: str = None
    expiration_seconds: int = None
    upload_url: str = None
    object_key: str = None
    bucket: BucketObject = None
    create_time: str = None
