import type { RtcParticipantVO } from './rtc-participant-vo';

export interface RtcRoomVO {
  id?: string;
  uuid?: string;
  roomId?: string;
  hostName?: string;
  guestName?: string;
  startTime?: string;
  duration?: string;
  status?: string;
  participants?: number;
  recordingStatus?: string;
  quality?: string;
  participantList?: RtcParticipantVO[];
}
