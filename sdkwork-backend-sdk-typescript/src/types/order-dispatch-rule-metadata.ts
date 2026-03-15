export interface OrderDispatchRuleMetadata {
  ratingConcurrentLimits?: Record<string, number>;
  allowedRatingLevels?: string[];
}
