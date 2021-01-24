<template>
  <div id="app">
    <Header />
    <div>
      <router-view />
    </div>
    <Footer />
  </div>
</template>

<script>
import router from "@/router/myRouter.js";
import Header from "@/components/Header.vue";
import Footer from "@/components/Footer.vue";
export default {
  name: "App",
  router: router,
  components: {
    Header,
    Footer,
  },
};
</script>

<style>
body {
  margin: 0px;
}
</style>
