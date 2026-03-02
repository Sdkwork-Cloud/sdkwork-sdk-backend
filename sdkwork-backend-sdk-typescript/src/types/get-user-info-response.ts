/** Result of retrieving user information */
export interface GetUserInfoResponse {
  /** User's unique identifier */
  userId?: string;
  /** User's open ID (platform-specific user identifier) */
  openId?: string;
  /** User's union ID (cross-platform user identifier) */
  unionId?: string;
  /** User's username */
  username?: string;
  /** User's email address */
  email?: string;
  /** Whether the email is verified */
  emailVerified?: boolean;
  /** User's full name */
  fullName?: string;
  /** URL to user's avatar image */
  avatarUrl?: string;
  /** User's gender */
  gender?: 'UNKNOWN' | 'MALE' | 'FEMALE' | 'NEUTRAL';
  /** User's nickname */
  nickname?: string;
  /** User's gender as integer (1 for male, 2 for female) */
  sex?: number;
  /** User's city */
  city?: string;
  /** User's province */
  province?: string;
  /** User's country */
  country?: string;
  /** User's privileges */
  privileges?: string[];
  /** User's bio/description */
  bio?: string;
  /** User's blog/website URL */
  blog?: string;
  /** User's location */
  location?: string;
  /** User's company */
  company?: string;
  /** User's first name */
  firstName?: string;
  /** User's last name */
  lastName?: string;
  /** User's locale */
  locale?: string;
  /** User's mobile phone number */
  mobile?: string;
  /** User's job title */
  jobTitle?: string;
  /** User's office location */
  officeLocation?: string;
}
