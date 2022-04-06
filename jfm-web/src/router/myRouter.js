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
        {
            path: '/search',
            component: () => import('@/pages/search/searchIndex.vue')
        },
        {
            path: '/video',
            component: () => import('@/pages/videoPlay/videoIndex.vue')
        },
        {
            path: '/editor',
            component: () => import('@/pages/editor/editorIndex.vue')
        },
        {
            path: '/category',
            component: () => import('@/pages/category/category.vue')
        },
        {
            path: '/activity',
            component: () => import('@/pages/activity/activity.vue')
        },
        {
            path: '/wallpaper',
            component: () => import('@/pages/wallpaper/wallpaper.vue')
        },
    ]
})