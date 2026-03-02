from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class UserMetadata:
    sp_mch_id: int = None
    partner_id: int = None
    agent_id: int = None
    shop_id: int = None
    from_user_id: int = None
