using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class AudioMediaResourceList
    {
        public List<AudioMediaResource>? Audios { get; set; }
        public List<AssetMediaResource>? Resources { get; set; }
    }
}
