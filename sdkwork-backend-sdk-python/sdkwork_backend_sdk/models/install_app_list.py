from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class InstallAppList:
    app_id_list: List[int] = None
