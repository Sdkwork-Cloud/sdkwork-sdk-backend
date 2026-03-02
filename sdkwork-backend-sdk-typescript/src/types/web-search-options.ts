import type { UserLocation } from './user-location';

export interface WebSearchOptions {
  search_context_size?: 'low' | 'medium' | 'high';
  user_location?: UserLocation;
}
