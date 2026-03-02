using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class VideoMediaResourceList
    {
        public List<VideoMediaResource>? Videos { get; set; }
        public List<AssetMediaResource>? Resources { get; set; }
    }
}
