<template>
  <div style="background-color: #f6f9fa;">
    <div style="display:flex;padding-top:40px;position:relative;" class="footer">
      <div style="width:80%;min-width:980px;margin:auto">
        <div style="float:left;width:33%">
          <div style="margin-bottom:22px;color:gray">加菲猫</div>
          <div class="foot-list">
            <div>关于我们</div>
            <div>联系我们</div>
            <div>加入我们</div>
            <div>友情连接</div>
            <div>加菲猫认证</div>
            <div>投资者关系</div>
          </div>
        </div>
        <el-divider direction="vertical"></el-divider>
        <div style="float:left;width:33%;">
          <div style="padding-left:30px">
            <div style="margin-bottom:22px;color:gray">传送门</div>
            <div class="foot-list">
              <div>帮助中心</div>
              <div>高级弹幕</div>
              <div>活动专题页</div>
              <div>侵权申诉</div>
              <div>活动中心</div>
              <div>用户反馈论坛</div>
              <div>壁纸站</div>
              <div>名人堂专车号</div>
              <div>服务中心</div>
            </div>
          </div>
        </div>
        <el-divider direction="vertical"></el-divider>
        <div style="float:left;width:33%;">
          <div style="padding-left:30px">
            <div style="float:left;cursor:pointer">
              <div
                :style="{'background':'url('+this.BG_ICON+') no-repeat -1024px -194px',width:'60px',height:'60px',margin:'auto'}"
              ></div>
              <div style="margin-top:5px">客户端下载</div>
            </div>
            <div style="float:left;margin-left:15px;cursor:pointer">
              <div
                :style="{'background':'url('+this.BG_ICON+') no-repeat -1024px -322px',width:'60px',height:'60px',margin:'auto'}"
              ></div>
              <div style="margin-top:5px">新浪微博</div>
            </div>
            <div style="float:left;margin-left:15px;cursor:pointer">
              <div
                :style="{'background':'url('+this.BG_ICON+') no-repeat -1024px -66px',width:'60px',height:'60px',margin:'auto'}"
              ></div>
              <div style="margin-top:5px">官方微信</div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <div
      style="text-align:center;color: gray; font-family: 楷体; margin-top: 10px;padding-bottom:15px"
    >Copyright © 2020 梦想天空（山边小溪） Powered by .java-vue Core on Kubernetes</div>
  </div>
</template>

<script>
import BG_ICON from "@/resource/icons.png";

export default {
  name: "Footer",
  data() {
    return {
      BG_ICON,
    };
  },
};
</script>

<style lang="less" scoped>
.footer /deep/ .el-divider--vertical {
  height: calc(100% - 55px);
  position: absolute;
  margin: 0px;
}

.foot-list {
  font-size: 14px;
  div {
    width: 33%;
    float: left;
    margin-bottom: 14px;
    cursor: pointer;
  }
  div:hover {
    color: #00a1d6;
  }
}
</style>