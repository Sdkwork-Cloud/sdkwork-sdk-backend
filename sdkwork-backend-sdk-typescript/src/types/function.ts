export interface Function {
  description?: string;
  name?: string;
  parameters?: Record<string, Record<string, unknown>>;
  strict?: boolean;
}
