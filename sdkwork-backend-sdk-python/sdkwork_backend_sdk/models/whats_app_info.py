from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class WhatsAppInfo:
    user_id: str = None
    phone_number: str = None
    display_name: str = None
    profile_picture_url: str = None
