from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusGameChallengeVO:
    """棋牌游戏挑战赛VO"""
    created_at: str = None
    updated_at: str = None
    challenge_id: int = None
    challenge_no: str = None
    arena_id: int = None
    source_type: str = None
    game_type: str = None
    game_mode_code: str = None
    status: str = None
    challenger_user_id: int = None
    target_user_id: int = None
    winner_user_id: int = None
    loser_user_id: int = None
    stake_score: int = None
    challenger_stake_locked: int = None
    target_stake_locked: int = None
    leaderboard_id: int = None
    room_id: int = None
    match_id: int = None
    reason: str = None
    challenged_at: str = None
    accepted_at: str = None
    settled_at: str = None
    expired_at: str = None
    canceled_at: str = None
