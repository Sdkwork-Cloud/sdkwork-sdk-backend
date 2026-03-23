import type { DnsServers } from './dns-servers';
import type { PlusDnsRecordVO } from './plus-dns-record-vo';

/** ååç®¡çVO */
export interface PlusHostDomainVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** ä¸»é®IDï¼ç±æ°æ®åºèªå¨çæ */
  id?: number;
  /** éç¨å¯ä¸æ è¯ç¬¦UUID */
  uuid?: string;
  /** ååï¼ä¾å¦ï¼example.comï¼ */
  domainName?: string;
  /** é¡¶çº§ååï¼ä¾å¦ï¼com, cn, netï¼ */
  tld?: string;
  /** æ³¨åå */
  registrar?: string;
  /** æå±ç¨æ·ID */
  ownerId?: number;
  /** æ³¨åæ¶é´ */
  registeredAt?: string;
  /** è¿ææ¶é´ */
  expiredAt?: string;
  /** ååç¶æï¼ACTIVE-æ­£å¸¸, EXPIRED-è¿æ, PENDING- pending, SUSPENDED- suspended ç­ï¼ */
  status?: 'ACTIVE' | 'EXPIRED' | 'PENDING' | 'SUSPENDED' | 'DELETED';
  /** DNSæå¡å¨åè¡¨ */
  dnsServers?: DnsServers;
  /** è§£æç¶æï¼NORMAL-æ­£å¸¸ / ABnormal-å¼å¸¸ï¼ */
  resolutionStatus?: 'NORMAL' | 'ERROR' | 'PAUSED' | 'FAILED';
  /** æ¯å¦èªå¨ç»­è´¹ */
  autoRenew?: boolean;
  /** å¤æ³¨ä¿¡æ¯ */
  remark?: string;
  /** å³èçDNSè§£æè®°å½åè¡¨ */
  dnsRecords?: PlusDnsRecordVO[];
}
