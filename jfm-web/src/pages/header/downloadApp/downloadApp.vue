<template>
  <div style="margin-top: 50px; box-shadow: inset 0px 4px 4px 0px rgb(242 242 242)">
    <div style="display: flex;" class="bg-img">
      <div style="width:50%">
        <img />
      </div>
      <div style="width:50%"></div>
    </div>
    <h1 class="animate__animated animate__fadeIn" v-if="show">An animated element</h1>
    <el-button @click="show = !show">Button</el-button>
  </div>
</template>

<script>
export default {
  name: "DownloadApp",
  data() {
    return {
      show: true
    };
  }
};
</script>

<style scoped>
.bg-img {
  position: relative;
  background: #fff url("~@/pages/header/downloadApp/resources/bg1.png")
    no-repeat;
  margin: 0 auto;
  height: 689px;
}
</style>