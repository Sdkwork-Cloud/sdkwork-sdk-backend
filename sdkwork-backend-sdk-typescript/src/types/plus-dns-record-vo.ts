import type { DnsRecordValue } from './dns-record-value';

/** DNS解析记录VO */
export interface PlusDnsRecordVO {
  /** 记录创建时间 */
  createdAt?: string;
  /** 记录更新时间 */
  updatedAt?: string;
  /** 主键ID，由数据库自动生成 */
  id?: number;
  /** 通用唯一标识符UUID */
  uuid?: string;
  /** 关联的域名ID */
  domainId?: number;
  /** 记录名称（如 www, @, ftp 等） */
  recordName?: string;
  /** 文件名（用于域名验证文件等场景） */
  fileName?: string;
  /** 文件内容（用于域名验证文件内容） */
  fileContent?: string;
  /** DNS记录类型（A, AAAA, CNAME, MX, TXT等） */
  recordType?: 'A' | 'AAAA' | 'CNAME' | 'MX' | 'TXT' | 'SRV' | 'NS' | 'PTR' | 'SOA' | 'SPF';
  /** 记录值（如IP地址、别名等） */
  recordValue?: DnsRecordValue;
  /** TTL（生存时间，单位秒） */
  ttl?: number;
  /** 优先级（用于MX记录等） */
  priority?: number;
  /** 记录状态（启用/禁用） */
  enabled?: boolean;
  recordValues?: string[];
  firstRecordValue?: string;
}
