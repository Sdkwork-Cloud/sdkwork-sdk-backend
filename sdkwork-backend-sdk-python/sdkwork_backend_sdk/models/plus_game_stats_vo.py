from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusGameStatsVO:
    """棋牌游戏玩家统计VO"""
    created_at: str = None
    updated_at: str = None
    stats_id: int = None
    user_id: int = None
    game_type: str = None
    game_mode_code: str = None
    season_key: str = None
    scope_type: str = None
    scope_owner_id: int = None
    club_id: int = None
    region_code: str = None
    nickname_snapshot: str = None
    avatar_url: str = None
    ranking_type: str = None
    total_match_count: int = None
    win_count: int = None
    lose_count: int = None
    draw_count: int = None
    escape_count: int = None
    total_round_count: int = None
    total_action_count: int = None
    total_move_count: int = None
    total_duration_seconds: int = None
    score: int = None
    rating_score: int = None
    chips_balance: int = None
    profit_amount: int = None
    win_rate: float = None
    current_win_streak: int = None
    best_win_streak: int = None
    highest_rating_score: int = None
    best_rank_no: int = None
    best_daily_rank_no: int = None
    best_weekly_rank_no: int = None
    best_monthly_rank_no: int = None
    best_quarterly_rank_no: int = None
    best_yearly_rank_no: int = None
    honor_count: int = None
    leaderboard_position: int = None
    last_match_at: str = None
    challenge_total_count: int = None
    challenge_win_count: int = None
    challenge_lose_count: int = None
    arena_attack_win_count: int = None
    arena_defense_win_count: int = None
    arena_defense_lose_count: int = None
    arena_best_defense_streak: int = None
