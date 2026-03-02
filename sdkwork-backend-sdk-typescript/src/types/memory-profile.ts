import type { ProfileItem } from './profile-item';

/** AI模型服务令牌使用限制配置信息 */
export interface MemoryProfile {
  items?: ProfileItem[];
  customs?: Record<string, ProfileItem[]>;
  description?: string;
}
