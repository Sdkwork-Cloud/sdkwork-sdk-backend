from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusUserProfileVO:
    """用户个人资料VO"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    face_image: ImageMediaResource = None
    face_video: VideoMediaResource = None
    username: str = None
    nickname: str = None
    email: str = None
    phone: str = None
    gender: str = None
    status: str = None
    country_code: str = None
    province_code: str = None
    city_code: str = None
    district_code: str = None
    address: str = None
    bio: str = None
    birth_date: str = None
    social_info_list: SocialInfoList = None
