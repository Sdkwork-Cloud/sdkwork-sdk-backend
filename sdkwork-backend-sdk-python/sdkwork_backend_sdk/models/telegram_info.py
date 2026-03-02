from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class TelegramInfo:
    user_id: int = None
    username: str = None
    full_name: str = None
    phone_number: str = None
    language_code: str = None
