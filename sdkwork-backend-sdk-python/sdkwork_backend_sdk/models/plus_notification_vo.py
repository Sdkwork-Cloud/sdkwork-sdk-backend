from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusNotificationVO:
    """Notification VO"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    role: str = None
    sender_id: int = None
    sender: Participant = None
    receiver_id: int = None
    receiver: Participant = None
    group_id: int = None
    title: str = None
    content: str = None
    type: str = None
    channel_type: str = None
    template_id: str = None
    template_params: Dict[str, Any] = None
    redirect_url: str = None
    mini_program_path: str = None
    status: str = None
    sent_at: str = None
    read_at: str = None
    extra_data: Dict[str, Any] = None
    retry_count: int = None
    max_retry_count: int = None
    error_message: str = None
