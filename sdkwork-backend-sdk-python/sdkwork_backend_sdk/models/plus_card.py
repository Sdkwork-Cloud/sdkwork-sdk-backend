from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusCard:
    tenant_id: int = None
    organization_id: int = None
    data_scope: str = None
    id: int = None
    uuid: str = None
    created_at: str = None
    updated_at: str = None
    v: int = None
    card_organization_id: int = None
    card_type: str = None
    code_type: str = None
    title: str = None
    brand_name: str = None
    logo_url: str = None
    notice: str = None
    description: str = None
    color: str = None
    quantity: int = None
    get_limit: int = None
    can_share: bool = None
    can_give_friend: bool = None
    start_time: str = None
    end_time: str = None
    status: str = None
