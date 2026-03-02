import type { DnsServer } from './dns-server';

export interface DnsServers {
  servers?: DnsServer[];
  empty?: boolean;
}
