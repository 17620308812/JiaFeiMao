import Vue from 'vue'
import Router from 'vue-router'
import Login from '@/pages/user/login.vue'
import Register from '@/pages/user/register.vue'
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
        {
            path: '/register',
            component: Register
        },
    ]
})