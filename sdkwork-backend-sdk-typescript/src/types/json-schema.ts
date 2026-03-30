export interface JsonSchema {
  name?: string;
  schema?: Record<string, Record<string, unknown>>;
  strict?: boolean;
}
