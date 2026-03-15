from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusGameArenaVO:
    """棋牌游戏擂台VO"""
    created_at: str = None
    updated_at: str = None
    arena_id: int = None
    arena_no: str = None
    name: str = None
    description: str = None
    game_type: str = None
    game_mode_code: str = None
    status: str = None
    owner_user_id: int = None
    current_champion_user_id: int = None
    current_challenge_id: int = None
    stake_score: int = None
    total_challenge_count: int = None
    successful_defense_count: int = None
    failed_defense_count: int = None
    current_defense_streak: int = None
    best_defense_streak: int = None
    total_reward_score: int = None
    room_id: int = None
    match_id: int = None
    opened_at: str = None
    last_challenge_at: str = None
    last_settled_at: str = None
    closed_at: str = None
