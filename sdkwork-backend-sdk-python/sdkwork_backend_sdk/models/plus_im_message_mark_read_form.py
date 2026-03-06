from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusImMessageMarkReadForm:
    """IM消息已读请求参数"""
    conversation_id: int
