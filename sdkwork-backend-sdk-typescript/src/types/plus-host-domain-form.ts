import type { DnsServers } from './dns-servers';

/** 域名创建表单 */
export interface PlusHostDomainForm {
  /** 域名（例如：example.com） */
  domainName: string;
  /** 顶级域名（例如：com、cn、net） */
  tld?: string;
  /** 域名注册商 */
  registrar?: string;
  /** 所属用户ID */
  ownerId: number;
  /** 注册时间 */
  registeredAt: string;
  /** 过期时间 */
  expiredAt: string;
  /** 域名状态 */
  status: 'ACTIVE' | 'EXPIRED' | 'PENDING' | 'SUSPENDED';
  /** DNS服务器列表（JSON格式） */
  dnsServers: DnsServers;
  /** 解析状态 */
  resolutionStatus: 'NORMAL' | 'ABNORMAL';
  /** 是否自动续费 */
  autoRenew?: boolean;
  /** 备注信息 */
  remark?: string;
}
