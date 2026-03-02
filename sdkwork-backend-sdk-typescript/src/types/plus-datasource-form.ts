import type { DatasourceConfig } from './datasource-config';
import type { TagsContent } from './tags-content';

/** Data source creation form (includes name, type, connection config) */
export interface PlusDatasourceForm {
  /** 数据源名称 */
  name: string;
  /** 数据源类型(如MySQL, PostgreSQL, MongoDB等) */
  type: 1 | 2 | 3 | 4 | 5 | 6 | 7 | 99;
  /** 数据源状态(ACTIVE:活跃,INACTIVE:未激活,ERROR:错误) */
  status: 1 | 0 | -1 | -2;
  /** 数据源描述 */
  description?: string;
  /** 连接配置信息(JSON格式) */
  connectionConfig: DatasourceConfig;
  /** 数据源URL */
  url?: string;
  /** 数据源创建者/所有者 */
  owner?: string;
  /** 最后成功连接时间 */
  lastConnectedAt?: string;
  /** 连接超时时间(秒) */
  connectionTimeout?: number;
  /** 标签(逗号分隔) */
  tags?: TagsContent;
  /** 数据库版本 */
  dbVersion?: string;
  /** 安全级别(0-低,1-中,2-高) */
  securityLevel?: number;
  /** 访问计数 */
  accessCount?: number;
  /** UI显示图标 */
  icon?: string;
  /** UI显示颜色(HEX) */
  color?: string;
}
