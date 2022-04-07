<template>
  <div>
    <div style="display:flex;position:relative;margin-bottom:10px">
      <JfmIconShijian size="45" />
      <div style="height:45px;line-height:45px;font-size: 25px;margin-left: 10px;">热门事件</div>
    </div>
    <div style="display:flex;position:relative;height:387px;margin-bottom:20px;cursor:pointer">
      <div style="width:60%;position:relative">
        <div>
          <el-carousel
            height="380px"
            :autoplay="false"
            indicator-position="none"
            arrow="never"
            ref="carousel"
          >
            <el-carousel-item name="1">
              <img
                src="~@/resource/index-event/wallhaven-0q578q.jpg"
                style="width:100%;height:100%;"
              />
            </el-carousel-item>
            <el-carousel-item name="2">
              <img
                src="~@/resource/index-event/wallhaven-0qvr3d.jpg"
                style="width:100%;height:100%;"
              />
            </el-carousel-item>
            <el-carousel-item name="3">
              <img
                src="~@/resource/index-event/wallhaven-4x3mxl.jpg"
                style="width:100%;height:100%;"
              />
            </el-carousel-item>
            <el-carousel-item name="4">
              <img
                src="~@/resource/index-event/wallhaven-eyx3pl.jpg"
                style="width:100%;height:100%;"
              />
            </el-carousel-item>
            <el-carousel-item name="5">
              <img
                src="~@/resource/index-event/wallhaven-gjvdvl.jpg"
                style="width:100%;height:100%;"
              />
            </el-carousel-item>
          </el-carousel>
        </div>
        <div
          style="diplay:flex;position: absolute; bottom: 0px; z-index: 2; width: 100%; line-height: 40px; background-color: rgb(222,222,222);display: flex;cursor:pointer"
        >
          <div
            style="width:20%;text-align:center;"
            ref="leftImgHover1"
            @mouseenter="handelMoveHover('1')"
          >
            <span>灵能密保</span>
            <div style="height:2px;width:100%"></div>
          </div>
          <div
            style="width:20%;text-align:center"
            ref="leftImgHover2"
            @mouseenter="handelMoveHover('2')"
          >
            <span>灵能特工 序章</span>
            <div style="height:2px;width:100%"></div>
          </div>
          <div
            style="width:20%;text-align:center"
            ref="leftImgHover3"
            @mouseenter="handelMoveHover('3')"
          >
            <span>2020通行证</span>
            <div style="height:2px;width:100%"></div>
          </div>
          <div
            style="width:20%;text-align:center"
            ref="leftImgHover4"
            @mouseenter="handelMoveHover('4')"
          >
            <span>KDA联盟上新</span>
            <div style="height:2px;width:100%"></div>
          </div>
          <div
            style="width:20%;text-align:center"
            ref="leftImgHover5"
            @mouseenter="handelMoveHover('5')"
          >
            <span>每周限是优惠</span>
            <div style="height:2px;width:100%"></div>
          </div>
        </div>
      </div>
      <div style="width:40%">
        <div class="indes-t-msg" style="padding:0px 40px">
          <el-tabs style="width:100%">
            <el-tab-pane label="综合">
              <div
                style="color: #0da0b4;text-align:center;font-size:25px;line-height:60px;height:60px;text-align:center;white-space: nowrap; overflow: hidden; text-overflow: ellipsis;"
              >10.19版本更新公告：沙漠玫瑰 莎弥拉起舞而来</div>
              <div style="color:#424242">
                <div style="display:flex;line-height: 40px;border-top: 1px solid rgb(222,222,222);">
                  <div style="width:60px">
                    <span
                      style="border: 1px solid orange; padding: 2px 5px; color: orange; font-size: 14px;"
                    >视频</span>
                  </div>
                  <div style="width:calc(100% - 110px)">2020英雄联盟全球总决赛主题曲MV《所向无前》</div>
                  <div style="width:50px;color:gray">09-17</div>
                </div>
                <div style="display:flex;line-height: 40px;border-top: 1px solid rgb(222,222,222);">
                  <div style="width:60px">
                    <span
                      style="border: 1px solid blue; padding: 2px 5px; color: blue; font-size: 14px;"
                    >公告</span>
                  </div>
                  <div style="width:calc(100% - 110px)">2020全球总决赛主题曲MV发布倒计时一小时</div>
                  <div style="width:50px;color:gray">09-17</div>
                </div>
                <div style="display:flex;line-height: 40px;border-top: 1px solid rgb(222,222,222);">
                  <div style="width:60px">
                    <span
                      style="border: 1px solid blue; padding: 2px 5px; color: blue; font-size: 14px;"
                    >公告</span>
                  </div>
                  <div style="width:calc(100% - 110px)">2020全球总决赛主题曲MV倒计时海报—Mata</div>
                  <div style="width:50px;color:gray">09-17</div>
                </div>
                <div style="display:flex;line-height: 40px;border-top: 1px solid rgb(222,222,222);">
                  <div style="width:60px">
                    <span
                      style="border: 1px solid blue; padding: 2px 5px; color: blue; font-size: 14px;"
                    >公告</span>
                  </div>
                  <div style="width:calc(100% - 110px)">2020全球总决赛主题曲MV倒计时海报—Xpeke</div>
                  <div style="width:50px;color:gray">09-17</div>
                </div>
                <div style="display:flex;line-height: 40px;border-top: 1px solid rgb(222,222,222);">
                  <div style="width:60px">
                    <span
                      style="border: 1px solid red; padding: 2px 5px; color: red; font-size: 14px;"
                    >赛事</span>
                  </div>
                  <div style="width:calc(100% - 110px)">LGD：十年饮冰，难凉热血</div>
                  <div style="width:50px;color:gray">09-17</div>
                </div>
                <div style="display:flex;line-height: 40px;border-top: 1px solid rgb(222,222,222);">
                  <div style="width:60px">
                    <span
                      style="border: 1px solid orange; padding: 2px 5px; color: orange; font-size: 14px;"
                    >视频</span>
                  </div>
                  <div style="width:calc(100% - 110px)">2LPL战队S10斗鱼应援曲：止战之殇TES应援版</div>
                  <div style="width:50px;color:gray">09-17</div>
                </div>
              </div>
            </el-tab-pane>
            <el-tab-pane label="公告">
              <div
                style="color: #0da0b4;text-align:center;font-size:25px;line-height:60px;height:60px;text-align:center"
              >[原创] S10主题曲简析·超越对手的尽头</div>
              <div style="color:#424242">
                <div style="display:flex;line-height: 40px;border-top: 1px solid rgb(222,222,222);">
                  <div style="width:60px">
                    <span
                      style="border: 1px solid orange; padding: 2px 5px; color: orange; font-size: 14px;"
                    >视频</span>
                  </div>
                  <div style="width:calc(100% - 110px)">游戏环境公示及处罚名单9月18日</div>
                  <div style="width:50px;color:gray">09-17</div>
                </div>
                <div style="display:flex;line-height: 40px;border-top: 1px solid rgb(222,222,222);">
                  <div style="width:60px">
                    <span
                      style="border: 1px solid blue; padding: 2px 5px; color: blue; font-size: 14px;"
                    >公告</span>
                  </div>
                  <div style="width:calc(100% - 110px)">2020全球总决赛主题曲MV发布倒计时一小时</div>
                  <div style="width:50px;color:gray">09-17</div>
                </div>
                <div style="display:flex;line-height: 40px;border-top: 1px solid rgb(222,222,222);">
                  <div style="width:60px">
                    <span
                      style="border: 1px solid blue; padding: 2px 5px; color: blue; font-size: 14px;"
                    >公告</span>
                  </div>
                  <div style="width:calc(100% - 110px)">9月18日不停机更新公告</div>
                  <div style="width:50px;color:gray">09-17</div>
                </div>
                <div style="display:flex;line-height: 40px;border-top: 1px solid rgb(222,222,222);">
                  <div style="width:60px">
                    <span
                      style="border: 1px solid blue; padding: 2px 5px; color: blue; font-size: 14px;"
                    >公告</span>
                  </div>
                  <div style="width:calc(100% - 110px)">2020全球总决赛主题曲MV倒计时海报—Xpeke</div>
                  <div style="width:50px;color:gray">09-17</div>
                </div>
                <div style="display:flex;line-height: 40px;border-top: 1px solid rgb(222,222,222);">
                  <div style="width:60px">
                    <span
                      style="border: 1px solid red; padding: 2px 5px; color: red; font-size: 14px;"
                    >赛事</span>
                  </div>
                  <div style="width:calc(100% - 110px)">LGD：十年饮冰，难凉热血</div>
                  <div style="width:50px;color:gray">09-17</div>
                </div>
                <div style="display:flex;line-height: 40px;border-top: 1px solid rgb(222,222,222);">
                  <div style="width:60px">
                    <span
                      style="border: 1px solid orange; padding: 2px 5px; color: orange; font-size: 14px;"
                    >视频</span>
                  </div>
                  <div style="width:calc(100% - 110px)">2LPL战队S10斗鱼应援曲：止战之殇TES应援版</div>
                  <div style="width:50px;color:gray">09-17</div>
                </div>
              </div>
            </el-tab-pane>
            <el-tab-pane label="赛事">
              <div
                style="color: #0da0b4;text-align:center;font-size:25px;line-height:60px;height:60px;text-align:center"
              >云顶之巅：月神刺，玉剑仙！ 神超 S4上分阵</div>
              <div style="color:#424242">
                <div style="display:flex;line-height: 40px;border-top: 1px solid rgb(222,222,222);">
                  <div style="width:60px">
                    <span
                      style="border: 1px solid blue; padding: 2px 5px; color: blue; font-size: 14px;"
                    >公告</span>
                  </div>
                  <div style="width:calc(100% - 110px)">9月18日不停机更新公告</div>
                  <div style="width:50px;color:gray">09-17</div>
                </div>
                <div style="display:flex;line-height: 40px;border-top: 1px solid rgb(222,222,222);">
                  <div style="width:60px">
                    <span
                      style="border: 1px solid blue; padding: 2px 5px; color: blue; font-size: 14px;"
                    >公告</span>
                  </div>
                  <div style="width:calc(100% - 110px)">2020全球总决赛主题曲MV倒计时海报—Xpeke</div>
                  <div style="width:50px;color:gray">09-17</div>
                </div>
                <div style="display:flex;line-height: 40px;border-top: 1px solid rgb(222,222,222);">
                  <div style="width:60px">
                    <span
                      style="border: 1px solid orange; padding: 2px 5px; color: orange; font-size: 14px;"
                    >视频</span>
                  </div>
                  <div style="width:calc(100% - 110px)">游戏环境公示及处罚名单9月18日</div>
                  <div style="width:50px;color:gray">09-17</div>
                </div>
                <div style="display:flex;line-height: 40px;border-top: 1px solid rgb(222,222,222);">
                  <div style="width:60px">
                    <span
                      style="border: 1px solid blue; padding: 2px 5px; color: blue; font-size: 14px;"
                    >公告</span>
                  </div>
                  <div style="width:calc(100% - 110px)">2020全球总决赛主题曲MV发布倒计时一小时</div>
                  <div style="width:50px;color:gray">09-17</div>
                </div>

                <div style="display:flex;line-height: 40px;border-top: 1px solid rgb(222,222,222);">
                  <div style="width:60px">
                    <span
                      style="border: 1px solid red; padding: 2px 5px; color: red; font-size: 14px;"
                    >赛事</span>
                  </div>
                  <div style="width:calc(100% - 110px)">LGD：十年饮冰，难凉热血</div>
                  <div style="width:50px;color:gray">09-17</div>
                </div>
                <div style="display:flex;line-height: 40px;border-top: 1px solid rgb(222,222,222);">
                  <div style="width:60px">
                    <span
                      style="border: 1px solid orange; padding: 2px 5px; color: orange; font-size: 14px;"
                    >视频</span>
                  </div>
                  <div style="width:calc(100% - 110px)">2LPL战队S10斗鱼应援曲：止战之殇TES应援版</div>
                  <div style="width:50px;color:gray">09-17</div>
                </div>
              </div>
            </el-tab-pane>
            <el-tab-pane label="攻略">
              <div
                style="color: #0da0b4;text-align:center;font-size:25px;line-height:60px;height:60px;text-align:center"
              >加班！加班！加班！使劲加班！</div>
              <div style="color:#424242">
                <div style="display:flex;line-height: 40px;border-top: 1px solid rgb(222,222,222);">
                  <div style="width:60px">
                    <span
                      style="border: 1px solid blue; padding: 2px 5px; color: blue; font-size: 14px;"
                    >公告</span>
                  </div>
                  <div style="width:calc(100% - 110px)">金铲子攻略组：S4资料站（3）装备与节奏引导</div>
                  <div style="width:50px;color:gray">09-17</div>
                </div>
                <div style="display:flex;line-height: 40px;border-top: 1px solid rgb(222,222,222);">
                  <div style="width:60px">
                    <span
                      style="border: 1px solid blue; padding: 2px 5px; color: blue; font-size: 14px;"
                    >公告</span>
                  </div>
                  <div style="width:calc(100% - 110px)">2020全球总决赛主题曲MV倒计时海报—Xpeke</div>
                  <div style="width:50px;color:gray">09-17</div>
                </div>
                <div style="display:flex;line-height: 40px;border-top: 1px solid rgb(222,222,222);">
                  <div style="width:60px">
                    <span
                      style="border: 1px solid orange; padding: 2px 5px; color: orange; font-size: 14px;"
                    >视频</span>
                  </div>
                  <div style="width:calc(100% - 110px)">金铲子攻略组：S4资料站（3）装备与节奏引导</div>
                  <div style="width:50px;color:gray">09-17</div>
                </div>
                <div style="display:flex;line-height: 40px;border-top: 1px solid rgb(222,222,222);">
                  <div style="width:60px">
                    <span
                      style="border: 1px solid blue; padding: 2px 5px; color: blue; font-size: 14px;"
                    >公告</span>
                  </div>
                  <div style="width:calc(100% - 110px)">2020全球总决赛主题曲MV发布倒计时一小时</div>
                  <div style="width:50px;color:gray">09-17</div>
                </div>

                <div style="display:flex;line-height: 40px;border-top: 1px solid rgb(222,222,222);">
                  <div style="width:60px">
                    <span
                      style="border: 1px solid red; padding: 2px 5px; color: red; font-size: 14px;"
                    >赛事</span>
                  </div>
                  <div style="width:calc(100% - 110px)">LGD：十年饮冰，难凉热血</div>
                  <div style="width:50px;color:gray">09-17</div>
                </div>
                <div style="display:flex;line-height: 40px;border-top: 1px solid rgb(222,222,222);">
                  <div style="width:60px">
                    <span
                      style="border: 1px solid orange; padding: 2px 5px; color: orange; font-size: 14px;"
                    >视频</span>
                  </div>
                  <div style="width:calc(100% - 110px)">2LPL战队S10斗鱼应援曲：止战之殇TES应援版</div>
                  <div style="width:50px;color:gray">09-17</div>
                </div>
              </div>
            </el-tab-pane>
            <el-tab-pane label="社区">
              <div
                style="color: #0da0b4;text-align:center;font-size:25px;line-height:60px;height:60px;text-align:center"
              >准备好看全球总决赛了吗？</div>
              <div style="color:#424242">
                <div style="display:flex;line-height: 40px;border-top: 1px solid rgb(222,222,222);">
                  <div style="width:60px">
                    <span
                      style="border: 1px solid blue; padding: 2px 5px; color: blue; font-size: 14px;"
                    >公告</span>
                  </div>
                  <div style="width:calc(100% - 110px)">2020全球总决赛主题曲MV倒计时海报—Xpeke</div>
                  <div style="width:50px;color:gray">09-17</div>
                </div>
                <div style="display:flex;line-height: 40px;border-top: 1px solid rgb(222,222,222);">
                  <div style="width:60px">
                    <span
                      style="border: 1px solid blue; padding: 2px 5px; color: blue; font-size: 14px;"
                    >公告</span>
                  </div>
                  <div style="width:calc(100% - 110px)">金铲子攻略组：S4资料站（3）装备与节奏引导</div>
                  <div style="width:50px;color:gray">09-17</div>
                </div>
                <div style="display:flex;line-height: 40px;border-top: 1px solid rgb(222,222,222);">
                  <div style="width:60px">
                    <span
                      style="border: 1px solid orange; padding: 2px 5px; color: orange; font-size: 14px;"
                    >视频</span>
                  </div>
                  <div style="width:calc(100% - 110px)">金铲子攻略组：S4资料站（3）装备与节奏引导</div>
                  <div style="width:50px;color:gray">09-17</div>
                </div>
                <div style="display:flex;line-height: 40px;border-top: 1px solid rgb(222,222,222);">
                  <div style="width:60px">
                    <span
                      style="border: 1px solid blue; padding: 2px 5px; color: blue; font-size: 14px;"
                    >公告</span>
                  </div>
                  <div style="width:calc(100% - 110px)">2020全球总决赛主题曲MV发布倒计时一小时</div>
                  <div style="width:50px;color:gray">09-17</div>
                </div>

                <div style="display:flex;line-height: 40px;border-top: 1px solid rgb(222,222,222);">
                  <div style="width:60px">
                    <span
                      style="border: 1px solid red; padding: 2px 5px; color: red; font-size: 14px;"
                    >赛事</span>
                  </div>
                  <div style="width:calc(100% - 110px)">LGD：十年饮冰，难凉热血</div>
                  <div style="width:50px;color:gray">09-17</div>
                </div>
                <div style="display:flex;line-height: 40px;border-top: 1px solid rgb(222,222,222);">
                  <div style="width:60px">
                    <span
                      style="border: 1px solid orange; padding: 2px 5px; color: orange; font-size: 14px;"
                    >视频</span>
                  </div>
                  <div style="width:calc(100% - 110px)">2LPL战队S10斗鱼应援曲：止战之殇TES应援版</div>
                  <div style="width:50px;color:gray">09-17</div>
                </div>
              </div>
            </el-tab-pane>
          </el-tabs>
        </div>
        <div
          style="text-align:center;background-color:rgb(222,222,222);line-height:42px;margin: 0px 40px;"
        >
          <span>阅读更多</span>
          <span style="color:#7ea1a6">
            更新资讯 -
            <i class="el-icon-right"></i>
          </span>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import { JfmIconShijian } from "@/components/colorFont.js";
export default {
  name: "Huodong",
  components: {
    JfmIconShijian,
  },
  data() {
    return {
      lastType: "",
    };
  },
  methods: {
    handelMoveHover(selectKey) {
      if (this.lastType) {
        let lastdom = this.$refs["leftImgHover" + this.lastType];
        let lastdomdiv = lastdom.getElementsByTagName("div")[0];
        lastdom.style["background-color"] = "rgb(222,222,222)";
        lastdom.style["color"] = "black";
        lastdomdiv.style["background-color"] = "transparent";
      }
      let dom = this.$refs["leftImgHover" + selectKey];
      let domdiv = dom.getElementsByTagName("div")[0];
      dom.style["background-color"] = "white";
      dom.style["color"] = "burlywood";
      domdiv.style["background-color"] = "burlywood";
      this.lastType = selectKey;

      this.$refs.carousel.setActiveItem(selectKey);
    },
  },
};
</script>

<style lang="less" scoped>
.indes-t-msg /deep/ .el-tabs__active-bar {
  background-color: #0da0b4;
}

.indes-t-msg /deep/ .el-tabs__header {
  margin: 0px;
}

.indes-t-msg /deep/ .el-tabs__nav {
  width: 100%;
}

.indes-t-msg /deep/ .el-tabs__item {
  padding: 0px;
  width: 20%;
  text-align: center;
  font-size: 25px;
}

.indes-t-msg /deep/ .el-tabs--top .el-tabs__item.is-top:nth-child(2) {
  font-weight: 0;
}

.indes-t-msg /deep/ .el-tabs__item.is-active {
  color: #0da0b4;
  font-weight: 700;
}
</style>