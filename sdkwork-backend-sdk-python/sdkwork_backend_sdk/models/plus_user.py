from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusUser:
    tenant_id: int = None
    organization_id: int = None
    data_scope: str = None
    id: int = None
    uuid: str = None
    created_at: str = None
    updated_at: str = None
    v: int = None
    username: str = None
    nickname: str = None
    password: str = None
    platform: str = None
    type: str = None
    gender: str = None
    face_image: ImageMediaResource = None
    face_video: VideoMediaResource = None
    salt: str = None
    scene: str = None
    email: str = None
    phone: str = None
    country_code: str = None
    province_code: str = None
    city_code: str = None
    district_code: str = None
    address: str = None
    bio: str = None
    birth_date: str = None
    oauth_user_info: GetUserInfoResponse = None
    status: str = None
    roles: List[PlusRole] = None
    metadata: UserMetadata = None
    social_info_list: SocialInfoList = None
    role_codes: List[str] = None
    authorities: List[GrantedAuthority] = None
