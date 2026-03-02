from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AecConfig:
    echo_mode: int = None
    delay_estimation: int = None
    noise_suppression: int = None
    echo_tail_ms: int = None
    sample_rate: int = None
