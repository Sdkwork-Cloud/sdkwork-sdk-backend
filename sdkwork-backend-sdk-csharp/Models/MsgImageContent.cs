using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class MsgImageContent
    {
        public string? Content { get; set; }
        public ImageMediaResource? Resource { get; set; }
    }
}
