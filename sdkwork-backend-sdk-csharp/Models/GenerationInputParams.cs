using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class GenerationInputParams
    {
        public ImageGenerationInput? Image { get; set; }
        public VideoGenerationInput? Video { get; set; }
        public AudioGenerationInput? Audio { get; set; }
        public MusicGenerationInput? Music { get; set; }
        public VoiceSpeakerGenerationInput? Voice { get; set; }
        public CharacterGenerationInput? Character { get; set; }
        public AudioEffectGenerationInput? AudioEffect { get; set; }
    }
}
