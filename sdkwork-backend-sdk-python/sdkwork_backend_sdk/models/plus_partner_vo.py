from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusPartnerVO:
    """分销合作伙伴VO"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    name: str = None
    level: str = None
    status: str = None
    contact_name: str = None
    contact_phone: str = None
    contact_email: str = None
    company_address: str = None
    business_license: str = None
    settlement_account: str = None
    commission_rate: float = None
    total_commission: float = None
    withdrawable_commission: float = None
    withdrawn_commission: float = None
    promotion_code: str = None
    parent_id: int = None
    parent_metadata: PlusTreeParentMetadata = None
    parent_uuid: str = None
    cooperation_start_time: str = None
    cooperation_end_time: str = None
    remark: str = None
