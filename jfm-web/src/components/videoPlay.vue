<template>
  <div style="width:100%;height: 100%;">
    <video :ref="'video-play-'+videoComponentId" controls width="100%" height="100%" />
  </div>
</template>

<script>
import flvjs from "flv.js";

export default {
  name: "videoPlay",
  props: {
    url: {
      type: String,
      required: true
    }
  },
  data() {
    return {
      videoComponentId:
        (Math.random() * 10000000).toString(16).substr(0, 4) +
        "-" +
        new Date().getTime() +
        "-" +
        Math.random()
          .toString()
          .substr(2, 5)
    };
  },
  mounted() {
    if (flvjs.isSupported()) {
      var videoElement = this.$refs["video-play-" + this.videoComponentId];
      this.flvPlayer = flvjs.createPlayer({
        type: "video/mp4",
        isLive: false,
        hasAudio: false,
        url: this.url
      });
      this.flvPlayer.attachMediaElement(videoElement);
      this.flvPlayer.load();
      //this.flvPlayer.play();
    }
  }
};
</script>