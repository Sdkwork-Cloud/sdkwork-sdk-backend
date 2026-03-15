from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusGameDefinitionQueryForm:
    """棋牌游戏玩法定义查询表单"""
    id: int = None
    created_at_from: str = None
    created_at_to: str = None
    code: str = None
    code_like: str = None
    name_like: str = None
    game_type: str = None
    category: str = None
    game_mode_code: str = None
    enabled: bool = None
    ranked: bool = None
    supports_replay: bool = None
    supports_tournament: bool = None
