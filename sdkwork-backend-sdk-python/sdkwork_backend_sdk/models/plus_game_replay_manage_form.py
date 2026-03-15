from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusGameReplayManageForm:
    """棋牌游戏回放管理表单"""
    title: str = None
    public_visible: bool = None
    allow_share: bool = None
    status: str = None
    cover_url: str = None
    expired_at: str = None
