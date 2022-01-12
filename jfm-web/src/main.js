import Vue from 'vue'
import App from './App.vue'
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
import animated from 'animate.css' // npm install animate.css --save安装，在引入
import videoPlay from '@/components/videoPlay.vue'

import Axios from '@/config/axios'

Vue.prototype.$http = Axios;

Vue.use(animated)
Vue.use(ElementUI);
Vue.config.productionTip = false
//自定义视频组件
Vue.use({ install: function (Vue) { Vue.component('video-play', videoPlay) } })

new Vue({
  render: h => h(App),
}).$mount('#app')
