import type { ProfileItem } from './profile-item';

/** AIæ¨¡åæå¡ä»¤çä½¿ç¨éå¶éç½®ä¿¡æ¯ */
export interface MemoryProfile {
  items?: ProfileItem[];
  customs?: Record<string, ProfileItem[]>;
  description?: string;
}
