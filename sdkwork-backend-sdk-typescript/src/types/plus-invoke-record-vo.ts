/** Invocation record VO (records API calls, function calls, and other invocation behaviors) */
export interface PlusInvokeRecordVO {
  /** Creation timestamp */
  createdAt?: string;
  /** Last update timestamp */
  updatedAt?: string;
  /** Primary key ID */
  id?: number;
  /** Universally unique identifier UUID */
  uuid?: string;
  /** Invocation type (API_CALL/FUNCTION_CALL) */
  type?: 'DEFAULT' | 'API_CALL' | 'FUNCTION_CALL';
  /** API endpoint path (non-null for API_CALL type) */
  apiEndpoint?: string;
  /** Function name (non-null for FUNCTION_CALL type) */
  functionName?: string;
  /** Request parameters (JSON format) */
  requestParams?: Record<string, unknown>;
  /** Request headers (JSON format) */
  headers?: Record<string, unknown>;
  /** Execution status (SUCCESS/FAILURE/RUNNING) */
  status?: 'DEFAULT' | 'RUNNING' | 'SUCCESS' | 'FAILURE';
  /** Execution duration (ms) */
  duration?: number;
  /** Error message (when invocation fails) */
  errorMsg?: string;
  /** Invoker user ID */
  userId?: number;
  /** Client IP address (IPv4/IPv6) */
  clientIp?: string;
  /** Client geographical location */
  clientLocation?: string;
  /** Client User-Agent information */
  userAgent?: string;
  /** Client browser details */
  browserInfo?: string;
  /** Client unique identifier */
  clientId?: string;
}
