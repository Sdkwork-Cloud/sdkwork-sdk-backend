export interface RtcCallRecordVO {
  id?: string;
  uuid?: string;
  roomId?: string;
  caller?: string;
  callee?: string;
  startTime?: string;
  endTime?: string;
  duration?: string;
  status?: string;
  recordingUrl?: string;
  fileSize?: string;
  cost?: number;
  mos?: number;
  disconnectReason?: string;
  resolution?: string;
}
