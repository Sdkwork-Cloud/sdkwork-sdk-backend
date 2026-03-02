/** File part creation form */
export interface PlusFilePartForm {
  /** Associated file ID */
  fileId: number;
  /** Chunk index (0-based) */
  chunkIndex: number;
  /** Chunk size in bytes */
  chunkSize: number;
  /** Total file size in bytes */
  totalSize: number;
  /** Chunk content checksum */
  checksum?: string;
  /** Upload status: 1-uploading, 2-uploaded, 3-failed */
  status: number;
  /** Storage path of this chunk */
  storagePath?: string;
}
