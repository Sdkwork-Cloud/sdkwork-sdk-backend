from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusGameTournamentPlayerVO:
    """棋牌游戏赛事参赛者VO"""
    created_at: str = None
    updated_at: str = None
    player_id: int = None
    tournament_id: int = None
    user_id: int = None
    game_type: str = None
    club_id: int = None
    team_no: int = None
    status: str = None
    seed_no: int = None
    rank_no: int = None
    nickname_snapshot: str = None
    avatar_url: str = None
    score_value: float = None
    total_match_count: int = None
    win_count: int = None
    lose_count: int = None
    registered_at: str = None
    checked_in_at: str = None
    finished_at: str = None
