import type { DnsServers } from './dns-servers';

/** åååå»ºè¡¨å */
export interface PlusHostDomainForm {
  /** Domain name */
  domainName: string;
  /** Top-level domain */
  tld?: string;
  /** Registrar */
  registrar?: string;
  /** Owner ID */
  ownerId: number;
  /** Registered time */
  registeredAt: string;
  /** Expiration time */
  expiredAt: string;
  /** Domain status */
  status: 'ACTIVE' | 'EXPIRED' | 'PENDING' | 'SUSPENDED' | 'DELETED';
  /** DNS servers */
  dnsServers: DnsServers;
  /** Resolution status */
  resolutionStatus: 'NORMAL' | 'ERROR' | 'PAUSED' | 'FAILED';
  /** Auto renew */
  autoRenew?: boolean;
  /** Remark */
  remark?: string;
}
