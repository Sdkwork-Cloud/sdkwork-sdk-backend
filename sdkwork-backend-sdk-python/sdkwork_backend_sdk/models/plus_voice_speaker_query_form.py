from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusVoiceSpeakerQueryForm:
    id: int = None
    created_at_from: str = None
    created_at_to: str = None
    user_id: int = None
    keyword: str = None
    status: str = None
    data_scope: str = None
