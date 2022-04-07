<template>
  <div>
    <div style="display:flex;position:relative">
      <JfmIconTuiguang size="45" />
      <div style="height:45px;line-height:45px;font-size: 25px;margin-left: 10px;">推广视频</div>
      <div style="height: 25px; position: absolute; bottom: 5px; left: 180px;display:flex;">
        <JfmIconHuo />
        <span style="font-size: 14px; margin-right: 20px;padding: 5px;" class="fire-font">这石头吃起来像煤块</span>
        <JfmIconHuo />
        <div style="font-size: 14px;padding: 5px;" class="fire-font">今天的天气看起来不错</div>
      </div>
    </div>
    <div style="display:flex;margin: 0px -15px;">
      <div v-for="item in 3" :key="item" style="width:33.33%;padding: 0px 15px;">
        <div
          style="position: relative;"
          class="index-show"
          @mouseenter="handleMouseEnter(item)"
          @mouseleave="handleMouseLeave(item)"
        >
          <div class="index-img">
            <div
              style="color: burlywood;position:absolute;top:15px;left:15px;background-color:black;padding: 3px 5px; border-radius: 5px;"
            >新皮肤</div>

            <div
              style="background: -webkit-linear-gradient(bottom, rgb(0, 0, 0) 0%, rgba(0,0,0,0.8) 40%,transparent 100%);height:150px;position:absolute;bottom:0px;width: 100%;"
            >
              <div
                style="color: burlywood;position:absolute;bottom:40px;left:15px;font-size:22px;font-weight:700"
              >二倍攻势 玫瑰绽放</div>
              <div style="color:white;position:absolute;bottom:15px;left:15px">灵能特工 序章</div>
            </div>
          </div>
          <div class="index-video">
            <video-play url="/index-video/example.mp4"></video-play>
          </div>
        </div>
      </div>
    </div>
    <div
      class="ind-img-bot"
      ref="ind-img-bot"
      @mouseenter="handleMouseEnter(item)"
      @mouseleave="handleMouseLeave(item)"
    >
      <div
        style="width:14.28%;position:relative;height:130px;cursor:pointer"
        v-for="item in 7"
        :key="item"
      >
        <div style="margin:0px 5px 0px 5px">
          <img
            :src="'/index-video-bottom/index-video-bottom1 ('+item+').jpg'"
            style="width: 100%; height: 100%;"
          />
        </div>
        <div
          style="position:absolute; bottom: 0px; margin: 0px 5px;text-align: center; background-color: rgba(0,0,0,0.5);color: burlywood;right: 0px; left: 0px; line-height: 35px;"
        >灵魂莲花 202{{item}}</div>
      </div>
    </div>
  </div>
</template>

<script>
import { JfmIconTuiguang, JfmIconHuo } from "@/components/colorFont.js";

export default {
  name: "TuiGuangVideo",
  components: {
    JfmIconTuiguang,
    JfmIconHuo
  },
  data() {
    return {};
  },
  methods: {
    handleMouseEnter(type) {
      this.$refs["ind-img-bot"].style.height = "145px";
    },
    handleMouseLeave(type) {
      this.$refs["ind-img-bot"].style.height = "0px";
    }
  }
};
</script>

<style lang="less" scoped>
.fire-font:hover {
  color: #00a1d6;
  cursor: pointer;
}

.index-show {
  .index-img {
    background-size: 100%;
    position: absolute;
    z-index: 2;
    height: 282px;
    top: 0px;
    left: 0px;
    border-radius: 5px;
    overflow: hidden;
    width: 100%;
    transition: height 0.5s;
    background-image: url("~@/resource/index-video-img/index-video-3.jpg");
  }
  .index-video {
    border-radius: 5px;
    overflow: hidden;
    height: 282px;
    transition: width 0s;
    background: black;
  }
}
.ind-img-bot {
  height: 0px;
  display: flex;
  overflow: hidden;
  transition: height 0.5s;
  margin-top: 20px;
}

.index-show:hover {
  .index-img {
    height: 0px;
  }
}
</style>