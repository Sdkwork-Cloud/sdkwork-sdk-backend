/** 笔记发布文章表单 */
export interface PlusNotesPublishArticleForm {
  /** 笔记ID */
  noteId?: number;
  /** 笔记UUID */
  noteUuid?: string;
  /** 文章标题，未传则使用笔记标题 */
  title?: string;
  /** 文章内容（支持 Markdown/HTML），未传则使用笔记内容 */
  content?: string;
  /** 文章摘要 */
  digest?: string;
  /** 作者 */
  author?: string;
  /** 封面图 mediaId */
  thumbMediaId?: string;
  /** 原文链接 */
  contentSourceUrl?: string;
  /** 是否显示封面（0否，1是） */
  showCoverPic?: number;
  /** 是否打开评论（0否，1是） */
  needOpenComment?: number;
  /** 是否仅粉丝可评论（0否，1是） */
  onlyFansCanComment?: number;
}
