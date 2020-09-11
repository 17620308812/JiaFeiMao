<template>
  <div id="app">
    <Header />
    <div>
      <router-view />
    </div>
  </div>
</template>

<script>
import router from "@/pages/router/myRouter.js";
import Header from "@/components/Header.vue";
export default {
  name: "App",
  router: router,
  components: {
    Header,
  },
};
</script>

<style>
body {
  margin: 0px;
}
</style>
