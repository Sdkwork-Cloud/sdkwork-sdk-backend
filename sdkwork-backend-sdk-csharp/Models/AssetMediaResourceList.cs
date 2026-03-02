using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class AssetMediaResourceList
    {
        public List<ImageMediaResource>? Images { get; set; }
        public List<VideoMediaResource>? Videos { get; set; }
        public List<AudioMediaResource>? Audios { get; set; }
        public List<FileMediaResource>? Files { get; set; }
        public List<MusicMediaResource>? Musics { get; set; }
        public List<AssetMediaResource>? Resources { get; set; }
    }
}
