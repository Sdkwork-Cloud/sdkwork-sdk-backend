export interface HttpApiDefinition {
  apiName?: string;
  description?: string;
  baseUrl?: string;
  path?: string;
  method?: 'GET' | 'POST' | 'PUT' | 'DELETE' | 'PATCH' | 'HEAD' | 'OPTIONS';
  headers?: Record<string, string>;
  parameters?: Record<string, Record<string, unknown>>;
  requestFormat?: string;
  responseFormat?: string;
  authenticated?: boolean;
  timeoutMillis?: number;
  requestBodyFormat?: string;
  requestBody?: Record<string, Record<string, unknown>>;
  authType?: 'NONE' | 'API_KEY' | 'OAUTH2';
  authParams?: Record<string, Record<string, unknown>>;
}
