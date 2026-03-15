from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusNotesMediaPublishStatusForm:
    """P lu sN ot es Me di aP ub li sh St at us Fo rm"""
    user_id: int = None
    platform: str = None
    product: str = None
    publish_id: str
