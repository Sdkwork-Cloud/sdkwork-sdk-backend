using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class ShareContents
    {
        public List<ShareItem>? Items { get; set; }
    }
}
