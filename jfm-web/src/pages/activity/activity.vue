<template>
  <div style="margin-top: 55px">
    <div style="box-shadow: inset 0px 4px 4px 0px rgb(242 242 242);padding-top:20px">
      <div style="width: 70%;margin: 0 auto;">
        <div style="padding-bottom: 20px; border-bottom: 1px solid #e5e9ef;">
          <span class="ac-logo"></span>
          <span style="font-size: 18px; line-height: 14px; color: #222;">活动列表</span>
        </div>
        <div>
          <ul style="list-style: none;margin-top:0px; padding: 0;">
            <li v-for="item in 10" :key="item" style="display:flex;padding: 20px 0px;border-bottom: 1px solid #e5e9ef;">
              <div style="width: 260px;height:150px">
                <img
                :src="require('@/resource/index-scroll/index-scroll-'+(item % 5 +1) +'.jpg')"
                  style="width:100%;height:100%;border-radius:4px;overflow:hidden"
                  alt
                />
              </div>
              <div style="margin-left: 10px">
                <div style="font-weight:700;font-size:18px;margin-bottom: 15px">今日的砖头特别的烫手，真的呦~~</div>
                <div style="font-size:12px;font-weight: 700;margin-left:5px">
                  <span style="color: #00a1d6;margin-right:15px">【进行中】</span>
                  <span>2022-03-05 至 2022-06-02</span>
                </div>
              </div>
            </li>
          </ul>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "activity"
};
</script>

<style lang="less" scoped>
.ac-logo {
  background: url("~@/resource/icons.png") -82px -1624px no-repeat;
  width: 25px;
  vertical-align: middle;
  height: 25px;
  margin-right: 10px;
  display: inline-block;
}
</style>