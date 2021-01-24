import Vue from 'vue'
import Router from 'vue-router'
import Login from '@/pages/login/login.vue'
import Index from '@/pages/index/index'

Vue.use(Router);

export default new Router({
    routes: [
        {
            path: '/',
            component: Index
        },
        {
            path: '/index',
            component: Index
        },
        {
            path: '/login',
            component: Login
        },
    ]
})