export interface OrderWorkerDispatchMetadata {
  enabledTaskCodes?: string[];
  taskConcurrentOverrides?: Record<string, number>;
}
