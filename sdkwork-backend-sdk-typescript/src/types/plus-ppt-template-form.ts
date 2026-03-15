import type { ImageMediaResourceList } from './image-media-resource-list';
import type { PlusPptTemplateMeta } from './plus-ppt-template-meta';
import type { PlusPptTemplateSlide } from './plus-ppt-template-slide';
import type { PlusPptTemplateTags } from './plus-ppt-template-tags';

/** PPT template creation form */
export interface PlusPptTemplateForm {
  /** Template title */
  title: string;
  /** Template description */
  description?: string;
  /** Cover images */
  coverImages?: ImageMediaResourceList;
  /** Template type */
  type: 'DEFAULT' | 'BUSINESS' | 'EDUCATION' | 'REPORT' | 'OTHER';
  /** Template status */
  status: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'DRAFT';
  /** Author ID */
  authorId: number;
  /** Author name */
  authorName?: string;
  /** Template tags */
  tags?: PlusPptTemplateTags;
  /** Template metadata */
  meta?: PlusPptTemplateMeta;
  /** Slides */
  slides?: PlusPptTemplateSlide[];
}
