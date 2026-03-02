import type { JsonSchema } from './json-schema';

export interface ResponseFormat {
  type?: 'text' | 'json_object' | 'json_schema';
  json_schema?: JsonSchema;
}
