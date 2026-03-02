export interface PoolConfig {
  minIdle?: number;
  maxPoolSize?: number;
  connectionTimeout?: number;
  idleTimeout?: number;
  maxLifetime?: number;
  autoCommit?: boolean;
  connectionTestQuery?: string;
  poolName?: string;
}
