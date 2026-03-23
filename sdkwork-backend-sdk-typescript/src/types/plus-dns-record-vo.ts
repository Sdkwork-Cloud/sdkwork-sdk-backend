import type { DnsRecordValue } from './dns-record-value';

/** DNSè§£æè®°å½VO */
export interface PlusDnsRecordVO {
  /** è®°å½åå»ºæ¶é´ */
  createdAt?: string;
  /** è®°å½æ´æ°æ¶é´ */
  updatedAt?: string;
  /** ä¸»é®IDï¼ç±æ°æ®åºèªå¨çæ */
  id?: number;
  /** éç¨å¯ä¸æ è¯ç¬¦UUID */
  uuid?: string;
  /** å³èçååID */
  domainId?: number;
  /** è®°å½åç§°ï¼å¦ www, @, ftp ç­ï¼ */
  recordName?: string;
  /** æä»¶åï¼ç¨äºååéªè¯æä»¶ç­åºæ¯ï¼ */
  fileName?: string;
  /** æä»¶åå®¹ï¼ç¨äºååéªè¯æä»¶åå®¹ï¼ */
  fileContent?: string;
  /** DNSè®°å½ç±»åï¼A, AAAA, CNAME, MX, TXTç­ï¼ */
  recordType?: 'A' | 'AAAA' | 'CNAME' | 'MX' | 'TXT' | 'SRV' | 'NS' | 'PTR' | 'SOA' | 'SPF';
  /** è®°å½å¼ï¼å¦IPå°åãå«åç­ï¼ */
  recordValue?: DnsRecordValue;
  /** TTLï¼çå­æ¶é´ï¼åä½ç§ï¼ */
  ttl?: number;
  /** ä¼åçº§ï¼ç¨äºMXè®°å½ç­ï¼ */
  priority?: number;
  /** è®°å½ç¶æï¼å¯ç¨/ç¦ç¨ï¼ */
  enabled?: boolean;
  recordValues?: string[];
  firstRecordValue?: string;
}
