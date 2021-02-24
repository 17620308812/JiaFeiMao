import Vue from 'vue'
import App from './App.vue'
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
import animated from 'animate.css' // npm install animate.css --save安装，在引入

import VideoPlayer from 'vue-video-player'
import 'vue-video-player/src/custom-theme.css'
import 'video.js/dist/video-js.css'
// import 'vue-video-player/src/custom-theme.css'

import Axios from '@/config/axios'

Vue.prototype.$http = Axios;

Vue.use(VideoPlayer, /* {
  options: global default options,
  events: global videojs events
} */)


Vue.use(animated)
Vue.use(ElementUI);
Vue.config.productionTip = false

new Vue({
  render: h => h(App),
}).$mount('#app')
