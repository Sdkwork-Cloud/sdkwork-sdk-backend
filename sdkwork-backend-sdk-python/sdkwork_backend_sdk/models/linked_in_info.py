from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class LinkedInInfo:
    user_id: str = None
    username: str = None
    full_name: str = None
    profile_picture_url: str = None
    headline: str = None
    position: str = None
    company: str = None
    industry: str = None
    education: str = None
    location: str = None
