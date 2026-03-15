from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusGameTournamentVO:
    """棋牌游戏赛事VO"""
    created_at: str = None
    updated_at: str = None
    tournament_id: int = None
    tournament_no: str = None
    name: str = None
    short_name: str = None
    description: str = None
    game_type: str = None
    game_mode_code: str = None
    tournament_type: str = None
    status: str = None
    organizer_user_id: int = None
    club_id: int = None
    season_key: str = None
    region_code: str = None
    min_player_count: int = None
    max_player_count: int = None
    team_size: int = None
    registration_required: bool = None
    ranked: bool = None
    replay_enabled: bool = None
    sign_up_start_at: str = None
    sign_up_end_at: str = None
    start_at: str = None
    end_at: str = None
    winner_user_id: int = None
    winner_club_id: int = None
    total_participant_count: int = None
    total_match_count: int = None
    registered_count: int = None
    checked_in_count: int = None
    playing_count: int = None
    advanced_count: int = None
    eliminated_count: int = None
    finished_count: int = None
    withdrawn_count: int = None
