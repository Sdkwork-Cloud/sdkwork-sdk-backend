using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class MsgPayload
    {
        public MsgAudioContent? Audio { get; set; }
        public MsgFileContent? File { get; set; }
        public MsgImageContent? Image { get; set; }
        public MsgLocationContent? Location { get; set; }
        public MsgMusicContent? Music { get; set; }
        public MsgTextContent? Text { get; set; }
        public MsgVideoContent? Video { get; set; }
    }
}
