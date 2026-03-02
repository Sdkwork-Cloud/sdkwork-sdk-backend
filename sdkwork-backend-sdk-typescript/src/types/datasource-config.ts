import type { PoolConfig } from './pool-config';

export interface DatasourceConfig {
  type?: string;
  host?: string;
  port?: number;
  database?: string;
  username?: string;
  password?: string;
  params?: string;
  poolConfig?: PoolConfig;
  driverClassName?: string;
  jdbcUrl?: string;
}
