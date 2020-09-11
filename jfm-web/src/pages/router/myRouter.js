import Vue from 'vue'
import Router from 'vue-router'
import Login from '@/pages/login/login.vue'
import Index from '@/pages/index/index.vue'

Vue.use(Router);

export default new Router({
    routes: [
        {
            path: '/login',
            component: Login
        },
        {
            path: '/index',
            component: Index
        }
    ]
})