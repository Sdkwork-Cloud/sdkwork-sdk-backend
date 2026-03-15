from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusGameDefinitionVO:
    """棋牌游戏玩法定义VO"""
    created_at: str = None
    updated_at: str = None
    definition_id: int = None
    code: str = None
    game_type: str = None
    category: str = None
    name: str = None
    alias: str = None
    game_mode_code: str = None
    description: str = None
    rule_summary: str = None
    min_players: int = None
    max_players: int = None
    seat_count: int = None
    team_count: int = None
    default_round_count: int = None
    turn_based: bool = None
    ranked: bool = None
    supports_spectator: bool = None
    supports_trusteeship: bool = None
    supports_robot: bool = None
    supports_replay: bool = None
    supports_friend_room: bool = None
    supports_tournament: bool = None
    supports_club: bool = None
    supports_practice: bool = None
    difficulty_level: int = None
    tutorial_url: str = None
    ranking_type: str = None
    default_rule_config: Dict[str, Any] = None
    metadata: Dict[str, Any] = None
    supported_leaderboard_periods: List[str] = None
    enabled: bool = None
