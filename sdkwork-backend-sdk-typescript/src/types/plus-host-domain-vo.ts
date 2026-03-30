import type { DnsServers } from './dns-servers';
import type { PlusDnsRecordVO } from './plus-dns-record-vo';

/** 域名管理VO */
export interface PlusHostDomainVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** 主键ID，由数据库自动生成 */
  id?: number;
  /** 通用唯一标识符UUID */
  uuid?: string;
  /** 域名（例如：example.com） */
  domainName?: string;
  /** 顶级域名（例如：com, cn, net） */
  tld?: string;
  /** 注册商 */
  registrar?: string;
  /** 所属用户ID */
  ownerId?: number;
  /** 注册时间 */
  registeredAt?: string;
  /** 过期时间 */
  expiredAt?: string;
  /** 域名状态（ACTIVE-正常, EXPIRED-过期, PENDING- pending, SUSPENDED- suspended 等） */
  status?: 'ACTIVE' | 'EXPIRED' | 'PENDING' | 'SUSPENDED' | 'DELETED';
  /** DNS服务器列表 */
  dnsServers?: DnsServers;
  /** 解析状态（NORMAL-正常 / ABnormal-异常） */
  resolutionStatus?: 'NORMAL' | 'ERROR' | 'PAUSED' | 'FAILED';
  /** 是否自动续费 */
  autoRenew?: boolean;
  /** 备注信息 */
  remark?: string;
  /** 关联的DNS解析记录列表 */
  dnsRecords?: PlusDnsRecordVO[];
}
