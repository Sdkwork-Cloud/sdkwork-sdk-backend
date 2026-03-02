using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class AecConfig
    {
        public int? EchoMode { get; set; }
        public int? DelayEstimation { get; set; }
        public int? NoiseSuppression { get; set; }
        public int? EchoTailMs { get; set; }
        public int? SampleRate { get; set; }
    }
}
