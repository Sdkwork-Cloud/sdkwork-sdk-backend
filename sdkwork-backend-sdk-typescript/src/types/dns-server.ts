export interface DnsServer {
  address?: string;
  port?: number;
  type?: 'PRIMARY' | 'SECONDARY';
  priority?: number;
  enabled?: boolean;
}
