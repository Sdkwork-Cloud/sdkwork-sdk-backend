import type { DnsRecordValue } from './dns-record-value';

/** DNS record creation form */
export interface PlusDnsRecordForm {
  /** Host domain ID */
  domainId: number;
  /** Record name */
  recordName?: string;
  /** Verification file name */
  fileName?: string;
  /** Verification file content */
  fileContent?: string;
  /** Record type */
  recordType: 'A' | 'AAAA' | 'CNAME' | 'MX' | 'TXT' | 'SRV' | 'NS' | 'PTR' | 'SOA' | 'SPF';
  /** Record value */
  recordValue?: DnsRecordValue;
  /** TTL */
  ttl: number;
  /** Priority */
  priority?: number;
  /** Enabled */
  enabled: boolean;
}
