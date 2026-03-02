from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class GetUserInfoResponse:
    """Result of retrieving user information"""
    user_id: str = None
    open_id: str = None
    union_id: str = None
    username: str = None
    email: str = None
    email_verified: bool = None
    full_name: str = None
    avatar_url: str = None
    gender: str = None
    nickname: str = None
    sex: int = None
    city: str = None
    province: str = None
    country: str = None
    privileges: List[str] = None
    bio: str = None
    blog: str = None
    location: str = None
    company: str = None
    first_name: str = None
    last_name: str = None
    locale: str = None
    mobile: str = None
    job_title: str = None
    office_location: str = None
