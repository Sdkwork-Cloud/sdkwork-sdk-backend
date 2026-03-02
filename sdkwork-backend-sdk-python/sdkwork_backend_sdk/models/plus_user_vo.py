from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusUserVO:
    """System User Value Object"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    face_image: ImageMediaResource = None
    face_video: ImageMediaResource = None
    username: str = None
    nickname: str = None
    email: str = None
    phone: str = None
    gender: str = None
    status: str = None
    role_ids: List[int] = None
    role_names: List[str] = None
    social_info_list: SocialInfoList = None
