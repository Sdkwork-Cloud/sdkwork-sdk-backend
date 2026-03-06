/** Form for creating content work */
export interface CreateContentForm {
  /** Title */
  title: string;
  /** Type */
  type: string;
  /** Description */
  description?: string;
  /** Cover URL */
  coverUrl?: string;
}
